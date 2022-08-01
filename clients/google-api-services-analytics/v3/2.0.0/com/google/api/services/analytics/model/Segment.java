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
 * JSON template for an Analytics segment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Segment extends com.google.api.client.json.GenericJson {

  /**
   * Time the segment was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime created;

  /**
   * Segment definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String definition;

  /**
   * Segment ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Resource type for Analytics segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Segment name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Segment ID. Can be used with the 'segment' parameter in Core Reporting API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String segmentId;

  /**
   * Link for this segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Type for a segment. Possible values are "BUILT_IN" or "CUSTOM".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Time the segment was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * Time the segment was created.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreated() {
    return created;
  }

  /**
   * Time the segment was created.
   * @param created created or {@code null} for none
   */
  public Segment setCreated(com.google.api.client.util.DateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Segment definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefinition() {
    return definition;
  }

  /**
   * Segment definition.
   * @param definition definition or {@code null} for none
   */
  public Segment setDefinition(java.lang.String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Segment ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Segment ID.
   * @param id id or {@code null} for none
   */
  public Segment setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Resource type for Analytics segment.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for Analytics segment.
   * @param kind kind or {@code null} for none
   */
  public Segment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Segment name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Segment name.
   * @param name name or {@code null} for none
   */
  public Segment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Segment ID. Can be used with the 'segment' parameter in Core Reporting API.
   * @return value or {@code null} for none
   */
  public java.lang.String getSegmentId() {
    return segmentId;
  }

  /**
   * Segment ID. Can be used with the 'segment' parameter in Core Reporting API.
   * @param segmentId segmentId or {@code null} for none
   */
  public Segment setSegmentId(java.lang.String segmentId) {
    this.segmentId = segmentId;
    return this;
  }

  /**
   * Link for this segment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link for this segment.
   * @param selfLink selfLink or {@code null} for none
   */
  public Segment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Type for a segment. Possible values are "BUILT_IN" or "CUSTOM".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type for a segment. Possible values are "BUILT_IN" or "CUSTOM".
   * @param type type or {@code null} for none
   */
  public Segment setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Time the segment was last modified.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * Time the segment was last modified.
   * @param updated updated or {@code null} for none
   */
  public Segment setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  @Override
  public Segment set(String fieldName, Object value) {
    return (Segment) super.set(fieldName, value);
  }

  @Override
  public Segment clone() {
    return (Segment) super.clone();
  }

}
