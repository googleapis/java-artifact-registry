// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1/settings.proto

package com.google.devtools.artifactregistry.v1;

public final class SettingsProto {
  private SettingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_ProjectSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ProjectSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_GetProjectSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetProjectSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_UpdateProjectSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_UpdateProjectSettingsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/devtools/artifactregistry/v1/se" +
      "ttings.proto\022#google.devtools.artifactre" +
      "gistry.v1\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032 google/pr" +
      "otobuf/field_mask.proto\"\214\003\n\017ProjectSetti" +
      "ngs\022\014\n\004name\030\001 \001(\t\022g\n\030legacy_redirection_" +
      "state\030\002 \001(\0162E.google.devtools.artifactre" +
      "gistry.v1.ProjectSettings.RedirectionSta" +
      "te\"\247\001\n\020RedirectionState\022!\n\035REDIRECTION_S" +
      "TATE_UNSPECIFIED\020\000\022$\n REDIRECTION_FROM_G" +
      "CR_IO_DISABLED\020\001\022#\n\037REDIRECTION_FROM_GCR" +
      "_IO_ENABLED\020\002\022%\n!REDIRECTION_FROM_GCR_IO" +
      "_FINALIZED\020\003:X\352AU\n/artifactregistry.goog" +
      "leapis.com/ProjectSettings\022\"projects/{pr" +
      "oject}/projectSettings\"b\n\031GetProjectSett" +
      "ingsRequest\022E\n\004name\030\001 \001(\tB7\340A\002\372A1\n/artif" +
      "actregistry.googleapis.com/ProjectSettin" +
      "gs\"\237\001\n\034UpdateProjectSettingsRequest\022N\n\020p" +
      "roject_settings\030\002 \001(\01324.google.devtools." +
      "artifactregistry.v1.ProjectSettings\022/\n\013u" +
      "pdate_mask\030\003 \001(\0132\032.google.protobuf.Field" +
      "MaskB\373\001\n\'com.google.devtools.artifactreg" +
      "istry.v1B\rSettingsProtoP\001ZSgoogle.golang" +
      ".org/genproto/googleapis/devtools/artifa" +
      "ctregistry/v1;artifactregistry\252\002 Google." +
      "Cloud.ArtifactRegistry.V1\312\002 Google\\Cloud" +
      "\\ArtifactRegistry\\V1\352\002#Google::Cloud::Ar" +
      "tifactRegistry::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_devtools_artifactregistry_v1_ProjectSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_ProjectSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_ProjectSettings_descriptor,
        new java.lang.String[] { "Name", "LegacyRedirectionState", });
    internal_static_google_devtools_artifactregistry_v1_GetProjectSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_GetProjectSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_GetProjectSettingsRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_devtools_artifactregistry_v1_UpdateProjectSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_UpdateProjectSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_UpdateProjectSettingsRequest_descriptor,
        new java.lang.String[] { "ProjectSettings", "UpdateMask", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
