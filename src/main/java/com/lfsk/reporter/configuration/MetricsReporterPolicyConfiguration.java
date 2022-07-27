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
package com.lfsk.reporter.configuration;

import io.gravitee.policy.api.PolicyConfiguration;

import java.util.List;

/**
 * @author snow.xu
 * @date 2022/5/31
 */
public class MetricsReporterPolicyConfiguration implements PolicyConfiguration {

    private String remoteWriteUrl;
    private List<String> interceptPaths;
    private String metricTemplateJson; // 解析指标模板

    public String getRemoteWriteUrl() {
        return remoteWriteUrl;
    }

    public void setRemoteWriteUrl(String remoteWriteUrl) {
        this.remoteWriteUrl = remoteWriteUrl;
    }

    public List<String> getInterceptPaths() {
        return interceptPaths;
    }

    public void setInterceptPaths(List<String> interceptPaths) {
        this.interceptPaths = interceptPaths;
    }

    public String getMetricTemplateJson() {
        return metricTemplateJson;
    }

    public void setMetricTemplateJson(String metricTemplateJson) {
        this.metricTemplateJson = metricTemplateJson;
    }
}
