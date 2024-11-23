// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMixinUGCTimeControl.proto

package emu.grasscutter.net.proto;

public final class AbilityMixinUGCTimeControlOuterClass {
  private AbilityMixinUGCTimeControlOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMixinUGCTimeControlOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMixinUGCTimeControl)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 start_move_time = 3;</code>
     * @return The startMoveTime.
     */
    int getStartMoveTime();

    /**
     * <code>uint64 start_move_time_ms = 11;</code>
     * @return The startMoveTimeMs.
     */
    long getStartMoveTimeMs();
  }
  /**
   * <pre>
   * Obf: EPBAICGAHIL
   * </pre>
   *
   * Protobuf type {@code AbilityMixinUGCTimeControl}
   */
  public static final class AbilityMixinUGCTimeControl extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMixinUGCTimeControl)
      AbilityMixinUGCTimeControlOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMixinUGCTimeControl.newBuilder() to construct.
    private AbilityMixinUGCTimeControl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMixinUGCTimeControl() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMixinUGCTimeControl();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityMixinUGCTimeControl(
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
            case 24: {

              startMoveTime_ = input.readUInt32();
              break;
            }
            case 88: {

              startMoveTimeMs_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.internal_static_AbilityMixinUGCTimeControl_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.internal_static_AbilityMixinUGCTimeControl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl.class, emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl.Builder.class);
    }

    public static final int START_MOVE_TIME_FIELD_NUMBER = 3;
    private int startMoveTime_;
    /**
     * <code>uint32 start_move_time = 3;</code>
     * @return The startMoveTime.
     */
    @java.lang.Override
    public int getStartMoveTime() {
      return startMoveTime_;
    }

    public static final int START_MOVE_TIME_MS_FIELD_NUMBER = 11;
    private long startMoveTimeMs_;
    /**
     * <code>uint64 start_move_time_ms = 11;</code>
     * @return The startMoveTimeMs.
     */
    @java.lang.Override
    public long getStartMoveTimeMs() {
      return startMoveTimeMs_;
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
      if (startMoveTime_ != 0) {
        output.writeUInt32(3, startMoveTime_);
      }
      if (startMoveTimeMs_ != 0L) {
        output.writeUInt64(11, startMoveTimeMs_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startMoveTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, startMoveTime_);
      }
      if (startMoveTimeMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, startMoveTimeMs_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl other = (emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl) obj;

      if (getStartMoveTime()
          != other.getStartMoveTime()) return false;
      if (getStartMoveTimeMs()
          != other.getStartMoveTimeMs()) return false;
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
      hash = (37 * hash) + START_MOVE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartMoveTime();
      hash = (37 * hash) + START_MOVE_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartMoveTimeMs());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl prototype) {
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
     * Obf: EPBAICGAHIL
     * </pre>
     *
     * Protobuf type {@code AbilityMixinUGCTimeControl}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMixinUGCTimeControl)
        emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControlOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.internal_static_AbilityMixinUGCTimeControl_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.internal_static_AbilityMixinUGCTimeControl_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl.class, emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl.newBuilder()
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
        startMoveTime_ = 0;

        startMoveTimeMs_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.internal_static_AbilityMixinUGCTimeControl_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl build() {
        emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl buildPartial() {
        emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl result = new emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl(this);
        result.startMoveTime_ = startMoveTime_;
        result.startMoveTimeMs_ = startMoveTimeMs_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl other) {
        if (other == emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl.getDefaultInstance()) return this;
        if (other.getStartMoveTime() != 0) {
          setStartMoveTime(other.getStartMoveTime());
        }
        if (other.getStartMoveTimeMs() != 0L) {
          setStartMoveTimeMs(other.getStartMoveTimeMs());
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
        emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int startMoveTime_ ;
      /**
       * <code>uint32 start_move_time = 3;</code>
       * @return The startMoveTime.
       */
      @java.lang.Override
      public int getStartMoveTime() {
        return startMoveTime_;
      }
      /**
       * <code>uint32 start_move_time = 3;</code>
       * @param value The startMoveTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartMoveTime(int value) {
        
        startMoveTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_move_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartMoveTime() {
        
        startMoveTime_ = 0;
        onChanged();
        return this;
      }

      private long startMoveTimeMs_ ;
      /**
       * <code>uint64 start_move_time_ms = 11;</code>
       * @return The startMoveTimeMs.
       */
      @java.lang.Override
      public long getStartMoveTimeMs() {
        return startMoveTimeMs_;
      }
      /**
       * <code>uint64 start_move_time_ms = 11;</code>
       * @param value The startMoveTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setStartMoveTimeMs(long value) {
        
        startMoveTimeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 start_move_time_ms = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartMoveTimeMs() {
        
        startMoveTimeMs_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AbilityMixinUGCTimeControl)
    }

    // @@protoc_insertion_point(class_scope:AbilityMixinUGCTimeControl)
    private static final emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl();
    }

    public static emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMixinUGCTimeControl>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMixinUGCTimeControl>() {
      @java.lang.Override
      public AbilityMixinUGCTimeControl parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityMixinUGCTimeControl(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityMixinUGCTimeControl> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMixinUGCTimeControl> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityMixinUGCTimeControlOuterClass.AbilityMixinUGCTimeControl getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMixinUGCTimeControl_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMixinUGCTimeControl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AbilityMixinUGCTimeControl.proto\"Q\n\032Ab" +
      "ilityMixinUGCTimeControl\022\027\n\017start_move_t" +
      "ime\030\003 \001(\r\022\032\n\022start_move_time_ms\030\013 \001(\004B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMixinUGCTimeControl_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMixinUGCTimeControl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMixinUGCTimeControl_descriptor,
        new java.lang.String[] { "StartMoveTime", "StartMoveTimeMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
