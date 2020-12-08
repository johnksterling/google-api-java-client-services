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

package com.google.api.services.youtube.model;

/**
 * A *third party account link* resource represents a link between a YouTube account or a channel
 * and an account on a third-party service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ThirdPartyLink extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#thirdPartyLink".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The linking_token identifies a YouTube account and channel with which the third party account
   * is linked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkingToken;

  /**
   * The snippet object contains basic details about the third- party account link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThirdPartyLinkSnippet snippet;

  /**
   * The status object contains information about the status of the link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThirdPartyLinkStatus status;

  /**
   * Etag of this resource
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource
   * @param etag etag or {@code null} for none
   */
  public ThirdPartyLink setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#thirdPartyLink".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#thirdPartyLink".
   * @param kind kind or {@code null} for none
   */
  public ThirdPartyLink setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The linking_token identifies a YouTube account and channel with which the third party account
   * is linked.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkingToken() {
    return linkingToken;
  }

  /**
   * The linking_token identifies a YouTube account and channel with which the third party account
   * is linked.
   * @param linkingToken linkingToken or {@code null} for none
   */
  public ThirdPartyLink setLinkingToken(java.lang.String linkingToken) {
    this.linkingToken = linkingToken;
    return this;
  }

  /**
   * The snippet object contains basic details about the third- party account link.
   * @return value or {@code null} for none
   */
  public ThirdPartyLinkSnippet getSnippet() {
    return snippet;
  }

  /**
   * The snippet object contains basic details about the third- party account link.
   * @param snippet snippet or {@code null} for none
   */
  public ThirdPartyLink setSnippet(ThirdPartyLinkSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * The status object contains information about the status of the link.
   * @return value or {@code null} for none
   */
  public ThirdPartyLinkStatus getStatus() {
    return status;
  }

  /**
   * The status object contains information about the status of the link.
   * @param status status or {@code null} for none
   */
  public ThirdPartyLink setStatus(ThirdPartyLinkStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public ThirdPartyLink set(String fieldName, Object value) {
    return (ThirdPartyLink) super.set(fieldName, value);
  }

  @Override
  public ThirdPartyLink clone() {
    return (ThirdPartyLink) super.clone();
  }

}
