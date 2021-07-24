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

package com.google.api.services.retail.v2alpha.model;

/**
 * Request message for AddFulfillmentPlaces method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The time when the fulfillment updates are issued, used to prevent out-of-order updates on
   * fulfillment information. If not provided, the internal system time will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String addTime;

  /**
   * If set to true, and the Product is not found, the fulfillment information will still be
   * processed and retained for at most 1 day and processed once the Product is created. If set to
   * false, an INVALID_ARGUMENT error is returned if the Product is not found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowMissing;

  /**
   * Required. The IDs for this type, such as the store IDs for "pickup-in-store" or the region IDs
   * for "same-day-delivery" to be added for this type. Duplicate IDs will be automatically ignored.
   * At least 1 value is required, and a maximum of 2000 values are allowed. Each value must be a
   * string with a length limit of 10 characters, matching the pattern [a-zA-Z0-9_-]+, such as
   * "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is returned. If the total number
   * of place IDs exceeds 2000 for this type after adding, then the update will be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> placeIds;

  /**
   * Required. The fulfillment type, including commonly used types (such as pickup in store and same
   * day delivery), and custom types. Supported values: * "pickup-in-store" * "ship-to-store" *
   * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3"
   * * "custom-type-4" * "custom-type-5" If this field is set to an invalid value other than these,
   * an INVALID_ARGUMENT error is returned. This field directly corresponds to
   * Product.fulfillment_info.type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The time when the fulfillment updates are issued, used to prevent out-of-order updates on
   * fulfillment information. If not provided, the internal system time will be used.
   * @return value or {@code null} for none
   */
  public String getAddTime() {
    return addTime;
  }

  /**
   * The time when the fulfillment updates are issued, used to prevent out-of-order updates on
   * fulfillment information. If not provided, the internal system time will be used.
   * @param addTime addTime or {@code null} for none
   */
  public GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest setAddTime(String addTime) {
    this.addTime = addTime;
    return this;
  }

  /**
   * If set to true, and the Product is not found, the fulfillment information will still be
   * processed and retained for at most 1 day and processed once the Product is created. If set to
   * false, an INVALID_ARGUMENT error is returned if the Product is not found.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowMissing() {
    return allowMissing;
  }

  /**
   * If set to true, and the Product is not found, the fulfillment information will still be
   * processed and retained for at most 1 day and processed once the Product is created. If set to
   * false, an INVALID_ARGUMENT error is returned if the Product is not found.
   * @param allowMissing allowMissing or {@code null} for none
   */
  public GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest setAllowMissing(java.lang.Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  /**
   * Required. The IDs for this type, such as the store IDs for "pickup-in-store" or the region IDs
   * for "same-day-delivery" to be added for this type. Duplicate IDs will be automatically ignored.
   * At least 1 value is required, and a maximum of 2000 values are allowed. Each value must be a
   * string with a length limit of 10 characters, matching the pattern [a-zA-Z0-9_-]+, such as
   * "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is returned. If the total number
   * of place IDs exceeds 2000 for this type after adding, then the update will be rejected.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPlaceIds() {
    return placeIds;
  }

  /**
   * Required. The IDs for this type, such as the store IDs for "pickup-in-store" or the region IDs
   * for "same-day-delivery" to be added for this type. Duplicate IDs will be automatically ignored.
   * At least 1 value is required, and a maximum of 2000 values are allowed. Each value must be a
   * string with a length limit of 10 characters, matching the pattern [a-zA-Z0-9_-]+, such as
   * "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is returned. If the total number
   * of place IDs exceeds 2000 for this type after adding, then the update will be rejected.
   * @param placeIds placeIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest setPlaceIds(java.util.List<java.lang.String> placeIds) {
    this.placeIds = placeIds;
    return this;
  }

  /**
   * Required. The fulfillment type, including commonly used types (such as pickup in store and same
   * day delivery), and custom types. Supported values: * "pickup-in-store" * "ship-to-store" *
   * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3"
   * * "custom-type-4" * "custom-type-5" If this field is set to an invalid value other than these,
   * an INVALID_ARGUMENT error is returned. This field directly corresponds to
   * Product.fulfillment_info.type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The fulfillment type, including commonly used types (such as pickup in store and same
   * day delivery), and custom types. Supported values: * "pickup-in-store" * "ship-to-store" *
   * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3"
   * * "custom-type-4" * "custom-type-5" If this field is set to an invalid value other than these,
   * an INVALID_ARGUMENT error is returned. This field directly corresponds to
   * Product.fulfillment_info.type.
   * @param type type or {@code null} for none
   */
  public GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest clone() {
    return (GoogleCloudRetailV2alphaAddFulfillmentPlacesRequest) super.clone();
  }

}
