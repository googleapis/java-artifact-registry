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
// source: google/devtools/artifactregistry/v1/repository.proto

package com.google.devtools.artifactregistry.v1;

public final class RepositoryProto {
  private RepositoryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_Repository_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_Repository_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_Repository_MavenRepositoryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_Repository_MavenRepositoryConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_Repository_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_Repository_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListRepositoriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListRepositoriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListRepositoriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListRepositoriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetRepositoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetRepositoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_CreateRepositoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_CreateRepositoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_DeleteRepositoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_DeleteRepositoryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/devtools/artifactregistry/v1/re"
          + "pository.proto\022#google.devtools.artifact"
          + "registry.v1\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032 google/"
          + "protobuf/field_mask.proto\032\037google/protob"
          + "uf/timestamp.proto\"\245\007\n\nRepository\022]\n\014mav"
          + "en_config\030\t \001(\0132E.google.devtools.artifa"
          + "ctregistry.v1.Repository.MavenRepository"
          + "ConfigH\000\022\014\n\004name\030\001 \001(\t\022F\n\006format\030\002 \001(\01626"
          + ".google.devtools.artifactregistry.v1.Rep"
          + "ository.Format\022\023\n\013description\030\003 \001(\t\022K\n\006l"
          + "abels\030\004 \003(\0132;.google.devtools.artifactre"
          + "gistry.v1.Repository.LabelsEntry\022/\n\013crea"
          + "te_time\030\005 \001(\0132\032.google.protobuf.Timestam"
          + "p\022/\n\013update_time\030\006 \001(\0132\032.google.protobuf"
          + ".Timestamp\022\024\n\014kms_key_name\030\010 \001(\t\032\363\001\n\025Mav"
          + "enRepositoryConfig\022!\n\031allow_snapshot_ove"
          + "rwrites\030\001 \001(\010\022k\n\016version_policy\030\002 \001(\0162S."
          + "google.devtools.artifactregistry.v1.Repo"
          + "sitory.MavenRepositoryConfig.VersionPoli"
          + "cy\"J\n\rVersionPolicy\022\036\n\032VERSION_POLICY_UN"
          + "SPECIFIED\020\000\022\013\n\007RELEASE\020\001\022\014\n\010SNAPSHOT\020\002\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\"^\n\006Format\022\026\n\022FORMAT_UNSPECIFIED\020\000\022"
          + "\n\n\006DOCKER\020\001\022\t\n\005MAVEN\020\002\022\007\n\003NPM\020\003\022\007\n\003APT\020\005"
          + "\022\007\n\003YUM\020\006\022\n\n\006PYTHON\020\010:r\352Ao\n*artifactregi"
          + "stry.googleapis.com/Repository\022Aprojects"
          + "/{project}/locations/{location}/reposito"
          + "ries/{repository}B\017\n\rformat_config\"\204\001\n\027L"
          + "istRepositoriesRequest\022B\n\006parent\030\001 \001(\tB2"
          + "\340A\002\372A,\022*artifactregistry.googleapis.com/"
          + "Repository\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_to"
          + "ken\030\003 \001(\t\"z\n\030ListRepositoriesResponse\022E\n"
          + "\014repositories\030\001 \003(\0132/.google.devtools.ar"
          + "tifactregistry.v1.Repository\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\"X\n\024GetRepositoryRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n*artifactregistry.go"
          + "ogleapis.com/Repository\"\271\001\n\027CreateReposi"
          + "toryRequest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\022*art"
          + "ifactregistry.googleapis.com/Repository\022"
          + "\025\n\rrepository_id\030\002 \001(\t\022C\n\nrepository\030\003 \001"
          + "(\0132/.google.devtools.artifactregistry.v1"
          + ".Repository\"\217\001\n\027UpdateRepositoryRequest\022"
          + "C\n\nrepository\030\001 \001(\0132/.google.devtools.ar"
          + "tifactregistry.v1.Repository\022/\n\013update_m"
          + "ask\030\002 \001(\0132\032.google.protobuf.FieldMask\"[\n"
          + "\027DeleteRepositoryRequest\022@\n\004name\030\001 \001(\tB2"
          + "\340A\002\372A,\n*artifactregistry.googleapis.com/"
          + "RepositoryB\375\001\n\'com.google.devtools.artif"
          + "actregistry.v1B\017RepositoryProtoP\001ZSgoogl"
          + "e.golang.org/genproto/googleapis/devtool"
          + "s/artifactregistry/v1;artifactregistry\252\002"
          + " Google.Cloud.ArtifactRegistry.V1\312\002 Goog"
          + "le\\Cloud\\ArtifactRegistry\\V1\352\002#Google::C"
          + "loud::ArtifactRegistry::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_Repository_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_Repository_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_Repository_descriptor,
            new java.lang.String[] {
              "MavenConfig",
              "Name",
              "Format",
              "Description",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "KmsKeyName",
              "FormatConfig",
            });
    internal_static_google_devtools_artifactregistry_v1_Repository_MavenRepositoryConfig_descriptor =
        internal_static_google_devtools_artifactregistry_v1_Repository_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_devtools_artifactregistry_v1_Repository_MavenRepositoryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_Repository_MavenRepositoryConfig_descriptor,
            new java.lang.String[] {
              "AllowSnapshotOverwrites", "VersionPolicy",
            });
    internal_static_google_devtools_artifactregistry_v1_Repository_LabelsEntry_descriptor =
        internal_static_google_devtools_artifactregistry_v1_Repository_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_devtools_artifactregistry_v1_Repository_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_Repository_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_devtools_artifactregistry_v1_ListRepositoriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_ListRepositoriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListRepositoriesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_ListRepositoriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ListRepositoriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListRepositoriesResponse_descriptor,
            new java.lang.String[] {
              "Repositories", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_GetRepositoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1_GetRepositoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetRepositoryRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1_CreateRepositoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1_CreateRepositoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_CreateRepositoryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RepositoryId", "Repository",
            });
    internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_descriptor,
            new java.lang.String[] {
              "Repository", "UpdateMask",
            });
    internal_static_google_devtools_artifactregistry_v1_DeleteRepositoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_artifactregistry_v1_DeleteRepositoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_DeleteRepositoryRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
