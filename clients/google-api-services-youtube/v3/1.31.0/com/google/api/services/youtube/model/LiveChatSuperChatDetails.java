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
 * Model definition for LiveChatSuperChatDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveChatSuperChatDetails extends com.google.api.client.json.GenericJson {

  /**
   * A rendered string that displays the fund amount and currency to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String amountDisplayString;

  /**
   * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger amountMicros;

  /**
   * The currency in which the purchase was made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currency;

  /**
   * The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is
   * 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long tier;

  /**
   * The comment added by the user to this Super Chat event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userComment;

  /**
   * A rendered string that displays the fund amount and currency to the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getAmountDisplayString() {
    return amountDisplayString;
  }

  /**
   * A rendered string that displays the fund amount and currency to the user.
   * @param amountDisplayString amountDisplayString or {@code null} for none
   */
  public LiveChatSuperChatDetails setAmountDisplayString(java.lang.String amountDisplayString) {
    this.amountDisplayString = amountDisplayString;
    return this;
  }

  /**
   * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAmountMicros() {
    return amountMicros;
  }

  /**
   * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
   * @param amountMicros amountMicros or {@code null} for none
   */
  public LiveChatSuperChatDetails setAmountMicros(java.math.BigInteger amountMicros) {
    this.amountMicros = amountMicros;
    return this;
  }

  /**
   * The currency in which the purchase was made.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrency() {
    return currency;
  }

  /**
   * The currency in which the purchase was made.
   * @param currency currency or {@code null} for none
   */
  public LiveChatSuperChatDetails setCurrency(java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is
   * 1.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTier() {
    return tier;
  }

  /**
   * The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is
   * 1.
   * @param tier tier or {@code null} for none
   */
  public LiveChatSuperChatDetails setTier(java.lang.Long tier) {
    this.tier = tier;
    return this;
  }

  /**
   * The comment added by the user to this Super Chat event.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserComment() {
    return userComment;
  }

  /**
   * The comment added by the user to this Super Chat event.
   * @param userComment userComment or {@code null} for none
   */
  public LiveChatSuperChatDetails setUserComment(java.lang.String userComment) {
    this.userComment = userComment;
    return this;
  }

  @Override
  public LiveChatSuperChatDetails set(String fieldName, Object value) {
    return (LiveChatSuperChatDetails) super.set(fieldName, value);
  }

  @Override
  public LiveChatSuperChatDetails clone() {
    return (LiveChatSuperChatDetails) super.clone();
  }

}
