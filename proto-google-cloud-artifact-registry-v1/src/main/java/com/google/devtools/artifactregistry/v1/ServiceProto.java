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
// source: google/devtools/artifactregistry/v1/service.proto

package com.google.devtools.artifactregistry.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/devtools/artifactregistry/v1/se"
          + "rvice.proto\022#google.devtools.artifactreg"
          + "istry.v1\032\034google/api/annotations.proto\032\027"
          + "google/api/client.proto\0326google/devtools"
          + "/artifactregistry/v1/apt_artifact.proto\032"
          + "2google/devtools/artifactregistry/v1/art"
          + "ifact.proto\032.google/devtools/artifactreg"
          + "istry/v1/file.proto\0321google/devtools/art"
          + "ifactregistry/v1/package.proto\0324google/d"
          + "evtools/artifactregistry/v1/repository.p"
          + "roto\0322google/devtools/artifactregistry/v"
          + "1/settings.proto\032-google/devtools/artifa"
          + "ctregistry/v1/tag.proto\0321google/devtools"
          + "/artifactregistry/v1/version.proto\0326goog"
          + "le/devtools/artifactregistry/v1/vpcsc_co"
          + "nfig.proto\0326google/devtools/artifactregi"
          + "stry/v1/yum_artifact.proto\032\036google/iam/v"
          + "1/iam_policy.proto\032\032google/iam/v1/policy"
          + ".proto\032#google/longrunning/operations.pr"
          + "oto\032\033google/protobuf/empty.proto\"\023\n\021Oper"
          + "ationMetadata2\242>\n\020ArtifactRegistry\022\341\001\n\020L"
          + "istDockerImages\022<.google.devtools.artifa"
          + "ctregistry.v1.ListDockerImagesRequest\032=."
          + "google.devtools.artifactregistry.v1.List"
          + "DockerImagesResponse\"P\202\323\344\223\002A\022?/v1/{paren"
          + "t=projects/*/locations/*/repositories/*}"
          + "/dockerImages\332A\006parent\022\316\001\n\016GetDockerImag"
          + "e\022:.google.devtools.artifactregistry.v1."
          + "GetDockerImageRequest\0320.google.devtools."
          + "artifactregistry.v1.DockerImage\"N\202\323\344\223\002A\022"
          + "?/v1/{name=projects/*/locations/*/reposi"
          + "tories/*/dockerImages/*}\332A\004name\022\351\001\n\022List"
          + "MavenArtifacts\022>.google.devtools.artifac"
          + "tregistry.v1.ListMavenArtifactsRequest\032?"
          + ".google.devtools.artifactregistry.v1.Lis"
          + "tMavenArtifactsResponse\"R\202\323\344\223\002C\022A/v1/{pa"
          + "rent=projects/*/locations/*/repositories"
          + "/*}/mavenArtifacts\332A\006parent\022\326\001\n\020GetMaven"
          + "Artifact\022<.google.devtools.artifactregis"
          + "try.v1.GetMavenArtifactRequest\0322.google."
          + "devtools.artifactregistry.v1.MavenArtifa"
          + "ct\"P\202\323\344\223\002C\022A/v1/{name=projects/*/locatio"
          + "ns/*/repositories/*/mavenArtifacts/*}\332A\004"
          + "name\022\335\001\n\017ListNpmPackages\022;.google.devtoo"
          + "ls.artifactregistry.v1.ListNpmPackagesRe"
          + "quest\032<.google.devtools.artifactregistry"
          + ".v1.ListNpmPackagesResponse\"O\202\323\344\223\002@\022>/v1"
          + "/{parent=projects/*/locations/*/reposito"
          + "ries/*}/npmPackages\332A\006parent\022\312\001\n\rGetNpmP"
          + "ackage\0229.google.devtools.artifactregistr"
          + "y.v1.GetNpmPackageRequest\032/.google.devto"
          + "ols.artifactregistry.v1.NpmPackage\"M\202\323\344\223"
          + "\002@\022>/v1/{name=projects/*/locations/*/rep"
          + "ositories/*/npmPackages/*}\332A\004name\022\351\001\n\022Li"
          + "stPythonPackages\022>.google.devtools.artif"
          + "actregistry.v1.ListPythonPackagesRequest"
          + "\032?.google.devtools.artifactregistry.v1.L"
          + "istPythonPackagesResponse\"R\202\323\344\223\002C\022A/v1/{"
          + "parent=projects/*/locations/*/repositori"
          + "es/*}/pythonPackages\332A\006parent\022\326\001\n\020GetPyt"
          + "honPackage\022<.google.devtools.artifactreg"
          + "istry.v1.GetPythonPackageRequest\0322.googl"
          + "e.devtools.artifactregistry.v1.PythonPac"
          + "kage\"P\202\323\344\223\002C\022A/v1/{name=projects/*/locat"
          + "ions/*/repositories/*/pythonPackages/*}\332"
          + "A\004name\022\313\002\n\022ImportAptArtifacts\022>.google.d"
          + "evtools.artifactregistry.v1.ImportAptArt"
          + "ifactsRequest\032\035.google.longrunning.Opera"
          + "tion\"\325\001\202\323\344\223\002K\"F/v1/{parent=projects/*/lo"
          + "cations/*/repositories/*}/aptArtifacts:i"
          + "mport:\001*\312A\200\001\n>google.devtools.artifactre"
          + "gistry.v1.ImportAptArtifactsResponse\022>go"
          + "ogle.devtools.artifactregistry.v1.Import"
          + "AptArtifactsMetadata\022\313\002\n\022ImportYumArtifa"
          + "cts\022>.google.devtools.artifactregistry.v"
          + "1.ImportYumArtifactsRequest\032\035.google.lon"
          + "grunning.Operation\"\325\001\202\323\344\223\002K\"F/v1/{parent"
          + "=projects/*/locations/*/repositories/*}/"
          + "yumArtifacts:import:\001*\312A\200\001\n>google.devto"
          + "ols.artifactregistry.v1.ImportYumArtifac"
          + "tsResponse\022>google.devtools.artifactregi"
          + "stry.v1.ImportYumArtifactsMetadata\022\322\001\n\020L"
          + "istRepositories\022<.google.devtools.artifa"
          + "ctregistry.v1.ListRepositoriesRequest\032=."
          + "google.devtools.artifactregistry.v1.List"
          + "RepositoriesResponse\"A\202\323\344\223\0022\0220/v1/{paren"
          + "t=projects/*/locations/*}/repositories\332A"
          + "\006parent\022\274\001\n\rGetRepository\0229.google.devto"
          + "ols.artifactregistry.v1.GetRepositoryReq"
          + "uest\032/.google.devtools.artifactregistry."
          + "v1.Repository\"?\202\323\344\223\0022\0220/v1/{name=project"
          + "s/*/locations/*/repositories/*}\332A\004name\022\302"
          + "\002\n\020CreateRepository\022<.google.devtools.ar"
          + "tifactregistry.v1.CreateRepositoryReques"
          + "t\032\035.google.longrunning.Operation\"\320\001\202\323\344\223\002"
          + ">\"0/v1/{parent=projects/*/locations/*}/r"
          + "epositories:\nrepository\332A\037parent,reposit"
          + "ory,repository_id\312Ag\n.google.devtools.ar"
          + "tifactregistry.v1.Repository\0225google.dev"
          + "tools.artifactregistry.v1.OperationMetad"
          + "ata\022\353\001\n\020UpdateRepository\022<.google.devtoo"
          + "ls.artifactregistry.v1.UpdateRepositoryR"
          + "equest\032/.google.devtools.artifactregistr"
          + "y.v1.Repository\"h\202\323\344\223\002I2;/v1/{repository"
          + ".name=projects/*/locations/*/repositorie"
          + "s/*}:\nrepository\332A\026repository,update_mas"
          + "k\022\202\002\n\020DeleteRepository\022<.google.devtools"
          + ".artifactregistry.v1.DeleteRepositoryReq"
          + "uest\032\035.google.longrunning.Operation\"\220\001\202\323"
          + "\344\223\0022*0/v1/{name=projects/*/locations/*/r"
          + "epositories/*}\332A\004name\312AN\n\025google.protobu"
          + "f.Empty\0225google.devtools.artifactregistr"
          + "y.v1.OperationMetadata\022\321\001\n\014ListPackages\022"
          + "8.google.devtools.artifactregistry.v1.Li"
          + "stPackagesRequest\0329.google.devtools.arti"
          + "factregistry.v1.ListPackagesResponse\"L\202\323"
          + "\344\223\002=\022;/v1/{parent=projects/*/locations/*"
          + "/repositories/*}/packages\332A\006parent\022\276\001\n\nG"
          + "etPackage\0226.google.devtools.artifactregi"
          + "stry.v1.GetPackageRequest\032,.google.devto"
          + "ols.artifactregistry.v1.Package\"J\202\323\344\223\002=\022"
          + ";/v1/{name=projects/*/locations/*/reposi"
          + "tories/*/packages/*}\332A\004name\022\207\002\n\rDeletePa"
          + "ckage\0229.google.devtools.artifactregistry"
          + ".v1.DeletePackageRequest\032\035.google.longru"
          + "nning.Operation\"\233\001\202\323\344\223\002=*;/v1/{name=proj"
          + "ects/*/locations/*/repositories/*/packag"
          + "es/*}\332A\004name\312AN\n\025google.protobuf.Empty\0225"
          + "google.devtools.artifactregistry.v1.Oper"
          + "ationMetadata\022\334\001\n\014ListVersions\0228.google."
          + "devtools.artifactregistry.v1.ListVersion"
          + "sRequest\0329.google.devtools.artifactregis"
          + "try.v1.ListVersionsResponse\"W\202\323\344\223\002H\022F/v1"
          + "/{parent=projects/*/locations/*/reposito"
          + "ries/*/packages/*}/versions\332A\006parent\022\311\001\n"
          + "\nGetVersion\0226.google.devtools.artifactre"
          + "gistry.v1.GetVersionRequest\032,.google.dev"
          + "tools.artifactregistry.v1.Version\"U\202\323\344\223\002"
          + "H\022F/v1/{name=projects/*/locations/*/repo"
          + "sitories/*/packages/*/versions/*}\332A\004name"
          + "\022\222\002\n\rDeleteVersion\0229.google.devtools.art"
          + "ifactregistry.v1.DeleteVersionRequest\032\035."
          + "google.longrunning.Operation\"\246\001\202\323\344\223\002H*F/"
          + "v1/{name=projects/*/locations/*/reposito"
          + "ries/*/packages/*/versions/*}\332A\004name\312AN\n"
          + "\025google.protobuf.Empty\0225google.devtools."
          + "artifactregistry.v1.OperationMetadata\022\305\001"
          + "\n\tListFiles\0225.google.devtools.artifactre"
          + "gistry.v1.ListFilesRequest\0326.google.devt"
          + "ools.artifactregistry.v1.ListFilesRespon"
          + "se\"I\202\323\344\223\002:\0228/v1/{parent=projects/*/locat"
          + "ions/*/repositories/*}/files\332A\006parent\022\263\001"
          + "\n\007GetFile\0223.google.devtools.artifactregi"
          + "stry.v1.GetFileRequest\032).google.devtools"
          + ".artifactregistry.v1.File\"H\202\323\344\223\002;\0229/v1/{"
          + "name=projects/*/locations/*/repositories"
          + "/*/files/**}\332A\004name\022\314\001\n\010ListTags\0224.googl"
          + "e.devtools.artifactregistry.v1.ListTagsR"
          + "equest\0325.google.devtools.artifactregistr"
          + "y.v1.ListTagsResponse\"S\202\323\344\223\002D\022B/v1/{pare"
          + "nt=projects/*/locations/*/repositories/*"
          + "/packages/*}/tags\332A\006parent\022\271\001\n\006GetTag\0222."
          + "google.devtools.artifactregistry.v1.GetT"
          + "agRequest\032(.google.devtools.artifactregi"
          + "stry.v1.Tag\"Q\202\323\344\223\002D\022B/v1/{name=projects/"
          + "*/locations/*/repositories/*/packages/*/"
          + "tags/*}\332A\004name\022\321\001\n\tCreateTag\0225.google.de"
          + "vtools.artifactregistry.v1.CreateTagRequ"
          + "est\032(.google.devtools.artifactregistry.v"
          + "1.Tag\"c\202\323\344\223\002I\"B/v1/{parent=projects/*/lo"
          + "cations/*/repositories/*/packages/*}/tag"
          + "s:\003tag\332A\021parent,tag,tag_id\022\323\001\n\tUpdateTag"
          + "\0225.google.devtools.artifactregistry.v1.U"
          + "pdateTagRequest\032(.google.devtools.artifa"
          + "ctregistry.v1.Tag\"e\202\323\344\223\002M2F/v1/{tag.name"
          + "=projects/*/locations/*/repositories/*/p"
          + "ackages/*/tags/*}:\003tag\332A\017tag,update_mask"
          + "\022\255\001\n\tDeleteTag\0225.google.devtools.artifac"
          + "tregistry.v1.DeleteTagRequest\032\026.google.p"
          + "rotobuf.Empty\"Q\202\323\344\223\002D*B/v1/{name=project"
          + "s/*/locations/*/repositories/*/packages/"
          + "*/tags/*}\332A\004name\022\227\001\n\014SetIamPolicy\022\".goog"
          + "le.iam.v1.SetIamPolicyRequest\032\025.google.i"
          + "am.v1.Policy\"L\202\323\344\223\002F\"A/v1/{resource=proj"
          + "ects/*/locations/*/repositories/*}:setIa"
          + "mPolicy:\001*\022\224\001\n\014GetIamPolicy\022\".google.iam"
          + ".v1.GetIamPolicyRequest\032\025.google.iam.v1."
          + "Policy\"I\202\323\344\223\002C\022A/v1/{resource=projects/*"
          + "/locations/*/repositories/*}:getIamPolic"
          + "y\022\275\001\n\022TestIamPermissions\022(.google.iam.v1"
          + ".TestIamPermissionsRequest\032).google.iam."
          + "v1.TestIamPermissionsResponse\"R\202\323\344\223\002L\"G/"
          + "v1/{resource=projects/*/locations/*/repo"
          + "sitories/*}:testIamPermissions:\001*\022\300\001\n\022Ge"
          + "tProjectSettings\022>.google.devtools.artif"
          + "actregistry.v1.GetProjectSettingsRequest"
          + "\0324.google.devtools.artifactregistry.v1.P"
          + "rojectSettings\"4\202\323\344\223\002\'\022%/v1/{name=projec"
          + "ts/*/projectSettings}\332A\004name\022\201\002\n\025UpdateP"
          + "rojectSettings\022A.google.devtools.artifac"
          + "tregistry.v1.UpdateProjectSettingsReques"
          + "t\0324.google.devtools.artifactregistry.v1."
          + "ProjectSettings\"o\202\323\344\223\002J26/v1/{project_se"
          + "ttings.name=projects/*/projectSettings}:"
          + "\020project_settings\332A\034project_settings,upd"
          + "ate_mask\022\274\001\n\016GetVPCSCConfig\022:.google.dev"
          + "tools.artifactregistry.v1.GetVPCSCConfig"
          + "Request\0320.google.devtools.artifactregist"
          + "ry.v1.VPCSCConfig\"<\202\323\344\223\002/\022-/v1/{name=pro"
          + "jects/*/locations/*/vpcscConfig}\332A\004name\022"
          + "\361\001\n\021UpdateVPCSCConfig\022=.google.devtools."
          + "artifactregistry.v1.UpdateVPCSCConfigReq"
          + "uest\0320.google.devtools.artifactregistry."
          + "v1.VPCSCConfig\"k\202\323\344\223\002J2:/v1/{vpcsc_confi"
          + "g.name=projects/*/locations/*/vpcscConfi"
          + "g}:\014vpcsc_config\332A\030vpcsc_config,update_m"
          + "ask\032\214\001\312A\037artifactregistry.googleapis.com"
          + "\322Aghttps://www.googleapis.com/auth/cloud"
          + "-platform,https://www.googleapis.com/aut"
          + "h/cloud-platform.read-onlyB\372\001\n\'com.googl"
          + "e.devtools.artifactregistry.v1B\014ServiceP"
          + "rotoP\001ZSgoogle.golang.org/genproto/googl"
          + "eapis/devtools/artifactregistry/v1;artif"
          + "actregistry\252\002 Google.Cloud.ArtifactRegis"
          + "try.V1\312\002 Google\\Cloud\\ArtifactRegistry\\V"
          + "1\352\002#Google::Cloud::ArtifactRegistry::V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.AptArtifactProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.ArtifactProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.FileProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.PackageProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.RepositoryProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.SettingsProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.TagProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.VersionProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.VPCSCConfigProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1.YumArtifactProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_OperationMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.AptArtifactProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.ArtifactProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.FileProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.PackageProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.RepositoryProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.SettingsProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.TagProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.VersionProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.VPCSCConfigProto.getDescriptor();
    com.google.devtools.artifactregistry.v1.YumArtifactProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
