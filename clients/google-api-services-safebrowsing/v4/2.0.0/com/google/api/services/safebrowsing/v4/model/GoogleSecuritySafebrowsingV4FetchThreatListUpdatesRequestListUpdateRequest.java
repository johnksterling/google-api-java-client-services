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

package com.google.api.services.safebrowsing.v4.model;

/**
 * A single list update request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest extends com.google.api.client.json.GenericJson {

  /**
   * The constraints associated with this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequestConstraints constraints;

  /**
   * The type of platform at risk by entries present in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platformType;

  /**
   * The current state of the client for the requested list (the encrypted client state that was
   * received from the last successful list update).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The types of entries present in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String threatEntryType;

  /**
   * The type of threat posed by entries present in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String threatType;

  /**
   * The constraints associated with this request.
   * @return value or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequestConstraints getConstraints() {
    return constraints;
  }

  /**
   * The constraints associated with this request.
   * @param constraints constraints or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest setConstraints(GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequestConstraints constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * The type of platform at risk by entries present in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatformType() {
    return platformType;
  }

  /**
   * The type of platform at risk by entries present in the list.
   * @param platformType platformType or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest setPlatformType(java.lang.String platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * The current state of the client for the requested list (the encrypted client state that was
   * received from the last successful list update).
   * @see #decodeState()
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the client for the requested list (the encrypted client state that was
   * received from the last successful list update).
   * @see #getState()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeState() {
    return com.google.api.client.util.Base64.decodeBase64(state);
  }

  /**
   * The current state of the client for the requested list (the encrypted client state that was
   * received from the last successful list update).
   * @see #encodeState()
   * @param state state or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The current state of the client for the requested list (the encrypted client state that was
   * received from the last successful list update).
   * @see #setState()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest encodeState(byte[] state) {
    this.state = com.google.api.client.util.Base64.encodeBase64URLSafeString(state);
    return this;
  }

  /**
   * The types of entries present in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getThreatEntryType() {
    return threatEntryType;
  }

  /**
   * The types of entries present in the list.
   * @param threatEntryType threatEntryType or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest setThreatEntryType(java.lang.String threatEntryType) {
    this.threatEntryType = threatEntryType;
    return this;
  }

  /**
   * The type of threat posed by entries present in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getThreatType() {
    return threatType;
  }

  /**
   * The type of threat posed by entries present in the list.
   * @param threatType threatType or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest setThreatType(java.lang.String threatType) {
    this.threatType = threatType;
    return this;
  }

  @Override
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest set(String fieldName, Object value) {
    return (GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest clone() {
    return (GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest) super.clone();
  }

}
