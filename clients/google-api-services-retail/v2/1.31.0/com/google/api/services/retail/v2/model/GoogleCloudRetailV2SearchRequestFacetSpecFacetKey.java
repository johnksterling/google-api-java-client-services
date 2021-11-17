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
 * Specifies how a facet is computed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2SearchRequestFacetSpecFacetKey extends com.google.api.client.json.GenericJson {

  /**
   * Only get facet values that contains the given strings. For example, suppose "categories" has
   * three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "contains" to "Shoe", the
   * "categories" facet will give only "Women > Shoe" and "Men > Shoe". Only supported on textual
   * fields. Maximum is 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> contains;

  /**
   * Set only if values should be bucketized into intervals. Must be set for facets with numerical
   * values. Must not be set for facet with text values. Maximum number of intervals is 30.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2Interval> intervals;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2Interval used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2Interval.class);
  }

  /**
   * Required. Supported textual and numerical facet keys in Product object, over which the facet
   * values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not
   * specified: * textual_field = * "brands" * "categories" * "genders" * "ageGroups" *
   * "availability" * "colorFamilies" * "colors" * "sizes" * "materials" * "patterns" * "conditions"
   * * "attributes.key" * "pickupInStore" * "shipToStore" * "sameDayDelivery" * "nextDayDelivery" *
   * "customFulfillment1" * "customFulfillment2" * "customFulfillment3" * "customFulfillment4" *
   * "customFulfillment5" * "inventory(place_id,attributes.key)" * numerical_field = * "price" *
   * "discount" * "rating" * "ratingCount" * "attributes.key" * "inventory(place_id,price)" *
   * "inventory(place_id,attributes.key)"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The order in which Facet.values are returned. Allowed values are: * "count desc", which means
   * order by Facet.FacetValue.count descending. * "value desc", which means order by
   * Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values
   * are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical
   * intervals are sorted in the order given by FacetSpec.FacetKey.intervals;
   * FulfillmentInfo.place_ids are sorted in the order given by
   * FacetSpec.FacetKey.restricted_values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderBy;

  /**
   * Only get facet values that start with the given string prefix. For example, suppose
   * "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set
   * "prefixes" to "Women", the "categories" facet will give only "Women > Shoe" and "Women >
   * Dress". Only supported on textual fields. Maximum is 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> prefixes;

  /**
   * The query that is used to compute facet for the given facet key. When provided, it will
   * override the default behavior of facet computation. The query syntax is the same as a filter
   * expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no
   * limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be
   * always "1" and FacetValue.count will be the number of results that matches the query. For
   * example, you can set a customized facet for "shipToStore", where FacetKey.key is
   * "customizedShipToStore", and FacetKey.query is "availability: ANY(\"IN_STOCK\") AND
   * shipToStore: ANY(\"123\")". Then the facet will count the products that are both in stock and
   * ship to store "123".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Only get facet for the given restricted values. For example, when using "pickupInStore" as key
   * and set restricted values to ["store123", "store456"], only facets for "store123" and
   * "store456" are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must
   * be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery *
   * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 *
   * customFulfillment4 * customFulfillment5
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> restrictedValues;

  /**
   * Only get facet values that contains the given strings. For example, suppose "categories" has
   * three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "contains" to "Shoe", the
   * "categories" facet will give only "Women > Shoe" and "Men > Shoe". Only supported on textual
   * fields. Maximum is 10.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getContains() {
    return contains;
  }

  /**
   * Only get facet values that contains the given strings. For example, suppose "categories" has
   * three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "contains" to "Shoe", the
   * "categories" facet will give only "Women > Shoe" and "Men > Shoe". Only supported on textual
   * fields. Maximum is 10.
   * @param contains contains or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey setContains(java.util.List<java.lang.String> contains) {
    this.contains = contains;
    return this;
  }

  /**
   * Set only if values should be bucketized into intervals. Must be set for facets with numerical
   * values. Must not be set for facet with text values. Maximum number of intervals is 30.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2Interval> getIntervals() {
    return intervals;
  }

  /**
   * Set only if values should be bucketized into intervals. Must be set for facets with numerical
   * values. Must not be set for facet with text values. Maximum number of intervals is 30.
   * @param intervals intervals or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey setIntervals(java.util.List<GoogleCloudRetailV2Interval> intervals) {
    this.intervals = intervals;
    return this;
  }

  /**
   * Required. Supported textual and numerical facet keys in Product object, over which the facet
   * values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not
   * specified: * textual_field = * "brands" * "categories" * "genders" * "ageGroups" *
   * "availability" * "colorFamilies" * "colors" * "sizes" * "materials" * "patterns" * "conditions"
   * * "attributes.key" * "pickupInStore" * "shipToStore" * "sameDayDelivery" * "nextDayDelivery" *
   * "customFulfillment1" * "customFulfillment2" * "customFulfillment3" * "customFulfillment4" *
   * "customFulfillment5" * "inventory(place_id,attributes.key)" * numerical_field = * "price" *
   * "discount" * "rating" * "ratingCount" * "attributes.key" * "inventory(place_id,price)" *
   * "inventory(place_id,attributes.key)"
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Required. Supported textual and numerical facet keys in Product object, over which the facet
   * values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not
   * specified: * textual_field = * "brands" * "categories" * "genders" * "ageGroups" *
   * "availability" * "colorFamilies" * "colors" * "sizes" * "materials" * "patterns" * "conditions"
   * * "attributes.key" * "pickupInStore" * "shipToStore" * "sameDayDelivery" * "nextDayDelivery" *
   * "customFulfillment1" * "customFulfillment2" * "customFulfillment3" * "customFulfillment4" *
   * "customFulfillment5" * "inventory(place_id,attributes.key)" * numerical_field = * "price" *
   * "discount" * "rating" * "ratingCount" * "attributes.key" * "inventory(place_id,price)" *
   * "inventory(place_id,attributes.key)"
   * @param key key or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * The order in which Facet.values are returned. Allowed values are: * "count desc", which means
   * order by Facet.FacetValue.count descending. * "value desc", which means order by
   * Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values
   * are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical
   * intervals are sorted in the order given by FacetSpec.FacetKey.intervals;
   * FulfillmentInfo.place_ids are sorted in the order given by
   * FacetSpec.FacetKey.restricted_values.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderBy() {
    return orderBy;
  }

  /**
   * The order in which Facet.values are returned. Allowed values are: * "count desc", which means
   * order by Facet.FacetValue.count descending. * "value desc", which means order by
   * Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values
   * are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical
   * intervals are sorted in the order given by FacetSpec.FacetKey.intervals;
   * FulfillmentInfo.place_ids are sorted in the order given by
   * FacetSpec.FacetKey.restricted_values.
   * @param orderBy orderBy or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey setOrderBy(java.lang.String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Only get facet values that start with the given string prefix. For example, suppose
   * "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set
   * "prefixes" to "Women", the "categories" facet will give only "Women > Shoe" and "Women >
   * Dress". Only supported on textual fields. Maximum is 10.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrefixes() {
    return prefixes;
  }

  /**
   * Only get facet values that start with the given string prefix. For example, suppose
   * "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set
   * "prefixes" to "Women", the "categories" facet will give only "Women > Shoe" and "Women >
   * Dress". Only supported on textual fields. Maximum is 10.
   * @param prefixes prefixes or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey setPrefixes(java.util.List<java.lang.String> prefixes) {
    this.prefixes = prefixes;
    return this;
  }

  /**
   * The query that is used to compute facet for the given facet key. When provided, it will
   * override the default behavior of facet computation. The query syntax is the same as a filter
   * expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no
   * limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be
   * always "1" and FacetValue.count will be the number of results that matches the query. For
   * example, you can set a customized facet for "shipToStore", where FacetKey.key is
   * "customizedShipToStore", and FacetKey.query is "availability: ANY(\"IN_STOCK\") AND
   * shipToStore: ANY(\"123\")". Then the facet will count the products that are both in stock and
   * ship to store "123".
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * The query that is used to compute facet for the given facet key. When provided, it will
   * override the default behavior of facet computation. The query syntax is the same as a filter
   * expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no
   * limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be
   * always "1" and FacetValue.count will be the number of results that matches the query. For
   * example, you can set a customized facet for "shipToStore", where FacetKey.key is
   * "customizedShipToStore", and FacetKey.query is "availability: ANY(\"IN_STOCK\") AND
   * shipToStore: ANY(\"123\")". Then the facet will count the products that are both in stock and
   * ship to store "123".
   * @param query query or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Only get facet for the given restricted values. For example, when using "pickupInStore" as key
   * and set restricted values to ["store123", "store456"], only facets for "store123" and
   * "store456" are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must
   * be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery *
   * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 *
   * customFulfillment4 * customFulfillment5
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRestrictedValues() {
    return restrictedValues;
  }

  /**
   * Only get facet for the given restricted values. For example, when using "pickupInStore" as key
   * and set restricted values to ["store123", "store456"], only facets for "store123" and
   * "store456" are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must
   * be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery *
   * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 *
   * customFulfillment4 * customFulfillment5
   * @param restrictedValues restrictedValues or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey setRestrictedValues(java.util.List<java.lang.String> restrictedValues) {
    this.restrictedValues = restrictedValues;
    return this;
  }

  @Override
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey set(String fieldName, Object value) {
    return (GoogleCloudRetailV2SearchRequestFacetSpecFacetKey) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2SearchRequestFacetSpecFacetKey clone() {
    return (GoogleCloudRetailV2SearchRequestFacetSpecFacetKey) super.clone();
  }

}
