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

package com.google.api.services.monitoring.v1.model;

/**
 * The context of a span. This is attached to an Exemplar in Distribution values during
 * aggregation.It contains the name of a span with format:
 * projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID]
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpanContext extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the span. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID] [TRACE_ID] is a unique
   * identifier for a trace within a project; it is a 32-character hexadecimal encoding of a 16-byte
   * array.[SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character
   * hexadecimal encoding of an 8-byte array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spanName;

  /**
   * The resource name of the span. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID] [TRACE_ID] is a unique
   * identifier for a trace within a project; it is a 32-character hexadecimal encoding of a 16-byte
   * array.[SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character
   * hexadecimal encoding of an 8-byte array.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpanName() {
    return spanName;
  }

  /**
   * The resource name of the span. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID] [TRACE_ID] is a unique
   * identifier for a trace within a project; it is a 32-character hexadecimal encoding of a 16-byte
   * array.[SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character
   * hexadecimal encoding of an 8-byte array.
   * @param spanName spanName or {@code null} for none
   */
  public SpanContext setSpanName(java.lang.String spanName) {
    this.spanName = spanName;
    return this;
  }

  @Override
  public SpanContext set(String fieldName, Object value) {
    return (SpanContext) super.set(fieldName, value);
  }

  @Override
  public SpanContext clone() {
    return (SpanContext) super.clone();
  }

}
