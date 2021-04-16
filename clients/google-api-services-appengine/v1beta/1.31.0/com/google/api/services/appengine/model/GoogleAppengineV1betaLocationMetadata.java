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

package com.google.api.services.appengine.model;

/**
 * Metadata for the given google.cloud.location.Location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppengineV1betaLocationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * App Engine flexible environment is available in the given location.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean flexibleEnvironmentAvailable;

  /**
   * Output only. Search API (https://cloud.google.com/appengine/docs/standard/python/search) is
   * available in the given location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean searchApiAvailable;

  /**
   * App Engine standard environment is available in the given location.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean standardEnvironmentAvailable;

  /**
   * App Engine flexible environment is available in the given location.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFlexibleEnvironmentAvailable() {
    return flexibleEnvironmentAvailable;
  }

  /**
   * App Engine flexible environment is available in the given location.@OutputOnly
   * @param flexibleEnvironmentAvailable flexibleEnvironmentAvailable or {@code null} for none
   */
  public GoogleAppengineV1betaLocationMetadata setFlexibleEnvironmentAvailable(java.lang.Boolean flexibleEnvironmentAvailable) {
    this.flexibleEnvironmentAvailable = flexibleEnvironmentAvailable;
    return this;
  }

  /**
   * Output only. Search API (https://cloud.google.com/appengine/docs/standard/python/search) is
   * available in the given location.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSearchApiAvailable() {
    return searchApiAvailable;
  }

  /**
   * Output only. Search API (https://cloud.google.com/appengine/docs/standard/python/search) is
   * available in the given location.
   * @param searchApiAvailable searchApiAvailable or {@code null} for none
   */
  public GoogleAppengineV1betaLocationMetadata setSearchApiAvailable(java.lang.Boolean searchApiAvailable) {
    this.searchApiAvailable = searchApiAvailable;
    return this;
  }

  /**
   * App Engine standard environment is available in the given location.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStandardEnvironmentAvailable() {
    return standardEnvironmentAvailable;
  }

  /**
   * App Engine standard environment is available in the given location.@OutputOnly
   * @param standardEnvironmentAvailable standardEnvironmentAvailable or {@code null} for none
   */
  public GoogleAppengineV1betaLocationMetadata setStandardEnvironmentAvailable(java.lang.Boolean standardEnvironmentAvailable) {
    this.standardEnvironmentAvailable = standardEnvironmentAvailable;
    return this;
  }

  @Override
  public GoogleAppengineV1betaLocationMetadata set(String fieldName, Object value) {
    return (GoogleAppengineV1betaLocationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleAppengineV1betaLocationMetadata clone() {
    return (GoogleAppengineV1betaLocationMetadata) super.clone();
  }

}
