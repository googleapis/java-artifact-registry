// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/package.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 * <pre>
 * The response from listing packages.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ListPackagesResponse}
 */
public final class ListPackagesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.ListPackagesResponse)
    ListPackagesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPackagesResponse.newBuilder() to construct.
  private ListPackagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPackagesResponse() {
    packages_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPackagesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListPackagesResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              packages_ = new java.util.ArrayList<com.google.devtools.artifactregistry.v1beta2.Package>();
              mutable_bitField0_ |= 0x00000001;
            }
            packages_.add(
                input.readMessage(com.google.devtools.artifactregistry.v1beta2.Package.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        packages_ = java.util.Collections.unmodifiableList(packages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.artifactregistry.v1beta2.PackageProto.internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.PackageProto.internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse.class, com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse.Builder.class);
  }

  public static final int PACKAGES_FIELD_NUMBER = 1;
  private java.util.List<com.google.devtools.artifactregistry.v1beta2.Package> packages_;
  /**
   * <pre>
   * The packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.artifactregistry.v1beta2.Package> getPackagesList() {
    return packages_;
  }
  /**
   * <pre>
   * The packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.PackageOrBuilder> 
      getPackagesOrBuilderList() {
    return packages_;
  }
  /**
   * <pre>
   * The packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
   */
  @java.lang.Override
  public int getPackagesCount() {
    return packages_.size();
  }
  /**
   * <pre>
   * The packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.Package getPackages(int index) {
    return packages_.get(index);
  }
  /**
   * <pre>
   * The packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.PackageOrBuilder getPackagesOrBuilder(
      int index) {
    return packages_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The token to retrieve the next page of packages, or empty if there are no
   * more packages to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The token to retrieve the next page of packages, or empty if there are no
   * more packages to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < packages_.size(); i++) {
      output.writeMessage(1, packages_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < packages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, packages_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse other = (com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse) obj;

    if (!getPackagesList()
        .equals(other.getPackagesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getPackagesCount() > 0) {
      hash = (37 * hash) + PACKAGES_FIELD_NUMBER;
      hash = (53 * hash) + getPackagesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse prototype) {
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
   * The response from listing packages.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ListPackagesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.ListPackagesResponse)
      com.google.devtools.artifactregistry.v1beta2.ListPackagesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.PackageProto.internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.PackageProto.internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse.class, com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse.newBuilder()
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
        getPackagesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (packagesBuilder_ == null) {
        packages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        packagesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.PackageProto.internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse build() {
      com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse result = new com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse(this);
      int from_bitField0_ = bitField0_;
      if (packagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          packages_ = java.util.Collections.unmodifiableList(packages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.packages_ = packages_;
      } else {
        result.packages_ = packagesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse other) {
      if (other == com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse.getDefaultInstance()) return this;
      if (packagesBuilder_ == null) {
        if (!other.packages_.isEmpty()) {
          if (packages_.isEmpty()) {
            packages_ = other.packages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePackagesIsMutable();
            packages_.addAll(other.packages_);
          }
          onChanged();
        }
      } else {
        if (!other.packages_.isEmpty()) {
          if (packagesBuilder_.isEmpty()) {
            packagesBuilder_.dispose();
            packagesBuilder_ = null;
            packages_ = other.packages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            packagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPackagesFieldBuilder() : null;
          } else {
            packagesBuilder_.addAllMessages(other.packages_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.devtools.artifactregistry.v1beta2.Package> packages_ =
      java.util.Collections.emptyList();
    private void ensurePackagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        packages_ = new java.util.ArrayList<com.google.devtools.artifactregistry.v1beta2.Package>(packages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.Package, com.google.devtools.artifactregistry.v1beta2.Package.Builder, com.google.devtools.artifactregistry.v1beta2.PackageOrBuilder> packagesBuilder_;

    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public java.util.List<com.google.devtools.artifactregistry.v1beta2.Package> getPackagesList() {
      if (packagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(packages_);
      } else {
        return packagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public int getPackagesCount() {
      if (packagesBuilder_ == null) {
        return packages_.size();
      } else {
        return packagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.Package getPackages(int index) {
      if (packagesBuilder_ == null) {
        return packages_.get(index);
      } else {
        return packagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder setPackages(
        int index, com.google.devtools.artifactregistry.v1beta2.Package value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.set(index, value);
        onChanged();
      } else {
        packagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder setPackages(
        int index, com.google.devtools.artifactregistry.v1beta2.Package.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.set(index, builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder addPackages(com.google.devtools.artifactregistry.v1beta2.Package value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.add(value);
        onChanged();
      } else {
        packagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder addPackages(
        int index, com.google.devtools.artifactregistry.v1beta2.Package value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.add(index, value);
        onChanged();
      } else {
        packagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder addPackages(
        com.google.devtools.artifactregistry.v1beta2.Package.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.add(builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder addPackages(
        int index, com.google.devtools.artifactregistry.v1beta2.Package.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.add(index, builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder addAllPackages(
        java.lang.Iterable<? extends com.google.devtools.artifactregistry.v1beta2.Package> values) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, packages_);
        onChanged();
      } else {
        packagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder clearPackages() {
      if (packagesBuilder_ == null) {
        packages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        packagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public Builder removePackages(int index) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.remove(index);
        onChanged();
      } else {
        packagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.Package.Builder getPackagesBuilder(
        int index) {
      return getPackagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.PackageOrBuilder getPackagesOrBuilder(
        int index) {
      if (packagesBuilder_ == null) {
        return packages_.get(index);  } else {
        return packagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.PackageOrBuilder> 
         getPackagesOrBuilderList() {
      if (packagesBuilder_ != null) {
        return packagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(packages_);
      }
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.Package.Builder addPackagesBuilder() {
      return getPackagesFieldBuilder().addBuilder(
          com.google.devtools.artifactregistry.v1beta2.Package.getDefaultInstance());
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.Package.Builder addPackagesBuilder(
        int index) {
      return getPackagesFieldBuilder().addBuilder(
          index, com.google.devtools.artifactregistry.v1beta2.Package.getDefaultInstance());
    }
    /**
     * <pre>
     * The packages returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.Package packages = 1;</code>
     */
    public java.util.List<com.google.devtools.artifactregistry.v1beta2.Package.Builder> 
         getPackagesBuilderList() {
      return getPackagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.Package, com.google.devtools.artifactregistry.v1beta2.Package.Builder, com.google.devtools.artifactregistry.v1beta2.PackageOrBuilder> 
        getPackagesFieldBuilder() {
      if (packagesBuilder_ == null) {
        packagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.artifactregistry.v1beta2.Package, com.google.devtools.artifactregistry.v1beta2.Package.Builder, com.google.devtools.artifactregistry.v1beta2.PackageOrBuilder>(
                packages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        packages_ = null;
      }
      return packagesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The token to retrieve the next page of packages, or empty if there are no
     * more packages to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The token to retrieve the next page of packages, or empty if there are no
     * more packages to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The token to retrieve the next page of packages, or empty if there are no
     * more packages to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token to retrieve the next page of packages, or empty if there are no
     * more packages to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token to retrieve the next page of packages, or empty if there are no
     * more packages to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.ListPackagesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.ListPackagesResponse)
  private static final com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse();
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPackagesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPackagesResponse>() {
    @java.lang.Override
    public ListPackagesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListPackagesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListPackagesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPackagesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

