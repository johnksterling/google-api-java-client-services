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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Metadata type for the operation returned by
 * google.bigtable.admin.v2.BigtableTableAdmin.UndeleteTable.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UndeleteTableMetadata extends com.google.api.client.json.GenericJson {

  /**
   * If set, the time at which this operation finished or was cancelled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The name of the table being restored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The time at which this operation started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * If set, the time at which this operation finished or was cancelled.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * If set, the time at which this operation finished or was cancelled.
   * @param endTime endTime or {@code null} for none
   */
  public UndeleteTableMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The name of the table being restored.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the table being restored.
   * @param name name or {@code null} for none
   */
  public UndeleteTableMetadata setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The time at which this operation started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The time at which this operation started.
   * @param startTime startTime or {@code null} for none
   */
  public UndeleteTableMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public UndeleteTableMetadata set(String fieldName, Object value) {
    return (UndeleteTableMetadata) super.set(fieldName, value);
  }

  @Override
  public UndeleteTableMetadata clone() {
    return (UndeleteTableMetadata) super.clone();
  }

}
