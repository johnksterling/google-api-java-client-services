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

package com.google.api.services.dlp.v2.model;

/**
 * A rule for transforming a value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2PrimitiveTransformation extends com.google.api.client.json.GenericJson {

  /**
   * Bucketing
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BucketingConfig bucketingConfig;

  /**
   * Mask
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CharacterMaskConfig characterMaskConfig;

  /**
   * Deterministic Crypto
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoDeterministicConfig cryptoDeterministicConfig;

  /**
   * Crypto
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoHashConfig cryptoHashConfig;

  /**
   * Ffx-Fpe
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig cryptoReplaceFfxFpeConfig;

  /**
   * Date Shift
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DateShiftConfig dateShiftConfig;

  /**
   * Fixed size bucketing
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FixedSizeBucketingConfig fixedSizeBucketingConfig;

  /**
   * Redact
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2RedactConfig redactConfig;

  /**
   * Replace with a specified value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ReplaceValueConfig replaceConfig;

  /**
   * Replace with a value randomly drawn (with replacement) from a dictionary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ReplaceDictionaryConfig replaceDictionaryConfig;

  /**
   * Replace with infotype
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ReplaceWithInfoTypeConfig replaceWithInfoTypeConfig;

  /**
   * Time extraction
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TimePartConfig timePartConfig;

  /**
   * Bucketing
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BucketingConfig getBucketingConfig() {
    return bucketingConfig;
  }

  /**
   * Bucketing
   * @param bucketingConfig bucketingConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setBucketingConfig(GooglePrivacyDlpV2BucketingConfig bucketingConfig) {
    this.bucketingConfig = bucketingConfig;
    return this;
  }

  /**
   * Mask
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CharacterMaskConfig getCharacterMaskConfig() {
    return characterMaskConfig;
  }

  /**
   * Mask
   * @param characterMaskConfig characterMaskConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setCharacterMaskConfig(GooglePrivacyDlpV2CharacterMaskConfig characterMaskConfig) {
    this.characterMaskConfig = characterMaskConfig;
    return this;
  }

  /**
   * Deterministic Crypto
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoDeterministicConfig getCryptoDeterministicConfig() {
    return cryptoDeterministicConfig;
  }

  /**
   * Deterministic Crypto
   * @param cryptoDeterministicConfig cryptoDeterministicConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setCryptoDeterministicConfig(GooglePrivacyDlpV2CryptoDeterministicConfig cryptoDeterministicConfig) {
    this.cryptoDeterministicConfig = cryptoDeterministicConfig;
    return this;
  }

  /**
   * Crypto
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoHashConfig getCryptoHashConfig() {
    return cryptoHashConfig;
  }

  /**
   * Crypto
   * @param cryptoHashConfig cryptoHashConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setCryptoHashConfig(GooglePrivacyDlpV2CryptoHashConfig cryptoHashConfig) {
    this.cryptoHashConfig = cryptoHashConfig;
    return this;
  }

  /**
   * Ffx-Fpe
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig getCryptoReplaceFfxFpeConfig() {
    return cryptoReplaceFfxFpeConfig;
  }

  /**
   * Ffx-Fpe
   * @param cryptoReplaceFfxFpeConfig cryptoReplaceFfxFpeConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setCryptoReplaceFfxFpeConfig(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig cryptoReplaceFfxFpeConfig) {
    this.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
    return this;
  }

  /**
   * Date Shift
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DateShiftConfig getDateShiftConfig() {
    return dateShiftConfig;
  }

  /**
   * Date Shift
   * @param dateShiftConfig dateShiftConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setDateShiftConfig(GooglePrivacyDlpV2DateShiftConfig dateShiftConfig) {
    this.dateShiftConfig = dateShiftConfig;
    return this;
  }

  /**
   * Fixed size bucketing
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FixedSizeBucketingConfig getFixedSizeBucketingConfig() {
    return fixedSizeBucketingConfig;
  }

  /**
   * Fixed size bucketing
   * @param fixedSizeBucketingConfig fixedSizeBucketingConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setFixedSizeBucketingConfig(GooglePrivacyDlpV2FixedSizeBucketingConfig fixedSizeBucketingConfig) {
    this.fixedSizeBucketingConfig = fixedSizeBucketingConfig;
    return this;
  }

  /**
   * Redact
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2RedactConfig getRedactConfig() {
    return redactConfig;
  }

  /**
   * Redact
   * @param redactConfig redactConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setRedactConfig(GooglePrivacyDlpV2RedactConfig redactConfig) {
    this.redactConfig = redactConfig;
    return this;
  }

  /**
   * Replace with a specified value.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ReplaceValueConfig getReplaceConfig() {
    return replaceConfig;
  }

  /**
   * Replace with a specified value.
   * @param replaceConfig replaceConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setReplaceConfig(GooglePrivacyDlpV2ReplaceValueConfig replaceConfig) {
    this.replaceConfig = replaceConfig;
    return this;
  }

  /**
   * Replace with a value randomly drawn (with replacement) from a dictionary.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ReplaceDictionaryConfig getReplaceDictionaryConfig() {
    return replaceDictionaryConfig;
  }

  /**
   * Replace with a value randomly drawn (with replacement) from a dictionary.
   * @param replaceDictionaryConfig replaceDictionaryConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setReplaceDictionaryConfig(GooglePrivacyDlpV2ReplaceDictionaryConfig replaceDictionaryConfig) {
    this.replaceDictionaryConfig = replaceDictionaryConfig;
    return this;
  }

  /**
   * Replace with infotype
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ReplaceWithInfoTypeConfig getReplaceWithInfoTypeConfig() {
    return replaceWithInfoTypeConfig;
  }

  /**
   * Replace with infotype
   * @param replaceWithInfoTypeConfig replaceWithInfoTypeConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setReplaceWithInfoTypeConfig(GooglePrivacyDlpV2ReplaceWithInfoTypeConfig replaceWithInfoTypeConfig) {
    this.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
    return this;
  }

  /**
   * Time extraction
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TimePartConfig getTimePartConfig() {
    return timePartConfig;
  }

  /**
   * Time extraction
   * @param timePartConfig timePartConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setTimePartConfig(GooglePrivacyDlpV2TimePartConfig timePartConfig) {
    this.timePartConfig = timePartConfig;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2PrimitiveTransformation set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2PrimitiveTransformation) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2PrimitiveTransformation clone() {
    return (GooglePrivacyDlpV2PrimitiveTransformation) super.clone();
  }

}
