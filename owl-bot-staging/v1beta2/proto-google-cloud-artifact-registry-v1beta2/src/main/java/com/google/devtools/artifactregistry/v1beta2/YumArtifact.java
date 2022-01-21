// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/yum_artifact.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 * <pre>
 * A detailed representation of a Yum artifact.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.YumArtifact}
 */
public final class YumArtifact extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.YumArtifact)
    YumArtifactOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YumArtifact.newBuilder() to construct.
  private YumArtifact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YumArtifact() {
    name_ = "";
    packageName_ = "";
    packageType_ = 0;
    architecture_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YumArtifact();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private YumArtifact(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            packageName_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            packageType_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            architecture_ = s;
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
    return com.google.devtools.artifactregistry.v1beta2.YumArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.YumArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.YumArtifact.class, com.google.devtools.artifactregistry.v1beta2.YumArtifact.Builder.class);
  }

  /**
   * <pre>
   * Package type is either binary or source.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType}
   */
  public enum PackageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Package type is not specified.
     * </pre>
     *
     * <code>PACKAGE_TYPE_UNSPECIFIED = 0;</code>
     */
    PACKAGE_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Binary package (.rpm).
     * </pre>
     *
     * <code>BINARY = 1;</code>
     */
    BINARY(1),
    /**
     * <pre>
     * Source package (.srpm).
     * </pre>
     *
     * <code>SOURCE = 2;</code>
     */
    SOURCE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Package type is not specified.
     * </pre>
     *
     * <code>PACKAGE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int PACKAGE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Binary package (.rpm).
     * </pre>
     *
     * <code>BINARY = 1;</code>
     */
    public static final int BINARY_VALUE = 1;
    /**
     * <pre>
     * Source package (.srpm).
     * </pre>
     *
     * <code>SOURCE = 2;</code>
     */
    public static final int SOURCE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PackageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PackageType forNumber(int value) {
      switch (value) {
        case 0: return PACKAGE_TYPE_UNSPECIFIED;
        case 1: return BINARY;
        case 2: return SOURCE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PackageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PackageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PackageType>() {
            public PackageType findValueByNumber(int number) {
              return PackageType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
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
      return com.google.devtools.artifactregistry.v1beta2.YumArtifact.getDescriptor().getEnumTypes().get(0);
    }

    private static final PackageType[] VALUES = values();

    public static PackageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PackageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Output only. The Artifact Registry resource name of the artifact.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The Artifact Registry resource name of the artifact.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object packageName_;
  /**
   * <pre>
   * Output only. The yum package name of the artifact.
   * </pre>
   *
   * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The packageName.
   */
  @java.lang.Override
  public java.lang.String getPackageName() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packageName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The yum package name of the artifact.
   * </pre>
   *
   * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for packageName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPackageNameBytes() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      packageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGE_TYPE_FIELD_NUMBER = 3;
  private int packageType_;
  /**
   * <pre>
   * Output only. An artifact is a binary or source package.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for packageType.
   */
  @java.lang.Override public int getPackageTypeValue() {
    return packageType_;
  }
  /**
   * <pre>
   * Output only. An artifact is a binary or source package.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The packageType.
   */
  @java.lang.Override public com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType getPackageType() {
    @SuppressWarnings("deprecation")
    com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType result = com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType.valueOf(packageType_);
    return result == null ? com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType.UNRECOGNIZED : result;
  }

  public static final int ARCHITECTURE_FIELD_NUMBER = 4;
  private volatile java.lang.Object architecture_;
  /**
   * <pre>
   * Output only. Operating system architecture of the artifact.
   * </pre>
   *
   * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The architecture.
   */
  @java.lang.Override
  public java.lang.String getArchitecture() {
    java.lang.Object ref = architecture_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      architecture_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Operating system architecture of the artifact.
   * </pre>
   *
   * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for architecture.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArchitectureBytes() {
    java.lang.Object ref = architecture_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      architecture_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, packageName_);
    }
    if (packageType_ != com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType.PACKAGE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, packageType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(architecture_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, architecture_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, packageName_);
    }
    if (packageType_ != com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType.PACKAGE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, packageType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(architecture_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, architecture_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.YumArtifact)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.YumArtifact other = (com.google.devtools.artifactregistry.v1beta2.YumArtifact) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getPackageName()
        .equals(other.getPackageName())) return false;
    if (packageType_ != other.packageType_) return false;
    if (!getArchitecture()
        .equals(other.getArchitecture())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PACKAGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPackageName().hashCode();
    hash = (37 * hash) + PACKAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + packageType_;
    hash = (37 * hash) + ARCHITECTURE_FIELD_NUMBER;
    hash = (53 * hash) + getArchitecture().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1beta2.YumArtifact prototype) {
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
   * A detailed representation of a Yum artifact.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.YumArtifact}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.YumArtifact)
      com.google.devtools.artifactregistry.v1beta2.YumArtifactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.YumArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.YumArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.YumArtifact.class, com.google.devtools.artifactregistry.v1beta2.YumArtifact.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.YumArtifact.newBuilder()
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
      name_ = "";

      packageName_ = "";

      packageType_ = 0;

      architecture_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.YumArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.YumArtifact getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.YumArtifact.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.YumArtifact build() {
      com.google.devtools.artifactregistry.v1beta2.YumArtifact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.YumArtifact buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.YumArtifact result = new com.google.devtools.artifactregistry.v1beta2.YumArtifact(this);
      result.name_ = name_;
      result.packageName_ = packageName_;
      result.packageType_ = packageType_;
      result.architecture_ = architecture_;
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
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.YumArtifact) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.YumArtifact)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1beta2.YumArtifact other) {
      if (other == com.google.devtools.artifactregistry.v1beta2.YumArtifact.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getPackageName().isEmpty()) {
        packageName_ = other.packageName_;
        onChanged();
      }
      if (other.packageType_ != 0) {
        setPackageTypeValue(other.getPackageTypeValue());
      }
      if (!other.getArchitecture().isEmpty()) {
        architecture_ = other.architecture_;
        onChanged();
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
      com.google.devtools.artifactregistry.v1beta2.YumArtifact parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.artifactregistry.v1beta2.YumArtifact) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    private java.lang.Object packageName_ = "";
    /**
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The packageName.
     */
    public java.lang.String getPackageName() {
      java.lang.Object ref = packageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for packageName.
     */
    public com.google.protobuf.ByteString
        getPackageNameBytes() {
      java.lang.Object ref = packageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        packageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      packageName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearPackageName() {
      
      packageName_ = getDefaultInstance().getPackageName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      packageName_ = value;
      onChanged();
      return this;
    }

    private int packageType_ = 0;
    /**
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for packageType.
     */
    @java.lang.Override public int getPackageTypeValue() {
      return packageType_;
    }
    /**
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for packageType to set.
     * @return This builder for chaining.
     */
    public Builder setPackageTypeValue(int value) {
      
      packageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The packageType.
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType getPackageType() {
      @SuppressWarnings("deprecation")
      com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType result = com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType.valueOf(packageType_);
      return result == null ? com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The packageType to set.
     * @return This builder for chaining.
     */
    public Builder setPackageType(com.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      packageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearPackageType() {
      
      packageType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object architecture_ = "";
    /**
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The architecture.
     */
    public java.lang.String getArchitecture() {
      java.lang.Object ref = architecture_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        architecture_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for architecture.
     */
    public com.google.protobuf.ByteString
        getArchitectureBytes() {
      java.lang.Object ref = architecture_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        architecture_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The architecture to set.
     * @return This builder for chaining.
     */
    public Builder setArchitecture(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      architecture_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearArchitecture() {
      
      architecture_ = getDefaultInstance().getArchitecture();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for architecture to set.
     * @return This builder for chaining.
     */
    public Builder setArchitectureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      architecture_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.YumArtifact)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.YumArtifact)
  private static final com.google.devtools.artifactregistry.v1beta2.YumArtifact DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.YumArtifact();
  }

  public static com.google.devtools.artifactregistry.v1beta2.YumArtifact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YumArtifact>
      PARSER = new com.google.protobuf.AbstractParser<YumArtifact>() {
    @java.lang.Override
    public YumArtifact parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new YumArtifact(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<YumArtifact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YumArtifact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.YumArtifact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

