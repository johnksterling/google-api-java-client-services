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
 * Request message for PurgeProducts method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaPurgeProductsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The filter string to specify the products to be deleted with a length limit of 5,000
   * characters. Empty string filter is not allowed. "*" implies delete all items in a branch. The
   * eligible fields for filtering are: * `availability`: Double quoted Product.availability string.
   * * `create_time` : in ISO 8601 "zulu" format. Supported syntax: * Comparators (">", "<", ">=",
   * "<=", "="). Examples: * create_time <= "2015-02-13T17:05:46Z" * availability = "IN_STOCK” *
   * Conjunctions ("AND") Examples: * create_time <= "2015-02-13T17:05:46Z" AND availability =
   * "PREORDER" * Disjunctions ("OR") Examples: * create_time <= "2015-02-13T17:05:46Z" OR
   * availability = "IN_STOCK" * Can support nested queries. Examples: * (create_time <=
   * "2015-02-13T17:05:46Z" AND availability = "PREORDER") OR (create_time >= "2015-02-14T13:03:32Z"
   * AND availability = "IN_STOCK") * Filter Limits: * Filter should not contain more than 6
   * conditions. * Max nesting depth should not exceed 2 levels. Examples queries: * Delete back
   * order products created before a timestamp. create_time <= "2015-02-13T17:05:46Z" OR
   * availability = "BACKORDER”
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Actually perform the purge. If `force` is set to false, the method will return the expected
   * purge count without deleting any products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean force;

  /**
   * Required. The filter string to specify the products to be deleted with a length limit of 5,000
   * characters. Empty string filter is not allowed. "*" implies delete all items in a branch. The
   * eligible fields for filtering are: * `availability`: Double quoted Product.availability string.
   * * `create_time` : in ISO 8601 "zulu" format. Supported syntax: * Comparators (">", "<", ">=",
   * "<=", "="). Examples: * create_time <= "2015-02-13T17:05:46Z" * availability = "IN_STOCK” *
   * Conjunctions ("AND") Examples: * create_time <= "2015-02-13T17:05:46Z" AND availability =
   * "PREORDER" * Disjunctions ("OR") Examples: * create_time <= "2015-02-13T17:05:46Z" OR
   * availability = "IN_STOCK" * Can support nested queries. Examples: * (create_time <=
   * "2015-02-13T17:05:46Z" AND availability = "PREORDER") OR (create_time >= "2015-02-14T13:03:32Z"
   * AND availability = "IN_STOCK") * Filter Limits: * Filter should not contain more than 6
   * conditions. * Max nesting depth should not exceed 2 levels. Examples queries: * Delete back
   * order products created before a timestamp. create_time <= "2015-02-13T17:05:46Z" OR
   * availability = "BACKORDER”
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Required. The filter string to specify the products to be deleted with a length limit of 5,000
   * characters. Empty string filter is not allowed. "*" implies delete all items in a branch. The
   * eligible fields for filtering are: * `availability`: Double quoted Product.availability string.
   * * `create_time` : in ISO 8601 "zulu" format. Supported syntax: * Comparators (">", "<", ">=",
   * "<=", "="). Examples: * create_time <= "2015-02-13T17:05:46Z" * availability = "IN_STOCK” *
   * Conjunctions ("AND") Examples: * create_time <= "2015-02-13T17:05:46Z" AND availability =
   * "PREORDER" * Disjunctions ("OR") Examples: * create_time <= "2015-02-13T17:05:46Z" OR
   * availability = "IN_STOCK" * Can support nested queries. Examples: * (create_time <=
   * "2015-02-13T17:05:46Z" AND availability = "PREORDER") OR (create_time >= "2015-02-14T13:03:32Z"
   * AND availability = "IN_STOCK") * Filter Limits: * Filter should not contain more than 6
   * conditions. * Max nesting depth should not exceed 2 levels. Examples queries: * Delete back
   * order products created before a timestamp. create_time <= "2015-02-13T17:05:46Z" OR
   * availability = "BACKORDER”
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPurgeProductsRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Actually perform the purge. If `force` is set to false, the method will return the expected
   * purge count without deleting any products.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getForce() {
    return force;
  }

  /**
   * Actually perform the purge. If `force` is set to false, the method will return the expected
   * purge count without deleting any products.
   * @param force force or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPurgeProductsRequest setForce(java.lang.Boolean force) {
    this.force = force;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaPurgeProductsRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaPurgeProductsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaPurgeProductsRequest clone() {
    return (GoogleCloudRetailV2alphaPurgeProductsRequest) super.clone();
  }

}
