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
 * Properties of a spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpreadsheetProperties extends com.google.api.client.json.GenericJson {

  /**
   * The amount of time to wait before volatile functions are recalculated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String autoRecalc;

  /**
   * The default format of all cells in the spreadsheet. CellData.effectiveFormat will not be set if
   * the cell's format is equal to this default format. This field is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CellFormat defaultFormat;

  /**
   * Determines whether and how circular references are resolved with iterative calculation. Absence
   * of this field means that circular references result in calculation errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IterativeCalculationSettings iterativeCalculationSettings;

  /**
   * The locale of the spreadsheet in one of the following formats: * an ISO 639-1 language code
   * such as `en` * an ISO 639-2 language code such as `fil`, if no 639-1 code exists * a
   * combination of the ISO language code and country code, such as `en_US` Note: when updating this
   * field, not all locales/languages are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locale;

  /**
   * Theme applied to the spreadsheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SpreadsheetTheme spreadsheetTheme;

  /**
   * The time zone of the spreadsheet, in CLDR format such as `America/New_York`. If the time zone
   * isn't recognized, this may be a custom time zone such as `GMT-07:00`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * The title of the spreadsheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The amount of time to wait before volatile functions are recalculated.
   * @return value or {@code null} for none
   */
  public java.lang.String getAutoRecalc() {
    return autoRecalc;
  }

  /**
   * The amount of time to wait before volatile functions are recalculated.
   * @param autoRecalc autoRecalc or {@code null} for none
   */
  public SpreadsheetProperties setAutoRecalc(java.lang.String autoRecalc) {
    this.autoRecalc = autoRecalc;
    return this;
  }

  /**
   * The default format of all cells in the spreadsheet. CellData.effectiveFormat will not be set if
   * the cell's format is equal to this default format. This field is read-only.
   * @return value or {@code null} for none
   */
  public CellFormat getDefaultFormat() {
    return defaultFormat;
  }

  /**
   * The default format of all cells in the spreadsheet. CellData.effectiveFormat will not be set if
   * the cell's format is equal to this default format. This field is read-only.
   * @param defaultFormat defaultFormat or {@code null} for none
   */
  public SpreadsheetProperties setDefaultFormat(CellFormat defaultFormat) {
    this.defaultFormat = defaultFormat;
    return this;
  }

  /**
   * Determines whether and how circular references are resolved with iterative calculation. Absence
   * of this field means that circular references result in calculation errors.
   * @return value or {@code null} for none
   */
  public IterativeCalculationSettings getIterativeCalculationSettings() {
    return iterativeCalculationSettings;
  }

  /**
   * Determines whether and how circular references are resolved with iterative calculation. Absence
   * of this field means that circular references result in calculation errors.
   * @param iterativeCalculationSettings iterativeCalculationSettings or {@code null} for none
   */
  public SpreadsheetProperties setIterativeCalculationSettings(IterativeCalculationSettings iterativeCalculationSettings) {
    this.iterativeCalculationSettings = iterativeCalculationSettings;
    return this;
  }

  /**
   * The locale of the spreadsheet in one of the following formats: * an ISO 639-1 language code
   * such as `en` * an ISO 639-2 language code such as `fil`, if no 639-1 code exists * a
   * combination of the ISO language code and country code, such as `en_US` Note: when updating this
   * field, not all locales/languages are supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocale() {
    return locale;
  }

  /**
   * The locale of the spreadsheet in one of the following formats: * an ISO 639-1 language code
   * such as `en` * an ISO 639-2 language code such as `fil`, if no 639-1 code exists * a
   * combination of the ISO language code and country code, such as `en_US` Note: when updating this
   * field, not all locales/languages are supported.
   * @param locale locale or {@code null} for none
   */
  public SpreadsheetProperties setLocale(java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Theme applied to the spreadsheet.
   * @return value or {@code null} for none
   */
  public SpreadsheetTheme getSpreadsheetTheme() {
    return spreadsheetTheme;
  }

  /**
   * Theme applied to the spreadsheet.
   * @param spreadsheetTheme spreadsheetTheme or {@code null} for none
   */
  public SpreadsheetProperties setSpreadsheetTheme(SpreadsheetTheme spreadsheetTheme) {
    this.spreadsheetTheme = spreadsheetTheme;
    return this;
  }

  /**
   * The time zone of the spreadsheet, in CLDR format such as `America/New_York`. If the time zone
   * isn't recognized, this may be a custom time zone such as `GMT-07:00`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * The time zone of the spreadsheet, in CLDR format such as `America/New_York`. If the time zone
   * isn't recognized, this may be a custom time zone such as `GMT-07:00`.
   * @param timeZone timeZone or {@code null} for none
   */
  public SpreadsheetProperties setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The title of the spreadsheet.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the spreadsheet.
   * @param title title or {@code null} for none
   */
  public SpreadsheetProperties setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public SpreadsheetProperties set(String fieldName, Object value) {
    return (SpreadsheetProperties) super.set(fieldName, value);
  }

  @Override
  public SpreadsheetProperties clone() {
    return (SpreadsheetProperties) super.clone();
  }

}
