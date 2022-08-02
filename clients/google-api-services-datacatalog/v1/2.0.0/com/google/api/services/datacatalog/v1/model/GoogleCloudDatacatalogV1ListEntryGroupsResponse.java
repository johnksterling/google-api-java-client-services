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

package com.google.api.services.datacatalog.v1.model;

/**
 * Response message for ListEntryGroups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1ListEntryGroupsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Entry group details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatacatalogV1EntryGroup> entryGroups;

  static {
    // hack to force ProGuard to consider GoogleCloudDatacatalogV1EntryGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDatacatalogV1EntryGroup.class);
  }

  /**
   * Pagination token to specify in the next call to retrieve the next page of results. Empty if
   * there are no more items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Entry group details.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatacatalogV1EntryGroup> getEntryGroups() {
    return entryGroups;
  }

  /**
   * Entry group details.
   * @param entryGroups entryGroups or {@code null} for none
   */
  public GoogleCloudDatacatalogV1ListEntryGroupsResponse setEntryGroups(java.util.List<GoogleCloudDatacatalogV1EntryGroup> entryGroups) {
    this.entryGroups = entryGroups;
    return this;
  }

  /**
   * Pagination token to specify in the next call to retrieve the next page of results. Empty if
   * there are no more items.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token to specify in the next call to retrieve the next page of results. Empty if
   * there are no more items.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDatacatalogV1ListEntryGroupsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1ListEntryGroupsResponse set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1ListEntryGroupsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1ListEntryGroupsResponse clone() {
    return (GoogleCloudDatacatalogV1ListEntryGroupsResponse) super.clone();
  }

}
