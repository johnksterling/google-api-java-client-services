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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * Response message for ListConversionEvents RPC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaListConversionEventsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The requested conversion events
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAnalyticsAdminV1alphaConversionEvent> conversionEvents;

  static {
    // hack to force ProGuard to consider GoogleAnalyticsAdminV1alphaConversionEvent used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAnalyticsAdminV1alphaConversionEvent.class);
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The requested conversion events
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAnalyticsAdminV1alphaConversionEvent> getConversionEvents() {
    return conversionEvents;
  }

  /**
   * The requested conversion events
   * @param conversionEvents conversionEvents or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaListConversionEventsResponse setConversionEvents(java.util.List<GoogleAnalyticsAdminV1alphaConversionEvent> conversionEvents) {
    this.conversionEvents = conversionEvents;
    return this;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaListConversionEventsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListConversionEventsResponse set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaListConversionEventsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListConversionEventsResponse clone() {
    return (GoogleAnalyticsAdminV1alphaListConversionEventsResponse) super.clone();
  }

}
