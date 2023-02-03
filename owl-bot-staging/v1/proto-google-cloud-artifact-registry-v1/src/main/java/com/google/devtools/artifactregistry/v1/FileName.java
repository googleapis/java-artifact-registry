/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.artifactregistry.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class FileName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_REPOSITORY_FILE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/repositories/{repository}/files/{file}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String repository;
  private final String file;

  @Deprecated
  protected FileName() {
    project = null;
    location = null;
    repository = null;
    file = null;
  }

  private FileName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    repository = Preconditions.checkNotNull(builder.getRepository());
    file = Preconditions.checkNotNull(builder.getFile());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getRepository() {
    return repository;
  }

  public String getFile() {
    return file;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static FileName of(String project, String location, String repository, String file) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setRepository(repository)
        .setFile(file)
        .build();
  }

  public static String format(String project, String location, String repository, String file) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setRepository(repository)
        .setFile(file)
        .build()
        .toString();
  }

  public static FileName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_REPOSITORY_FILE.validatedMatch(
            formattedString, "FileName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("repository"),
        matchMap.get("file"));
  }

  public static List<FileName> parseList(List<String> formattedStrings) {
    List<FileName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FileName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (FileName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_REPOSITORY_FILE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (repository != null) {
            fieldMapBuilder.put("repository", repository);
          }
          if (file != null) {
            fieldMapBuilder.put("file", file);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_REPOSITORY_FILE.instantiate(
        "project", project, "location", location, "repository", repository, "file", file);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      FileName that = ((FileName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.repository, that.repository)
          && Objects.equals(this.file, that.file);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(repository);
    h *= 1000003;
    h ^= Objects.hashCode(file);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/repositories/{repository}/files/{file}. */
  public static class Builder {
    private String project;
    private String location;
    private String repository;
    private String file;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getRepository() {
      return repository;
    }

    public String getFile() {
      return file;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setRepository(String repository) {
      this.repository = repository;
      return this;
    }

    public Builder setFile(String file) {
      this.file = file;
      return this;
    }

    private Builder(FileName fileName) {
      this.project = fileName.project;
      this.location = fileName.location;
      this.repository = fileName.repository;
      this.file = fileName.file;
    }

    public FileName build() {
      return new FileName(this);
    }
  }
}
