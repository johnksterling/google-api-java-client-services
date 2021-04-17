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

package com.google.api.services.logging.v2.model;

/**
 * The parameters to TailLogEntries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TailLogEntriesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The amount of time to buffer log entries at the server before being returned to
   * prevent out of order results due to late arriving log entries. Valid values are between 0-60000
   * milliseconds. Defaults to 2000 milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String bufferWindow;

  /**
   * Optional. A filter that chooses which log entries to return. See Advanced Logs Filters
   * (https://cloud.google.com/logging/docs/view/advanced_filters). Only log entries that match the
   * filter are returned. An empty filter matches all log entries in the resources listed in
   * resource_names. Referencing a parent resource that is not in resource_names will cause the
   * filter to return no results. The maximum length of the filter is 20000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Required. Name of a parent resource from which to retrieve log entries: projects/[PROJECT_ID]
   * organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]May
   * alternatively be one or more views:
   * projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] bil
   * lingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceNames;

  /**
   * Optional. The amount of time to buffer log entries at the server before being returned to
   * prevent out of order results due to late arriving log entries. Valid values are between 0-60000
   * milliseconds. Defaults to 2000 milliseconds.
   * @return value or {@code null} for none
   */
  public String getBufferWindow() {
    return bufferWindow;
  }

  /**
   * Optional. The amount of time to buffer log entries at the server before being returned to
   * prevent out of order results due to late arriving log entries. Valid values are between 0-60000
   * milliseconds. Defaults to 2000 milliseconds.
   * @param bufferWindow bufferWindow or {@code null} for none
   */
  public TailLogEntriesRequest setBufferWindow(String bufferWindow) {
    this.bufferWindow = bufferWindow;
    return this;
  }

  /**
   * Optional. A filter that chooses which log entries to return. See Advanced Logs Filters
   * (https://cloud.google.com/logging/docs/view/advanced_filters). Only log entries that match the
   * filter are returned. An empty filter matches all log entries in the resources listed in
   * resource_names. Referencing a parent resource that is not in resource_names will cause the
   * filter to return no results. The maximum length of the filter is 20000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Optional. A filter that chooses which log entries to return. See Advanced Logs Filters
   * (https://cloud.google.com/logging/docs/view/advanced_filters). Only log entries that match the
   * filter are returned. An empty filter matches all log entries in the resources listed in
   * resource_names. Referencing a parent resource that is not in resource_names will cause the
   * filter to return no results. The maximum length of the filter is 20000 characters.
   * @param filter filter or {@code null} for none
   */
  public TailLogEntriesRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Required. Name of a parent resource from which to retrieve log entries: projects/[PROJECT_ID]
   * organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]May
   * alternatively be one or more views:
   * projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] bil
   * lingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceNames() {
    return resourceNames;
  }

  /**
   * Required. Name of a parent resource from which to retrieve log entries: projects/[PROJECT_ID]
   * organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]May
   * alternatively be one or more views:
   * projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] bil
   * lingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
   * @param resourceNames resourceNames or {@code null} for none
   */
  public TailLogEntriesRequest setResourceNames(java.util.List<java.lang.String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  @Override
  public TailLogEntriesRequest set(String fieldName, Object value) {
    return (TailLogEntriesRequest) super.set(fieldName, value);
  }

  @Override
  public TailLogEntriesRequest clone() {
    return (TailLogEntriesRequest) super.clone();
  }

}
