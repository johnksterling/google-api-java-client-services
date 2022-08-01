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
 * A protected range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProtectedRange extends com.google.api.client.json.GenericJson {

  /**
   * The description of this protected range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The users and groups with edit access to the protected range. This field is only visible to
   * users with edit access to the protected range and the document. Editors are not supported with
   * warning_only protection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Editors editors;

  /**
   * The named range this protected range is backed by, if any. When writing, only one of range or
   * named_range_id may be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namedRangeId;

  /**
   * The ID of the protected range. This field is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer protectedRangeId;

  /**
   * The range that is being protected. The range may be fully unbounded, in which case this is
   * considered a protected sheet. When writing, only one of range or named_range_id may be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange range;

  /**
   * True if the user who requested this protected range can edit the protected area. This field is
   * read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requestingUserCanEdit;

  /**
   * The list of unprotected ranges within a protected sheet. Unprotected ranges are only supported
   * on protected sheets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GridRange> unprotectedRanges;

  static {
    // hack to force ProGuard to consider GridRange used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GridRange.class);
  }

  /**
   * True if this protected range will show a warning when editing. Warning-based protection means
   * that every user can edit data in the protected range, except editing will prompt a warning
   * asking the user to confirm the edit. When writing: if this field is true, then editors is
   * ignored. Additionally, if this field is changed from true to false and the `editors` field is
   * not set (nor included in the field mask), then the editors will be set to all the editors in
   * the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean warningOnly;

  /**
   * The description of this protected range.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of this protected range.
   * @param description description or {@code null} for none
   */
  public ProtectedRange setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The users and groups with edit access to the protected range. This field is only visible to
   * users with edit access to the protected range and the document. Editors are not supported with
   * warning_only protection.
   * @return value or {@code null} for none
   */
  public Editors getEditors() {
    return editors;
  }

  /**
   * The users and groups with edit access to the protected range. This field is only visible to
   * users with edit access to the protected range and the document. Editors are not supported with
   * warning_only protection.
   * @param editors editors or {@code null} for none
   */
  public ProtectedRange setEditors(Editors editors) {
    this.editors = editors;
    return this;
  }

  /**
   * The named range this protected range is backed by, if any. When writing, only one of range or
   * named_range_id may be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamedRangeId() {
    return namedRangeId;
  }

  /**
   * The named range this protected range is backed by, if any. When writing, only one of range or
   * named_range_id may be set.
   * @param namedRangeId namedRangeId or {@code null} for none
   */
  public ProtectedRange setNamedRangeId(java.lang.String namedRangeId) {
    this.namedRangeId = namedRangeId;
    return this;
  }

  /**
   * The ID of the protected range. This field is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProtectedRangeId() {
    return protectedRangeId;
  }

  /**
   * The ID of the protected range. This field is read-only.
   * @param protectedRangeId protectedRangeId or {@code null} for none
   */
  public ProtectedRange setProtectedRangeId(java.lang.Integer protectedRangeId) {
    this.protectedRangeId = protectedRangeId;
    return this;
  }

  /**
   * The range that is being protected. The range may be fully unbounded, in which case this is
   * considered a protected sheet. When writing, only one of range or named_range_id may be set.
   * @return value or {@code null} for none
   */
  public GridRange getRange() {
    return range;
  }

  /**
   * The range that is being protected. The range may be fully unbounded, in which case this is
   * considered a protected sheet. When writing, only one of range or named_range_id may be set.
   * @param range range or {@code null} for none
   */
  public ProtectedRange setRange(GridRange range) {
    this.range = range;
    return this;
  }

  /**
   * True if the user who requested this protected range can edit the protected area. This field is
   * read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequestingUserCanEdit() {
    return requestingUserCanEdit;
  }

  /**
   * True if the user who requested this protected range can edit the protected area. This field is
   * read-only.
   * @param requestingUserCanEdit requestingUserCanEdit or {@code null} for none
   */
  public ProtectedRange setRequestingUserCanEdit(java.lang.Boolean requestingUserCanEdit) {
    this.requestingUserCanEdit = requestingUserCanEdit;
    return this;
  }

  /**
   * The list of unprotected ranges within a protected sheet. Unprotected ranges are only supported
   * on protected sheets.
   * @return value or {@code null} for none
   */
  public java.util.List<GridRange> getUnprotectedRanges() {
    return unprotectedRanges;
  }

  /**
   * The list of unprotected ranges within a protected sheet. Unprotected ranges are only supported
   * on protected sheets.
   * @param unprotectedRanges unprotectedRanges or {@code null} for none
   */
  public ProtectedRange setUnprotectedRanges(java.util.List<GridRange> unprotectedRanges) {
    this.unprotectedRanges = unprotectedRanges;
    return this;
  }

  /**
   * True if this protected range will show a warning when editing. Warning-based protection means
   * that every user can edit data in the protected range, except editing will prompt a warning
   * asking the user to confirm the edit. When writing: if this field is true, then editors is
   * ignored. Additionally, if this field is changed from true to false and the `editors` field is
   * not set (nor included in the field mask), then the editors will be set to all the editors in
   * the document.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWarningOnly() {
    return warningOnly;
  }

  /**
   * True if this protected range will show a warning when editing. Warning-based protection means
   * that every user can edit data in the protected range, except editing will prompt a warning
   * asking the user to confirm the edit. When writing: if this field is true, then editors is
   * ignored. Additionally, if this field is changed from true to false and the `editors` field is
   * not set (nor included in the field mask), then the editors will be set to all the editors in
   * the document.
   * @param warningOnly warningOnly or {@code null} for none
   */
  public ProtectedRange setWarningOnly(java.lang.Boolean warningOnly) {
    this.warningOnly = warningOnly;
    return this;
  }

  @Override
  public ProtectedRange set(String fieldName, Object value) {
    return (ProtectedRange) super.set(fieldName, value);
  }

  @Override
  public ProtectedRange clone() {
    return (ProtectedRange) super.clone();
  }

}
