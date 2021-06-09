// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/repository.proto

package com.google.devtools.artifactregistry.v1beta2;

public interface RepositoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.Repository)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the repository, for example:
   * "projects/p1/locations/us-central1/repositories/repo1".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the repository, for example:
   * "projects/p1/locations/us-central1/repositories/repo1".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The format of packages that are stored in the repository.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Repository.Format format = 2;</code>
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   * <pre>
   * The format of packages that are stored in the repository.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Repository.Format format = 2;</code>
   * @return The format.
   */
  com.google.devtools.artifactregistry.v1beta2.Repository.Format getFormat();

  /**
   * <pre>
   * The user-provided description of the repository.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The user-provided description of the repository.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Labels with user-defined metadata.
   * This field may contain up to 64 entries. Label keys and values may be no
   * longer than 63 characters. Label keys must begin with a lowercase letter
   * and may only contain lowercase letters, numeric characters, underscores,
   * and dashes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels with user-defined metadata.
   * This field may contain up to 64 entries. Label keys and values may be no
   * longer than 63 characters. Label keys must begin with a lowercase letter
   * and may only contain lowercase letters, numeric characters, underscores,
   * and dashes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Labels with user-defined metadata.
   * This field may contain up to 64 entries. Label keys and values may be no
   * longer than 63 characters. Label keys must begin with a lowercase letter
   * and may only contain lowercase letters, numeric characters, underscores,
   * and dashes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels with user-defined metadata.
   * This field may contain up to 64 entries. Label keys and values may be no
   * longer than 63 characters. Label keys must begin with a lowercase letter
   * and may only contain lowercase letters, numeric characters, underscores,
   * and dashes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Labels with user-defined metadata.
   * This field may contain up to 64 entries. Label keys and values may be no
   * longer than 63 characters. Label keys must begin with a lowercase letter
   * and may only contain lowercase letters, numeric characters, underscores,
   * and dashes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The time when the repository was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The time when the repository was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The time when the repository was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The time when the repository was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The time when the repository was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The time when the repository was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * The Cloud KMS resource name of the customer managed encryption key that’s
   * used to encrypt the contents of the Repository. Has the form:
   * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
   * This value may not be changed after the Repository has been created.
   * </pre>
   *
   * <code>string kms_key_name = 8;</code>
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   * <pre>
   * The Cloud KMS resource name of the customer managed encryption key that’s
   * used to encrypt the contents of the Repository. Has the form:
   * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
   * This value may not be changed after the Repository has been created.
   * </pre>
   *
   * <code>string kms_key_name = 8;</code>
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString
      getKmsKeyNameBytes();
}
