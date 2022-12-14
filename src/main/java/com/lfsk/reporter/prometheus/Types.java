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
package com.lfsk.reporter.prometheus;

public final class Types {
  private Types() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MetricMetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MetricMetadata)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Represents the metric type, these match the set from Prometheus.
     * Refer to pkg/textparse/interface.go for details.
     * </pre>
     *
     * <code>.MetricMetadata.MetricType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <pre>
     * Represents the metric type, these match the set from Prometheus.
     * Refer to pkg/textparse/interface.go for details.
     * </pre>
     *
     * <code>.MetricMetadata.MetricType type = 1;</code>
     * @return The type.
     */
    Types.MetricMetadata.MetricType getType();

    /**
     * <code>string metric_family_name = 2;</code>
     * @return The metricFamilyName.
     */
    String getMetricFamilyName();
    /**
     * <code>string metric_family_name = 2;</code>
     * @return The bytes for metricFamilyName.
     */
    com.google.protobuf.ByteString
        getMetricFamilyNameBytes();

    /**
     * <code>string help = 4;</code>
     * @return The help.
     */
    String getHelp();
    /**
     * <code>string help = 4;</code>
     * @return The bytes for help.
     */
    com.google.protobuf.ByteString
        getHelpBytes();

    /**
     * <code>string unit = 5;</code>
     * @return The unit.
     */
    String getUnit();
    /**
     * <code>string unit = 5;</code>
     * @return The bytes for unit.
     */
    com.google.protobuf.ByteString
        getUnitBytes();
  }
  /**
   * Protobuf type {@code MetricMetadata}
   */
  public static final class MetricMetadata extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MetricMetadata)
      MetricMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MetricMetadata.newBuilder() to construct.
    private MetricMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MetricMetadata() {
      type_ = 0;
      metricFamilyName_ = "";
      help_ = "";
      unit_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new MetricMetadata();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MetricMetadata(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              metricFamilyName_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              help_ = s;
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              unit_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_MetricMetadata_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_MetricMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.MetricMetadata.class, Types.MetricMetadata.Builder.class);
    }

    /**
     * Protobuf enum {@code MetricMetadata.MetricType}
     */
    public enum MetricType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>COUNTER = 1;</code>
       */
      COUNTER(1),
      /**
       * <code>GAUGE = 2;</code>
       */
      GAUGE(2),
      /**
       * <code>HISTOGRAM = 3;</code>
       */
      HISTOGRAM(3),
      /**
       * <code>GAUGEHISTOGRAM = 4;</code>
       */
      GAUGEHISTOGRAM(4),
      /**
       * <code>SUMMARY = 5;</code>
       */
      SUMMARY(5),
      /**
       * <code>INFO = 6;</code>
       */
      INFO(6),
      /**
       * <code>STATESET = 7;</code>
       */
      STATESET(7),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>COUNTER = 1;</code>
       */
      public static final int COUNTER_VALUE = 1;
      /**
       * <code>GAUGE = 2;</code>
       */
      public static final int GAUGE_VALUE = 2;
      /**
       * <code>HISTOGRAM = 3;</code>
       */
      public static final int HISTOGRAM_VALUE = 3;
      /**
       * <code>GAUGEHISTOGRAM = 4;</code>
       */
      public static final int GAUGEHISTOGRAM_VALUE = 4;
      /**
       * <code>SUMMARY = 5;</code>
       */
      public static final int SUMMARY_VALUE = 5;
      /**
       * <code>INFO = 6;</code>
       */
      public static final int INFO_VALUE = 6;
      /**
       * <code>STATESET = 7;</code>
       */
      public static final int STATESET_VALUE = 7;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static MetricType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MetricType forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return COUNTER;
          case 2: return GAUGE;
          case 3: return HISTOGRAM;
          case 4: return GAUGEHISTOGRAM;
          case 5: return SUMMARY;
          case 6: return INFO;
          case 7: return STATESET;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MetricType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MetricType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MetricType>() {
              public MetricType findValueByNumber(int number) {
                return MetricType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Types.MetricMetadata.getDescriptor().getEnumTypes().get(0);
      }

      private static final MetricType[] VALUES = values();

      public static MetricType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private MetricType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MetricMetadata.MetricType)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <pre>
     * Represents the metric type, these match the set from Prometheus.
     * Refer to pkg/textparse/interface.go for details.
     * </pre>
     *
     * <code>.MetricMetadata.MetricType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Represents the metric type, these match the set from Prometheus.
     * Refer to pkg/textparse/interface.go for details.
     * </pre>
     *
     * <code>.MetricMetadata.MetricType type = 1;</code>
     * @return The type.
     */
    @Override
    public Types.MetricMetadata.MetricType getType() {
      @SuppressWarnings("deprecation")
      Types.MetricMetadata.MetricType result = Types.MetricMetadata.MetricType.valueOf(type_);
      return result == null ? Types.MetricMetadata.MetricType.UNRECOGNIZED : result;
    }

    public static final int METRIC_FAMILY_NAME_FIELD_NUMBER = 2;
    private volatile Object metricFamilyName_;
    /**
     * <code>string metric_family_name = 2;</code>
     * @return The metricFamilyName.
     */
    @Override
    public String getMetricFamilyName() {
      Object ref = metricFamilyName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        metricFamilyName_ = s;
        return s;
      }
    }
    /**
     * <code>string metric_family_name = 2;</code>
     * @return The bytes for metricFamilyName.
     */
    @Override
    public com.google.protobuf.ByteString
        getMetricFamilyNameBytes() {
      Object ref = metricFamilyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        metricFamilyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HELP_FIELD_NUMBER = 4;
    private volatile Object help_;
    /**
     * <code>string help = 4;</code>
     * @return The help.
     */
    @Override
    public String getHelp() {
      Object ref = help_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        help_ = s;
        return s;
      }
    }
    /**
     * <code>string help = 4;</code>
     * @return The bytes for help.
     */
    @Override
    public com.google.protobuf.ByteString
        getHelpBytes() {
      Object ref = help_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        help_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNIT_FIELD_NUMBER = 5;
    private volatile Object unit_;
    /**
     * <code>string unit = 5;</code>
     * @return The unit.
     */
    @Override
    public String getUnit() {
      Object ref = unit_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        unit_ = s;
        return s;
      }
    }
    /**
     * <code>string unit = 5;</code>
     * @return The bytes for unit.
     */
    @Override
    public com.google.protobuf.ByteString
        getUnitBytes() {
      Object ref = unit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        unit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != Types.MetricMetadata.MetricType.UNKNOWN.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (!getMetricFamilyNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, metricFamilyName_);
      }
      if (!getHelpBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, help_);
      }
      if (!getUnitBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, unit_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != Types.MetricMetadata.MetricType.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (!getMetricFamilyNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, metricFamilyName_);
      }
      if (!getHelpBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, help_);
      }
      if (!getUnitBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, unit_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.MetricMetadata)) {
        return super.equals(obj);
      }
      Types.MetricMetadata other = (Types.MetricMetadata) obj;

      if (type_ != other.type_) return false;
      if (!getMetricFamilyName()
          .equals(other.getMetricFamilyName())) return false;
      if (!getHelp()
          .equals(other.getHelp())) return false;
      if (!getUnit()
          .equals(other.getUnit())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + METRIC_FAMILY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMetricFamilyName().hashCode();
      hash = (37 * hash) + HELP_FIELD_NUMBER;
      hash = (53 * hash) + getHelp().hashCode();
      hash = (37 * hash) + UNIT_FIELD_NUMBER;
      hash = (53 * hash) + getUnit().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.MetricMetadata parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.MetricMetadata parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.MetricMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.MetricMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.MetricMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.MetricMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.MetricMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.MetricMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.MetricMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.MetricMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.MetricMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.MetricMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.MetricMetadata prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MetricMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MetricMetadata)
        Types.MetricMetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_MetricMetadata_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_MetricMetadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.MetricMetadata.class, Types.MetricMetadata.Builder.class);
      }

      // Construct using Types.MetricMetadata.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        metricFamilyName_ = "";

        help_ = "";

        unit_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_MetricMetadata_descriptor;
      }

      @Override
      public Types.MetricMetadata getDefaultInstanceForType() {
        return Types.MetricMetadata.getDefaultInstance();
      }

      @Override
      public Types.MetricMetadata build() {
        Types.MetricMetadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.MetricMetadata buildPartial() {
        Types.MetricMetadata result = new Types.MetricMetadata(this);
        result.type_ = type_;
        result.metricFamilyName_ = metricFamilyName_;
        result.help_ = help_;
        result.unit_ = unit_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.MetricMetadata) {
          return mergeFrom((Types.MetricMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.MetricMetadata other) {
        if (other == Types.MetricMetadata.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getMetricFamilyName().isEmpty()) {
          metricFamilyName_ = other.metricFamilyName_;
          onChanged();
        }
        if (!other.getHelp().isEmpty()) {
          help_ = other.help_;
          onChanged();
        }
        if (!other.getUnit().isEmpty()) {
          unit_ = other.unit_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.MetricMetadata parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.MetricMetadata) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <pre>
       * Represents the metric type, these match the set from Prometheus.
       * Refer to pkg/textparse/interface.go for details.
       * </pre>
       *
       * <code>.MetricMetadata.MetricType type = 1;</code>
       * @return The enum numeric value on the wire for type.
       */
      @Override
      public int getTypeValue() {
        return type_;
      }
      /**
       * <pre>
       * Represents the metric type, these match the set from Prometheus.
       * Refer to pkg/textparse/interface.go for details.
       * </pre>
       *
       * <code>.MetricMetadata.MetricType type = 1;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {

        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Represents the metric type, these match the set from Prometheus.
       * Refer to pkg/textparse/interface.go for details.
       * </pre>
       *
       * <code>.MetricMetadata.MetricType type = 1;</code>
       * @return The type.
       */
      @Override
      public Types.MetricMetadata.MetricType getType() {
        @SuppressWarnings("deprecation")
        Types.MetricMetadata.MetricType result = Types.MetricMetadata.MetricType.valueOf(type_);
        return result == null ? Types.MetricMetadata.MetricType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Represents the metric type, these match the set from Prometheus.
       * Refer to pkg/textparse/interface.go for details.
       * </pre>
       *
       * <code>.MetricMetadata.MetricType type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(Types.MetricMetadata.MetricType value) {
        if (value == null) {
          throw new NullPointerException();
        }

        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Represents the metric type, these match the set from Prometheus.
       * Refer to pkg/textparse/interface.go for details.
       * </pre>
       *
       * <code>.MetricMetadata.MetricType type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {

        type_ = 0;
        onChanged();
        return this;
      }

      private Object metricFamilyName_ = "";
      /**
       * <code>string metric_family_name = 2;</code>
       * @return The metricFamilyName.
       */
      public String getMetricFamilyName() {
        Object ref = metricFamilyName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          metricFamilyName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string metric_family_name = 2;</code>
       * @return The bytes for metricFamilyName.
       */
      public com.google.protobuf.ByteString
          getMetricFamilyNameBytes() {
        Object ref = metricFamilyName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          metricFamilyName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string metric_family_name = 2;</code>
       * @param value The metricFamilyName to set.
       * @return This builder for chaining.
       */
      public Builder setMetricFamilyName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        metricFamilyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string metric_family_name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMetricFamilyName() {

        metricFamilyName_ = getDefaultInstance().getMetricFamilyName();
        onChanged();
        return this;
      }
      /**
       * <code>string metric_family_name = 2;</code>
       * @param value The bytes for metricFamilyName to set.
       * @return This builder for chaining.
       */
      public Builder setMetricFamilyNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        metricFamilyName_ = value;
        onChanged();
        return this;
      }

      private Object help_ = "";
      /**
       * <code>string help = 4;</code>
       * @return The help.
       */
      public String getHelp() {
        Object ref = help_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          help_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string help = 4;</code>
       * @return The bytes for help.
       */
      public com.google.protobuf.ByteString
          getHelpBytes() {
        Object ref = help_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          help_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string help = 4;</code>
       * @param value The help to set.
       * @return This builder for chaining.
       */
      public Builder setHelp(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        help_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string help = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearHelp() {

        help_ = getDefaultInstance().getHelp();
        onChanged();
        return this;
      }
      /**
       * <code>string help = 4;</code>
       * @param value The bytes for help to set.
       * @return This builder for chaining.
       */
      public Builder setHelpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        help_ = value;
        onChanged();
        return this;
      }

      private Object unit_ = "";
      /**
       * <code>string unit = 5;</code>
       * @return The unit.
       */
      public String getUnit() {
        Object ref = unit_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          unit_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string unit = 5;</code>
       * @return The bytes for unit.
       */
      public com.google.protobuf.ByteString
          getUnitBytes() {
        Object ref = unit_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          unit_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string unit = 5;</code>
       * @param value The unit to set.
       * @return This builder for chaining.
       */
      public Builder setUnit(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        unit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string unit = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnit() {

        unit_ = getDefaultInstance().getUnit();
        onChanged();
        return this;
      }
      /**
       * <code>string unit = 5;</code>
       * @param value The bytes for unit to set.
       * @return This builder for chaining.
       */
      public Builder setUnitBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        unit_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MetricMetadata)
    }

    // @@protoc_insertion_point(class_scope:MetricMetadata)
    private static final Types.MetricMetadata DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.MetricMetadata();
    }

    public static Types.MetricMetadata getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MetricMetadata>
        PARSER = new com.google.protobuf.AbstractParser<MetricMetadata>() {
      @Override
      public MetricMetadata parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MetricMetadata(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MetricMetadata> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<MetricMetadata> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.MetricMetadata getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SampleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Sample)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double value = 1;</code>
     * @return The value.
     */
    double getValue();

    /**
     * <code>int64 timestamp = 2;</code>
     * @return The timestamp.
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code Sample}
   */
  public static final class Sample extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Sample)
      SampleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Sample.newBuilder() to construct.
    private Sample(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Sample() {
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Sample();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Sample(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              value_ = input.readDouble();
              break;
            }
            case 16: {

              timestamp_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_Sample_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_Sample_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.Sample.class, Types.Sample.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;
    /**
     * <code>double value = 1;</code>
     * @return The value.
     */
    @Override
    public double getValue() {
      return value_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 2;</code>
     * @return The timestamp.
     */
    @Override
    public long getTimestamp() {
      return timestamp_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (value_ != 0D) {
        output.writeDouble(1, value_);
      }
      if (timestamp_ != 0L) {
        output.writeInt64(2, timestamp_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, value_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, timestamp_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.Sample)) {
        return super.equals(obj);
      }
      Types.Sample other = (Types.Sample) obj;

      if (Double.doubleToLongBits(getValue())
          != Double.doubleToLongBits(
              other.getValue())) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          Double.doubleToLongBits(getValue()));
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.Sample parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Sample parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Sample parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Sample parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Sample parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Sample parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Sample parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.Sample parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.Sample parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.Sample parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.Sample parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.Sample parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.Sample prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Sample}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Sample)
        Types.SampleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_Sample_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_Sample_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.Sample.class, Types.Sample.Builder.class);
      }

      // Construct using Types.Sample.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        value_ = 0D;

        timestamp_ = 0L;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_Sample_descriptor;
      }

      @Override
      public Types.Sample getDefaultInstanceForType() {
        return Types.Sample.getDefaultInstance();
      }

      @Override
      public Types.Sample build() {
        Types.Sample result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.Sample buildPartial() {
        Types.Sample result = new Types.Sample(this);
        result.value_ = value_;
        result.timestamp_ = timestamp_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.Sample) {
          return mergeFrom((Types.Sample)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.Sample other) {
        if (other == Types.Sample.getDefaultInstance()) return this;
        if (other.getValue() != 0D) {
          setValue(other.getValue());
        }
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.Sample parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.Sample) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double value_ ;
      /**
       * <code>double value = 1;</code>
       * @return The value.
       */
      @Override
      public double getValue() {
        return value_;
      }
      /**
       * <code>double value = 1;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(double value) {

        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double value = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {

        value_ = 0D;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 2;</code>
       * @return The timestamp.
       */
      @Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 2;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {

        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {

        timestamp_ = 0L;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Sample)
    }

    // @@protoc_insertion_point(class_scope:Sample)
    private static final Types.Sample DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.Sample();
    }

    public static Types.Sample getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Sample>
        PARSER = new com.google.protobuf.AbstractParser<Sample>() {
      @Override
      public Sample parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Sample(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Sample> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Sample> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.Sample getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TimeSeriesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TimeSeries)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<Types.Label>
        getLabelsList();
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    Types.Label getLabels(int index);
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    int getLabelsCount();
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends Types.LabelOrBuilder>
        getLabelsOrBuilderList();
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    Types.LabelOrBuilder getLabelsOrBuilder(
            int index);

    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<Types.Sample>
        getSamplesList();
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    Types.Sample getSamples(int index);
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    int getSamplesCount();
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends Types.SampleOrBuilder>
        getSamplesOrBuilderList();
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    Types.SampleOrBuilder getSamplesOrBuilder(
            int index);
  }
  /**
   * <pre>
   * TimeSeries represents samples and labels for a single time series.
   * </pre>
   *
   * Protobuf type {@code TimeSeries}
   */
  public static final class TimeSeries extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TimeSeries)
      TimeSeriesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TimeSeries.newBuilder() to construct.
    private TimeSeries(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TimeSeries() {
      labels_ = java.util.Collections.emptyList();
      samples_ = java.util.Collections.emptyList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new TimeSeries();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TimeSeries(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                labels_ = new java.util.ArrayList<Types.Label>();
                mutable_bitField0_ |= 0x00000001;
              }
              labels_.add(
                  input.readMessage(Types.Label.parser(), extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                samples_ = new java.util.ArrayList<Types.Sample>();
                mutable_bitField0_ |= 0x00000002;
              }
              samples_.add(
                  input.readMessage(Types.Sample.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          samples_ = java.util.Collections.unmodifiableList(samples_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_TimeSeries_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_TimeSeries_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.TimeSeries.class, Types.TimeSeries.Builder.class);
    }

    public static final int LABELS_FIELD_NUMBER = 1;
    private java.util.List<Types.Label> labels_;
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<Types.Label> getLabelsList() {
      return labels_;
    }
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<? extends Types.LabelOrBuilder>
        getLabelsOrBuilderList() {
      return labels_;
    }
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.Label getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.LabelOrBuilder getLabelsOrBuilder(
        int index) {
      return labels_.get(index);
    }

    public static final int SAMPLES_FIELD_NUMBER = 2;
    private java.util.List<Types.Sample> samples_;
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<Types.Sample> getSamplesList() {
      return samples_;
    }
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<? extends Types.SampleOrBuilder>
        getSamplesOrBuilderList() {
      return samples_;
    }
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public int getSamplesCount() {
      return samples_.size();
    }
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.Sample getSamples(int index) {
      return samples_.get(index);
    }
    /**
     * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.SampleOrBuilder getSamplesOrBuilder(
        int index) {
      return samples_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < labels_.size(); i++) {
        output.writeMessage(1, labels_.get(i));
      }
      for (int i = 0; i < samples_.size(); i++) {
        output.writeMessage(2, samples_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < labels_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, labels_.get(i));
      }
      for (int i = 0; i < samples_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, samples_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.TimeSeries)) {
        return super.equals(obj);
      }
      Types.TimeSeries other = (Types.TimeSeries) obj;

      if (!getLabelsList()
          .equals(other.getLabelsList())) return false;
      if (!getSamplesList()
          .equals(other.getSamplesList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getLabelsCount() > 0) {
        hash = (37 * hash) + LABELS_FIELD_NUMBER;
        hash = (53 * hash) + getLabelsList().hashCode();
      }
      if (getSamplesCount() > 0) {
        hash = (37 * hash) + SAMPLES_FIELD_NUMBER;
        hash = (53 * hash) + getSamplesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.TimeSeries parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.TimeSeries parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.TimeSeries parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.TimeSeries parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.TimeSeries parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.TimeSeries parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.TimeSeries parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.TimeSeries parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.TimeSeries parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.TimeSeries parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.TimeSeries parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.TimeSeries parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.TimeSeries prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * TimeSeries represents samples and labels for a single time series.
     * </pre>
     *
     * Protobuf type {@code TimeSeries}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TimeSeries)
        Types.TimeSeriesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_TimeSeries_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_TimeSeries_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.TimeSeries.class, Types.TimeSeries.Builder.class);
      }

      // Construct using Types.TimeSeries.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getLabelsFieldBuilder();
          getSamplesFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          labelsBuilder_.clear();
        }
        if (samplesBuilder_ == null) {
          samples_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          samplesBuilder_.clear();
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_TimeSeries_descriptor;
      }

      @Override
      public Types.TimeSeries getDefaultInstanceForType() {
        return Types.TimeSeries.getDefaultInstance();
      }

      @Override
      public Types.TimeSeries build() {
        Types.TimeSeries result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.TimeSeries buildPartial() {
        Types.TimeSeries result = new Types.TimeSeries(this);
        int from_bitField0_ = bitField0_;
        if (labelsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            labels_ = java.util.Collections.unmodifiableList(labels_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.labels_ = labels_;
        } else {
          result.labels_ = labelsBuilder_.build();
        }
        if (samplesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            samples_ = java.util.Collections.unmodifiableList(samples_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.samples_ = samples_;
        } else {
          result.samples_ = samplesBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.TimeSeries) {
          return mergeFrom((Types.TimeSeries)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.TimeSeries other) {
        if (other == Types.TimeSeries.getDefaultInstance()) return this;
        if (labelsBuilder_ == null) {
          if (!other.labels_.isEmpty()) {
            if (labels_.isEmpty()) {
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLabelsIsMutable();
              labels_.addAll(other.labels_);
            }
            onChanged();
          }
        } else {
          if (!other.labels_.isEmpty()) {
            if (labelsBuilder_.isEmpty()) {
              labelsBuilder_.dispose();
              labelsBuilder_ = null;
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
              labelsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLabelsFieldBuilder() : null;
            } else {
              labelsBuilder_.addAllMessages(other.labels_);
            }
          }
        }
        if (samplesBuilder_ == null) {
          if (!other.samples_.isEmpty()) {
            if (samples_.isEmpty()) {
              samples_ = other.samples_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureSamplesIsMutable();
              samples_.addAll(other.samples_);
            }
            onChanged();
          }
        } else {
          if (!other.samples_.isEmpty()) {
            if (samplesBuilder_.isEmpty()) {
              samplesBuilder_.dispose();
              samplesBuilder_ = null;
              samples_ = other.samples_;
              bitField0_ = (bitField0_ & ~0x00000002);
              samplesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSamplesFieldBuilder() : null;
            } else {
              samplesBuilder_.addAllMessages(other.samples_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.TimeSeries parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.TimeSeries) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<Types.Label> labels_ =
        java.util.Collections.emptyList();
      private void ensureLabelsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          labels_ = new java.util.ArrayList<Types.Label>(labels_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Label, Types.Label.Builder, Types.LabelOrBuilder> labelsBuilder_;

      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Label> getLabelsList() {
        if (labelsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(labels_);
        } else {
          return labelsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public int getLabelsCount() {
        if (labelsBuilder_ == null) {
          return labels_.size();
        } else {
          return labelsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label getLabels(int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);
        } else {
          return labelsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.set(index, value);
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.set(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(index, value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllLabels(
          Iterable<? extends Label> values) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, labels_);
          onChanged();
        } else {
          labelsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearLabels() {
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          labelsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeLabels(int index) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.remove(index);
          onChanged();
        } else {
          labelsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder getLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.LabelOrBuilder getLabelsOrBuilder(
          int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);  } else {
          return labelsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends Types.LabelOrBuilder>
           getLabelsOrBuilderList() {
        if (labelsBuilder_ != null) {
          return labelsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(labels_);
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder addLabelsBuilder() {
        return getLabelsFieldBuilder().addBuilder(
            Types.Label.getDefaultInstance());
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder addLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().addBuilder(
            index, Types.Label.getDefaultInstance());
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Label.Builder>
           getLabelsBuilderList() {
        return getLabelsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Label, Types.Label.Builder, Types.LabelOrBuilder>
          getLabelsFieldBuilder() {
        if (labelsBuilder_ == null) {
          labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Types.Label, Types.Label.Builder, Types.LabelOrBuilder>(
                  labels_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          labels_ = null;
        }
        return labelsBuilder_;
      }

      private java.util.List<Types.Sample> samples_ =
        java.util.Collections.emptyList();
      private void ensureSamplesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          samples_ = new java.util.ArrayList<Types.Sample>(samples_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Sample, Types.Sample.Builder, Types.SampleOrBuilder> samplesBuilder_;

      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Sample> getSamplesList() {
        if (samplesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(samples_);
        } else {
          return samplesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public int getSamplesCount() {
        if (samplesBuilder_ == null) {
          return samples_.size();
        } else {
          return samplesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Sample getSamples(int index) {
        if (samplesBuilder_ == null) {
          return samples_.get(index);
        } else {
          return samplesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setSamples(
          int index, Types.Sample value) {
        if (samplesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSamplesIsMutable();
          samples_.set(index, value);
          onChanged();
        } else {
          samplesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setSamples(
          int index, Types.Sample.Builder builderForValue) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          samples_.set(index, builderForValue.build());
          onChanged();
        } else {
          samplesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addSamples(Types.Sample value) {
        if (samplesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSamplesIsMutable();
          samples_.add(value);
          onChanged();
        } else {
          samplesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addSamples(
          int index, Types.Sample value) {
        if (samplesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSamplesIsMutable();
          samples_.add(index, value);
          onChanged();
        } else {
          samplesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addSamples(
          Types.Sample.Builder builderForValue) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          samples_.add(builderForValue.build());
          onChanged();
        } else {
          samplesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addSamples(
          int index, Types.Sample.Builder builderForValue) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          samples_.add(index, builderForValue.build());
          onChanged();
        } else {
          samplesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllSamples(
          Iterable<? extends Sample> values) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, samples_);
          onChanged();
        } else {
          samplesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearSamples() {
        if (samplesBuilder_ == null) {
          samples_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          samplesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeSamples(int index) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          samples_.remove(index);
          onChanged();
        } else {
          samplesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Sample.Builder getSamplesBuilder(
          int index) {
        return getSamplesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.SampleOrBuilder getSamplesOrBuilder(
          int index) {
        if (samplesBuilder_ == null) {
          return samples_.get(index);  } else {
          return samplesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends Types.SampleOrBuilder>
           getSamplesOrBuilderList() {
        if (samplesBuilder_ != null) {
          return samplesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(samples_);
        }
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Sample.Builder addSamplesBuilder() {
        return getSamplesFieldBuilder().addBuilder(
            Types.Sample.getDefaultInstance());
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Sample.Builder addSamplesBuilder(
          int index) {
        return getSamplesFieldBuilder().addBuilder(
            index, Types.Sample.getDefaultInstance());
      }
      /**
       * <code>repeated .Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Sample.Builder>
           getSamplesBuilderList() {
        return getSamplesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Sample, Types.Sample.Builder, Types.SampleOrBuilder>
          getSamplesFieldBuilder() {
        if (samplesBuilder_ == null) {
          samplesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Types.Sample, Types.Sample.Builder, Types.SampleOrBuilder>(
                  samples_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          samples_ = null;
        }
        return samplesBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TimeSeries)
    }

    // @@protoc_insertion_point(class_scope:TimeSeries)
    private static final Types.TimeSeries DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.TimeSeries();
    }

    public static Types.TimeSeries getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TimeSeries>
        PARSER = new com.google.protobuf.AbstractParser<TimeSeries>() {
      @Override
      public TimeSeries parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TimeSeries(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TimeSeries> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<TimeSeries> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.TimeSeries getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LabelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Label)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    String getValue();
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * Protobuf type {@code Label}
   */
  public static final class Label extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Label)
      LabelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Label.newBuilder() to construct.
    private Label(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Label() {
      name_ = "";
      value_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Label();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Label(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              value_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_Label_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_Label_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.Label.class, Types.Label.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private volatile Object value_;
    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    @Override
    public String getValue() {
      Object ref = value_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    @Override
    public com.google.protobuf.ByteString
        getValueBytes() {
      Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getValueBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getValueBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.Label)) {
        return super.equals(obj);
      }
      Types.Label other = (Types.Label) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getValue()
          .equals(other.getValue())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.Label parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Label parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Label parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Label parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Label parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Label parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Label parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.Label parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.Label parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.Label parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.Label parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.Label parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.Label prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Label}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Label)
        Types.LabelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_Label_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_Label_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.Label.class, Types.Label.Builder.class);
      }

      // Construct using Types.Label.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        name_ = "";

        value_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_Label_descriptor;
      }

      @Override
      public Types.Label getDefaultInstanceForType() {
        return Types.Label.getDefaultInstance();
      }

      @Override
      public Types.Label build() {
        Types.Label result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.Label buildPartial() {
        Types.Label result = new Types.Label(this);
        result.name_ = name_;
        result.value_ = value_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.Label) {
          return mergeFrom((Types.Label)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.Label other) {
        if (other == Types.Label.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.Label parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.Label) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {

        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        name_ = value;
        onChanged();
        return this;
      }

      private Object value_ = "";
      /**
       * <code>string value = 2;</code>
       * @return The value.
       */
      public String getValue() {
        Object ref = value_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       * @return The bytes for value.
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {

        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       * @param value The bytes for value to set.
       * @return This builder for chaining.
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        value_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Label)
    }

    // @@protoc_insertion_point(class_scope:Label)
    private static final Types.Label DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.Label();
    }

    public static Types.Label getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Label>
        PARSER = new com.google.protobuf.AbstractParser<Label>() {
      @Override
      public Label parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Label(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Label> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Label> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.Label getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LabelsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Labels)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<Types.Label>
        getLabelsList();
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    Types.Label getLabels(int index);
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    int getLabelsCount();
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends Types.LabelOrBuilder>
        getLabelsOrBuilderList();
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    Types.LabelOrBuilder getLabelsOrBuilder(
            int index);
  }
  /**
   * Protobuf type {@code Labels}
   */
  public static final class Labels extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Labels)
      LabelsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Labels.newBuilder() to construct.
    private Labels(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Labels() {
      labels_ = java.util.Collections.emptyList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Labels();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Labels(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                labels_ = new java.util.ArrayList<Types.Label>();
                mutable_bitField0_ |= 0x00000001;
              }
              labels_.add(
                  input.readMessage(Types.Label.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_Labels_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_Labels_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.Labels.class, Types.Labels.Builder.class);
    }

    public static final int LABELS_FIELD_NUMBER = 1;
    private java.util.List<Types.Label> labels_;
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<Types.Label> getLabelsList() {
      return labels_;
    }
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<? extends Types.LabelOrBuilder>
        getLabelsOrBuilderList() {
      return labels_;
    }
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.Label getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.LabelOrBuilder getLabelsOrBuilder(
        int index) {
      return labels_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < labels_.size(); i++) {
        output.writeMessage(1, labels_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < labels_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, labels_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.Labels)) {
        return super.equals(obj);
      }
      Types.Labels other = (Types.Labels) obj;

      if (!getLabelsList()
          .equals(other.getLabelsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getLabelsCount() > 0) {
        hash = (37 * hash) + LABELS_FIELD_NUMBER;
        hash = (53 * hash) + getLabelsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.Labels parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Labels parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Labels parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Labels parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Labels parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Labels parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Labels parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.Labels parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.Labels parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.Labels parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.Labels parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.Labels parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.Labels prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Labels}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Labels)
        Types.LabelsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_Labels_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_Labels_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.Labels.class, Types.Labels.Builder.class);
      }

      // Construct using Types.Labels.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getLabelsFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          labelsBuilder_.clear();
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_Labels_descriptor;
      }

      @Override
      public Types.Labels getDefaultInstanceForType() {
        return Types.Labels.getDefaultInstance();
      }

      @Override
      public Types.Labels build() {
        Types.Labels result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.Labels buildPartial() {
        Types.Labels result = new Types.Labels(this);
        int from_bitField0_ = bitField0_;
        if (labelsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            labels_ = java.util.Collections.unmodifiableList(labels_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.labels_ = labels_;
        } else {
          result.labels_ = labelsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.Labels) {
          return mergeFrom((Types.Labels)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.Labels other) {
        if (other == Types.Labels.getDefaultInstance()) return this;
        if (labelsBuilder_ == null) {
          if (!other.labels_.isEmpty()) {
            if (labels_.isEmpty()) {
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLabelsIsMutable();
              labels_.addAll(other.labels_);
            }
            onChanged();
          }
        } else {
          if (!other.labels_.isEmpty()) {
            if (labelsBuilder_.isEmpty()) {
              labelsBuilder_.dispose();
              labelsBuilder_ = null;
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
              labelsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLabelsFieldBuilder() : null;
            } else {
              labelsBuilder_.addAllMessages(other.labels_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.Labels parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.Labels) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<Types.Label> labels_ =
        java.util.Collections.emptyList();
      private void ensureLabelsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          labels_ = new java.util.ArrayList<Types.Label>(labels_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Label, Types.Label.Builder, Types.LabelOrBuilder> labelsBuilder_;

      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Label> getLabelsList() {
        if (labelsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(labels_);
        } else {
          return labelsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public int getLabelsCount() {
        if (labelsBuilder_ == null) {
          return labels_.size();
        } else {
          return labelsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label getLabels(int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);
        } else {
          return labelsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.set(index, value);
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.set(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(index, value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllLabels(
          Iterable<? extends Label> values) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, labels_);
          onChanged();
        } else {
          labelsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearLabels() {
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          labelsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeLabels(int index) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.remove(index);
          onChanged();
        } else {
          labelsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder getLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.LabelOrBuilder getLabelsOrBuilder(
          int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);  } else {
          return labelsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends Types.LabelOrBuilder>
           getLabelsOrBuilderList() {
        if (labelsBuilder_ != null) {
          return labelsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(labels_);
        }
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder addLabelsBuilder() {
        return getLabelsFieldBuilder().addBuilder(
            Types.Label.getDefaultInstance());
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder addLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().addBuilder(
            index, Types.Label.getDefaultInstance());
      }
      /**
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Label.Builder>
           getLabelsBuilderList() {
        return getLabelsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Label, Types.Label.Builder, Types.LabelOrBuilder>
          getLabelsFieldBuilder() {
        if (labelsBuilder_ == null) {
          labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Types.Label, Types.Label.Builder, Types.LabelOrBuilder>(
                  labels_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          labels_ = null;
        }
        return labelsBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Labels)
    }

    // @@protoc_insertion_point(class_scope:Labels)
    private static final Types.Labels DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.Labels();
    }

    public static Types.Labels getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Labels>
        PARSER = new com.google.protobuf.AbstractParser<Labels>() {
      @Override
      public Labels parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Labels(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Labels> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Labels> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.Labels getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LabelMatcherOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LabelMatcher)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LabelMatcher.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.LabelMatcher.Type type = 1;</code>
     * @return The type.
     */
    Types.LabelMatcher.Type getType();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string value = 3;</code>
     * @return The value.
     */
    String getValue();
    /**
     * <code>string value = 3;</code>
     * @return The bytes for value.
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * <pre>
   * Matcher specifies a rule, which can match or set of labels or not.
   * </pre>
   *
   * Protobuf type {@code LabelMatcher}
   */
  public static final class LabelMatcher extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LabelMatcher)
      LabelMatcherOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LabelMatcher.newBuilder() to construct.
    private LabelMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LabelMatcher() {
      type_ = 0;
      name_ = "";
      value_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new LabelMatcher();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LabelMatcher(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              value_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_LabelMatcher_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_LabelMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.LabelMatcher.class, Types.LabelMatcher.Builder.class);
    }

    /**
     * Protobuf enum {@code LabelMatcher.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>EQ = 0;</code>
       */
      EQ(0),
      /**
       * <code>NEQ = 1;</code>
       */
      NEQ(1),
      /**
       * <code>RE = 2;</code>
       */
      RE(2),
      /**
       * <code>NRE = 3;</code>
       */
      NRE(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>EQ = 0;</code>
       */
      public static final int EQ_VALUE = 0;
      /**
       * <code>NEQ = 1;</code>
       */
      public static final int NEQ_VALUE = 1;
      /**
       * <code>RE = 2;</code>
       */
      public static final int RE_VALUE = 2;
      /**
       * <code>NRE = 3;</code>
       */
      public static final int NRE_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Type forNumber(int value) {
        switch (value) {
          case 0: return EQ;
          case 1: return NEQ;
          case 2: return RE;
          case 3: return NRE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Types.LabelMatcher.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:LabelMatcher.Type)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.LabelMatcher.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.LabelMatcher.Type type = 1;</code>
     * @return The type.
     */
    @Override
    public Types.LabelMatcher.Type getType() {
      @SuppressWarnings("deprecation")
      Types.LabelMatcher.Type result = Types.LabelMatcher.Type.valueOf(type_);
      return result == null ? Types.LabelMatcher.Type.UNRECOGNIZED : result;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 3;
    private volatile Object value_;
    /**
     * <code>string value = 3;</code>
     * @return The value.
     */
    @Override
    public String getValue() {
      Object ref = value_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     * <code>string value = 3;</code>
     * @return The bytes for value.
     */
    @Override
    public com.google.protobuf.ByteString
        getValueBytes() {
      Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != Types.LabelMatcher.Type.EQ.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (!getValueBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != Types.LabelMatcher.Type.EQ.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (!getValueBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.LabelMatcher)) {
        return super.equals(obj);
      }
      Types.LabelMatcher other = (Types.LabelMatcher) obj;

      if (type_ != other.type_) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (!getValue()
          .equals(other.getValue())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.LabelMatcher parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.LabelMatcher parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.LabelMatcher parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.LabelMatcher parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.LabelMatcher parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.LabelMatcher parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.LabelMatcher parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.LabelMatcher parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.LabelMatcher parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.LabelMatcher parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.LabelMatcher parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.LabelMatcher parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.LabelMatcher prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Matcher specifies a rule, which can match or set of labels or not.
     * </pre>
     *
     * Protobuf type {@code LabelMatcher}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LabelMatcher)
        Types.LabelMatcherOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_LabelMatcher_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_LabelMatcher_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.LabelMatcher.class, Types.LabelMatcher.Builder.class);
      }

      // Construct using Types.LabelMatcher.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        name_ = "";

        value_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_LabelMatcher_descriptor;
      }

      @Override
      public Types.LabelMatcher getDefaultInstanceForType() {
        return Types.LabelMatcher.getDefaultInstance();
      }

      @Override
      public Types.LabelMatcher build() {
        Types.LabelMatcher result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.LabelMatcher buildPartial() {
        Types.LabelMatcher result = new Types.LabelMatcher(this);
        result.type_ = type_;
        result.name_ = name_;
        result.value_ = value_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.LabelMatcher) {
          return mergeFrom((Types.LabelMatcher)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.LabelMatcher other) {
        if (other == Types.LabelMatcher.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.LabelMatcher parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.LabelMatcher) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.LabelMatcher.Type type = 1;</code>
       * @return The enum numeric value on the wire for type.
       */
      @Override
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.LabelMatcher.Type type = 1;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {

        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.LabelMatcher.Type type = 1;</code>
       * @return The type.
       */
      @Override
      public Types.LabelMatcher.Type getType() {
        @SuppressWarnings("deprecation")
        Types.LabelMatcher.Type result = Types.LabelMatcher.Type.valueOf(type_);
        return result == null ? Types.LabelMatcher.Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.LabelMatcher.Type type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(Types.LabelMatcher.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }

        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.LabelMatcher.Type type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {

        type_ = 0;
        onChanged();
        return this;
      }

      private Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {

        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        name_ = value;
        onChanged();
        return this;
      }

      private Object value_ = "";
      /**
       * <code>string value = 3;</code>
       * @return The value.
       */
      public String getValue() {
        Object ref = value_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string value = 3;</code>
       * @return The bytes for value.
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string value = 3;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string value = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {

        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>string value = 3;</code>
       * @param value The bytes for value to set.
       * @return This builder for chaining.
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        value_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LabelMatcher)
    }

    // @@protoc_insertion_point(class_scope:LabelMatcher)
    private static final Types.LabelMatcher DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.LabelMatcher();
    }

    public static Types.LabelMatcher getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LabelMatcher>
        PARSER = new com.google.protobuf.AbstractParser<LabelMatcher>() {
      @Override
      public LabelMatcher parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LabelMatcher(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LabelMatcher> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<LabelMatcher> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.LabelMatcher getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReadHintsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReadHints)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Query step size in milliseconds.
     * </pre>
     *
     * <code>int64 step_ms = 1;</code>
     * @return The stepMs.
     */
    long getStepMs();

    /**
     * <pre>
     * String representation of surrounding function or aggregation.
     * </pre>
     *
     * <code>string func = 2;</code>
     * @return The func.
     */
    String getFunc();
    /**
     * <pre>
     * String representation of surrounding function or aggregation.
     * </pre>
     *
     * <code>string func = 2;</code>
     * @return The bytes for func.
     */
    com.google.protobuf.ByteString
        getFuncBytes();

    /**
     * <pre>
     * Start time in milliseconds.
     * </pre>
     *
     * <code>int64 start_ms = 3;</code>
     * @return The startMs.
     */
    long getStartMs();

    /**
     * <pre>
     * End time in milliseconds.
     * </pre>
     *
     * <code>int64 end_ms = 4;</code>
     * @return The endMs.
     */
    long getEndMs();

    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @return A list containing the grouping.
     */
    java.util.List<String>
        getGroupingList();
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @return The count of grouping.
     */
    int getGroupingCount();
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @param index The index of the element to return.
     * @return The grouping at the given index.
     */
    String getGrouping(int index);
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the grouping at the given index.
     */
    com.google.protobuf.ByteString
        getGroupingBytes(int index);

    /**
     * <pre>
     * Indicate whether it is without or by.
     * </pre>
     *
     * <code>bool by = 6;</code>
     * @return The by.
     */
    boolean getBy();

    /**
     * <pre>
     * Range vector selector range in milliseconds.
     * </pre>
     *
     * <code>int64 range_ms = 7;</code>
     * @return The rangeMs.
     */
    long getRangeMs();
  }
  /**
   * Protobuf type {@code ReadHints}
   */
  public static final class ReadHints extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReadHints)
      ReadHintsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReadHints.newBuilder() to construct.
    private ReadHints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReadHints() {
      func_ = "";
      grouping_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReadHints();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReadHints(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              stepMs_ = input.readInt64();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              func_ = s;
              break;
            }
            case 24: {

              startMs_ = input.readInt64();
              break;
            }
            case 32: {

              endMs_ = input.readInt64();
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                grouping_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              grouping_.add(s);
              break;
            }
            case 48: {

              by_ = input.readBool();
              break;
            }
            case 56: {

              rangeMs_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          grouping_ = grouping_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_ReadHints_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_ReadHints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.ReadHints.class, Types.ReadHints.Builder.class);
    }

    public static final int STEP_MS_FIELD_NUMBER = 1;
    private long stepMs_;
    /**
     * <pre>
     * Query step size in milliseconds.
     * </pre>
     *
     * <code>int64 step_ms = 1;</code>
     * @return The stepMs.
     */
    @Override
    public long getStepMs() {
      return stepMs_;
    }

    public static final int FUNC_FIELD_NUMBER = 2;
    private volatile Object func_;
    /**
     * <pre>
     * String representation of surrounding function or aggregation.
     * </pre>
     *
     * <code>string func = 2;</code>
     * @return The func.
     */
    @Override
    public String getFunc() {
      Object ref = func_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        func_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * String representation of surrounding function or aggregation.
     * </pre>
     *
     * <code>string func = 2;</code>
     * @return The bytes for func.
     */
    @Override
    public com.google.protobuf.ByteString
        getFuncBytes() {
      Object ref = func_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        func_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int START_MS_FIELD_NUMBER = 3;
    private long startMs_;
    /**
     * <pre>
     * Start time in milliseconds.
     * </pre>
     *
     * <code>int64 start_ms = 3;</code>
     * @return The startMs.
     */
    @Override
    public long getStartMs() {
      return startMs_;
    }

    public static final int END_MS_FIELD_NUMBER = 4;
    private long endMs_;
    /**
     * <pre>
     * End time in milliseconds.
     * </pre>
     *
     * <code>int64 end_ms = 4;</code>
     * @return The endMs.
     */
    @Override
    public long getEndMs() {
      return endMs_;
    }

    public static final int GROUPING_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList grouping_;
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @return A list containing the grouping.
     */
    public com.google.protobuf.ProtocolStringList
        getGroupingList() {
      return grouping_;
    }
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @return The count of grouping.
     */
    public int getGroupingCount() {
      return grouping_.size();
    }
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @param index The index of the element to return.
     * @return The grouping at the given index.
     */
    public String getGrouping(int index) {
      return grouping_.get(index);
    }
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the grouping at the given index.
     */
    public com.google.protobuf.ByteString
        getGroupingBytes(int index) {
      return grouping_.getByteString(index);
    }

    public static final int BY_FIELD_NUMBER = 6;
    private boolean by_;
    /**
     * <pre>
     * Indicate whether it is without or by.
     * </pre>
     *
     * <code>bool by = 6;</code>
     * @return The by.
     */
    @Override
    public boolean getBy() {
      return by_;
    }

    public static final int RANGE_MS_FIELD_NUMBER = 7;
    private long rangeMs_;
    /**
     * <pre>
     * Range vector selector range in milliseconds.
     * </pre>
     *
     * <code>int64 range_ms = 7;</code>
     * @return The rangeMs.
     */
    @Override
    public long getRangeMs() {
      return rangeMs_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (stepMs_ != 0L) {
        output.writeInt64(1, stepMs_);
      }
      if (!getFuncBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, func_);
      }
      if (startMs_ != 0L) {
        output.writeInt64(3, startMs_);
      }
      if (endMs_ != 0L) {
        output.writeInt64(4, endMs_);
      }
      for (int i = 0; i < grouping_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, grouping_.getRaw(i));
      }
      if (by_ != false) {
        output.writeBool(6, by_);
      }
      if (rangeMs_ != 0L) {
        output.writeInt64(7, rangeMs_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stepMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, stepMs_);
      }
      if (!getFuncBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, func_);
      }
      if (startMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, startMs_);
      }
      if (endMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, endMs_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < grouping_.size(); i++) {
          dataSize += computeStringSizeNoTag(grouping_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getGroupingList().size();
      }
      if (by_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, by_);
      }
      if (rangeMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, rangeMs_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.ReadHints)) {
        return super.equals(obj);
      }
      Types.ReadHints other = (Types.ReadHints) obj;

      if (getStepMs()
          != other.getStepMs()) return false;
      if (!getFunc()
          .equals(other.getFunc())) return false;
      if (getStartMs()
          != other.getStartMs()) return false;
      if (getEndMs()
          != other.getEndMs()) return false;
      if (!getGroupingList()
          .equals(other.getGroupingList())) return false;
      if (getBy()
          != other.getBy()) return false;
      if (getRangeMs()
          != other.getRangeMs()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + STEP_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStepMs());
      hash = (37 * hash) + FUNC_FIELD_NUMBER;
      hash = (53 * hash) + getFunc().hashCode();
      hash = (37 * hash) + START_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartMs());
      hash = (37 * hash) + END_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEndMs());
      if (getGroupingCount() > 0) {
        hash = (37 * hash) + GROUPING_FIELD_NUMBER;
        hash = (53 * hash) + getGroupingList().hashCode();
      }
      hash = (37 * hash) + BY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBy());
      hash = (37 * hash) + RANGE_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRangeMs());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.ReadHints parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.ReadHints parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.ReadHints parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.ReadHints parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.ReadHints parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.ReadHints parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.ReadHints parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.ReadHints parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.ReadHints parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.ReadHints parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.ReadHints parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.ReadHints parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.ReadHints prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ReadHints}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReadHints)
        Types.ReadHintsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_ReadHints_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_ReadHints_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.ReadHints.class, Types.ReadHints.Builder.class);
      }

      // Construct using Types.ReadHints.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        stepMs_ = 0L;

        func_ = "";

        startMs_ = 0L;

        endMs_ = 0L;

        grouping_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        by_ = false;

        rangeMs_ = 0L;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_ReadHints_descriptor;
      }

      @Override
      public Types.ReadHints getDefaultInstanceForType() {
        return Types.ReadHints.getDefaultInstance();
      }

      @Override
      public Types.ReadHints build() {
        Types.ReadHints result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.ReadHints buildPartial() {
        Types.ReadHints result = new Types.ReadHints(this);
        int from_bitField0_ = bitField0_;
        result.stepMs_ = stepMs_;
        result.func_ = func_;
        result.startMs_ = startMs_;
        result.endMs_ = endMs_;
        if (((bitField0_ & 0x00000001) != 0)) {
          grouping_ = grouping_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.grouping_ = grouping_;
        result.by_ = by_;
        result.rangeMs_ = rangeMs_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.ReadHints) {
          return mergeFrom((Types.ReadHints)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.ReadHints other) {
        if (other == Types.ReadHints.getDefaultInstance()) return this;
        if (other.getStepMs() != 0L) {
          setStepMs(other.getStepMs());
        }
        if (!other.getFunc().isEmpty()) {
          func_ = other.func_;
          onChanged();
        }
        if (other.getStartMs() != 0L) {
          setStartMs(other.getStartMs());
        }
        if (other.getEndMs() != 0L) {
          setEndMs(other.getEndMs());
        }
        if (!other.grouping_.isEmpty()) {
          if (grouping_.isEmpty()) {
            grouping_ = other.grouping_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupingIsMutable();
            grouping_.addAll(other.grouping_);
          }
          onChanged();
        }
        if (other.getBy() != false) {
          setBy(other.getBy());
        }
        if (other.getRangeMs() != 0L) {
          setRangeMs(other.getRangeMs());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.ReadHints parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.ReadHints) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long stepMs_ ;
      /**
       * <pre>
       * Query step size in milliseconds.
       * </pre>
       *
       * <code>int64 step_ms = 1;</code>
       * @return The stepMs.
       */
      @Override
      public long getStepMs() {
        return stepMs_;
      }
      /**
       * <pre>
       * Query step size in milliseconds.
       * </pre>
       *
       * <code>int64 step_ms = 1;</code>
       * @param value The stepMs to set.
       * @return This builder for chaining.
       */
      public Builder setStepMs(long value) {

        stepMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Query step size in milliseconds.
       * </pre>
       *
       * <code>int64 step_ms = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStepMs() {

        stepMs_ = 0L;
        onChanged();
        return this;
      }

      private Object func_ = "";
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @return The func.
       */
      public String getFunc() {
        Object ref = func_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          func_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @return The bytes for func.
       */
      public com.google.protobuf.ByteString
          getFuncBytes() {
        Object ref = func_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          func_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @param value The func to set.
       * @return This builder for chaining.
       */
      public Builder setFunc(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        func_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFunc() {

        func_ = getDefaultInstance().getFunc();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @param value The bytes for func to set.
       * @return This builder for chaining.
       */
      public Builder setFuncBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        func_ = value;
        onChanged();
        return this;
      }

      private long startMs_ ;
      /**
       * <pre>
       * Start time in milliseconds.
       * </pre>
       *
       * <code>int64 start_ms = 3;</code>
       * @return The startMs.
       */
      @Override
      public long getStartMs() {
        return startMs_;
      }
      /**
       * <pre>
       * Start time in milliseconds.
       * </pre>
       *
       * <code>int64 start_ms = 3;</code>
       * @param value The startMs to set.
       * @return This builder for chaining.
       */
      public Builder setStartMs(long value) {

        startMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Start time in milliseconds.
       * </pre>
       *
       * <code>int64 start_ms = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartMs() {

        startMs_ = 0L;
        onChanged();
        return this;
      }

      private long endMs_ ;
      /**
       * <pre>
       * End time in milliseconds.
       * </pre>
       *
       * <code>int64 end_ms = 4;</code>
       * @return The endMs.
       */
      @Override
      public long getEndMs() {
        return endMs_;
      }
      /**
       * <pre>
       * End time in milliseconds.
       * </pre>
       *
       * <code>int64 end_ms = 4;</code>
       * @param value The endMs to set.
       * @return This builder for chaining.
       */
      public Builder setEndMs(long value) {

        endMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * End time in milliseconds.
       * </pre>
       *
       * <code>int64 end_ms = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndMs() {

        endMs_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList grouping_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureGroupingIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          grouping_ = new com.google.protobuf.LazyStringArrayList(grouping_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @return A list containing the grouping.
       */
      public com.google.protobuf.ProtocolStringList
          getGroupingList() {
        return grouping_.getUnmodifiableView();
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @return The count of grouping.
       */
      public int getGroupingCount() {
        return grouping_.size();
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param index The index of the element to return.
       * @return The grouping at the given index.
       */
      public String getGrouping(int index) {
        return grouping_.get(index);
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param index The index of the value to return.
       * @return The bytes of the grouping at the given index.
       */
      public com.google.protobuf.ByteString
          getGroupingBytes(int index) {
        return grouping_.getByteString(index);
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param index The index to set the value at.
       * @param value The grouping to set.
       * @return This builder for chaining.
       */
      public Builder setGrouping(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureGroupingIsMutable();
        grouping_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param value The grouping to add.
       * @return This builder for chaining.
       */
      public Builder addGrouping(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureGroupingIsMutable();
        grouping_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param values The grouping to add.
       * @return This builder for chaining.
       */
      public Builder addAllGrouping(
          Iterable<String> values) {
        ensureGroupingIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, grouping_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrouping() {
        grouping_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param value The bytes of the grouping to add.
       * @return This builder for chaining.
       */
      public Builder addGroupingBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureGroupingIsMutable();
        grouping_.add(value);
        onChanged();
        return this;
      }

      private boolean by_ ;
      /**
       * <pre>
       * Indicate whether it is without or by.
       * </pre>
       *
       * <code>bool by = 6;</code>
       * @return The by.
       */
      @Override
      public boolean getBy() {
        return by_;
      }
      /**
       * <pre>
       * Indicate whether it is without or by.
       * </pre>
       *
       * <code>bool by = 6;</code>
       * @param value The by to set.
       * @return This builder for chaining.
       */
      public Builder setBy(boolean value) {

        by_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Indicate whether it is without or by.
       * </pre>
       *
       * <code>bool by = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBy() {

        by_ = false;
        onChanged();
        return this;
      }

      private long rangeMs_ ;
      /**
       * <pre>
       * Range vector selector range in milliseconds.
       * </pre>
       *
       * <code>int64 range_ms = 7;</code>
       * @return The rangeMs.
       */
      @Override
      public long getRangeMs() {
        return rangeMs_;
      }
      /**
       * <pre>
       * Range vector selector range in milliseconds.
       * </pre>
       *
       * <code>int64 range_ms = 7;</code>
       * @param value The rangeMs to set.
       * @return This builder for chaining.
       */
      public Builder setRangeMs(long value) {

        rangeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Range vector selector range in milliseconds.
       * </pre>
       *
       * <code>int64 range_ms = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRangeMs() {

        rangeMs_ = 0L;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ReadHints)
    }

    // @@protoc_insertion_point(class_scope:ReadHints)
    private static final Types.ReadHints DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.ReadHints();
    }

    public static Types.ReadHints getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReadHints>
        PARSER = new com.google.protobuf.AbstractParser<ReadHints>() {
      @Override
      public ReadHints parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadHints(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReadHints> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ReadHints> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.ReadHints getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChunkOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Chunk)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 min_time_ms = 1;</code>
     * @return The minTimeMs.
     */
    long getMinTimeMs();

    /**
     * <code>int64 max_time_ms = 2;</code>
     * @return The maxTimeMs.
     */
    long getMaxTimeMs();

    /**
     * <code>.Chunk.Encoding type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.Chunk.Encoding type = 3;</code>
     * @return The type.
     */
    Types.Chunk.Encoding getType();

    /**
     * <code>bytes data = 4;</code>
     * @return The data.
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * <pre>
   * Chunk represents a TSDB chunk.
   * Time range [min, max] is inclusive.
   * </pre>
   *
   * Protobuf type {@code Chunk}
   */
  public static final class Chunk extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Chunk)
      ChunkOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Chunk.newBuilder() to construct.
    private Chunk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Chunk() {
      type_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Chunk();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Chunk(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              minTimeMs_ = input.readInt64();
              break;
            }
            case 16: {

              maxTimeMs_ = input.readInt64();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 34: {

              data_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_Chunk_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_Chunk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.Chunk.class, Types.Chunk.Builder.class);
    }

    /**
     * <pre>
     * We require this to match chunkenc.Encoding.
     * </pre>
     *
     * Protobuf enum {@code Chunk.Encoding}
     */
    public enum Encoding
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>XOR = 1;</code>
       */
      XOR(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>XOR = 1;</code>
       */
      public static final int XOR_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static Encoding valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Encoding forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return XOR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Encoding>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Encoding> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Encoding>() {
              public Encoding findValueByNumber(int number) {
                return Encoding.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Types.Chunk.getDescriptor().getEnumTypes().get(0);
      }

      private static final Encoding[] VALUES = values();

      public static Encoding valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Encoding(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Chunk.Encoding)
    }

    public static final int MIN_TIME_MS_FIELD_NUMBER = 1;
    private long minTimeMs_;
    /**
     * <code>int64 min_time_ms = 1;</code>
     * @return The minTimeMs.
     */
    @Override
    public long getMinTimeMs() {
      return minTimeMs_;
    }

    public static final int MAX_TIME_MS_FIELD_NUMBER = 2;
    private long maxTimeMs_;
    /**
     * <code>int64 max_time_ms = 2;</code>
     * @return The maxTimeMs.
     */
    @Override
    public long getMaxTimeMs() {
      return maxTimeMs_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>.Chunk.Encoding type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.Chunk.Encoding type = 3;</code>
     * @return The type.
     */
    @Override
    public Types.Chunk.Encoding getType() {
      @SuppressWarnings("deprecation")
      Types.Chunk.Encoding result = Types.Chunk.Encoding.valueOf(type_);
      return result == null ? Types.Chunk.Encoding.UNRECOGNIZED : result;
    }

    public static final int DATA_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>bytes data = 4;</code>
     * @return The data.
     */
    @Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (minTimeMs_ != 0L) {
        output.writeInt64(1, minTimeMs_);
      }
      if (maxTimeMs_ != 0L) {
        output.writeInt64(2, maxTimeMs_);
      }
      if (type_ != Types.Chunk.Encoding.UNKNOWN.getNumber()) {
        output.writeEnum(3, type_);
      }
      if (!data_.isEmpty()) {
        output.writeBytes(4, data_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (minTimeMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, minTimeMs_);
      }
      if (maxTimeMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, maxTimeMs_);
      }
      if (type_ != Types.Chunk.Encoding.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, data_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.Chunk)) {
        return super.equals(obj);
      }
      Types.Chunk other = (Types.Chunk) obj;

      if (getMinTimeMs()
          != other.getMinTimeMs()) return false;
      if (getMaxTimeMs()
          != other.getMaxTimeMs()) return false;
      if (type_ != other.type_) return false;
      if (!getData()
          .equals(other.getData())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MIN_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMinTimeMs());
      hash = (37 * hash) + MAX_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxTimeMs());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.Chunk parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Chunk parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Chunk parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Chunk parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Chunk parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.Chunk parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.Chunk parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.Chunk parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.Chunk parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.Chunk parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.Chunk parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.Chunk parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.Chunk prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Chunk represents a TSDB chunk.
     * Time range [min, max] is inclusive.
     * </pre>
     *
     * Protobuf type {@code Chunk}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Chunk)
        Types.ChunkOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_Chunk_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_Chunk_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.Chunk.class, Types.Chunk.Builder.class);
      }

      // Construct using Types.Chunk.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        minTimeMs_ = 0L;

        maxTimeMs_ = 0L;

        type_ = 0;

        data_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_Chunk_descriptor;
      }

      @Override
      public Types.Chunk getDefaultInstanceForType() {
        return Types.Chunk.getDefaultInstance();
      }

      @Override
      public Types.Chunk build() {
        Types.Chunk result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.Chunk buildPartial() {
        Types.Chunk result = new Types.Chunk(this);
        result.minTimeMs_ = minTimeMs_;
        result.maxTimeMs_ = maxTimeMs_;
        result.type_ = type_;
        result.data_ = data_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.Chunk) {
          return mergeFrom((Types.Chunk)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.Chunk other) {
        if (other == Types.Chunk.getDefaultInstance()) return this;
        if (other.getMinTimeMs() != 0L) {
          setMinTimeMs(other.getMinTimeMs());
        }
        if (other.getMaxTimeMs() != 0L) {
          setMaxTimeMs(other.getMaxTimeMs());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.Chunk parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.Chunk) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long minTimeMs_ ;
      /**
       * <code>int64 min_time_ms = 1;</code>
       * @return The minTimeMs.
       */
      @Override
      public long getMinTimeMs() {
        return minTimeMs_;
      }
      /**
       * <code>int64 min_time_ms = 1;</code>
       * @param value The minTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setMinTimeMs(long value) {

        minTimeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 min_time_ms = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinTimeMs() {

        minTimeMs_ = 0L;
        onChanged();
        return this;
      }

      private long maxTimeMs_ ;
      /**
       * <code>int64 max_time_ms = 2;</code>
       * @return The maxTimeMs.
       */
      @Override
      public long getMaxTimeMs() {
        return maxTimeMs_;
      }
      /**
       * <code>int64 max_time_ms = 2;</code>
       * @param value The maxTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setMaxTimeMs(long value) {

        maxTimeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 max_time_ms = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxTimeMs() {

        maxTimeMs_ = 0L;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.Chunk.Encoding type = 3;</code>
       * @return The enum numeric value on the wire for type.
       */
      @Override
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.Chunk.Encoding type = 3;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {

        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Chunk.Encoding type = 3;</code>
       * @return The type.
       */
      @Override
      public Types.Chunk.Encoding getType() {
        @SuppressWarnings("deprecation")
        Types.Chunk.Encoding result = Types.Chunk.Encoding.valueOf(type_);
        return result == null ? Types.Chunk.Encoding.UNRECOGNIZED : result;
      }
      /**
       * <code>.Chunk.Encoding type = 3;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(Types.Chunk.Encoding value) {
        if (value == null) {
          throw new NullPointerException();
        }

        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Chunk.Encoding type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {

        type_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes data = 4;</code>
       * @return The data.
       */
      @Override
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>bytes data = 4;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }

        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes data = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {

        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Chunk)
    }

    // @@protoc_insertion_point(class_scope:Chunk)
    private static final Types.Chunk DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.Chunk();
    }

    public static Types.Chunk getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Chunk>
        PARSER = new com.google.protobuf.AbstractParser<Chunk>() {
      @Override
      public Chunk parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Chunk(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Chunk> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Chunk> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.Chunk getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChunkedSeriesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChunkedSeries)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<Types.Label>
        getLabelsList();
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    Types.Label getLabels(int index);
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    int getLabelsCount();
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends Types.LabelOrBuilder>
        getLabelsOrBuilderList();
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    Types.LabelOrBuilder getLabelsOrBuilder(
            int index);

    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<Types.Chunk>
        getChunksList();
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    Types.Chunk getChunks(int index);
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    int getChunksCount();
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends Types.ChunkOrBuilder>
        getChunksOrBuilderList();
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    Types.ChunkOrBuilder getChunksOrBuilder(
            int index);
  }
  /**
   * <pre>
   * ChunkedSeries represents single, encoded time series.
   * </pre>
   *
   * Protobuf type {@code ChunkedSeries}
   */
  public static final class ChunkedSeries extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChunkedSeries)
      ChunkedSeriesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChunkedSeries.newBuilder() to construct.
    private ChunkedSeries(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChunkedSeries() {
      labels_ = java.util.Collections.emptyList();
      chunks_ = java.util.Collections.emptyList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChunkedSeries();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChunkedSeries(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                labels_ = new java.util.ArrayList<Types.Label>();
                mutable_bitField0_ |= 0x00000001;
              }
              labels_.add(
                  input.readMessage(Types.Label.parser(), extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                chunks_ = new java.util.ArrayList<Types.Chunk>();
                mutable_bitField0_ |= 0x00000002;
              }
              chunks_.add(
                  input.readMessage(Types.Chunk.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          chunks_ = java.util.Collections.unmodifiableList(chunks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_prometheus_ChunkedSeries_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_prometheus_ChunkedSeries_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Types.ChunkedSeries.class, Types.ChunkedSeries.Builder.class);
    }

    public static final int LABELS_FIELD_NUMBER = 1;
    private java.util.List<Types.Label> labels_;
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<Types.Label> getLabelsList() {
      return labels_;
    }
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<? extends Types.LabelOrBuilder>
        getLabelsOrBuilderList() {
      return labels_;
    }
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.Label getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.LabelOrBuilder getLabelsOrBuilder(
        int index) {
      return labels_.get(index);
    }

    public static final int CHUNKS_FIELD_NUMBER = 2;
    private java.util.List<Types.Chunk> chunks_;
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<Types.Chunk> getChunksList() {
      return chunks_;
    }
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public java.util.List<? extends Types.ChunkOrBuilder>
        getChunksOrBuilderList() {
      return chunks_;
    }
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public int getChunksCount() {
      return chunks_.size();
    }
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.Chunk getChunks(int index) {
      return chunks_.get(index);
    }
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @Override
    public Types.ChunkOrBuilder getChunksOrBuilder(
        int index) {
      return chunks_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < labels_.size(); i++) {
        output.writeMessage(1, labels_.get(i));
      }
      for (int i = 0; i < chunks_.size(); i++) {
        output.writeMessage(2, chunks_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < labels_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, labels_.get(i));
      }
      for (int i = 0; i < chunks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, chunks_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Types.ChunkedSeries)) {
        return super.equals(obj);
      }
      Types.ChunkedSeries other = (Types.ChunkedSeries) obj;

      if (!getLabelsList()
          .equals(other.getLabelsList())) return false;
      if (!getChunksList()
          .equals(other.getChunksList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getLabelsCount() > 0) {
        hash = (37 * hash) + LABELS_FIELD_NUMBER;
        hash = (53 * hash) + getLabelsList().hashCode();
      }
      if (getChunksCount() > 0) {
        hash = (37 * hash) + CHUNKS_FIELD_NUMBER;
        hash = (53 * hash) + getChunksList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Types.ChunkedSeries parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.ChunkedSeries parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.ChunkedSeries parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.ChunkedSeries parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.ChunkedSeries parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Types.ChunkedSeries parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Types.ChunkedSeries parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.ChunkedSeries parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.ChunkedSeries parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Types.ChunkedSeries parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Types.ChunkedSeries parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Types.ChunkedSeries parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Types.ChunkedSeries prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * ChunkedSeries represents single, encoded time series.
     * </pre>
     *
     * Protobuf type {@code ChunkedSeries}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChunkedSeries)
        Types.ChunkedSeriesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Types.internal_static_prometheus_ChunkedSeries_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Types.internal_static_prometheus_ChunkedSeries_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Types.ChunkedSeries.class, Types.ChunkedSeries.Builder.class);
      }

      // Construct using Types.ChunkedSeries.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getLabelsFieldBuilder();
          getChunksFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          labelsBuilder_.clear();
        }
        if (chunksBuilder_ == null) {
          chunks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          chunksBuilder_.clear();
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Types.internal_static_prometheus_ChunkedSeries_descriptor;
      }

      @Override
      public Types.ChunkedSeries getDefaultInstanceForType() {
        return Types.ChunkedSeries.getDefaultInstance();
      }

      @Override
      public Types.ChunkedSeries build() {
        Types.ChunkedSeries result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Types.ChunkedSeries buildPartial() {
        Types.ChunkedSeries result = new Types.ChunkedSeries(this);
        int from_bitField0_ = bitField0_;
        if (labelsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            labels_ = java.util.Collections.unmodifiableList(labels_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.labels_ = labels_;
        } else {
          result.labels_ = labelsBuilder_.build();
        }
        if (chunksBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            chunks_ = java.util.Collections.unmodifiableList(chunks_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.chunks_ = chunks_;
        } else {
          result.chunks_ = chunksBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Types.ChunkedSeries) {
          return mergeFrom((Types.ChunkedSeries)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Types.ChunkedSeries other) {
        if (other == Types.ChunkedSeries.getDefaultInstance()) return this;
        if (labelsBuilder_ == null) {
          if (!other.labels_.isEmpty()) {
            if (labels_.isEmpty()) {
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLabelsIsMutable();
              labels_.addAll(other.labels_);
            }
            onChanged();
          }
        } else {
          if (!other.labels_.isEmpty()) {
            if (labelsBuilder_.isEmpty()) {
              labelsBuilder_.dispose();
              labelsBuilder_ = null;
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
              labelsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLabelsFieldBuilder() : null;
            } else {
              labelsBuilder_.addAllMessages(other.labels_);
            }
          }
        }
        if (chunksBuilder_ == null) {
          if (!other.chunks_.isEmpty()) {
            if (chunks_.isEmpty()) {
              chunks_ = other.chunks_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureChunksIsMutable();
              chunks_.addAll(other.chunks_);
            }
            onChanged();
          }
        } else {
          if (!other.chunks_.isEmpty()) {
            if (chunksBuilder_.isEmpty()) {
              chunksBuilder_.dispose();
              chunksBuilder_ = null;
              chunks_ = other.chunks_;
              bitField0_ = (bitField0_ & ~0x00000002);
              chunksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChunksFieldBuilder() : null;
            } else {
              chunksBuilder_.addAllMessages(other.chunks_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Types.ChunkedSeries parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Types.ChunkedSeries) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<Types.Label> labels_ =
        java.util.Collections.emptyList();
      private void ensureLabelsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          labels_ = new java.util.ArrayList<Types.Label>(labels_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Label, Types.Label.Builder, Types.LabelOrBuilder> labelsBuilder_;

      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Label> getLabelsList() {
        if (labelsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(labels_);
        } else {
          return labelsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public int getLabelsCount() {
        if (labelsBuilder_ == null) {
          return labels_.size();
        } else {
          return labelsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label getLabels(int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);
        } else {
          return labelsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.set(index, value);
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.set(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(index, value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllLabels(
          Iterable<? extends Label> values) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, labels_);
          onChanged();
        } else {
          labelsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearLabels() {
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          labelsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeLabels(int index) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.remove(index);
          onChanged();
        } else {
          labelsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder getLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.LabelOrBuilder getLabelsOrBuilder(
          int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);  } else {
          return labelsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends Types.LabelOrBuilder>
           getLabelsOrBuilderList() {
        if (labelsBuilder_ != null) {
          return labelsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(labels_);
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder addLabelsBuilder() {
        return getLabelsFieldBuilder().addBuilder(
            Types.Label.getDefaultInstance());
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Label.Builder addLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().addBuilder(
            index, Types.Label.getDefaultInstance());
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Label.Builder>
           getLabelsBuilderList() {
        return getLabelsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Label, Types.Label.Builder, Types.LabelOrBuilder>
          getLabelsFieldBuilder() {
        if (labelsBuilder_ == null) {
          labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Types.Label, Types.Label.Builder, Types.LabelOrBuilder>(
                  labels_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          labels_ = null;
        }
        return labelsBuilder_;
      }

      private java.util.List<Types.Chunk> chunks_ =
        java.util.Collections.emptyList();
      private void ensureChunksIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          chunks_ = new java.util.ArrayList<Types.Chunk>(chunks_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Chunk, Types.Chunk.Builder, Types.ChunkOrBuilder> chunksBuilder_;

      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Chunk> getChunksList() {
        if (chunksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chunks_);
        } else {
          return chunksBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public int getChunksCount() {
        if (chunksBuilder_ == null) {
          return chunks_.size();
        } else {
          return chunksBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Chunk getChunks(int index) {
        if (chunksBuilder_ == null) {
          return chunks_.get(index);
        } else {
          return chunksBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setChunks(
          int index, Types.Chunk value) {
        if (chunksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunksIsMutable();
          chunks_.set(index, value);
          onChanged();
        } else {
          chunksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setChunks(
          int index, Types.Chunk.Builder builderForValue) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          chunks_.set(index, builderForValue.build());
          onChanged();
        } else {
          chunksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addChunks(Types.Chunk value) {
        if (chunksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunksIsMutable();
          chunks_.add(value);
          onChanged();
        } else {
          chunksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addChunks(
          int index, Types.Chunk value) {
        if (chunksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunksIsMutable();
          chunks_.add(index, value);
          onChanged();
        } else {
          chunksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addChunks(
          Types.Chunk.Builder builderForValue) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          chunks_.add(builderForValue.build());
          onChanged();
        } else {
          chunksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addChunks(
          int index, Types.Chunk.Builder builderForValue) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          chunks_.add(index, builderForValue.build());
          onChanged();
        } else {
          chunksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllChunks(
          Iterable<? extends Chunk> values) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chunks_);
          onChanged();
        } else {
          chunksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearChunks() {
        if (chunksBuilder_ == null) {
          chunks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          chunksBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeChunks(int index) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          chunks_.remove(index);
          onChanged();
        } else {
          chunksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Chunk.Builder getChunksBuilder(
          int index) {
        return getChunksFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.ChunkOrBuilder getChunksOrBuilder(
          int index) {
        if (chunksBuilder_ == null) {
          return chunks_.get(index);  } else {
          return chunksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends Types.ChunkOrBuilder>
           getChunksOrBuilderList() {
        if (chunksBuilder_ != null) {
          return chunksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chunks_);
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Chunk.Builder addChunksBuilder() {
        return getChunksFieldBuilder().addBuilder(
            Types.Chunk.getDefaultInstance());
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Types.Chunk.Builder addChunksBuilder(
          int index) {
        return getChunksFieldBuilder().addBuilder(
            index, Types.Chunk.getDefaultInstance());
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<Types.Chunk.Builder>
           getChunksBuilderList() {
        return getChunksFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Types.Chunk, Types.Chunk.Builder, Types.ChunkOrBuilder>
          getChunksFieldBuilder() {
        if (chunksBuilder_ == null) {
          chunksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Types.Chunk, Types.Chunk.Builder, Types.ChunkOrBuilder>(
                  chunks_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          chunks_ = null;
        }
        return chunksBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ChunkedSeries)
    }

    // @@protoc_insertion_point(class_scope:ChunkedSeries)
    private static final Types.ChunkedSeries DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Types.ChunkedSeries();
    }

    public static Types.ChunkedSeries getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChunkedSeries>
        PARSER = new com.google.protobuf.AbstractParser<ChunkedSeries>() {
      @Override
      public ChunkedSeries parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChunkedSeries(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChunkedSeries> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ChunkedSeries> getParserForType() {
      return PARSER;
    }

    @Override
    public Types.ChunkedSeries getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_MetricMetadata_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_MetricMetadata_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_Sample_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_Sample_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_TimeSeries_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_TimeSeries_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_Label_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_Label_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_Labels_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_Labels_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_LabelMatcher_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_LabelMatcher_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_ReadHints_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_ReadHints_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_Chunk_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_Chunk_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_ChunkedSeries_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_ChunkedSeries_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013types.proto\022\nprometheus\032\024gogoproto/gog" +
      "o.proto\"\370\001\n\016MetricMetadata\0223\n\004type\030\001 \001(\016" +
      "2%.MetricMetadata.MetricType\022" +
      "\032\n\022metric_family_name\030\002 \001(\t\022\014\n\004help\030\004 \001(" +
      "\t\022\014\n\004unit\030\005 \001(\t\"y\n\nMetricType\022\013\n\007UNKNOWN" +
      "\020\000\022\013\n\007COUNTER\020\001\022\t\n\005GAUGE\020\002\022\r\n\tHISTOGRAM\020" +
      "\003\022\022\n\016GAUGEHISTOGRAM\020\004\022\013\n\007SUMMARY\020\005\022\010\n\004IN" +
      "FO\020\006\022\014\n\010STATESET\020\007\"*\n\006Sample\022\r\n\005value\030\001 " +
      "\001(\001\022\021\n\ttimestamp\030\002 \001(\003\"`\n\nTimeSeries\022\'\n\006" +
      "labels\030\001 \003(\0132\021.LabelB\004\310\336\037\000\022)\n" +
      "\007samples\030\002 \003(\0132\022.SampleB\004\310\336\037\000" +
      "\"$\n\005Label\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"1" +
      "\n\006Labels\022\'\n\006labels\030\001 \003(\0132\021.La" +
      "belB\004\310\336\037\000\"\202\001\n\014LabelMatcher\022+\n\004type\030\001 \001(\016" +
      "2\035.LabelMatcher.Type\022\014\n\004name\030" +
      "\002 \001(\t\022\r\n\005value\030\003 \001(\t\"(\n\004Type\022\006\n\002EQ\020\000\022\007\n\003" +
      "NEQ\020\001\022\006\n\002RE\020\002\022\007\n\003NRE\020\003\"|\n\tReadHints\022\017\n\007s" +
      "tep_ms\030\001 \001(\003\022\014\n\004func\030\002 \001(\t\022\020\n\010start_ms\030\003" +
      " \001(\003\022\016\n\006end_ms\030\004 \001(\003\022\020\n\010grouping\030\005 \003(\t\022\n" +
      "\n\002by\030\006 \001(\010\022\020\n\010range_ms\030\007 \001(\003\"\213\001\n\005Chunk\022\023" +
      "\n\013min_time_ms\030\001 \001(\003\022\023\n\013max_time_ms\030\002 \001(\003" +
      "\022(\n\004type\030\003 \001(\0162\032.Chunk.Encodi" +
      "ng\022\014\n\004data\030\004 \001(\014\" \n\010Encoding\022\013\n\007UNKNOWN\020" +
      "\000\022\007\n\003XOR\020\001\"a\n\rChunkedSeries\022\'\n\006labels\030\001 " +
      "\003(\0132\021.LabelB\004\310\336\037\000\022\'\n\006chunks\030\002" +
      " \003(\0132\021.ChunkB\004\310\336\037\000B\010Z\006prompbb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GoGoProtos.getDescriptor(),
        });
    internal_static_prometheus_MetricMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_prometheus_MetricMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_MetricMetadata_descriptor,
        new String[] { "Type", "MetricFamilyName", "Help", "Unit", });
    internal_static_prometheus_Sample_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_prometheus_Sample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_Sample_descriptor,
        new String[] { "Value", "Timestamp", });
    internal_static_prometheus_TimeSeries_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_prometheus_TimeSeries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_TimeSeries_descriptor,
        new String[] { "Labels", "Samples", });
    internal_static_prometheus_Label_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_prometheus_Label_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_Label_descriptor,
        new String[] { "Name", "Value", });
    internal_static_prometheus_Labels_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_prometheus_Labels_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_Labels_descriptor,
        new String[] { "Labels", });
    internal_static_prometheus_LabelMatcher_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_prometheus_LabelMatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_LabelMatcher_descriptor,
        new String[] { "Type", "Name", "Value", });
    internal_static_prometheus_ReadHints_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_prometheus_ReadHints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_ReadHints_descriptor,
        new String[] { "StepMs", "Func", "StartMs", "EndMs", "Grouping", "By", "RangeMs", });
    internal_static_prometheus_Chunk_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_prometheus_Chunk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_Chunk_descriptor,
        new String[] { "MinTimeMs", "MaxTimeMs", "Type", "Data", });
    internal_static_prometheus_ChunkedSeries_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_prometheus_ChunkedSeries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_ChunkedSeries_descriptor,
        new String[] { "Labels", "Chunks", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
