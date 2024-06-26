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

package com.google.api.services.solar.v1.model;

/**
 * Cost and benefit of leasing a particular configuration of solar panels with a particular
 * electricity usage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Solar API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LeasingSavings extends com.google.api.client.json.GenericJson {

  /**
   * Estimated annual leasing cost.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money annualLeasingCost;

  /**
   * Whether leases are allowed in this juristiction (leases are not allowed in some states). If
   * this field is false, then the values in this message should probably be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean leasesAllowed;

  /**
   * Whether leases are supported in this juristiction by the financial calculation engine. If this
   * field is false, then the values in this message should probably be ignored. This is independent
   * of `leases_allowed`: in some areas leases are allowed, but under conditions that aren't handled
   * by the financial models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean leasesSupported;

  /**
   * How much is saved (or not) over the lifetime period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SavingsOverTime savings;

  /**
   * Estimated annual leasing cost.
   * @return value or {@code null} for none
   */
  public Money getAnnualLeasingCost() {
    return annualLeasingCost;
  }

  /**
   * Estimated annual leasing cost.
   * @param annualLeasingCost annualLeasingCost or {@code null} for none
   */
  public LeasingSavings setAnnualLeasingCost(Money annualLeasingCost) {
    this.annualLeasingCost = annualLeasingCost;
    return this;
  }

  /**
   * Whether leases are allowed in this juristiction (leases are not allowed in some states). If
   * this field is false, then the values in this message should probably be ignored.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLeasesAllowed() {
    return leasesAllowed;
  }

  /**
   * Whether leases are allowed in this juristiction (leases are not allowed in some states). If
   * this field is false, then the values in this message should probably be ignored.
   * @param leasesAllowed leasesAllowed or {@code null} for none
   */
  public LeasingSavings setLeasesAllowed(java.lang.Boolean leasesAllowed) {
    this.leasesAllowed = leasesAllowed;
    return this;
  }

  /**
   * Whether leases are supported in this juristiction by the financial calculation engine. If this
   * field is false, then the values in this message should probably be ignored. This is independent
   * of `leases_allowed`: in some areas leases are allowed, but under conditions that aren't handled
   * by the financial models.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLeasesSupported() {
    return leasesSupported;
  }

  /**
   * Whether leases are supported in this juristiction by the financial calculation engine. If this
   * field is false, then the values in this message should probably be ignored. This is independent
   * of `leases_allowed`: in some areas leases are allowed, but under conditions that aren't handled
   * by the financial models.
   * @param leasesSupported leasesSupported or {@code null} for none
   */
  public LeasingSavings setLeasesSupported(java.lang.Boolean leasesSupported) {
    this.leasesSupported = leasesSupported;
    return this;
  }

  /**
   * How much is saved (or not) over the lifetime period.
   * @return value or {@code null} for none
   */
  public SavingsOverTime getSavings() {
    return savings;
  }

  /**
   * How much is saved (or not) over the lifetime period.
   * @param savings savings or {@code null} for none
   */
  public LeasingSavings setSavings(SavingsOverTime savings) {
    this.savings = savings;
    return this;
  }

  @Override
  public LeasingSavings set(String fieldName, Object value) {
    return (LeasingSavings) super.set(fieldName, value);
  }

  @Override
  public LeasingSavings clone() {
    return (LeasingSavings) super.clone();
  }

}
