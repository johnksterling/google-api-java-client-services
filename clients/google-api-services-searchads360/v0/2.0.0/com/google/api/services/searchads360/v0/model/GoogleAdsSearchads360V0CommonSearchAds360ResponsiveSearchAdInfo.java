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

package com.google.api.services.searchads360.v0.model;

/**
 * A Search Ads 360 responsive search ad.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0CommonSearchAds360ResponsiveSearchAdInfo extends com.google.api.client.json.GenericJson {

  /**
   * The tracking id of the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long adTrackingId;

  /**
   * Text appended to the auto-generated visible URL with a delimiter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path1;

  /**
   * Text appended to path1 with a delimiter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path2;

  /**
   * The tracking id of the ad.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdTrackingId() {
    return adTrackingId;
  }

  /**
   * The tracking id of the ad.
   * @param adTrackingId adTrackingId or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSearchAds360ResponsiveSearchAdInfo setAdTrackingId(java.lang.Long adTrackingId) {
    this.adTrackingId = adTrackingId;
    return this;
  }

  /**
   * Text appended to the auto-generated visible URL with a delimiter.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath1() {
    return path1;
  }

  /**
   * Text appended to the auto-generated visible URL with a delimiter.
   * @param path1 path1 or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSearchAds360ResponsiveSearchAdInfo setPath1(java.lang.String path1) {
    this.path1 = path1;
    return this;
  }

  /**
   * Text appended to path1 with a delimiter.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath2() {
    return path2;
  }

  /**
   * Text appended to path1 with a delimiter.
   * @param path2 path2 or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSearchAds360ResponsiveSearchAdInfo setPath2(java.lang.String path2) {
    this.path2 = path2;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0CommonSearchAds360ResponsiveSearchAdInfo set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0CommonSearchAds360ResponsiveSearchAdInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0CommonSearchAds360ResponsiveSearchAdInfo clone() {
    return (GoogleAdsSearchads360V0CommonSearchAds360ResponsiveSearchAdInfo) super.clone();
  }

}