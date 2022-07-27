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
package com.lfsk.reporter.utils;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.lfsk.reporter.configuration.MetricPoint;
import com.lfsk.reporter.prometheus.Remote;
import com.lfsk.reporter.prometheus.Types;
import io.gravitee.gateway.api.stream.exception.TransformationException;
import org.xerial.snappy.Snappy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author snow.xu
 * @date 2022/5/31
 */
public class PushUtil {
    private static PushUtil ins = new PushUtil();
    private PushUtil(){}
    public static PushUtil getInstance() {
        return ins;
    }

    public void remoteWrite(MetricPoint metricPoint, String remoteWriteUrl) {
        remoteWrite(ListUtil.toList(metricPoint), remoteWriteUrl);
    }

    public void remoteWrite(List<MetricPoint> metricPointList, String remoteWriteUrl) {
        if (ArrayUtil.isEmpty(metricPointList)) {
            return;
        }
        List<Types.TimeSeries> timeSeriesList = createTimeSeries(metricPointList);
        Remote.WriteRequest.Builder writeRequestBuilder = Remote.WriteRequest.newBuilder();
        Remote.WriteRequest writeRequest = writeRequestBuilder.addAllTimeseries(timeSeriesList).build();
        try {
            byte[] compressed = Snappy.compress(writeRequest.toByteArray());
            HttpResponse response = HttpUtil.createPost(remoteWriteUrl)
                    .header("Content-type", "application/x-www-form-urlencoded")
                    .header("Content-Encoding", "snappy")
                    .header("X-Prometheus-Remote-Write-Version", "0.1.0")
                    .body(compressed)
                    .execute();
            if (response.getStatus() > 299) {
                throw new TransformationException(String.format("prometheus remoteWrite response error, data: [{}], response: [{}]", metricPointList, response));
            }
        } catch (Exception e) {
            throw new TransformationException(String.format("prometheus remoteWrite error, data: [{}]", metricPointList, e));
        }
    }

    private List<Types.TimeSeries> createTimeSeries(List<MetricPoint> metricPointList) {
        List<Types.TimeSeries> timeSeriesList = new ArrayList<>();
        for (MetricPoint point : metricPointList) {
            Types.TimeSeries.Builder timeSeriesBuilder = Types.TimeSeries.newBuilder();
            Types.Sample.Builder sampleBuilder = Types.Sample.newBuilder();

            Types.Label metricNameLabel = Types.Label.newBuilder().setName("__name__").setValue(point.getMetric()).build();
            timeSeriesBuilder.addLabels(metricNameLabel);

            if (Objects.nonNull(point.getLabels()) && point.getLabels().size() > 0) {
                for (Map.Entry<String, String> entry : point.getLabels().entrySet()) {
                    Types.Label labelTmp = Types.Label.newBuilder().setName(entry.getKey()).setValue(entry.getValue()).build();
                    timeSeriesBuilder.addLabels(labelTmp);
                }
            }
            sampleBuilder.setValue(point.getValue());
            long timestamp = point.getTime() > 0 ? point.getTime() : System.currentTimeMillis();
            sampleBuilder.setTimestamp(timestamp);
            timeSeriesBuilder.addSamples(sampleBuilder.build());
            timeSeriesList.add(timeSeriesBuilder.build());
        }
        return timeSeriesList;
    }
}
