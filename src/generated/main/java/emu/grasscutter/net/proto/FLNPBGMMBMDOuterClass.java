// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FLNPBGMMBMD.proto

package emu.grasscutter.net.proto;

public final class FLNPBGMMBMDOuterClass {
  private FLNPBGMMBMDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FLNPBGMMBMDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FLNPBGMMBMD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA> 
        getGHCDCHBOFNEList();
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA getGHCDCHBOFNE(int index);
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    int getGHCDCHBOFNECount();
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder> 
        getGHCDCHBOFNEOrBuilderList();
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder getGHCDCHBOFNEOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 1474
   * </pre>
   *
   * Protobuf type {@code FLNPBGMMBMD}
   */
  public static final class FLNPBGMMBMD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FLNPBGMMBMD)
      FLNPBGMMBMDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FLNPBGMMBMD.newBuilder() to construct.
    private FLNPBGMMBMD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FLNPBGMMBMD() {
      gHCDCHBOFNE_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FLNPBGMMBMD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FLNPBGMMBMD(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gHCDCHBOFNE_ = new java.util.ArrayList<emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA>();
                mutable_bitField0_ |= 0x00000001;
              }
              gHCDCHBOFNE_.add(
                  input.readMessage(emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.parser(), extensionRegistry));
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
          gHCDCHBOFNE_ = java.util.Collections.unmodifiableList(gHCDCHBOFNE_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.internal_static_FLNPBGMMBMD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.internal_static_FLNPBGMMBMD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD.class, emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD.Builder.class);
    }

    public static final int GHCDCHBOFNE_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA> gHCDCHBOFNE_;
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA> getGHCDCHBOFNEList() {
      return gHCDCHBOFNE_;
    }
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder> 
        getGHCDCHBOFNEOrBuilderList() {
      return gHCDCHBOFNE_;
    }
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    @java.lang.Override
    public int getGHCDCHBOFNECount() {
      return gHCDCHBOFNE_.size();
    }
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA getGHCDCHBOFNE(int index) {
      return gHCDCHBOFNE_.get(index);
    }
    /**
     * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder getGHCDCHBOFNEOrBuilder(
        int index) {
      return gHCDCHBOFNE_.get(index);
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
      for (int i = 0; i < gHCDCHBOFNE_.size(); i++) {
        output.writeMessage(11, gHCDCHBOFNE_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < gHCDCHBOFNE_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, gHCDCHBOFNE_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD other = (emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD) obj;

      if (!getGHCDCHBOFNEList()
          .equals(other.getGHCDCHBOFNEList())) return false;
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
      if (getGHCDCHBOFNECount() > 0) {
        hash = (37 * hash) + GHCDCHBOFNE_FIELD_NUMBER;
        hash = (53 * hash) + getGHCDCHBOFNEList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD prototype) {
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
     * CmdId: 1474
     * </pre>
     *
     * Protobuf type {@code FLNPBGMMBMD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FLNPBGMMBMD)
        emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.internal_static_FLNPBGMMBMD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.internal_static_FLNPBGMMBMD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD.class, emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD.newBuilder()
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
          getGHCDCHBOFNEFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (gHCDCHBOFNEBuilder_ == null) {
          gHCDCHBOFNE_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          gHCDCHBOFNEBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.internal_static_FLNPBGMMBMD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD build() {
        emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD buildPartial() {
        emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD result = new emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD(this);
        int from_bitField0_ = bitField0_;
        if (gHCDCHBOFNEBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            gHCDCHBOFNE_ = java.util.Collections.unmodifiableList(gHCDCHBOFNE_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.gHCDCHBOFNE_ = gHCDCHBOFNE_;
        } else {
          result.gHCDCHBOFNE_ = gHCDCHBOFNEBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD) {
          return mergeFrom((emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD other) {
        if (other == emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD.getDefaultInstance()) return this;
        if (gHCDCHBOFNEBuilder_ == null) {
          if (!other.gHCDCHBOFNE_.isEmpty()) {
            if (gHCDCHBOFNE_.isEmpty()) {
              gHCDCHBOFNE_ = other.gHCDCHBOFNE_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureGHCDCHBOFNEIsMutable();
              gHCDCHBOFNE_.addAll(other.gHCDCHBOFNE_);
            }
            onChanged();
          }
        } else {
          if (!other.gHCDCHBOFNE_.isEmpty()) {
            if (gHCDCHBOFNEBuilder_.isEmpty()) {
              gHCDCHBOFNEBuilder_.dispose();
              gHCDCHBOFNEBuilder_ = null;
              gHCDCHBOFNE_ = other.gHCDCHBOFNE_;
              bitField0_ = (bitField0_ & ~0x00000001);
              gHCDCHBOFNEBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getGHCDCHBOFNEFieldBuilder() : null;
            } else {
              gHCDCHBOFNEBuilder_.addAllMessages(other.gHCDCHBOFNE_);
            }
          }
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
        emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA> gHCDCHBOFNE_ =
        java.util.Collections.emptyList();
      private void ensureGHCDCHBOFNEIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          gHCDCHBOFNE_ = new java.util.ArrayList<emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA>(gHCDCHBOFNE_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder> gHCDCHBOFNEBuilder_;

      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA> getGHCDCHBOFNEList() {
        if (gHCDCHBOFNEBuilder_ == null) {
          return java.util.Collections.unmodifiableList(gHCDCHBOFNE_);
        } else {
          return gHCDCHBOFNEBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public int getGHCDCHBOFNECount() {
        if (gHCDCHBOFNEBuilder_ == null) {
          return gHCDCHBOFNE_.size();
        } else {
          return gHCDCHBOFNEBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA getGHCDCHBOFNE(int index) {
        if (gHCDCHBOFNEBuilder_ == null) {
          return gHCDCHBOFNE_.get(index);
        } else {
          return gHCDCHBOFNEBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder setGHCDCHBOFNE(
          int index, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA value) {
        if (gHCDCHBOFNEBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGHCDCHBOFNEIsMutable();
          gHCDCHBOFNE_.set(index, value);
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder setGHCDCHBOFNE(
          int index, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder builderForValue) {
        if (gHCDCHBOFNEBuilder_ == null) {
          ensureGHCDCHBOFNEIsMutable();
          gHCDCHBOFNE_.set(index, builderForValue.build());
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder addGHCDCHBOFNE(emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA value) {
        if (gHCDCHBOFNEBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGHCDCHBOFNEIsMutable();
          gHCDCHBOFNE_.add(value);
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder addGHCDCHBOFNE(
          int index, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA value) {
        if (gHCDCHBOFNEBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGHCDCHBOFNEIsMutable();
          gHCDCHBOFNE_.add(index, value);
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder addGHCDCHBOFNE(
          emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder builderForValue) {
        if (gHCDCHBOFNEBuilder_ == null) {
          ensureGHCDCHBOFNEIsMutable();
          gHCDCHBOFNE_.add(builderForValue.build());
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder addGHCDCHBOFNE(
          int index, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder builderForValue) {
        if (gHCDCHBOFNEBuilder_ == null) {
          ensureGHCDCHBOFNEIsMutable();
          gHCDCHBOFNE_.add(index, builderForValue.build());
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder addAllGHCDCHBOFNE(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA> values) {
        if (gHCDCHBOFNEBuilder_ == null) {
          ensureGHCDCHBOFNEIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, gHCDCHBOFNE_);
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder clearGHCDCHBOFNE() {
        if (gHCDCHBOFNEBuilder_ == null) {
          gHCDCHBOFNE_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public Builder removeGHCDCHBOFNE(int index) {
        if (gHCDCHBOFNEBuilder_ == null) {
          ensureGHCDCHBOFNEIsMutable();
          gHCDCHBOFNE_.remove(index);
          onChanged();
        } else {
          gHCDCHBOFNEBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder getGHCDCHBOFNEBuilder(
          int index) {
        return getGHCDCHBOFNEFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder getGHCDCHBOFNEOrBuilder(
          int index) {
        if (gHCDCHBOFNEBuilder_ == null) {
          return gHCDCHBOFNE_.get(index);  } else {
          return gHCDCHBOFNEBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder> 
           getGHCDCHBOFNEOrBuilderList() {
        if (gHCDCHBOFNEBuilder_ != null) {
          return gHCDCHBOFNEBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(gHCDCHBOFNE_);
        }
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder addGHCDCHBOFNEBuilder() {
        return getGHCDCHBOFNEFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.getDefaultInstance());
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder addGHCDCHBOFNEBuilder(
          int index) {
        return getGHCDCHBOFNEFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.getDefaultInstance());
      }
      /**
       * <code>repeated .EGEDFFNFNAA GHCDCHBOFNE = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder> 
           getGHCDCHBOFNEBuilderList() {
        return getGHCDCHBOFNEFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder> 
          getGHCDCHBOFNEFieldBuilder() {
        if (gHCDCHBOFNEBuilder_ == null) {
          gHCDCHBOFNEBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder, emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder>(
                  gHCDCHBOFNE_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          gHCDCHBOFNE_ = null;
        }
        return gHCDCHBOFNEBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FLNPBGMMBMD)
    }

    // @@protoc_insertion_point(class_scope:FLNPBGMMBMD)
    private static final emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD();
    }

    public static emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FLNPBGMMBMD>
        PARSER = new com.google.protobuf.AbstractParser<FLNPBGMMBMD>() {
      @java.lang.Override
      public FLNPBGMMBMD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FLNPBGMMBMD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FLNPBGMMBMD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FLNPBGMMBMD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FLNPBGMMBMDOuterClass.FLNPBGMMBMD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FLNPBGMMBMD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FLNPBGMMBMD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FLNPBGMMBMD.proto\032\021EGEDFFNFNAA.proto\"0" +
      "\n\013FLNPBGMMBMD\022!\n\013GHCDCHBOFNE\030\013 \003(\0132\014.EGE" +
      "DFFNFNAAB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.getDescriptor(),
        });
    internal_static_FLNPBGMMBMD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FLNPBGMMBMD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FLNPBGMMBMD_descriptor,
        new java.lang.String[] { "GHCDCHBOFNE", });
    emu.grasscutter.net.proto.EGEDFFNFNAAOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
