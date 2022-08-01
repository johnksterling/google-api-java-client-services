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

package com.google.api.services.sheets.v4.model;

/**
 * A rule that may or may not match, depending on the condition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BooleanRule extends com.google.api.client.json.GenericJson {

  /**
   * The condition of the rule. If the condition evaluates to true, the format is applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BooleanCondition condition;

  /**
   * The format to apply. Conditional formatting can only apply a subset of formatting: bold,
   * italic, strikethrough, foreground color & background color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CellFormat format;

  /**
   * The condition of the rule. If the condition evaluates to true, the format is applied.
   * @return value or {@code null} for none
   */
  public BooleanCondition getCondition() {
    return condition;
  }

  /**
   * The condition of the rule. If the condition evaluates to true, the format is applied.
   * @param condition condition or {@code null} for none
   */
  public BooleanRule setCondition(BooleanCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * The format to apply. Conditional formatting can only apply a subset of formatting: bold,
   * italic, strikethrough, foreground color & background color.
   * @return value or {@code null} for none
   */
  public CellFormat getFormat() {
    return format;
  }

  /**
   * The format to apply. Conditional formatting can only apply a subset of formatting: bold,
   * italic, strikethrough, foreground color & background color.
   * @param format format or {@code null} for none
   */
  public BooleanRule setFormat(CellFormat format) {
    this.format = format;
    return this;
  }

  @Override
  public BooleanRule set(String fieldName, Object value) {
    return (BooleanRule) super.set(fieldName, value);
  }

  @Override
  public BooleanRule clone() {
    return (BooleanRule) super.clone();
  }

}
