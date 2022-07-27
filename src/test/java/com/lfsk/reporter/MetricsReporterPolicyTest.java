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

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.lfsk.reporter.configuration.JsonTemplate;
import com.lfsk.reporter.configuration.MetricPoint;
import com.lfsk.reporter.configuration.MetricType;
import com.lfsk.reporter.configuration.MetricsReporterPolicyConfiguration;
import io.gravitee.gateway.api.Request;
import io.gravitee.gateway.api.Response;
import io.gravitee.gateway.api.buffer.Buffer;
import io.gravitee.gateway.api.http.HttpHeaderNames;
import io.gravitee.gateway.api.http.HttpHeaders;
import io.gravitee.gateway.api.stream.ReadWriteStream;
import io.gravitee.policy.api.PolicyChain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * @author snow.xu
 * @date 2022/6/1
 */
@ExtendWith(MockitoExtension.class)
class MetricsReporterPolicyTest {

    private MetricsReporterPolicy policy;

    @Mock
    private MetricsReporterPolicyConfiguration configuration;

    @Mock
    private Request request;

    @Mock
    private Response response;

    @Mock
    protected PolicyChain policyChain;

    @BeforeEach
    public void init() {

        policy = new MetricsReporterPolicy(configuration);
    }

    @Test
    @DisplayName("Should transform and add header OnRequestContent")
    public void shouldTransformAndAddHeadersOnRequestContent() throws Exception {
        String body = loadResource("/io/gravitee/policy/reporter/body.json");
        String template = loadResource("/io/gravitee/policy/reporter/template.json");

        // Prepare context
        when(configuration.getRemoteWriteUrl()).thenReturn("http://192.168.188.71:9090/api/v1/write");
        when(request.headers()).thenReturn(HttpHeaders.create());
//        when(request.pathInfo()).thenReturn("/test");
        when(configuration.getMetricTemplateJson()).thenReturn(template);

        final ReadWriteStream result = policy.onRequestContent(request, policyChain);
        assertThat(result).isNotNull();
        result.bodyHandler(
                resultBody -> {
                    System.out.println("resultBody: " + resultBody);
                }
        );

        result.write(Buffer.buffer(body));
        result.end();

        assertThat(request.headers().names()).contains(HttpHeaderNames.CONTENT_TYPE);
        assertThat(request.headers().getAll(HttpHeaderNames.CONTENT_TYPE).get(0)).isEqualTo(MetricsReporterPolicy.CONTENT_TYPE);
        assertThat(request.headers().names()).doesNotContain(HttpHeaderNames.TRANSFER_ENCODING);
        assertThat(request.headers().names()).contains(HttpHeaderNames.CONTENT_LENGTH);
    }

    private String loadResource(String resource) throws IOException {
        InputStream is = this.getClass().getResourceAsStream(resource);
        return new BufferedReader(new InputStreamReader(is))
                .lines().collect(Collectors.joining("\n"));
    }

    @Test
    public void test() throws Exception {

        String body = loadResource("/io/gravitee/policy/reporter/body.json");

        String template = loadResource("/io/gravitee/policy/reporter/template.json");

        List<MetricPoint> mps = policy.convertMetrics(body, template);

        System.out.println(mps);
    }
}
