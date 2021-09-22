// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1/artifact.proto

package com.google.devtools.artifactregistry.v1;

public interface ListDockerImagesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ListDockerImagesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1.DockerImage> 
      getDockerImagesList();
  /**
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.DockerImage getDockerImages(int index);
  /**
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  int getDockerImagesCount();
  /**
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1.DockerImageOrBuilder> 
      getDockerImagesOrBuilderList();
  /**
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.DockerImageOrBuilder getDockerImagesOrBuilder(
      int index);

  /**
   * <pre>
   * The token to retrieve the next page of artifacts, or empty if there are no
   * more artifacts to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The token to retrieve the next page of artifacts, or empty if there are no
   * more artifacts to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
