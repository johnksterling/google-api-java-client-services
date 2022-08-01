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

package com.google.api.services.playdeveloperreporting.v1alpha1.model;

/**
 * Response with a paginated list of error reports matching the search query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Error reports that were found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePlayDeveloperReportingV1alpha1ErrorReport> errorReports;

  static {
    // hack to force ProGuard to consider GooglePlayDeveloperReportingV1alpha1ErrorReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePlayDeveloperReportingV1alpha1ErrorReport.class);
  }

  /**
   * Page token to fetch the next page of reports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Error reports that were found.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePlayDeveloperReportingV1alpha1ErrorReport> getErrorReports() {
    return errorReports;
  }

  /**
   * Error reports that were found.
   * @param errorReports errorReports or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse setErrorReports(java.util.List<GooglePlayDeveloperReportingV1alpha1ErrorReport> errorReports) {
    this.errorReports = errorReports;
    return this;
  }

  /**
   * Page token to fetch the next page of reports.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Page token to fetch the next page of reports.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse set(String fieldName, Object value) {
    return (GooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse) super.set(fieldName, value);
  }

  @Override
  public GooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse clone() {
    return (GooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse) super.clone();
  }

}
