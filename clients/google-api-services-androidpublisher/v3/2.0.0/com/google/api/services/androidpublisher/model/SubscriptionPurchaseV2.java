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

package com.google.api.services.androidpublisher.model;

/**
 * Indicates the status of a user's subscription purchase.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubscriptionPurchaseV2 extends com.google.api.client.json.GenericJson {

  /**
   * The acknowledgement state of the subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acknowledgementState;

  /**
   * Additional context around canceled subscriptions. Only present if the subscription currently
   * has subscription_state SUBSCRIPTION_STATE_CANCELED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CanceledStateContext canceledStateContext;

  /**
   * User account identifier in the third-party service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExternalAccountIdentifiers externalAccountIdentifiers;

  /**
   * This kind represents a SubscriptionPurchaseV2 object in the androidpublisher service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The order id of the latest order associated with the purchase of the subscription. For
   * autoRenewing subscription, this is the order id of signup order if it is not renewed yet, or
   * the last recurring order id (success, pending, or declined order). For prepaid subscription,
   * this is the order id associated with the queried purchase token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestOrderId;

  /**
   * Item-level info for a subscription purchase. The items in the same purchase should be either
   * all with AutoRenewingPlan or all with PrepaidPlan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SubscriptionPurchaseLineItem> lineItems;

  static {
    // hack to force ProGuard to consider SubscriptionPurchaseLineItem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SubscriptionPurchaseLineItem.class);
  }

  /**
   * The purchase token of the old subscription if this subscription is one of the following: * Re-
   * signup of a canceled but non-lapsed subscription * Upgrade/downgrade from a previous
   * subscription. * Convert from prepaid to auto renewing subscription. * Convert from an auto
   * renewing subscription to prepaid. * Topup a prepaid subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedPurchaseToken;

  /**
   * Additional context around paused subscriptions. Only present if the subscription currently has
   * subscription_state SUBSCRIPTION_STATE_PAUSED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PausedStateContext pausedStateContext;

  /**
   * ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was
   * granted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Time at which the subscription was granted. Not set for pending subscriptions (subscription was
   * created but awaiting payment during signup).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * User profile associated with purchases made with 'Subscribe with Google'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubscribeWithGoogleInfo subscribeWithGoogleInfo;

  /**
   * The current state of the subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscriptionState;

  /**
   * Only present if this subscription purchase is a test purchase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestPurchase testPurchase;

  /**
   * The acknowledgement state of the subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcknowledgementState() {
    return acknowledgementState;
  }

  /**
   * The acknowledgement state of the subscription.
   * @param acknowledgementState acknowledgementState or {@code null} for none
   */
  public SubscriptionPurchaseV2 setAcknowledgementState(java.lang.String acknowledgementState) {
    this.acknowledgementState = acknowledgementState;
    return this;
  }

  /**
   * Additional context around canceled subscriptions. Only present if the subscription currently
   * has subscription_state SUBSCRIPTION_STATE_CANCELED.
   * @return value or {@code null} for none
   */
  public CanceledStateContext getCanceledStateContext() {
    return canceledStateContext;
  }

  /**
   * Additional context around canceled subscriptions. Only present if the subscription currently
   * has subscription_state SUBSCRIPTION_STATE_CANCELED.
   * @param canceledStateContext canceledStateContext or {@code null} for none
   */
  public SubscriptionPurchaseV2 setCanceledStateContext(CanceledStateContext canceledStateContext) {
    this.canceledStateContext = canceledStateContext;
    return this;
  }

  /**
   * User account identifier in the third-party service.
   * @return value or {@code null} for none
   */
  public ExternalAccountIdentifiers getExternalAccountIdentifiers() {
    return externalAccountIdentifiers;
  }

  /**
   * User account identifier in the third-party service.
   * @param externalAccountIdentifiers externalAccountIdentifiers or {@code null} for none
   */
  public SubscriptionPurchaseV2 setExternalAccountIdentifiers(ExternalAccountIdentifiers externalAccountIdentifiers) {
    this.externalAccountIdentifiers = externalAccountIdentifiers;
    return this;
  }

  /**
   * This kind represents a SubscriptionPurchaseV2 object in the androidpublisher service.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This kind represents a SubscriptionPurchaseV2 object in the androidpublisher service.
   * @param kind kind or {@code null} for none
   */
  public SubscriptionPurchaseV2 setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The order id of the latest order associated with the purchase of the subscription. For
   * autoRenewing subscription, this is the order id of signup order if it is not renewed yet, or
   * the last recurring order id (success, pending, or declined order). For prepaid subscription,
   * this is the order id associated with the queried purchase token.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestOrderId() {
    return latestOrderId;
  }

  /**
   * The order id of the latest order associated with the purchase of the subscription. For
   * autoRenewing subscription, this is the order id of signup order if it is not renewed yet, or
   * the last recurring order id (success, pending, or declined order). For prepaid subscription,
   * this is the order id associated with the queried purchase token.
   * @param latestOrderId latestOrderId or {@code null} for none
   */
  public SubscriptionPurchaseV2 setLatestOrderId(java.lang.String latestOrderId) {
    this.latestOrderId = latestOrderId;
    return this;
  }

  /**
   * Item-level info for a subscription purchase. The items in the same purchase should be either
   * all with AutoRenewingPlan or all with PrepaidPlan.
   * @return value or {@code null} for none
   */
  public java.util.List<SubscriptionPurchaseLineItem> getLineItems() {
    return lineItems;
  }

  /**
   * Item-level info for a subscription purchase. The items in the same purchase should be either
   * all with AutoRenewingPlan or all with PrepaidPlan.
   * @param lineItems lineItems or {@code null} for none
   */
  public SubscriptionPurchaseV2 setLineItems(java.util.List<SubscriptionPurchaseLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * The purchase token of the old subscription if this subscription is one of the following: * Re-
   * signup of a canceled but non-lapsed subscription * Upgrade/downgrade from a previous
   * subscription. * Convert from prepaid to auto renewing subscription. * Convert from an auto
   * renewing subscription to prepaid. * Topup a prepaid subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedPurchaseToken() {
    return linkedPurchaseToken;
  }

  /**
   * The purchase token of the old subscription if this subscription is one of the following: * Re-
   * signup of a canceled but non-lapsed subscription * Upgrade/downgrade from a previous
   * subscription. * Convert from prepaid to auto renewing subscription. * Convert from an auto
   * renewing subscription to prepaid. * Topup a prepaid subscription.
   * @param linkedPurchaseToken linkedPurchaseToken or {@code null} for none
   */
  public SubscriptionPurchaseV2 setLinkedPurchaseToken(java.lang.String linkedPurchaseToken) {
    this.linkedPurchaseToken = linkedPurchaseToken;
    return this;
  }

  /**
   * Additional context around paused subscriptions. Only present if the subscription currently has
   * subscription_state SUBSCRIPTION_STATE_PAUSED.
   * @return value or {@code null} for none
   */
  public PausedStateContext getPausedStateContext() {
    return pausedStateContext;
  }

  /**
   * Additional context around paused subscriptions. Only present if the subscription currently has
   * subscription_state SUBSCRIPTION_STATE_PAUSED.
   * @param pausedStateContext pausedStateContext or {@code null} for none
   */
  public SubscriptionPurchaseV2 setPausedStateContext(PausedStateContext pausedStateContext) {
    this.pausedStateContext = pausedStateContext;
    return this;
  }

  /**
   * ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was
   * granted.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was
   * granted.
   * @param regionCode regionCode or {@code null} for none
   */
  public SubscriptionPurchaseV2 setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Time at which the subscription was granted. Not set for pending subscriptions (subscription was
   * created but awaiting payment during signup).
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time at which the subscription was granted. Not set for pending subscriptions (subscription was
   * created but awaiting payment during signup).
   * @param startTime startTime or {@code null} for none
   */
  public SubscriptionPurchaseV2 setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * User profile associated with purchases made with 'Subscribe with Google'.
   * @return value or {@code null} for none
   */
  public SubscribeWithGoogleInfo getSubscribeWithGoogleInfo() {
    return subscribeWithGoogleInfo;
  }

  /**
   * User profile associated with purchases made with 'Subscribe with Google'.
   * @param subscribeWithGoogleInfo subscribeWithGoogleInfo or {@code null} for none
   */
  public SubscriptionPurchaseV2 setSubscribeWithGoogleInfo(SubscribeWithGoogleInfo subscribeWithGoogleInfo) {
    this.subscribeWithGoogleInfo = subscribeWithGoogleInfo;
    return this;
  }

  /**
   * The current state of the subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscriptionState() {
    return subscriptionState;
  }

  /**
   * The current state of the subscription.
   * @param subscriptionState subscriptionState or {@code null} for none
   */
  public SubscriptionPurchaseV2 setSubscriptionState(java.lang.String subscriptionState) {
    this.subscriptionState = subscriptionState;
    return this;
  }

  /**
   * Only present if this subscription purchase is a test purchase.
   * @return value or {@code null} for none
   */
  public TestPurchase getTestPurchase() {
    return testPurchase;
  }

  /**
   * Only present if this subscription purchase is a test purchase.
   * @param testPurchase testPurchase or {@code null} for none
   */
  public SubscriptionPurchaseV2 setTestPurchase(TestPurchase testPurchase) {
    this.testPurchase = testPurchase;
    return this;
  }

  @Override
  public SubscriptionPurchaseV2 set(String fieldName, Object value) {
    return (SubscriptionPurchaseV2) super.set(fieldName, value);
  }

  @Override
  public SubscriptionPurchaseV2 clone() {
    return (SubscriptionPurchaseV2) super.clone();
  }

}
