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

package com.google.api.services.firestore.v1.model;

/**
 * Firestore query for running an aggregation over a StructuredQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StructuredAggregationQuery extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Series of aggregations to apply on top of the `structured_query`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Aggregation> aggregations;

  static {
    // hack to force ProGuard to consider Aggregation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Aggregation.class);
  }

  /**
   * Nested structured query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StructuredQuery structuredQuery;

  /**
   * Optional. Series of aggregations to apply on top of the `structured_query`.
   * @return value or {@code null} for none
   */
  public java.util.List<Aggregation> getAggregations() {
    return aggregations;
  }

  /**
   * Optional. Series of aggregations to apply on top of the `structured_query`.
   * @param aggregations aggregations or {@code null} for none
   */
  public StructuredAggregationQuery setAggregations(java.util.List<Aggregation> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  /**
   * Nested structured query.
   * @return value or {@code null} for none
   */
  public StructuredQuery getStructuredQuery() {
    return structuredQuery;
  }

  /**
   * Nested structured query.
   * @param structuredQuery structuredQuery or {@code null} for none
   */
  public StructuredAggregationQuery setStructuredQuery(StructuredQuery structuredQuery) {
    this.structuredQuery = structuredQuery;
    return this;
  }

  @Override
  public StructuredAggregationQuery set(String fieldName, Object value) {
    return (StructuredAggregationQuery) super.set(fieldName, value);
  }

  @Override
  public StructuredAggregationQuery clone() {
    return (StructuredAggregationQuery) super.clone();
  }

}
