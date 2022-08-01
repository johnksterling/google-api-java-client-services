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

package com.google.api.services.toolresults.model;

/**
 * A response containing the thumbnails in a step.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListStepThumbnailsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A continuation token to resume the query at the next item. If set, indicates that there are
   * more thumbnails to read, by calling list again with this value in the page_token field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of image data. Images are returned in a deterministic order; they are ordered by these
   * factors, in order of importance: * First, by their associated test case. Images without a test
   * case are considered greater than images with one. * Second, by their creation time. Images
   * without a creation time are greater than images with one. * Third, by the order in which they
   * were added to the step (by calls to CreateStep or UpdateStep).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Image> thumbnails;

  static {
    // hack to force ProGuard to consider Image used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Image.class);
  }

  /**
   * A continuation token to resume the query at the next item. If set, indicates that there are
   * more thumbnails to read, by calling list again with this value in the page_token field.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A continuation token to resume the query at the next item. If set, indicates that there are
   * more thumbnails to read, by calling list again with this value in the page_token field.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListStepThumbnailsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of image data. Images are returned in a deterministic order; they are ordered by these
   * factors, in order of importance: * First, by their associated test case. Images without a test
   * case are considered greater than images with one. * Second, by their creation time. Images
   * without a creation time are greater than images with one. * Third, by the order in which they
   * were added to the step (by calls to CreateStep or UpdateStep).
   * @return value or {@code null} for none
   */
  public java.util.List<Image> getThumbnails() {
    return thumbnails;
  }

  /**
   * A list of image data. Images are returned in a deterministic order; they are ordered by these
   * factors, in order of importance: * First, by their associated test case. Images without a test
   * case are considered greater than images with one. * Second, by their creation time. Images
   * without a creation time are greater than images with one. * Third, by the order in which they
   * were added to the step (by calls to CreateStep or UpdateStep).
   * @param thumbnails thumbnails or {@code null} for none
   */
  public ListStepThumbnailsResponse setThumbnails(java.util.List<Image> thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  @Override
  public ListStepThumbnailsResponse set(String fieldName, Object value) {
    return (ListStepThumbnailsResponse) super.set(fieldName, value);
  }

  @Override
  public ListStepThumbnailsResponse clone() {
    return (ListStepThumbnailsResponse) super.clone();
  }

}
