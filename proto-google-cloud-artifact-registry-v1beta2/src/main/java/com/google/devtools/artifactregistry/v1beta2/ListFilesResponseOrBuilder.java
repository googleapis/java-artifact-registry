// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/file.proto

package com.google.devtools.artifactregistry.v1beta2;

public interface ListFilesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.ListFilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1beta2.File> 
      getFilesList();
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.File getFiles(int index);
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  int getFilesCount();
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.FileOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.FileOrBuilder getFilesOrBuilder(
      int index);

  /**
   * <pre>
   * The token to retrieve the next page of files, or empty if there are no
   * more files to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The token to retrieve the next page of files, or empty if there are no
   * more files to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
