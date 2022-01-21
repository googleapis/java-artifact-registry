// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/settings.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 * <pre>
 * The Artifact Registry settings that apply to a Project.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ProjectSettings}
 */
public final class ProjectSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.ProjectSettings)
    ProjectSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProjectSettings.newBuilder() to construct.
  private ProjectSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProjectSettings() {
    name_ = "";
    legacyRedirectionState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProjectSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProjectSettings(
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
          case 16: {
            int rawValue = input.readEnum();

            legacyRedirectionState_ = rawValue;
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
    return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.ProjectSettings.class, com.google.devtools.artifactregistry.v1beta2.ProjectSettings.Builder.class);
  }

  /**
   * <pre>
   * The possible redirection states for legacy repositories.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState}
   */
  public enum RedirectionState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No redirection status has been set.
     * </pre>
     *
     * <code>REDIRECTION_STATE_UNSPECIFIED = 0;</code>
     */
    REDIRECTION_STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * Redirection is disabled.
     * </pre>
     *
     * <code>REDIRECTION_FROM_GCR_IO_DISABLED = 1;</code>
     */
    REDIRECTION_FROM_GCR_IO_DISABLED(1),
    /**
     * <pre>
     * Redirection is enabled.
     * </pre>
     *
     * <code>REDIRECTION_FROM_GCR_IO_ENABLED = 2;</code>
     */
    REDIRECTION_FROM_GCR_IO_ENABLED(2),
    /**
     * <pre>
     * Redirection is enabled, and has been finalized so cannot be reverted.
     * </pre>
     *
     * <code>REDIRECTION_FROM_GCR_IO_FINALIZED = 3;</code>
     */
    REDIRECTION_FROM_GCR_IO_FINALIZED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No redirection status has been set.
     * </pre>
     *
     * <code>REDIRECTION_STATE_UNSPECIFIED = 0;</code>
     */
    public static final int REDIRECTION_STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Redirection is disabled.
     * </pre>
     *
     * <code>REDIRECTION_FROM_GCR_IO_DISABLED = 1;</code>
     */
    public static final int REDIRECTION_FROM_GCR_IO_DISABLED_VALUE = 1;
    /**
     * <pre>
     * Redirection is enabled.
     * </pre>
     *
     * <code>REDIRECTION_FROM_GCR_IO_ENABLED = 2;</code>
     */
    public static final int REDIRECTION_FROM_GCR_IO_ENABLED_VALUE = 2;
    /**
     * <pre>
     * Redirection is enabled, and has been finalized so cannot be reverted.
     * </pre>
     *
     * <code>REDIRECTION_FROM_GCR_IO_FINALIZED = 3;</code>
     */
    public static final int REDIRECTION_FROM_GCR_IO_FINALIZED_VALUE = 3;


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
    public static RedirectionState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RedirectionState forNumber(int value) {
      switch (value) {
        case 0: return REDIRECTION_STATE_UNSPECIFIED;
        case 1: return REDIRECTION_FROM_GCR_IO_DISABLED;
        case 2: return REDIRECTION_FROM_GCR_IO_ENABLED;
        case 3: return REDIRECTION_FROM_GCR_IO_FINALIZED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RedirectionState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RedirectionState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RedirectionState>() {
            public RedirectionState findValueByNumber(int number) {
              return RedirectionState.forNumber(number);
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
      return com.google.devtools.artifactregistry.v1beta2.ProjectSettings.getDescriptor().getEnumTypes().get(0);
    }

    private static final RedirectionState[] VALUES = values();

    public static RedirectionState valueOf(
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

    private RedirectionState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the project's settings.
   * Always of the form:
   * projects/{project-id}/projectSettings
   * In update request: never set
   * In response: always set
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * The name of the project's settings.
   * Always of the form:
   * projects/{project-id}/projectSettings
   * In update request: never set
   * In response: always set
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int LEGACY_REDIRECTION_STATE_FIELD_NUMBER = 2;
  private int legacyRedirectionState_;
  /**
   * <pre>
   * The redirection state of the legacy repositories in this project.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;</code>
   * @return The enum numeric value on the wire for legacyRedirectionState.
   */
  @java.lang.Override public int getLegacyRedirectionStateValue() {
    return legacyRedirectionState_;
  }
  /**
   * <pre>
   * The redirection state of the legacy repositories in this project.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;</code>
   * @return The legacyRedirectionState.
   */
  @java.lang.Override public com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState getLegacyRedirectionState() {
    @SuppressWarnings("deprecation")
    com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState result = com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState.valueOf(legacyRedirectionState_);
    return result == null ? com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState.UNRECOGNIZED : result;
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
    if (legacyRedirectionState_ != com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState.REDIRECTION_STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, legacyRedirectionState_);
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
    if (legacyRedirectionState_ != com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState.REDIRECTION_STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, legacyRedirectionState_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.ProjectSettings)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.ProjectSettings other = (com.google.devtools.artifactregistry.v1beta2.ProjectSettings) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (legacyRedirectionState_ != other.legacyRedirectionState_) return false;
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
    hash = (37 * hash) + LEGACY_REDIRECTION_STATE_FIELD_NUMBER;
    hash = (53 * hash) + legacyRedirectionState_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1beta2.ProjectSettings prototype) {
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
   * The Artifact Registry settings that apply to a Project.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ProjectSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.ProjectSettings)
      com.google.devtools.artifactregistry.v1beta2.ProjectSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.ProjectSettings.class, com.google.devtools.artifactregistry.v1beta2.ProjectSettings.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.ProjectSettings.newBuilder()
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

      legacyRedirectionState_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ProjectSettings getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.ProjectSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ProjectSettings build() {
      com.google.devtools.artifactregistry.v1beta2.ProjectSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ProjectSettings buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.ProjectSettings result = new com.google.devtools.artifactregistry.v1beta2.ProjectSettings(this);
      result.name_ = name_;
      result.legacyRedirectionState_ = legacyRedirectionState_;
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
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.ProjectSettings) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.ProjectSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1beta2.ProjectSettings other) {
      if (other == com.google.devtools.artifactregistry.v1beta2.ProjectSettings.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.legacyRedirectionState_ != 0) {
        setLegacyRedirectionStateValue(other.getLegacyRedirectionStateValue());
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
      com.google.devtools.artifactregistry.v1beta2.ProjectSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.artifactregistry.v1beta2.ProjectSettings) e.getUnfinishedMessage();
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
     * The name of the project's settings.
     * Always of the form:
     * projects/{project-id}/projectSettings
     * In update request: never set
     * In response: always set
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the project's settings.
     * Always of the form:
     * projects/{project-id}/projectSettings
     * In update request: never set
     * In response: always set
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the project's settings.
     * Always of the form:
     * projects/{project-id}/projectSettings
     * In update request: never set
     * In response: always set
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the project's settings.
     * Always of the form:
     * projects/{project-id}/projectSettings
     * In update request: never set
     * In response: always set
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the project's settings.
     * Always of the form:
     * projects/{project-id}/projectSettings
     * In update request: never set
     * In response: always set
     * </pre>
     *
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

    private int legacyRedirectionState_ = 0;
    /**
     * <pre>
     * The redirection state of the legacy repositories in this project.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;</code>
     * @return The enum numeric value on the wire for legacyRedirectionState.
     */
    @java.lang.Override public int getLegacyRedirectionStateValue() {
      return legacyRedirectionState_;
    }
    /**
     * <pre>
     * The redirection state of the legacy repositories in this project.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;</code>
     * @param value The enum numeric value on the wire for legacyRedirectionState to set.
     * @return This builder for chaining.
     */
    public Builder setLegacyRedirectionStateValue(int value) {
      
      legacyRedirectionState_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The redirection state of the legacy repositories in this project.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;</code>
     * @return The legacyRedirectionState.
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState getLegacyRedirectionState() {
      @SuppressWarnings("deprecation")
      com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState result = com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState.valueOf(legacyRedirectionState_);
      return result == null ? com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The redirection state of the legacy repositories in this project.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;</code>
     * @param value The legacyRedirectionState to set.
     * @return This builder for chaining.
     */
    public Builder setLegacyRedirectionState(com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      legacyRedirectionState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The redirection state of the legacy repositories in this project.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLegacyRedirectionState() {
      
      legacyRedirectionState_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.ProjectSettings)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.ProjectSettings)
  private static final com.google.devtools.artifactregistry.v1beta2.ProjectSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.ProjectSettings();
  }

  public static com.google.devtools.artifactregistry.v1beta2.ProjectSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectSettings>
      PARSER = new com.google.protobuf.AbstractParser<ProjectSettings>() {
    @java.lang.Override
    public ProjectSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProjectSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProjectSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ProjectSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

