// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LHDHJOKBFNM.proto

package emu.grasscutter.net.proto;

public final class LHDHJOKBFNMOuterClass {
  private LHDHJOKBFNMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LHDHJOKBFNMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LHDHJOKBFNM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float OMHOEBJEOFB = 2;</code>
     * @return The oMHOEBJEOFB.
     */
    float getOMHOEBJEOFB();

    /**
     * <code>uint32 LAJGLCIFKCP = 8;</code>
     * @return The lAJGLCIFKCP.
     */
    int getLAJGLCIFKCP();

    /**
     * <code>float FCNFGMADAEH = 13;</code>
     * @return The fCNFGMADAEH.
     */
    float getFCNFGMADAEH();

    /**
     * <code>float duration = 11;</code>
     * @return The duration.
     */
    float getDuration();
  }
  /**
   * <pre>
   * CmdId: 20575
   * </pre>
   *
   * Protobuf type {@code LHDHJOKBFNM}
   */
  public static final class LHDHJOKBFNM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LHDHJOKBFNM)
      LHDHJOKBFNMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LHDHJOKBFNM.newBuilder() to construct.
    private LHDHJOKBFNM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LHDHJOKBFNM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LHDHJOKBFNM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LHDHJOKBFNM(
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
            case 21: {

              oMHOEBJEOFB_ = input.readFloat();
              break;
            }
            case 64: {

              lAJGLCIFKCP_ = input.readUInt32();
              break;
            }
            case 93: {

              duration_ = input.readFloat();
              break;
            }
            case 109: {

              fCNFGMADAEH_ = input.readFloat();
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
      return emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.class, emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.Builder.class);
    }

    public static final int OMHOEBJEOFB_FIELD_NUMBER = 2;
    private float oMHOEBJEOFB_;
    /**
     * <code>float OMHOEBJEOFB = 2;</code>
     * @return The oMHOEBJEOFB.
     */
    @java.lang.Override
    public float getOMHOEBJEOFB() {
      return oMHOEBJEOFB_;
    }

    public static final int LAJGLCIFKCP_FIELD_NUMBER = 8;
    private int lAJGLCIFKCP_;
    /**
     * <code>uint32 LAJGLCIFKCP = 8;</code>
     * @return The lAJGLCIFKCP.
     */
    @java.lang.Override
    public int getLAJGLCIFKCP() {
      return lAJGLCIFKCP_;
    }

    public static final int FCNFGMADAEH_FIELD_NUMBER = 13;
    private float fCNFGMADAEH_;
    /**
     * <code>float FCNFGMADAEH = 13;</code>
     * @return The fCNFGMADAEH.
     */
    @java.lang.Override
    public float getFCNFGMADAEH() {
      return fCNFGMADAEH_;
    }

    public static final int DURATION_FIELD_NUMBER = 11;
    private float duration_;
    /**
     * <code>float duration = 11;</code>
     * @return The duration.
     */
    @java.lang.Override
    public float getDuration() {
      return duration_;
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
      if (oMHOEBJEOFB_ != 0F) {
        output.writeFloat(2, oMHOEBJEOFB_);
      }
      if (lAJGLCIFKCP_ != 0) {
        output.writeUInt32(8, lAJGLCIFKCP_);
      }
      if (duration_ != 0F) {
        output.writeFloat(11, duration_);
      }
      if (fCNFGMADAEH_ != 0F) {
        output.writeFloat(13, fCNFGMADAEH_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oMHOEBJEOFB_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, oMHOEBJEOFB_);
      }
      if (lAJGLCIFKCP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, lAJGLCIFKCP_);
      }
      if (duration_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(11, duration_);
      }
      if (fCNFGMADAEH_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, fCNFGMADAEH_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM other = (emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM) obj;

      if (java.lang.Float.floatToIntBits(getOMHOEBJEOFB())
          != java.lang.Float.floatToIntBits(
              other.getOMHOEBJEOFB())) return false;
      if (getLAJGLCIFKCP()
          != other.getLAJGLCIFKCP()) return false;
      if (java.lang.Float.floatToIntBits(getFCNFGMADAEH())
          != java.lang.Float.floatToIntBits(
              other.getFCNFGMADAEH())) return false;
      if (java.lang.Float.floatToIntBits(getDuration())
          != java.lang.Float.floatToIntBits(
              other.getDuration())) return false;
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
      hash = (37 * hash) + OMHOEBJEOFB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOMHOEBJEOFB());
      hash = (37 * hash) + LAJGLCIFKCP_FIELD_NUMBER;
      hash = (53 * hash) + getLAJGLCIFKCP();
      hash = (37 * hash) + FCNFGMADAEH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFCNFGMADAEH());
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDuration());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM prototype) {
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
     * CmdId: 20575
     * </pre>
     *
     * Protobuf type {@code LHDHJOKBFNM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LHDHJOKBFNM)
        emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.class, emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.newBuilder()
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
        oMHOEBJEOFB_ = 0F;

        lAJGLCIFKCP_ = 0;

        fCNFGMADAEH_ = 0F;

        duration_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM build() {
        emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM buildPartial() {
        emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM result = new emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM(this);
        result.oMHOEBJEOFB_ = oMHOEBJEOFB_;
        result.lAJGLCIFKCP_ = lAJGLCIFKCP_;
        result.fCNFGMADAEH_ = fCNFGMADAEH_;
        result.duration_ = duration_;
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
        if (other instanceof emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM) {
          return mergeFrom((emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM other) {
        if (other == emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.getDefaultInstance()) return this;
        if (other.getOMHOEBJEOFB() != 0F) {
          setOMHOEBJEOFB(other.getOMHOEBJEOFB());
        }
        if (other.getLAJGLCIFKCP() != 0) {
          setLAJGLCIFKCP(other.getLAJGLCIFKCP());
        }
        if (other.getFCNFGMADAEH() != 0F) {
          setFCNFGMADAEH(other.getFCNFGMADAEH());
        }
        if (other.getDuration() != 0F) {
          setDuration(other.getDuration());
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
        emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float oMHOEBJEOFB_ ;
      /**
       * <code>float OMHOEBJEOFB = 2;</code>
       * @return The oMHOEBJEOFB.
       */
      @java.lang.Override
      public float getOMHOEBJEOFB() {
        return oMHOEBJEOFB_;
      }
      /**
       * <code>float OMHOEBJEOFB = 2;</code>
       * @param value The oMHOEBJEOFB to set.
       * @return This builder for chaining.
       */
      public Builder setOMHOEBJEOFB(float value) {
        
        oMHOEBJEOFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float OMHOEBJEOFB = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOMHOEBJEOFB() {
        
        oMHOEBJEOFB_ = 0F;
        onChanged();
        return this;
      }

      private int lAJGLCIFKCP_ ;
      /**
       * <code>uint32 LAJGLCIFKCP = 8;</code>
       * @return The lAJGLCIFKCP.
       */
      @java.lang.Override
      public int getLAJGLCIFKCP() {
        return lAJGLCIFKCP_;
      }
      /**
       * <code>uint32 LAJGLCIFKCP = 8;</code>
       * @param value The lAJGLCIFKCP to set.
       * @return This builder for chaining.
       */
      public Builder setLAJGLCIFKCP(int value) {
        
        lAJGLCIFKCP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LAJGLCIFKCP = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLAJGLCIFKCP() {
        
        lAJGLCIFKCP_ = 0;
        onChanged();
        return this;
      }

      private float fCNFGMADAEH_ ;
      /**
       * <code>float FCNFGMADAEH = 13;</code>
       * @return The fCNFGMADAEH.
       */
      @java.lang.Override
      public float getFCNFGMADAEH() {
        return fCNFGMADAEH_;
      }
      /**
       * <code>float FCNFGMADAEH = 13;</code>
       * @param value The fCNFGMADAEH to set.
       * @return This builder for chaining.
       */
      public Builder setFCNFGMADAEH(float value) {
        
        fCNFGMADAEH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float FCNFGMADAEH = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearFCNFGMADAEH() {
        
        fCNFGMADAEH_ = 0F;
        onChanged();
        return this;
      }

      private float duration_ ;
      /**
       * <code>float duration = 11;</code>
       * @return The duration.
       */
      @java.lang.Override
      public float getDuration() {
        return duration_;
      }
      /**
       * <code>float duration = 11;</code>
       * @param value The duration to set.
       * @return This builder for chaining.
       */
      public Builder setDuration(float value) {
        
        duration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float duration = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDuration() {
        
        duration_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:LHDHJOKBFNM)
    }

    // @@protoc_insertion_point(class_scope:LHDHJOKBFNM)
    private static final emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM();
    }

    public static emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LHDHJOKBFNM>
        PARSER = new com.google.protobuf.AbstractParser<LHDHJOKBFNM>() {
      @java.lang.Override
      public LHDHJOKBFNM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LHDHJOKBFNM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LHDHJOKBFNM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LHDHJOKBFNM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LHDHJOKBFNM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LHDHJOKBFNM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LHDHJOKBFNM.proto\"^\n\013LHDHJOKBFNM\022\023\n\013OM" +
      "HOEBJEOFB\030\002 \001(\002\022\023\n\013LAJGLCIFKCP\030\010 \001(\r\022\023\n\013" +
      "FCNFGMADAEH\030\r \001(\002\022\020\n\010duration\030\013 \001(\002B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LHDHJOKBFNM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LHDHJOKBFNM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LHDHJOKBFNM_descriptor,
        new java.lang.String[] { "OMHOEBJEOFB", "LAJGLCIFKCP", "FCNFGMADAEH", "Duration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
