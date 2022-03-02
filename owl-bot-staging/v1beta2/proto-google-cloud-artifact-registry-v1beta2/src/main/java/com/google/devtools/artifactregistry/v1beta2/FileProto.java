// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/file.proto

package com.google.devtools.artifactregistry.v1beta2;

public final class FileProto {
  private FileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_Hash_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_Hash_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_File_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_ListFilesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListFilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_GetFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_GetFileRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/devtools/artifactregistry/v1bet" +
      "a2/file.proto\022(google.devtools.artifactr" +
      "egistry.v1beta2\032\034google/api/annotations." +
      "proto\032\031google/api/resource.proto\032\037google" +
      "/protobuf/timestamp.proto\"\230\001\n\004Hash\022E\n\004ty" +
      "pe\030\001 \001(\01627.google.devtools.artifactregis" +
      "try.v1beta2.Hash.HashType\022\r\n\005value\030\002 \001(\014" +
      "\":\n\010HashType\022\031\n\025HASH_TYPE_UNSPECIFIED\020\000\022" +
      "\n\n\006SHA256\020\001\022\007\n\003MD5\020\002\"\324\002\n\004File\022\014\n\004name\030\001 " +
      "\001(\t\022\022\n\nsize_bytes\030\003 \001(\003\022>\n\006hashes\030\004 \003(\0132" +
      "..google.devtools.artifactregistry.v1bet" +
      "a2.Hash\022/\n\013create_time\030\005 \001(\0132\032.google.pr" +
      "otobuf.Timestamp\022/\n\013update_time\030\006 \001(\0132\032." +
      "google.protobuf.Timestamp\022\r\n\005owner\030\007 \001(\t" +
      ":y\352Av\n$artifactregistry.googleapis.com/F" +
      "ile\022Nprojects/{project}/locations/{locat" +
      "ion}/repositories/{repository}/files/{fi" +
      "le}\"Y\n\020ListFilesRequest\022\016\n\006parent\030\001 \001(\t\022" +
      "\016\n\006filter\030\004 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npa" +
      "ge_token\030\003 \001(\t\"k\n\021ListFilesResponse\022=\n\005f" +
      "iles\030\001 \003(\0132..google.devtools.artifactreg" +
      "istry.v1beta2.File\022\027\n\017next_page_token\030\002 " +
      "\001(\t\"\036\n\016GetFileRequest\022\014\n\004name\030\001 \001(\tB\220\002\n," +
      "com.google.devtools.artifactregistry.v1b" +
      "eta2B\tFileProtoP\001ZXgoogle.golang.org/gen" +
      "proto/googleapis/devtools/artifactregist" +
      "ry/v1beta2;artifactregistry\252\002%Google.Clo" +
      "ud.ArtifactRegistry.V1Beta2\312\002%Google\\Clo" +
      "ud\\ArtifactRegistry\\V1beta2\352\002(Google::Cl" +
      "oud::ArtifactRegistry::V1beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_devtools_artifactregistry_v1beta2_Hash_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_Hash_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_Hash_descriptor,
        new java.lang.String[] { "Type", "Value", });
    internal_static_google_devtools_artifactregistry_v1beta2_File_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1beta2_File_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_File_descriptor,
        new java.lang.String[] { "Name", "SizeBytes", "Hashes", "CreateTime", "UpdateTime", "Owner", });
    internal_static_google_devtools_artifactregistry_v1beta2_ListFilesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1beta2_ListFilesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_ListFilesRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", });
    internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_descriptor,
        new java.lang.String[] { "Files", "NextPageToken", });
    internal_static_google_devtools_artifactregistry_v1beta2_GetFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1beta2_GetFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_GetFileRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
