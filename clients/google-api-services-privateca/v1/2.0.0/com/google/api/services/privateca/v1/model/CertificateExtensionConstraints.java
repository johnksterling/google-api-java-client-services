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

package com.google.api.services.privateca.v1.model;

/**
 * Describes a set of X.509 extensions that may be part of some certificate issuance controls.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CertificateExtensionConstraints extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with
   * known_extensions to determine the full set of X.509 extensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ObjectId> additionalExtensions;

  /**
   * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to
   * determine the full set of X.509 extensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> knownExtensions;

  /**
   * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with
   * known_extensions to determine the full set of X.509 extensions.
   * @return value or {@code null} for none
   */
  public java.util.List<ObjectId> getAdditionalExtensions() {
    return additionalExtensions;
  }

  /**
   * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with
   * known_extensions to determine the full set of X.509 extensions.
   * @param additionalExtensions additionalExtensions or {@code null} for none
   */
  public CertificateExtensionConstraints setAdditionalExtensions(java.util.List<ObjectId> additionalExtensions) {
    this.additionalExtensions = additionalExtensions;
    return this;
  }

  /**
   * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to
   * determine the full set of X.509 extensions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getKnownExtensions() {
    return knownExtensions;
  }

  /**
   * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to
   * determine the full set of X.509 extensions.
   * @param knownExtensions knownExtensions or {@code null} for none
   */
  public CertificateExtensionConstraints setKnownExtensions(java.util.List<java.lang.String> knownExtensions) {
    this.knownExtensions = knownExtensions;
    return this;
  }

  @Override
  public CertificateExtensionConstraints set(String fieldName, Object value) {
    return (CertificateExtensionConstraints) super.set(fieldName, value);
  }

  @Override
  public CertificateExtensionConstraints clone() {
    return (CertificateExtensionConstraints) super.clone();
  }

}
