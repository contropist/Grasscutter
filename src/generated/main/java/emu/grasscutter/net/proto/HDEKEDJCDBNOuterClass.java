// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HDEKEDJCDBN.proto

package emu.grasscutter.net.proto;

public final class HDEKEDJCDBNOuterClass {
  private HDEKEDJCDBNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HDEKEDJCDBNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HDEKEDJCDBN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool HBGINJCBJKA = 9;</code>
     * @return The hBGINJCBJKA.
     */
    boolean getHBGINJCBJKA();

    /**
     * <code>uint32 config_id = 15;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 group_id = 7;</code>
     * @return The groupId.
     */
    int getGroupId();
  }
  /**
   * <pre>
   * CmdId: 1387
   * </pre>
   *
   * Protobuf type {@code HDEKEDJCDBN}
   */
  public static final class HDEKEDJCDBN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HDEKEDJCDBN)
      HDEKEDJCDBNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HDEKEDJCDBN.newBuilder() to construct.
    private HDEKEDJCDBN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HDEKEDJCDBN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HDEKEDJCDBN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HDEKEDJCDBN(
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
            case 56: {

              groupId_ = input.readUInt32();
              break;
            }
            case 72: {

              hBGINJCBJKA_ = input.readBool();
              break;
            }
            case 120: {

              configId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.internal_static_HDEKEDJCDBN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.internal_static_HDEKEDJCDBN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN.class, emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN.Builder.class);
    }

    public static final int HBGINJCBJKA_FIELD_NUMBER = 9;
    private boolean hBGINJCBJKA_;
    /**
     * <code>bool HBGINJCBJKA = 9;</code>
     * @return The hBGINJCBJKA.
     */
    @java.lang.Override
    public boolean getHBGINJCBJKA() {
      return hBGINJCBJKA_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 15;
    private int configId_;
    /**
     * <code>uint32 config_id = 15;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 7;
    private int groupId_;
    /**
     * <code>uint32 group_id = 7;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
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
      if (groupId_ != 0) {
        output.writeUInt32(7, groupId_);
      }
      if (hBGINJCBJKA_ != false) {
        output.writeBool(9, hBGINJCBJKA_);
      }
      if (configId_ != 0) {
        output.writeUInt32(15, configId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, groupId_);
      }
      if (hBGINJCBJKA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, hBGINJCBJKA_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, configId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN other = (emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN) obj;

      if (getHBGINJCBJKA()
          != other.getHBGINJCBJKA()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
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
      hash = (37 * hash) + HBGINJCBJKA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHBGINJCBJKA());
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN prototype) {
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
     * CmdId: 1387
     * </pre>
     *
     * Protobuf type {@code HDEKEDJCDBN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HDEKEDJCDBN)
        emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.internal_static_HDEKEDJCDBN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.internal_static_HDEKEDJCDBN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN.class, emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN.newBuilder()
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
        hBGINJCBJKA_ = false;

        configId_ = 0;

        groupId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.internal_static_HDEKEDJCDBN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN build() {
        emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN buildPartial() {
        emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN result = new emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN(this);
        result.hBGINJCBJKA_ = hBGINJCBJKA_;
        result.configId_ = configId_;
        result.groupId_ = groupId_;
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
        if (other instanceof emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN) {
          return mergeFrom((emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN other) {
        if (other == emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN.getDefaultInstance()) return this;
        if (other.getHBGINJCBJKA() != false) {
          setHBGINJCBJKA(other.getHBGINJCBJKA());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
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
        emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean hBGINJCBJKA_ ;
      /**
       * <code>bool HBGINJCBJKA = 9;</code>
       * @return The hBGINJCBJKA.
       */
      @java.lang.Override
      public boolean getHBGINJCBJKA() {
        return hBGINJCBJKA_;
      }
      /**
       * <code>bool HBGINJCBJKA = 9;</code>
       * @param value The hBGINJCBJKA to set.
       * @return This builder for chaining.
       */
      public Builder setHBGINJCBJKA(boolean value) {
        
        hBGINJCBJKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool HBGINJCBJKA = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearHBGINJCBJKA() {
        
        hBGINJCBJKA_ = false;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 15;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 15;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 7;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 7;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HDEKEDJCDBN)
    }

    // @@protoc_insertion_point(class_scope:HDEKEDJCDBN)
    private static final emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN();
    }

    public static emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HDEKEDJCDBN>
        PARSER = new com.google.protobuf.AbstractParser<HDEKEDJCDBN>() {
      @java.lang.Override
      public HDEKEDJCDBN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HDEKEDJCDBN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HDEKEDJCDBN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HDEKEDJCDBN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HDEKEDJCDBNOuterClass.HDEKEDJCDBN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HDEKEDJCDBN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HDEKEDJCDBN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HDEKEDJCDBN.proto\"G\n\013HDEKEDJCDBN\022\023\n\013HB" +
      "GINJCBJKA\030\t \001(\010\022\021\n\tconfig_id\030\017 \001(\r\022\020\n\010gr" +
      "oup_id\030\007 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HDEKEDJCDBN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HDEKEDJCDBN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HDEKEDJCDBN_descriptor,
        new java.lang.String[] { "HBGINJCBJKA", "ConfigId", "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
