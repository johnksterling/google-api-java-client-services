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

package com.google.api.services.paymentsresellersubscription.v1.model;

/**
 * Details about the previous subscription that this new subscription upgrades/downgrades from.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Payments Reseller Subscription API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails extends com.google.api.client.json.GenericJson {

  /**
   * Required. Specifies the billing cycle spec for the new upgraded/downgraded subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billingCycleSpec;

  /**
   * Required. The previous subscription id to be replaced. This is not the full resource name, use
   * the subscription_id segment only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String previousSubscriptionId;

  /**
   * Required. Specifies the billing cycle spec for the new upgraded/downgraded subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getBillingCycleSpec() {
    return billingCycleSpec;
  }

  /**
   * Required. Specifies the billing cycle spec for the new upgraded/downgraded subscription.
   * @param billingCycleSpec billingCycleSpec or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails setBillingCycleSpec(java.lang.String billingCycleSpec) {
    this.billingCycleSpec = billingCycleSpec;
    return this;
  }

  /**
   * Required. The previous subscription id to be replaced. This is not the full resource name, use
   * the subscription_id segment only.
   * @return value or {@code null} for none
   */
  public java.lang.String getPreviousSubscriptionId() {
    return previousSubscriptionId;
  }

  /**
   * Required. The previous subscription id to be replaced. This is not the full resource name, use
   * the subscription_id segment only.
   * @param previousSubscriptionId previousSubscriptionId or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails setPreviousSubscriptionId(java.lang.String previousSubscriptionId) {
    this.previousSubscriptionId = previousSubscriptionId;
    return this;
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails set(String fieldName, Object value) {
    return (GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails clone() {
    return (GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails) super.clone();
  }

}
