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

package com.google.api.services.retail.v2.model;

/**
 * Detailed product information associated with a user event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2ProductDetail extends com.google.api.client.json.GenericJson {

  /**
   * Required. Product information. Required field(s): * Product.id Optional override field(s): *
   * Product.price_info If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is important to ensure
   * that the overriding fields are accurate and complete. All other product fields are ignored and
   * instead populated via catalog lookup after event ingestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2Product product;

  /**
   * Quantity of the product associated with the user event. For example, this field will be 2 if
   * two products are added to the shopping cart for `purchase-complete` event. Required for `add-
   * to-cart` and `purchase-complete` event types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer quantity;

  /**
   * Required. Product information. Required field(s): * Product.id Optional override field(s): *
   * Product.price_info If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is important to ensure
   * that the overriding fields are accurate and complete. All other product fields are ignored and
   * instead populated via catalog lookup after event ingestion.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2Product getProduct() {
    return product;
  }

  /**
   * Required. Product information. Required field(s): * Product.id Optional override field(s): *
   * Product.price_info If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is important to ensure
   * that the overriding fields are accurate and complete. All other product fields are ignored and
   * instead populated via catalog lookup after event ingestion.
   * @param product product or {@code null} for none
   */
  public GoogleCloudRetailV2ProductDetail setProduct(GoogleCloudRetailV2Product product) {
    this.product = product;
    return this;
  }

  /**
   * Quantity of the product associated with the user event. For example, this field will be 2 if
   * two products are added to the shopping cart for `purchase-complete` event. Required for `add-
   * to-cart` and `purchase-complete` event types.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * Quantity of the product associated with the user event. For example, this field will be 2 if
   * two products are added to the shopping cart for `purchase-complete` event. Required for `add-
   * to-cart` and `purchase-complete` event types.
   * @param quantity quantity or {@code null} for none
   */
  public GoogleCloudRetailV2ProductDetail setQuantity(java.lang.Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  @Override
  public GoogleCloudRetailV2ProductDetail set(String fieldName, Object value) {
    return (GoogleCloudRetailV2ProductDetail) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2ProductDetail clone() {
    return (GoogleCloudRetailV2ProductDetail) super.clone();
  }

}
