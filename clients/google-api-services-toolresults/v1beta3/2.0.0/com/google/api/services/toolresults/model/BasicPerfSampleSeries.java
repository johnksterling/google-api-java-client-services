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
 * Encapsulates the metadata for basic sample series represented by a line chart
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
public final class BasicPerfSampleSeries extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String perfMetricType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String perfUnit;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sampleSeriesLabel;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPerfMetricType() {
    return perfMetricType;
  }

  /**
   * @param perfMetricType perfMetricType or {@code null} for none
   */
  public BasicPerfSampleSeries setPerfMetricType(java.lang.String perfMetricType) {
    this.perfMetricType = perfMetricType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPerfUnit() {
    return perfUnit;
  }

  /**
   * @param perfUnit perfUnit or {@code null} for none
   */
  public BasicPerfSampleSeries setPerfUnit(java.lang.String perfUnit) {
    this.perfUnit = perfUnit;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSampleSeriesLabel() {
    return sampleSeriesLabel;
  }

  /**
   * @param sampleSeriesLabel sampleSeriesLabel or {@code null} for none
   */
  public BasicPerfSampleSeries setSampleSeriesLabel(java.lang.String sampleSeriesLabel) {
    this.sampleSeriesLabel = sampleSeriesLabel;
    return this;
  }

  @Override
  public BasicPerfSampleSeries set(String fieldName, Object value) {
    return (BasicPerfSampleSeries) super.set(fieldName, value);
  }

  @Override
  public BasicPerfSampleSeries clone() {
    return (BasicPerfSampleSeries) super.clone();
  }

}
