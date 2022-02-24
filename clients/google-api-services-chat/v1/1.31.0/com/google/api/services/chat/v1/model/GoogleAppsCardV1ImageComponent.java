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

package com.google.api.services.chat.v1.model;

/**
 * Represents an image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1ImageComponent extends com.google.api.client.json.GenericJson {

  /**
   * The accessibility label for the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String altText;

  /**
   * The border style to apply to the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1BorderStyle borderStyle;

  /**
   * The crop style to apply to the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1ImageCropStyle cropStyle;

  /**
   * The image URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * The accessibility label for the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getAltText() {
    return altText;
  }

  /**
   * The accessibility label for the image.
   * @param altText altText or {@code null} for none
   */
  public GoogleAppsCardV1ImageComponent setAltText(java.lang.String altText) {
    this.altText = altText;
    return this;
  }

  /**
   * The border style to apply to the image.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1BorderStyle getBorderStyle() {
    return borderStyle;
  }

  /**
   * The border style to apply to the image.
   * @param borderStyle borderStyle or {@code null} for none
   */
  public GoogleAppsCardV1ImageComponent setBorderStyle(GoogleAppsCardV1BorderStyle borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }

  /**
   * The crop style to apply to the image.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1ImageCropStyle getCropStyle() {
    return cropStyle;
  }

  /**
   * The crop style to apply to the image.
   * @param cropStyle cropStyle or {@code null} for none
   */
  public GoogleAppsCardV1ImageComponent setCropStyle(GoogleAppsCardV1ImageCropStyle cropStyle) {
    this.cropStyle = cropStyle;
    return this;
  }

  /**
   * The image URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * The image URL.
   * @param imageUri imageUri or {@code null} for none
   */
  public GoogleAppsCardV1ImageComponent setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  @Override
  public GoogleAppsCardV1ImageComponent set(String fieldName, Object value) {
    return (GoogleAppsCardV1ImageComponent) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1ImageComponent clone() {
    return (GoogleAppsCardV1ImageComponent) super.clone();
  }

}
