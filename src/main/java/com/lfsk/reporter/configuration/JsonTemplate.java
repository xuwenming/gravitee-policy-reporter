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

import java.util.List;

/**
 * @author snow.xu
 * @date 2022/6/6
 */
public class JsonTemplate {
    private List<ObjectTemplate> properties;

    public static class ObjectTemplate {
        /**
         * 原始上报数据的name
         */
        private String sourceName;
        /**
         * 默认和sourceName同值
         * type=metric | label时生效,其他类型设置此值无效
         * 自定义指标名称和label时使用到此值
         */
        private String targetName;
        private String type;
        private List<ObjectTemplate> metrics;

        public String getSourceName() {
            return sourceName;
        }

        public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

        public String getTargetName() {
            return targetName;
        }

        public void setTargetName(String targetName) {
            this.targetName = targetName;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<ObjectTemplate> getMetrics() {
            return metrics;
        }

        public void setMetrics(List<ObjectTemplate> metrics) {
            this.metrics = metrics;
        }

        @Override
        public String toString() {
            return "ObjectTemplate{" +
                    "sourceName='" + sourceName + '\'' +
                    ", targetName='" + targetName + '\'' +
                    ", type='" + type + '\'' +
                    ", metrics=" + metrics +
                    '}';
        }
    }

    public List<ObjectTemplate> getProperties() {
        return properties;
    }

    public void setProperties(List<ObjectTemplate> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "JsonTemplate{" +
                "properties=" + properties +
                '}';
    }
}
