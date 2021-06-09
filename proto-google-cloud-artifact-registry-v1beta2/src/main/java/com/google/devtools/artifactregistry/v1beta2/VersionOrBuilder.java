// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/version.proto

package com.google.devtools.artifactregistry.v1beta2;

public interface VersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the version, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/art1".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the version, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/art1".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Description of the version, as specified in its metadata.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Description of the version, as specified in its metadata.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The time when the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The time when the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The time when the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The time when the version was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The time when the version was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The time when the version was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1beta2.Tag> 
      getRelatedTagsList();
  /**
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.Tag getRelatedTags(int index);
  /**
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  int getRelatedTagsCount();
  /**
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.TagOrBuilder> 
      getRelatedTagsOrBuilderList();
  /**
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.TagOrBuilder getRelatedTagsOrBuilder(
      int index);
}
