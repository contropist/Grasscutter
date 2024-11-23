// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityUpdateWatcherNotify.proto

package emu.grasscutter.net.proto;

public final class ActivityUpdateWatcherNotifyOuterClass {
  private ActivityUpdateWatcherNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityUpdateWatcherNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityUpdateWatcherNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ActivityWatcherInfo watcher_info = 6;</code>
     * @return Whether the watcherInfo field is set.
     */
    boolean hasWatcherInfo();
    /**
     * <code>.ActivityWatcherInfo watcher_info = 6;</code>
     * @return The watcherInfo.
     */
    emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfo();
    /**
     * <code>.ActivityWatcherInfo watcher_info = 6;</code>
     */
    emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoOrBuilder();

    /**
     * <code>uint32 activity_id = 10;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * CmdId: 20400
   * Obf: AIJCCDDEFAD
   * </pre>
   *
   * Protobuf type {@code ActivityUpdateWatcherNotify}
   */
  public static final class ActivityUpdateWatcherNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityUpdateWatcherNotify)
      ActivityUpdateWatcherNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityUpdateWatcherNotify.newBuilder() to construct.
    private ActivityUpdateWatcherNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityUpdateWatcherNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityUpdateWatcherNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityUpdateWatcherNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 50: {
              emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder subBuilder = null;
              if (watcherInfo_ != null) {
                subBuilder = watcherInfo_.toBuilder();
              }
              watcherInfo_ = input.readMessage(emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(watcherInfo_);
                watcherInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              activityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify.class, emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify.Builder.class);
    }

    public static final int WATCHER_INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo watcherInfo_;
    /**
     * <code>.ActivityWatcherInfo watcher_info = 6;</code>
     * @return Whether the watcherInfo field is set.
     */
    @java.lang.Override
    public boolean hasWatcherInfo() {
      return watcherInfo_ != null;
    }
    /**
     * <code>.ActivityWatcherInfo watcher_info = 6;</code>
     * @return The watcherInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfo() {
      return watcherInfo_ == null ? emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance() : watcherInfo_;
    }
    /**
     * <code>.ActivityWatcherInfo watcher_info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoOrBuilder() {
      return getWatcherInfo();
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 10;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 10;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (watcherInfo_ != null) {
        output.writeMessage(6, getWatcherInfo());
      }
      if (activityId_ != 0) {
        output.writeUInt32(10, activityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (watcherInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getWatcherInfo());
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, activityId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify other = (emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify) obj;

      if (hasWatcherInfo() != other.hasWatcherInfo()) return false;
      if (hasWatcherInfo()) {
        if (!getWatcherInfo()
            .equals(other.getWatcherInfo())) return false;
      }
      if (getActivityId()
          != other.getActivityId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasWatcherInfo()) {
        hash = (37 * hash) + WATCHER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getWatcherInfo().hashCode();
      }
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * CmdId: 20400
     * Obf: AIJCCDDEFAD
     * </pre>
     *
     * Protobuf type {@code ActivityUpdateWatcherNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityUpdateWatcherNotify)
        emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify.class, emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (watcherInfoBuilder_ == null) {
          watcherInfo_ = null;
        } else {
          watcherInfo_ = null;
          watcherInfoBuilder_ = null;
        }
        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify build() {
        emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify buildPartial() {
        emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify result = new emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify(this);
        if (watcherInfoBuilder_ == null) {
          result.watcherInfo_ = watcherInfo_;
        } else {
          result.watcherInfo_ = watcherInfoBuilder_.build();
        }
        result.activityId_ = activityId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify other) {
        if (other == emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify.getDefaultInstance()) return this;
        if (other.hasWatcherInfo()) {
          mergeWatcherInfo(other.getWatcherInfo());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo watcherInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo, emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> watcherInfoBuilder_;
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       * @return Whether the watcherInfo field is set.
       */
      public boolean hasWatcherInfo() {
        return watcherInfoBuilder_ != null || watcherInfo_ != null;
      }
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       * @return The watcherInfo.
       */
      public emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfo() {
        if (watcherInfoBuilder_ == null) {
          return watcherInfo_ == null ? emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance() : watcherInfo_;
        } else {
          return watcherInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       */
      public Builder setWatcherInfo(emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo value) {
        if (watcherInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          watcherInfo_ = value;
          onChanged();
        } else {
          watcherInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       */
      public Builder setWatcherInfo(
          emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder builderForValue) {
        if (watcherInfoBuilder_ == null) {
          watcherInfo_ = builderForValue.build();
          onChanged();
        } else {
          watcherInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       */
      public Builder mergeWatcherInfo(emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo value) {
        if (watcherInfoBuilder_ == null) {
          if (watcherInfo_ != null) {
            watcherInfo_ =
              emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.newBuilder(watcherInfo_).mergeFrom(value).buildPartial();
          } else {
            watcherInfo_ = value;
          }
          onChanged();
        } else {
          watcherInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       */
      public Builder clearWatcherInfo() {
        if (watcherInfoBuilder_ == null) {
          watcherInfo_ = null;
          onChanged();
        } else {
          watcherInfo_ = null;
          watcherInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       */
      public emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder getWatcherInfoBuilder() {
        
        onChanged();
        return getWatcherInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       */
      public emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoOrBuilder() {
        if (watcherInfoBuilder_ != null) {
          return watcherInfoBuilder_.getMessageOrBuilder();
        } else {
          return watcherInfo_ == null ?
              emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance() : watcherInfo_;
        }
      }
      /**
       * <code>.ActivityWatcherInfo watcher_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo, emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> 
          getWatcherInfoFieldBuilder() {
        if (watcherInfoBuilder_ == null) {
          watcherInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo, emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder>(
                  getWatcherInfo(),
                  getParentForChildren(),
                  isClean());
          watcherInfo_ = null;
        }
        return watcherInfoBuilder_;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 10;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 10;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ActivityUpdateWatcherNotify)
    }

    // @@protoc_insertion_point(class_scope:ActivityUpdateWatcherNotify)
    private static final emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify();
    }

    public static emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityUpdateWatcherNotify>
        PARSER = new com.google.protobuf.AbstractParser<ActivityUpdateWatcherNotify>() {
      @java.lang.Override
      public ActivityUpdateWatcherNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityUpdateWatcherNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityUpdateWatcherNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityUpdateWatcherNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityUpdateWatcherNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityUpdateWatcherNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ActivityUpdateWatcherNotify.proto\032\031Act" +
      "ivityWatcherInfo.proto\"^\n\033ActivityUpdate" +
      "WatcherNotify\022*\n\014watcher_info\030\006 \001(\0132\024.Ac" +
      "tivityWatcherInfo\022\023\n\013activity_id\030\n \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.getDescriptor(),
        });
    internal_static_ActivityUpdateWatcherNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityUpdateWatcherNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityUpdateWatcherNotify_descriptor,
        new java.lang.String[] { "WatcherInfo", "ActivityId", });
    emu.grasscutter.net.proto.ActivityWatcherInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
