// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterTrialAvatarActivityDungeonRsp.proto

package emu.grasscutter.net.proto;

public final class EnterTrialAvatarActivityDungeonRspOuterClass {
  private EnterTrialAvatarActivityDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterTrialAvatarActivityDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterTrialAvatarActivityDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 trial_avatar_index_id = 15;</code>
     * @return The trialAvatarIndexId.
     */
    int getTrialAvatarIndexId();

    /**
     * <code>uint32 activity_id = 6;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * CmdId: 2033
   * Name: HJPEGJLNEKL
   * </pre>
   *
   * Protobuf type {@code EnterTrialAvatarActivityDungeonRsp}
   */
  public static final class EnterTrialAvatarActivityDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterTrialAvatarActivityDungeonRsp)
      EnterTrialAvatarActivityDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterTrialAvatarActivityDungeonRsp.newBuilder() to construct.
    private EnterTrialAvatarActivityDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterTrialAvatarActivityDungeonRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterTrialAvatarActivityDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterTrialAvatarActivityDungeonRsp(
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
            case 48: {

              activityId_ = input.readUInt32();
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              trialAvatarIndexId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.internal_static_EnterTrialAvatarActivityDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.internal_static_EnterTrialAvatarActivityDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp.class, emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER = 15;
    private int trialAvatarIndexId_;
    /**
     * <code>uint32 trial_avatar_index_id = 15;</code>
     * @return The trialAvatarIndexId.
     */
    @java.lang.Override
    public int getTrialAvatarIndexId() {
      return trialAvatarIndexId_;
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 6;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 6;</code>
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
      if (activityId_ != 0) {
        output.writeUInt32(6, activityId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (trialAvatarIndexId_ != 0) {
        output.writeUInt32(15, trialAvatarIndexId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, activityId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (trialAvatarIndexId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, trialAvatarIndexId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp other = (emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getTrialAvatarIndexId()
          != other.getTrialAvatarIndexId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTrialAvatarIndexId();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp prototype) {
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
     * CmdId: 2033
     * Name: HJPEGJLNEKL
     * </pre>
     *
     * Protobuf type {@code EnterTrialAvatarActivityDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterTrialAvatarActivityDungeonRsp)
        emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.internal_static_EnterTrialAvatarActivityDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.internal_static_EnterTrialAvatarActivityDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp.class, emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp.newBuilder()
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
        retcode_ = 0;

        trialAvatarIndexId_ = 0;

        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.internal_static_EnterTrialAvatarActivityDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp build() {
        emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp buildPartial() {
        emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp result = new emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp(this);
        result.retcode_ = retcode_;
        result.trialAvatarIndexId_ = trialAvatarIndexId_;
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
        if (other instanceof emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp) {
          return mergeFrom((emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp other) {
        if (other == emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getTrialAvatarIndexId() != 0) {
          setTrialAvatarIndexId(other.getTrialAvatarIndexId());
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
        emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int trialAvatarIndexId_ ;
      /**
       * <code>uint32 trial_avatar_index_id = 15;</code>
       * @return The trialAvatarIndexId.
       */
      @java.lang.Override
      public int getTrialAvatarIndexId() {
        return trialAvatarIndexId_;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 15;</code>
       * @param value The trialAvatarIndexId to set.
       * @return This builder for chaining.
       */
      public Builder setTrialAvatarIndexId(int value) {
        
        trialAvatarIndexId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTrialAvatarIndexId() {
        
        trialAvatarIndexId_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 6;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 6;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 6;</code>
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


      // @@protoc_insertion_point(builder_scope:EnterTrialAvatarActivityDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:EnterTrialAvatarActivityDungeonRsp)
    private static final emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp();
    }

    public static emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterTrialAvatarActivityDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<EnterTrialAvatarActivityDungeonRsp>() {
      @java.lang.Override
      public EnterTrialAvatarActivityDungeonRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterTrialAvatarActivityDungeonRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterTrialAvatarActivityDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterTrialAvatarActivityDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterTrialAvatarActivityDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterTrialAvatarActivityDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(EnterTrialAvatarActivityDungeonRsp.pro" +
      "to\"i\n\"EnterTrialAvatarActivityDungeonRsp" +
      "\022\017\n\007retcode\030\014 \001(\005\022\035\n\025trial_avatar_index_" +
      "id\030\017 \001(\r\022\023\n\013activity_id\030\006 \001(\rB!\n\031emu.gra" +
      "sscutter.net.protoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterTrialAvatarActivityDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterTrialAvatarActivityDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterTrialAvatarActivityDungeonRsp_descriptor,
        new java.lang.String[] { "Retcode", "TrialAvatarIndexId", "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
