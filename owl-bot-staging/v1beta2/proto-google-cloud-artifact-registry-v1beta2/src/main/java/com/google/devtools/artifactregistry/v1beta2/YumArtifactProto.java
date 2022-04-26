// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/yum_artifact.proto

package com.google.devtools.artifactregistry.v1beta2;

public final class YumArtifactProto {
  private YumArtifactProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsGcsSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsErrorInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsErrorInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/devtools/artifactregistry/v1bet" +
      "a2/yum_artifact.proto\022(google.devtools.a" +
      "rtifactregistry.v1beta2\032\034google/api/anno" +
      "tations.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032#googl" +
      "e/longrunning/operations.proto\032\027google/r" +
      "pc/status.proto\"\214\003\n\013YumArtifact\022\021\n\004name\030" +
      "\001 \001(\tB\003\340A\003\022\031\n\014package_name\030\002 \001(\tB\003\340A\003\022\\\n" +
      "\014package_type\030\003 \001(\0162A.google.devtools.ar" +
      "tifactregistry.v1beta2.YumArtifact.Packa" +
      "geTypeB\003\340A\003\022\031\n\014architecture\030\004 \001(\tB\003\340A\003\"C" +
      "\n\013PackageType\022\034\n\030PACKAGE_TYPE_UNSPECIFIE" +
      "D\020\000\022\n\n\006BINARY\020\001\022\n\n\006SOURCE\020\002:\220\001\352A\214\001\n+arti" +
      "factregistry.googleapis.com/YumArtifact\022" +
      "]projects/{project}/locations/{location}" +
      "/repositories/{repository}/yumArtifacts/" +
      "{yum_artifact}\"B\n\033ImportYumArtifactsGcsS" +
      "ource\022\014\n\004uris\030\001 \003(\t\022\025\n\ruse_wildcards\030\002 \001" +
      "(\010\"\222\001\n\031ImportYumArtifactsRequest\022[\n\ngcs_" +
      "source\030\002 \001(\0132E.google.devtools.artifactr" +
      "egistry.v1beta2.ImportYumArtifactsGcsSou" +
      "rceH\000\022\016\n\006parent\030\001 \001(\tB\010\n\006source\"\247\001\n\033Impo" +
      "rtYumArtifactsErrorInfo\022[\n\ngcs_source\030\001 " +
      "\001(\0132E.google.devtools.artifactregistry.v" +
      "1beta2.ImportYumArtifactsGcsSourceH\000\022!\n\005" +
      "error\030\002 \001(\0132\022.google.rpc.StatusB\010\n\006sourc" +
      "e\"\301\001\n\032ImportYumArtifactsResponse\022L\n\ryum_" +
      "artifacts\030\001 \003(\01325.google.devtools.artifa" +
      "ctregistry.v1beta2.YumArtifact\022U\n\006errors" +
      "\030\002 \003(\0132E.google.devtools.artifactregistr" +
      "y.v1beta2.ImportYumArtifactsErrorInfo\"\034\n" +
      "\032ImportYumArtifactsMetadataB\227\002\n,com.goog" +
      "le.devtools.artifactregistry.v1beta2B\020Yu" +
      "mArtifactProtoP\001ZXgoogle.golang.org/genp" +
      "roto/googleapis/devtools/artifactregistr" +
      "y/v1beta2;artifactregistry\252\002%Google.Clou" +
      "d.ArtifactRegistry.V1Beta2\312\002%Google\\Clou" +
      "d\\ArtifactRegistry\\V1beta2\352\002(Google::Clo" +
      "ud::ArtifactRegistry::V1beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_YumArtifact_descriptor,
        new java.lang.String[] { "Name", "PackageName", "PackageType", "Architecture", });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsGcsSource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsGcsSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsGcsSource_descriptor,
        new java.lang.String[] { "Uris", "UseWildcards", });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsRequest_descriptor,
        new java.lang.String[] { "GcsSource", "Parent", "Source", });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsErrorInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsErrorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsErrorInfo_descriptor,
        new java.lang.String[] { "GcsSource", "Error", "Source", });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsResponse_descriptor,
        new java.lang.String[] { "YumArtifacts", "Errors", });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_ImportYumArtifactsMetadata_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
