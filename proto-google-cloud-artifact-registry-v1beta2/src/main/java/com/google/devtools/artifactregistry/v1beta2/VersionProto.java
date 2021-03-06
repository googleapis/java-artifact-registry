/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/version.proto

package com.google.devtools.artifactregistry.v1beta2;

public final class VersionProto {
  private VersionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/devtools/artifactregistry/v1bet"
          + "a2/version.proto\022(google.devtools.artifa"
          + "ctregistry.v1beta2\0322google/devtools/arti"
          + "factregistry/v1beta2/tag.proto\032\037google/p"
          + "rotobuf/timestamp.proto\032\034google/api/anno"
          + "tations.proto\"\323\001\n\007Version\022\014\n\004name\030\001 \001(\t\022"
          + "\023\n\013description\030\003 \001(\t\022/\n\013create_time\030\005 \001("
          + "\0132\032.google.protobuf.Timestamp\022/\n\013update_"
          + "time\030\006 \001(\0132\032.google.protobuf.Timestamp\022C"
          + "\n\014related_tags\030\007 \003(\0132-.google.devtools.a"
          + "rtifactregistry.v1beta2.Tag\"\221\001\n\023ListVers"
          + "ionsRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size"
          + "\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022C\n\004view\030\004 \001(\016"
          + "25.google.devtools.artifactregistry.v1be"
          + "ta2.VersionView\"t\n\024ListVersionsResponse\022"
          + "C\n\010versions\030\001 \003(\01321.google.devtools.arti"
          + "factregistry.v1beta2.Version\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\"f\n\021GetVersionRequest\022\014\n\004na"
          + "me\030\001 \001(\t\022C\n\004view\030\002 \001(\01625.google.devtools"
          + ".artifactregistry.v1beta2.VersionView\"3\n"
          + "\024DeleteVersionRequest\022\014\n\004name\030\001 \001(\t\022\r\n\005f"
          + "orce\030\002 \001(\010*@\n\013VersionView\022\034\n\030VERSION_VIE"
          + "W_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL\020\002B\223\002\n"
          + ",com.google.devtools.artifactregistry.v1"
          + "beta2B\014VersionProtoP\001ZXgoogle.golang.org"
          + "/genproto/googleapis/devtools/artifactre"
          + "gistry/v1beta2;artifactregistry\252\002%Google"
          + ".Cloud.ArtifactRegistry.V1Beta2\312\002%Google"
          + "\\Cloud\\ArtifactRegistry\\V1beta2\352\002(Google"
          + "::Cloud::ArtifactRegistry::V1beta2b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.devtools.artifactregistry.v1beta2.TagProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1beta2_Version_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_Version_descriptor,
            new java.lang.String[] {
              "Name", "Description", "CreateTime", "UpdateTime", "RelatedTags",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "View",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    com.google.devtools.artifactregistry.v1beta2.TagProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
