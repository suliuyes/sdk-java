// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/protocol/command.proto

package com.v2ray.core.common.protocol;

public final class CommandProto {
  private CommandProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AlternativeOutboundConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:v2ray.core.common.protocol.AlternativeOutboundConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    boolean hasSettings();
    /**
     * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    com.v2ray.core.common.serial.TypedMessageProto.TypedMessage getSettings();
    /**
     * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    com.v2ray.core.common.serial.TypedMessageProto.TypedMessageOrBuilder getSettingsOrBuilder();

    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    boolean hasStreamSettings();
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    com.v2ray.core.transport.internet.ConfigProto.StreamConfig getStreamSettings();
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    com.v2ray.core.transport.internet.ConfigProto.StreamConfigOrBuilder getStreamSettingsOrBuilder();
  }
  /**
   * Protobuf type {@code v2ray.core.common.protocol.AlternativeOutboundConfig}
   */
  public  static final class AlternativeOutboundConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:v2ray.core.common.protocol.AlternativeOutboundConfig)
      AlternativeOutboundConfigOrBuilder {
    // Use AlternativeOutboundConfig.newBuilder() to construct.
    private AlternativeOutboundConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AlternativeOutboundConfig() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AlternativeOutboundConfig(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.Builder subBuilder = null;
              if (settings_ != null) {
                subBuilder = settings_.toBuilder();
              }
              settings_ = input.readMessage(com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(settings_);
                settings_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              com.v2ray.core.transport.internet.ConfigProto.StreamConfig.Builder subBuilder = null;
              if (streamSettings_ != null) {
                subBuilder = streamSettings_.toBuilder();
              }
              streamSettings_ = input.readMessage(com.v2ray.core.transport.internet.ConfigProto.StreamConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(streamSettings_);
                streamSettings_ = subBuilder.buildPartial();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.common.protocol.CommandProto.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.common.protocol.CommandProto.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig.class, com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig.Builder.class);
    }

    public static final int SETTINGS_FIELD_NUMBER = 1;
    private com.v2ray.core.common.serial.TypedMessageProto.TypedMessage settings_;
    /**
     * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public boolean hasSettings() {
      return settings_ != null;
    }
    /**
     * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageProto.TypedMessage getSettings() {
      return settings_ == null ? com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.getDefaultInstance() : settings_;
    }
    /**
     * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageProto.TypedMessageOrBuilder getSettingsOrBuilder() {
      return getSettings();
    }

    public static final int STREAM_SETTINGS_FIELD_NUMBER = 3;
    private com.v2ray.core.transport.internet.ConfigProto.StreamConfig streamSettings_;
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public boolean hasStreamSettings() {
      return streamSettings_ != null;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public com.v2ray.core.transport.internet.ConfigProto.StreamConfig getStreamSettings() {
      return streamSettings_ == null ? com.v2ray.core.transport.internet.ConfigProto.StreamConfig.getDefaultInstance() : streamSettings_;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public com.v2ray.core.transport.internet.ConfigProto.StreamConfigOrBuilder getStreamSettingsOrBuilder() {
      return getStreamSettings();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (settings_ != null) {
        output.writeMessage(1, getSettings());
      }
      if (streamSettings_ != null) {
        output.writeMessage(3, getStreamSettings());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (settings_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSettings());
      }
      if (streamSettings_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getStreamSettings());
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig)) {
        return super.equals(obj);
      }
      com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig other = (com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig) obj;

      boolean result = true;
      result = result && (hasSettings() == other.hasSettings());
      if (hasSettings()) {
        result = result && getSettings()
            .equals(other.getSettings());
      }
      result = result && (hasStreamSettings() == other.hasStreamSettings());
      if (hasStreamSettings()) {
        result = result && getStreamSettings()
            .equals(other.getStreamSettings());
      }
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasSettings()) {
        hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
        hash = (53 * hash) + getSettings().hashCode();
      }
      if (hasStreamSettings()) {
        hash = (37 * hash) + STREAM_SETTINGS_FIELD_NUMBER;
        hash = (53 * hash) + getStreamSettings().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code v2ray.core.common.protocol.AlternativeOutboundConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:v2ray.core.common.protocol.AlternativeOutboundConfig)
        com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.v2ray.core.common.protocol.CommandProto.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.v2ray.core.common.protocol.CommandProto.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig.class, com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig.Builder.class);
      }

      // Construct using com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        if (settingsBuilder_ == null) {
          settings_ = null;
        } else {
          settings_ = null;
          settingsBuilder_ = null;
        }
        if (streamSettingsBuilder_ == null) {
          streamSettings_ = null;
        } else {
          streamSettings_ = null;
          streamSettingsBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.v2ray.core.common.protocol.CommandProto.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor;
      }

      public com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig getDefaultInstanceForType() {
        return com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig.getDefaultInstance();
      }

      public com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig build() {
        com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig buildPartial() {
        com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig result = new com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig(this);
        if (settingsBuilder_ == null) {
          result.settings_ = settings_;
        } else {
          result.settings_ = settingsBuilder_.build();
        }
        if (streamSettingsBuilder_ == null) {
          result.streamSettings_ = streamSettings_;
        } else {
          result.streamSettings_ = streamSettingsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig) {
          return mergeFrom((com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig other) {
        if (other == com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig.getDefaultInstance()) return this;
        if (other.hasSettings()) {
          mergeSettings(other.getSettings());
        }
        if (other.hasStreamSettings()) {
          mergeStreamSettings(other.getStreamSettings());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.v2ray.core.common.serial.TypedMessageProto.TypedMessage settings_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.v2ray.core.common.serial.TypedMessageProto.TypedMessage, com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageProto.TypedMessageOrBuilder> settingsBuilder_;
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      public boolean hasSettings() {
        return settingsBuilder_ != null || settings_ != null;
      }
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      public com.v2ray.core.common.serial.TypedMessageProto.TypedMessage getSettings() {
        if (settingsBuilder_ == null) {
          return settings_ == null ? com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.getDefaultInstance() : settings_;
        } else {
          return settingsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      public Builder setSettings(com.v2ray.core.common.serial.TypedMessageProto.TypedMessage value) {
        if (settingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settings_ = value;
          onChanged();
        } else {
          settingsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      public Builder setSettings(
          com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.Builder builderForValue) {
        if (settingsBuilder_ == null) {
          settings_ = builderForValue.build();
          onChanged();
        } else {
          settingsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      public Builder mergeSettings(com.v2ray.core.common.serial.TypedMessageProto.TypedMessage value) {
        if (settingsBuilder_ == null) {
          if (settings_ != null) {
            settings_ =
              com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.newBuilder(settings_).mergeFrom(value).buildPartial();
          } else {
            settings_ = value;
          }
          onChanged();
        } else {
          settingsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      public Builder clearSettings() {
        if (settingsBuilder_ == null) {
          settings_ = null;
          onChanged();
        } else {
          settings_ = null;
          settingsBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      public com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.Builder getSettingsBuilder() {
        
        onChanged();
        return getSettingsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      public com.v2ray.core.common.serial.TypedMessageProto.TypedMessageOrBuilder getSettingsOrBuilder() {
        if (settingsBuilder_ != null) {
          return settingsBuilder_.getMessageOrBuilder();
        } else {
          return settings_ == null ?
              com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.getDefaultInstance() : settings_;
        }
      }
      /**
       * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.v2ray.core.common.serial.TypedMessageProto.TypedMessage, com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageProto.TypedMessageOrBuilder> 
          getSettingsFieldBuilder() {
        if (settingsBuilder_ == null) {
          settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.v2ray.core.common.serial.TypedMessageProto.TypedMessage, com.v2ray.core.common.serial.TypedMessageProto.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageProto.TypedMessageOrBuilder>(
                  getSettings(),
                  getParentForChildren(),
                  isClean());
          settings_ = null;
        }
        return settingsBuilder_;
      }

      private com.v2ray.core.transport.internet.ConfigProto.StreamConfig streamSettings_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.v2ray.core.transport.internet.ConfigProto.StreamConfig, com.v2ray.core.transport.internet.ConfigProto.StreamConfig.Builder, com.v2ray.core.transport.internet.ConfigProto.StreamConfigOrBuilder> streamSettingsBuilder_;
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      public boolean hasStreamSettings() {
        return streamSettingsBuilder_ != null || streamSettings_ != null;
      }
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      public com.v2ray.core.transport.internet.ConfigProto.StreamConfig getStreamSettings() {
        if (streamSettingsBuilder_ == null) {
          return streamSettings_ == null ? com.v2ray.core.transport.internet.ConfigProto.StreamConfig.getDefaultInstance() : streamSettings_;
        } else {
          return streamSettingsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      public Builder setStreamSettings(com.v2ray.core.transport.internet.ConfigProto.StreamConfig value) {
        if (streamSettingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          streamSettings_ = value;
          onChanged();
        } else {
          streamSettingsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      public Builder setStreamSettings(
          com.v2ray.core.transport.internet.ConfigProto.StreamConfig.Builder builderForValue) {
        if (streamSettingsBuilder_ == null) {
          streamSettings_ = builderForValue.build();
          onChanged();
        } else {
          streamSettingsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      public Builder mergeStreamSettings(com.v2ray.core.transport.internet.ConfigProto.StreamConfig value) {
        if (streamSettingsBuilder_ == null) {
          if (streamSettings_ != null) {
            streamSettings_ =
              com.v2ray.core.transport.internet.ConfigProto.StreamConfig.newBuilder(streamSettings_).mergeFrom(value).buildPartial();
          } else {
            streamSettings_ = value;
          }
          onChanged();
        } else {
          streamSettingsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      public Builder clearStreamSettings() {
        if (streamSettingsBuilder_ == null) {
          streamSettings_ = null;
          onChanged();
        } else {
          streamSettings_ = null;
          streamSettingsBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      public com.v2ray.core.transport.internet.ConfigProto.StreamConfig.Builder getStreamSettingsBuilder() {
        
        onChanged();
        return getStreamSettingsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      public com.v2ray.core.transport.internet.ConfigProto.StreamConfigOrBuilder getStreamSettingsOrBuilder() {
        if (streamSettingsBuilder_ != null) {
          return streamSettingsBuilder_.getMessageOrBuilder();
        } else {
          return streamSettings_ == null ?
              com.v2ray.core.transport.internet.ConfigProto.StreamConfig.getDefaultInstance() : streamSettings_;
        }
      }
      /**
       * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.v2ray.core.transport.internet.ConfigProto.StreamConfig, com.v2ray.core.transport.internet.ConfigProto.StreamConfig.Builder, com.v2ray.core.transport.internet.ConfigProto.StreamConfigOrBuilder> 
          getStreamSettingsFieldBuilder() {
        if (streamSettingsBuilder_ == null) {
          streamSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.v2ray.core.transport.internet.ConfigProto.StreamConfig, com.v2ray.core.transport.internet.ConfigProto.StreamConfig.Builder, com.v2ray.core.transport.internet.ConfigProto.StreamConfigOrBuilder>(
                  getStreamSettings(),
                  getParentForChildren(),
                  isClean());
          streamSettings_ = null;
        }
        return streamSettingsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:v2ray.core.common.protocol.AlternativeOutboundConfig)
    }

    // @@protoc_insertion_point(class_scope:v2ray.core.common.protocol.AlternativeOutboundConfig)
    private static final com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig();
    }

    public static com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AlternativeOutboundConfig>
        PARSER = new com.google.protobuf.AbstractParser<AlternativeOutboundConfig>() {
      public AlternativeOutboundConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AlternativeOutboundConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AlternativeOutboundConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AlternativeOutboundConfig> getParserForType() {
      return PARSER;
    }

    public com.v2ray.core.common.protocol.CommandProto.AlternativeOutboundConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,v2ray.com/core/common/protocol/command" +
      ".proto\022\032v2ray.core.common.protocol\0320v2ra" +
      "y.com/core/common/serial/typed_message.p" +
      "roto\032.v2ray.com/core/transport/internet/" +
      "config.proto\"\233\001\n\031AlternativeOutboundConf" +
      "ig\0228\n\010settings\030\001 \001(\0132&.v2ray.core.common" +
      ".serial.TypedMessage\022D\n\017stream_settings\030" +
      "\003 \001(\0132+.v2ray.core.transport.internet.St" +
      "reamConfigBU\n\036com.v2ray.core.common.prot" +
      "ocolB\014CommandProtoZ\010protocol\252\002\032V2Ray.Cor",
      "e.Common.Protocolb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.serial.TypedMessageProto.getDescriptor(),
          com.v2ray.core.transport.internet.ConfigProto.getDescriptor(),
        }, assigner);
    internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor,
        new java.lang.String[] { "Settings", "StreamSettings", });
    com.v2ray.core.common.serial.TypedMessageProto.getDescriptor();
    com.v2ray.core.transport.internet.ConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}