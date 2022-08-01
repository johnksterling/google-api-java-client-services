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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * Logical element on the page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p2beta1Block extends com.google.api.client.json.GenericJson {

  /**
   * Detected block type (text, image etc) for this block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String blockType;

  /**
   * The bounding box for the block. The vertices are in the order of top-left, top-right, bottom-
   * right, bottom-left. When a rotation of the bounding box is detected the rotation is represented
   * as around the top-left corner as defined when the text is read in the 'natural' orientation.
   * For example: * when the text is horizontal it might look like: 0----1 | | 3----2 * when it's
   * rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex
   * order will still be (0, 1, 2, 3).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p2beta1BoundingPoly boundingBox;

  /**
   * Confidence of the OCR results on the block. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * List of paragraphs in this block (if this blocks is of type text).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p2beta1Paragraph> paragraphs;

  /**
   * Additional information detected for the block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p2beta1TextAnnotationTextProperty property;

  /**
   * Detected block type (text, image etc) for this block.
   * @return value or {@code null} for none
   */
  public java.lang.String getBlockType() {
    return blockType;
  }

  /**
   * Detected block type (text, image etc) for this block.
   * @param blockType blockType or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Block setBlockType(java.lang.String blockType) {
    this.blockType = blockType;
    return this;
  }

  /**
   * The bounding box for the block. The vertices are in the order of top-left, top-right, bottom-
   * right, bottom-left. When a rotation of the bounding box is detected the rotation is represented
   * as around the top-left corner as defined when the text is read in the 'natural' orientation.
   * For example: * when the text is horizontal it might look like: 0----1 | | 3----2 * when it's
   * rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex
   * order will still be (0, 1, 2, 3).
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1BoundingPoly getBoundingBox() {
    return boundingBox;
  }

  /**
   * The bounding box for the block. The vertices are in the order of top-left, top-right, bottom-
   * right, bottom-left. When a rotation of the bounding box is detected the rotation is represented
   * as around the top-left corner as defined when the text is read in the 'natural' orientation.
   * For example: * when the text is horizontal it might look like: 0----1 | | 3----2 * when it's
   * rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex
   * order will still be (0, 1, 2, 3).
   * @param boundingBox boundingBox or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Block setBoundingBox(GoogleCloudVisionV1p2beta1BoundingPoly boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Confidence of the OCR results on the block. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence of the OCR results on the block. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Block setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * List of paragraphs in this block (if this blocks is of type text).
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p2beta1Paragraph> getParagraphs() {
    return paragraphs;
  }

  /**
   * List of paragraphs in this block (if this blocks is of type text).
   * @param paragraphs paragraphs or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Block setParagraphs(java.util.List<GoogleCloudVisionV1p2beta1Paragraph> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  /**
   * Additional information detected for the block.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1TextAnnotationTextProperty getProperty() {
    return property;
  }

  /**
   * Additional information detected for the block.
   * @param property property or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Block setProperty(GoogleCloudVisionV1p2beta1TextAnnotationTextProperty property) {
    this.property = property;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p2beta1Block set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p2beta1Block) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p2beta1Block clone() {
    return (GoogleCloudVisionV1p2beta1Block) super.clone();
  }

}
