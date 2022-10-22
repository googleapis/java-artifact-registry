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
// source: google/devtools/artifactregistry/v1/version.proto

package com.google.devtools.artifactregistry.v1;

public final class VersionProto {
  private VersionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_DeleteVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_DeleteVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/devtools/artifactregistry/v1/ve"
          + "rsion.proto\022#google.devtools.artifactreg"
          + "istry.v1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032-google/dev"
          + "tools/artifactregistry/v1/tag.proto\032\034goo"
          + "gle/protobuf/struct.proto\032\037google/protob"
          + "uf/timestamp.proto\"\227\003\n\007Version\022\014\n\004name\030\001"
          + " \001(\t\022\023\n\013description\030\003 \001(\t\022/\n\013create_time"
          + "\030\005 \001(\0132\032.google.protobuf.Timestamp\022/\n\013up"
          + "date_time\030\006 \001(\0132\032.google.protobuf.Timest"
          + "amp\022>\n\014related_tags\030\007 \003(\0132(.google.devto"
          + "ols.artifactregistry.v1.Tag\022.\n\010metadata\030"
          + "\010 \001(\0132\027.google.protobuf.StructB\003\340A\003:\226\001\352A"
          + "\222\001\n\'artifactregistry.googleapis.com/Vers"
          + "ion\022gprojects/{project}/locations/{locat"
          + "ion}/repositories/{repository}/packages/"
          + "{package}/versions/{version}\"\243\001\n\023ListVer"
          + "sionsRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_siz"
          + "e\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022>\n\004view\030\004 \001("
          + "\01620.google.devtools.artifactregistry.v1."
          + "VersionView\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\"o\n\024Li"
          + "stVersionsResponse\022>\n\010versions\030\001 \003(\0132,.g"
          + "oogle.devtools.artifactregistry.v1.Versi"
          + "on\022\027\n\017next_page_token\030\002 \001(\t\"a\n\021GetVersio"
          + "nRequest\022\014\n\004name\030\001 \001(\t\022>\n\004view\030\002 \001(\01620.g"
          + "oogle.devtools.artifactregistry.v1.Versi"
          + "onView\"3\n\024DeleteVersionRequest\022\014\n\004name\030\001"
          + " \001(\t\022\r\n\005force\030\002 \001(\010*@\n\013VersionView\022\034\n\030VE"
          + "RSION_VIEW_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004F"
          + "ULL\020\002B\372\001\n\'com.google.devtools.artifactre"
          + "gistry.v1B\014VersionProtoP\001ZSgoogle.golang"
          + ".org/genproto/googleapis/devtools/artifa"
          + "ctregistry/v1;artifactregistry\252\002 Google."
          + "Cloud.ArtifactRegistry.V1\312\002 Google\\Cloud"
          + "\\ArtifactRegistry\\V1\352\002#Google::Cloud::Ar"
          + "tifactRegistry::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.TagProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_Version_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_Version_descriptor,
            new java.lang.String[] {
              "Name", "Description", "CreateTime", "UpdateTime", "RelatedTags", "Metadata",
            });
    internal_static_google_devtools_artifactregistry_v1_ListVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_ListVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "View", "OrderBy",
            });
    internal_static_google_devtools_artifactregistry_v1_ListVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ListVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_GetVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1_GetVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_devtools_artifactregistry_v1_DeleteVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1_DeleteVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_DeleteVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.TagProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
