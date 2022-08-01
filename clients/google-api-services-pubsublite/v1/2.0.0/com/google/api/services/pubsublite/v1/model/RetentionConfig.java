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

package com.google.api.services.pubsublite.v1.model;

/**
 * The settings for a topic's message retention.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Pub/Sub Lite API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RetentionConfig extends com.google.api.client.json.GenericJson {

  /**
   * The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the
   * topic's partitions grows beyond this value, older messages will be dropped to make room for
   * newer ones, regardless of the value of `period`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long perPartitionBytes;

  /**
   * How long a published message is retained. If unset, messages will be retained as long as the
   * bytes retained for each partition is below `per_partition_bytes`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String period;

  /**
   * The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the
   * topic's partitions grows beyond this value, older messages will be dropped to make room for
   * newer ones, regardless of the value of `period`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPerPartitionBytes() {
    return perPartitionBytes;
  }

  /**
   * The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the
   * topic's partitions grows beyond this value, older messages will be dropped to make room for
   * newer ones, regardless of the value of `period`.
   * @param perPartitionBytes perPartitionBytes or {@code null} for none
   */
  public RetentionConfig setPerPartitionBytes(java.lang.Long perPartitionBytes) {
    this.perPartitionBytes = perPartitionBytes;
    return this;
  }

  /**
   * How long a published message is retained. If unset, messages will be retained as long as the
   * bytes retained for each partition is below `per_partition_bytes`.
   * @return value or {@code null} for none
   */
  public String getPeriod() {
    return period;
  }

  /**
   * How long a published message is retained. If unset, messages will be retained as long as the
   * bytes retained for each partition is below `per_partition_bytes`.
   * @param period period or {@code null} for none
   */
  public RetentionConfig setPeriod(String period) {
    this.period = period;
    return this;
  }

  @Override
  public RetentionConfig set(String fieldName, Object value) {
    return (RetentionConfig) super.set(fieldName, value);
  }

  @Override
  public RetentionConfig clone() {
    return (RetentionConfig) super.clone();
  }

}
