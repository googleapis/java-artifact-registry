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
// source: google/devtools/artifactregistry/v1/artifact.proto

package com.google.devtools.artifactregistry.v1;

public final class ArtifactProto {
  private ArtifactProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_DockerImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_DockerImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/devtools/artifactregistry/v1/ar"
          + "tifact.proto\022#google.devtools.artifactre"
          + "gistry.v1\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032\037google/pr"
          + "otobuf/timestamp.proto\032\034google/api/annot"
          + "ations.proto\"\342\002\n\013DockerImage\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\002\022\020\n\003uri\030\002 \001(\tB\003\340A\002\022\014\n\004tags\030\003 \003(\t\022"
          + "\030\n\020image_size_bytes\030\004 \001(\003\022/\n\013upload_time"
          + "\030\005 \001(\0132\032.google.protobuf.Timestamp\022\022\n\nme"
          + "dia_type\030\006 \001(\t\022.\n\nbuild_time\030\007 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp:\220\001\352A\214\001\n+artifactr"
          + "egistry.googleapis.com/DockerImage\022]proj"
          + "ects/{project}/locations/{location}/repo"
          + "sitories/{repository}/dockerImages/{dock"
          + "er_image}\"U\n\027ListDockerImagesRequest\022\023\n\006"
          + "parent\030\001 \001(\tB\003\340A\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"|\n\030ListDockerImagesResp"
          + "onse\022G\n\rdocker_images\030\001 \003(\01320.google.dev"
          + "tools.artifactregistry.v1.DockerImage\022\027\n"
          + "\017next_page_token\030\002 \001(\tB\373\001\n\'com.google.de"
          + "vtools.artifactregistry.v1B\rArtifactProt"
          + "oP\001ZSgoogle.golang.org/genproto/googleap"
          + "is/devtools/artifactregistry/v1;artifact"
          + "registry\252\002 Google.Cloud.ArtifactRegistry"
          + ".V1\312\002 Google\\Cloud\\ArtifactRegistry\\V1\352\002"
          + "#Google::Cloud::ArtifactRegistry::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_DockerImage_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_DockerImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_DockerImage_descriptor,
            new java.lang.String[] {
              "Name", "Uri", "Tags", "ImageSizeBytes", "UploadTime", "MediaType", "BuildTime",
            });
    internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor,
            new java.lang.String[] {
              "DockerImages", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
