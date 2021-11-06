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
 * A CaPool represents a group of CertificateAuthorities that form a trust anchor. A CaPool can be
 * used to manage issuance policies for one or more CertificateAuthority resources and to rotate CA
 * certificates in and out of the trust anchor.
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
public final class CaPool extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IssuancePolicy issuancePolicy;

  /**
   * Optional. Labels with user-defined metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The resource name for this CaPool in the format `projects/locations/caPools`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The PublishingOptions to follow when issuing Certificates from any
   * CertificateAuthority in this CaPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PublishingOptions publishingOptions;

  /**
   * Required. Immutable. The Tier of this CaPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool.
   * @return value or {@code null} for none
   */
  public IssuancePolicy getIssuancePolicy() {
    return issuancePolicy;
  }

  /**
   * Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool.
   * @param issuancePolicy issuancePolicy or {@code null} for none
   */
  public CaPool setIssuancePolicy(IssuancePolicy issuancePolicy) {
    this.issuancePolicy = issuancePolicy;
    return this;
  }

  /**
   * Optional. Labels with user-defined metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels with user-defined metadata.
   * @param labels labels or {@code null} for none
   */
  public CaPool setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The resource name for this CaPool in the format `projects/locations/caPools`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name for this CaPool in the format `projects/locations/caPools`.
   * @param name name or {@code null} for none
   */
  public CaPool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The PublishingOptions to follow when issuing Certificates from any
   * CertificateAuthority in this CaPool.
   * @return value or {@code null} for none
   */
  public PublishingOptions getPublishingOptions() {
    return publishingOptions;
  }

  /**
   * Optional. The PublishingOptions to follow when issuing Certificates from any
   * CertificateAuthority in this CaPool.
   * @param publishingOptions publishingOptions or {@code null} for none
   */
  public CaPool setPublishingOptions(PublishingOptions publishingOptions) {
    this.publishingOptions = publishingOptions;
    return this;
  }

  /**
   * Required. Immutable. The Tier of this CaPool.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * Required. Immutable. The Tier of this CaPool.
   * @param tier tier or {@code null} for none
   */
  public CaPool setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  @Override
  public CaPool set(String fieldName, Object value) {
    return (CaPool) super.set(fieldName, value);
  }

  @Override
  public CaPool clone() {
    return (CaPool) super.clone();
  }

}
