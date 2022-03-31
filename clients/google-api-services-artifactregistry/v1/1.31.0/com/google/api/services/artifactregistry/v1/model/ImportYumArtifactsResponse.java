/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.artifactregistry.v1.model;

/**
 * The response message from importing YUM artifacts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportYumArtifactsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Detailed error info for packages that were not imported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImportYumArtifactsErrorInfo> errors;

  static {
    // hack to force ProGuard to consider ImportYumArtifactsErrorInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ImportYumArtifactsErrorInfo.class);
  }

  /**
   * The yum artifacts imported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<YumArtifact> yumArtifacts;

  /**
   * Detailed error info for packages that were not imported.
   * @return value or {@code null} for none
   */
  public java.util.List<ImportYumArtifactsErrorInfo> getErrors() {
    return errors;
  }

  /**
   * Detailed error info for packages that were not imported.
   * @param errors errors or {@code null} for none
   */
  public ImportYumArtifactsResponse setErrors(java.util.List<ImportYumArtifactsErrorInfo> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The yum artifacts imported.
   * @return value or {@code null} for none
   */
  public java.util.List<YumArtifact> getYumArtifacts() {
    return yumArtifacts;
  }

  /**
   * The yum artifacts imported.
   * @param yumArtifacts yumArtifacts or {@code null} for none
   */
  public ImportYumArtifactsResponse setYumArtifacts(java.util.List<YumArtifact> yumArtifacts) {
    this.yumArtifacts = yumArtifacts;
    return this;
  }

  @Override
  public ImportYumArtifactsResponse set(String fieldName, Object value) {
    return (ImportYumArtifactsResponse) super.set(fieldName, value);
  }

  @Override
  public ImportYumArtifactsResponse clone() {
    return (ImportYumArtifactsResponse) super.clone();
  }

}
