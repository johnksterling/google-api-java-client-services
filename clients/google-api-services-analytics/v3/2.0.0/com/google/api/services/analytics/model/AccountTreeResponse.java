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

package com.google.api.services.analytics.model;

/**
 * JSON template for an Analytics account tree response. The account tree response is used in the
 * provisioning api to return the result of creating an account, property, and view (profile).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountTreeResponse extends com.google.api.client.json.GenericJson {

  /**
   * The account created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Account account;

  /**
   * Resource type for account ticket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * View (Profile) for the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Profile profile;

  /**
   * Web property for the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Webproperty webproperty;

  /**
   * The account created.
   * @return value or {@code null} for none
   */
  public Account getAccount() {
    return account;
  }

  /**
   * The account created.
   * @param account account or {@code null} for none
   */
  public AccountTreeResponse setAccount(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Resource type for account ticket.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for account ticket.
   * @param kind kind or {@code null} for none
   */
  public AccountTreeResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * View (Profile) for the account.
   * @return value or {@code null} for none
   */
  public Profile getProfile() {
    return profile;
  }

  /**
   * View (Profile) for the account.
   * @param profile profile or {@code null} for none
   */
  public AccountTreeResponse setProfile(Profile profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Web property for the account.
   * @return value or {@code null} for none
   */
  public Webproperty getWebproperty() {
    return webproperty;
  }

  /**
   * Web property for the account.
   * @param webproperty webproperty or {@code null} for none
   */
  public AccountTreeResponse setWebproperty(Webproperty webproperty) {
    this.webproperty = webproperty;
    return this;
  }

  @Override
  public AccountTreeResponse set(String fieldName, Object value) {
    return (AccountTreeResponse) super.set(fieldName, value);
  }

  @Override
  public AccountTreeResponse clone() {
    return (AccountTreeResponse) super.clone();
  }

}
