/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lfsk.reporter;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.lfsk.reporter.configuration.JsonTemplate;
import com.lfsk.reporter.configuration.MetricPoint;
import com.lfsk.reporter.configuration.MetricType;
import com.lfsk.reporter.configuration.MetricsReporterPolicyConfiguration;
import com.lfsk.reporter.utils.CharsetHelper;
import com.lfsk.reporter.utils.PushUtil;
import io.gravitee.common.http.MediaType;
import io.gravitee.gateway.api.Request;
import io.gravitee.gateway.api.buffer.Buffer;
import io.gravitee.gateway.api.http.stream.TransformableRequestStreamBuilder;
import io.gravitee.gateway.api.stream.ReadWriteStream;
import io.gravitee.gateway.api.stream.exception.TransformationException;
import io.gravitee.policy.api.PolicyChain;
import io.gravitee.policy.api.PolicyResult;
import io.gravitee.policy.api.annotations.OnRequestContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * @author snow.xu
 * @date 2022/5/31
 */
public class MetricsReporterPolicy {

    private static final Logger LOGGER = LoggerFactory.getLogger(MetricsReporterPolicy.class);

    private static final String UTF8_CHARSET_NAME = "UTF-8";
    static final String CONTENT_TYPE = MediaType.APPLICATION_JSON + ";charset=" + UTF8_CHARSET_NAME;
    private static final String JOB_NAME = "job";
    private static final String JOB_VALUE = "lfsk_exporter";

    private final MetricsReporterPolicyConfiguration configuration;

    public MetricsReporterPolicy(final MetricsReporterPolicyConfiguration configuration) {
        this.configuration = configuration;
    }

    @OnRequestContent
    public ReadWriteStream onRequestContent(Request request, PolicyChain chain) {
        LOGGER.warn("~~~~~~~~~~~~~~~~~~~~~~~~~~ MetricsReporterPolicy start ~~~~~~~~~~~~~~~~~~~~~~~~~");
        if(CollUtil.isNotEmpty(configuration.getInterceptPaths())
                && !configuration.getInterceptPaths().contains(request.pathInfo())) {
            return null;
        }

        Charset charset = CharsetHelper.extractCharset();
        return TransformableRequestStreamBuilder.on(request).contentType(CONTENT_TYPE).transform(remoteWrite(charset, request, chain)).build();

    }

    private Function<Buffer, Buffer> remoteWrite(Charset charset, Request request, PolicyChain chain) {
        return input -> {
            try {
                return handlerBuffer(charset, request, chain, input);
            } catch (Exception e) {
                LOGGER.error("解密body流中的参数异常{}", e);
                chain.failWith(PolicyResult.failure("illegal request", 401, ""));
                throw new TransformationException("push metrics data error : " + e.getMessage(), e);
            }
        };
    }

    private Buffer handlerBuffer(Charset charset, Request request, PolicyChain chain, Buffer input) throws UnsupportedEncodingException {
        String retStr = doHandlerBuffer(charset, request, input);
        return Buffer.buffer(retStr);

    }

    private String doHandlerBuffer(Charset charset, Request request, Buffer input) throws UnsupportedEncodingException {
        // 解密body流中的参数
        String body = new String(input.toString(charset).getBytes(UTF8_CHARSET_NAME));
//        LOGGER.warn("body：" + body);
        if (!StrUtil.isEmpty(body)){

            try {
                List<MetricPoint> mps = convertMetrics(body, configuration.getMetricTemplateJson());
                LOGGER.warn("mps：" + mps);
                if(CollUtil.isNotEmpty(mps)) {
                    PushUtil.getInstance().remoteWrite(mps, configuration.getRemoteWriteUrl());
                }
            } catch (Exception e) {
                LOGGER.error("发送指标内容出错{}", e);
            }


            LOGGER.warn("----------------------MetricsReporterPolicy end---------------------------");
        }
        return body;
    }

    public List<MetricPoint> convertMetrics(String body, String template) {
        List<MetricPoint> mps = new ArrayList<>();

        Map<String, Object> bodyMap = JSONUtil.toBean(body, Map.class);

        JsonTemplate jsonTemplate = JSONUtil.toBean(template, JsonTemplate.class);
        List<JsonTemplate.ObjectTemplate> properties = jsonTemplate.getProperties();

        Map<String, String> labels = new HashMap<>();
        for(JsonTemplate.ObjectTemplate objectTemplate : properties) {
            if(MetricType.label.name().equals(objectTemplate.getType())) {
                String labelName = StrUtil.isEmpty(objectTemplate.getTargetName()) ? objectTemplate.getSourceName() : objectTemplate.getTargetName();
                labels.put(labelName, (String) bodyMap.get(objectTemplate.getSourceName()));
            }
        }
        labels.putIfAbsent(JOB_NAME, JOB_VALUE);

        for(JsonTemplate.ObjectTemplate objectTemplate : properties) {
            if(MetricType.metrics.name().equals(objectTemplate.getType())) {
                List<JsonTemplate.ObjectTemplate> metricsTemplate = objectTemplate.getMetrics();
                Optional<JsonTemplate.ObjectTemplate> timeMetric = metricsTemplate.stream()
                        .filter(mt -> MetricType.time.name().equals(mt.getType())).findFirst();
                String timeKey = timeMetric.isPresent() ? timeMetric.get().getSourceName() : "collectTime";

                List<JsonTemplate.ObjectTemplate> metricList = metricsTemplate.stream()
                        .filter(mt -> MetricType.metric.name().equals(mt.getType())).collect(Collectors.toList());

                Object obj = bodyMap.get(objectTemplate.getSourceName());
                if(obj instanceof List) {
                    JSONArray metrics = (JSONArray) obj;
                    metrics.forEach((metric) -> {

                        Map<String, Object> mmap = JSONUtil.toBean(JSONUtil.toJsonStr(metric), Map.class);
                        Object time = mmap.get(timeKey);
                        metricList.forEach(metricTemplate -> {
                            if(ObjectUtil.isNotEmpty(mmap.get(metricTemplate.getSourceName()))) {
                                MetricPoint mp = new MetricPoint();
                                mp.setLabels(labels);

                                if(time instanceof Long) {
                                    mp.setTime((long) time);
                                }

                                String metricName = StrUtil.isEmpty(metricTemplate.getTargetName()) ? metricTemplate.getSourceName() : metricTemplate.getTargetName();

                                mp.setMetric(metricName);
                                mp.setValue(Double.valueOf(mmap.get(metricTemplate.getSourceName()).toString()));

                                mps.add(mp);
                            }
                        });
                    });
                }
            }
        }

        return mps;
    }

}
