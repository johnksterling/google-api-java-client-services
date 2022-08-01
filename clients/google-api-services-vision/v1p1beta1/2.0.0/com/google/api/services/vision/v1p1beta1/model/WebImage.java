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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * Metadata for online images.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WebImage extends com.google.api.client.json.GenericJson {

  /**
   * (Deprecated) Overall relevancy score for the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * The result image URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * (Deprecated) Overall relevancy score for the image.
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * (Deprecated) Overall relevancy score for the image.
   * @param score score or {@code null} for none
   */
  public WebImage setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  /**
   * The result image URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The result image URL.
   * @param url url or {@code null} for none
   */
  public WebImage setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public WebImage set(String fieldName, Object value) {
    return (WebImage) super.set(fieldName, value);
  }

  @Override
  public WebImage clone() {
    return (WebImage) super.clone();
  }

}
