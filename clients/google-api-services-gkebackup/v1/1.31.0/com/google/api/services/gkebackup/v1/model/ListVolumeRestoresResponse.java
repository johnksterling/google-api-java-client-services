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
 * Response message for ListVolumeRestores.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListVolumeRestoresResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token which may be sent as page_token in a subsequent `ListVolumeRestores` call to retrieve
   * the next page of results. If this field is omitted or empty, then there are no more results to
   * return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of VolumeRestores matching the given criteria.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VolumeRestore> volumeRestores;

  /**
   * A token which may be sent as page_token in a subsequent `ListVolumeRestores` call to retrieve
   * the next page of results. If this field is omitted or empty, then there are no more results to
   * return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token which may be sent as page_token in a subsequent `ListVolumeRestores` call to retrieve
   * the next page of results. If this field is omitted or empty, then there are no more results to
   * return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListVolumeRestoresResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of VolumeRestores matching the given criteria.
   * @return value or {@code null} for none
   */
  public java.util.List<VolumeRestore> getVolumeRestores() {
    return volumeRestores;
  }

  /**
   * The list of VolumeRestores matching the given criteria.
   * @param volumeRestores volumeRestores or {@code null} for none
   */
  public ListVolumeRestoresResponse setVolumeRestores(java.util.List<VolumeRestore> volumeRestores) {
    this.volumeRestores = volumeRestores;
    return this;
  }

  @Override
  public ListVolumeRestoresResponse set(String fieldName, Object value) {
    return (ListVolumeRestoresResponse) super.set(fieldName, value);
  }

  @Override
  public ListVolumeRestoresResponse clone() {
    return (ListVolumeRestoresResponse) super.clone();
  }

}
