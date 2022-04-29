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

package com.google.api.services.gkebackup.v1.model;

/**
 * Response message for ListBackupPlans.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListBackupPlansResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of BackupPlans matching the given criteria.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BackupPlan> backupPlans;

  static {
    // hack to force ProGuard to consider BackupPlan used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BackupPlan.class);
  }

  /**
   * A token which may be sent as page_token in a subsequent `ListBackupPlans` call to retrieve the
   * next page of results. If this field is omitted or empty, then there are no more results to
   * return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The list of BackupPlans matching the given criteria.
   * @return value or {@code null} for none
   */
  public java.util.List<BackupPlan> getBackupPlans() {
    return backupPlans;
  }

  /**
   * The list of BackupPlans matching the given criteria.
   * @param backupPlans backupPlans or {@code null} for none
   */
  public ListBackupPlansResponse setBackupPlans(java.util.List<BackupPlan> backupPlans) {
    this.backupPlans = backupPlans;
    return this;
  }

  /**
   * A token which may be sent as page_token in a subsequent `ListBackupPlans` call to retrieve the
   * next page of results. If this field is omitted or empty, then there are no more results to
   * return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token which may be sent as page_token in a subsequent `ListBackupPlans` call to retrieve the
   * next page of results. If this field is omitted or empty, then there are no more results to
   * return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListBackupPlansResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListBackupPlansResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListBackupPlansResponse set(String fieldName, Object value) {
    return (ListBackupPlansResponse) super.set(fieldName, value);
  }

  @Override
  public ListBackupPlansResponse clone() {
    return (ListBackupPlansResponse) super.clone();
  }

}
