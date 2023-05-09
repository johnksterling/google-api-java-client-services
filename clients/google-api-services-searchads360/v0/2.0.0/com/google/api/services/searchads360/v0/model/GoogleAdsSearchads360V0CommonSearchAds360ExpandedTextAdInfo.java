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
 * A Search Ads 360 expanded text ad.
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
public final class GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo extends com.google.api.client.json.GenericJson {

  /**
   * The tracking id of the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long adTrackingId;

  /**
   * The first line of the ad's description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description1;

  /**
   * The second line of the ad's description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description2;

  /**
   * The headline of the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headline;

  /**
   * The second headline of the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headline2;

  /**
   * The third headline of the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headline3;

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
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo setAdTrackingId(java.lang.Long adTrackingId) {
    this.adTrackingId = adTrackingId;
    return this;
  }

  /**
   * The first line of the ad's description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription1() {
    return description1;
  }

  /**
   * The first line of the ad's description.
   * @param description1 description1 or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo setDescription1(java.lang.String description1) {
    this.description1 = description1;
    return this;
  }

  /**
   * The second line of the ad's description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription2() {
    return description2;
  }

  /**
   * The second line of the ad's description.
   * @param description2 description2 or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo setDescription2(java.lang.String description2) {
    this.description2 = description2;
    return this;
  }

  /**
   * The headline of the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeadline() {
    return headline;
  }

  /**
   * The headline of the ad.
   * @param headline headline or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo setHeadline(java.lang.String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * The second headline of the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeadline2() {
    return headline2;
  }

  /**
   * The second headline of the ad.
   * @param headline2 headline2 or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo setHeadline2(java.lang.String headline2) {
    this.headline2 = headline2;
    return this;
  }

  /**
   * The third headline of the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeadline3() {
    return headline3;
  }

  /**
   * The third headline of the ad.
   * @param headline3 headline3 or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo setHeadline3(java.lang.String headline3) {
    this.headline3 = headline3;
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
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo setPath1(java.lang.String path1) {
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
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo setPath2(java.lang.String path2) {
    this.path2 = path2;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo clone() {
    return (GoogleAdsSearchads360V0CommonSearchAds360ExpandedTextAdInfo) super.clone();
  }

}