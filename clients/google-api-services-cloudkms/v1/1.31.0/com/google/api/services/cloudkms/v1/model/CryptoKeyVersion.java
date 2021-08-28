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

package com.google.api.services.cloudkms.v1.model;

/**
 * A CryptoKeyVersion represents an individual cryptographic key, and the associated key material.
 * An ENABLED version can be used for cryptographic operations. For security reasons, the raw
 * cryptographic key material represented by a CryptoKeyVersion can never be viewed or exported. It
 * can only be used to encrypt, decrypt, or sign data when an authorized user or application invokes
 * Cloud KMS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CryptoKeyVersion extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String algorithm;

  /**
   * Output only. Statement that was generated and signed by the HSM at key creation time. Use this
   * statement to verify attributes of the key as stored on the HSM, independently of Google. Only
   * provided for key versions with protection_level HSM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KeyOperationAttestation attestation;

  /**
   * Output only. The time at which this CryptoKeyVersion was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time this CryptoKeyVersion's key material was destroyed. Only present if state
   * is DESTROYED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String destroyEventTime;

  /**
   * Output only. The time this CryptoKeyVersion's key material is scheduled for destruction. Only
   * present if state is DESTROY_SCHEDULED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String destroyTime;

  /**
   * ExternalProtectionLevelOptions stores a group of additional fields for configuring a
   * CryptoKeyVersion that are specific to the EXTERNAL protection level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExternalProtectionLevelOptions externalProtectionLevelOptions;

  /**
   * Output only. The time this CryptoKeyVersion's key material was generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String generateTime;

  /**
   * Output only. The root cause of the most recent import failure. Only present if state is
   * IMPORT_FAILED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importFailureReason;

  /**
   * Output only. The name of the ImportJob used in the most recent import of this CryptoKeyVersion.
   * Only present if the underlying key material was imported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importJob;

  /**
   * Output only. The time at which this CryptoKeyVersion's key material was most recently imported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String importTime;

  /**
   * Output only. The resource name for this CryptoKeyVersion in the format
   * `projects/locations/keyRings/cryptoKeys/cryptoKeyVersions`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The ProtectionLevel describing how crypto operations are performed with this
   * CryptoKeyVersion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protectionLevel;

  /**
   * Output only. Whether or not this key version is eligible for reimport, by being specified as a
   * target in ImportCryptoKeyVersionRequest.crypto_key_version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reimportEligible;

  /**
   * The current state of the CryptoKeyVersion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlgorithm() {
    return algorithm;
  }

  /**
   * Output only. The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
   * @param algorithm algorithm or {@code null} for none
   */
  public CryptoKeyVersion setAlgorithm(java.lang.String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Output only. Statement that was generated and signed by the HSM at key creation time. Use this
   * statement to verify attributes of the key as stored on the HSM, independently of Google. Only
   * provided for key versions with protection_level HSM.
   * @return value or {@code null} for none
   */
  public KeyOperationAttestation getAttestation() {
    return attestation;
  }

  /**
   * Output only. Statement that was generated and signed by the HSM at key creation time. Use this
   * statement to verify attributes of the key as stored on the HSM, independently of Google. Only
   * provided for key versions with protection_level HSM.
   * @param attestation attestation or {@code null} for none
   */
  public CryptoKeyVersion setAttestation(KeyOperationAttestation attestation) {
    this.attestation = attestation;
    return this;
  }

  /**
   * Output only. The time at which this CryptoKeyVersion was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which this CryptoKeyVersion was created.
   * @param createTime createTime or {@code null} for none
   */
  public CryptoKeyVersion setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time this CryptoKeyVersion's key material was destroyed. Only present if state
   * is DESTROYED.
   * @return value or {@code null} for none
   */
  public String getDestroyEventTime() {
    return destroyEventTime;
  }

  /**
   * Output only. The time this CryptoKeyVersion's key material was destroyed. Only present if state
   * is DESTROYED.
   * @param destroyEventTime destroyEventTime or {@code null} for none
   */
  public CryptoKeyVersion setDestroyEventTime(String destroyEventTime) {
    this.destroyEventTime = destroyEventTime;
    return this;
  }

  /**
   * Output only. The time this CryptoKeyVersion's key material is scheduled for destruction. Only
   * present if state is DESTROY_SCHEDULED.
   * @return value or {@code null} for none
   */
  public String getDestroyTime() {
    return destroyTime;
  }

  /**
   * Output only. The time this CryptoKeyVersion's key material is scheduled for destruction. Only
   * present if state is DESTROY_SCHEDULED.
   * @param destroyTime destroyTime or {@code null} for none
   */
  public CryptoKeyVersion setDestroyTime(String destroyTime) {
    this.destroyTime = destroyTime;
    return this;
  }

  /**
   * ExternalProtectionLevelOptions stores a group of additional fields for configuring a
   * CryptoKeyVersion that are specific to the EXTERNAL protection level.
   * @return value or {@code null} for none
   */
  public ExternalProtectionLevelOptions getExternalProtectionLevelOptions() {
    return externalProtectionLevelOptions;
  }

  /**
   * ExternalProtectionLevelOptions stores a group of additional fields for configuring a
   * CryptoKeyVersion that are specific to the EXTERNAL protection level.
   * @param externalProtectionLevelOptions externalProtectionLevelOptions or {@code null} for none
   */
  public CryptoKeyVersion setExternalProtectionLevelOptions(ExternalProtectionLevelOptions externalProtectionLevelOptions) {
    this.externalProtectionLevelOptions = externalProtectionLevelOptions;
    return this;
  }

  /**
   * Output only. The time this CryptoKeyVersion's key material was generated.
   * @return value or {@code null} for none
   */
  public String getGenerateTime() {
    return generateTime;
  }

  /**
   * Output only. The time this CryptoKeyVersion's key material was generated.
   * @param generateTime generateTime or {@code null} for none
   */
  public CryptoKeyVersion setGenerateTime(String generateTime) {
    this.generateTime = generateTime;
    return this;
  }

  /**
   * Output only. The root cause of the most recent import failure. Only present if state is
   * IMPORT_FAILED.
   * @return value or {@code null} for none
   */
  public java.lang.String getImportFailureReason() {
    return importFailureReason;
  }

  /**
   * Output only. The root cause of the most recent import failure. Only present if state is
   * IMPORT_FAILED.
   * @param importFailureReason importFailureReason or {@code null} for none
   */
  public CryptoKeyVersion setImportFailureReason(java.lang.String importFailureReason) {
    this.importFailureReason = importFailureReason;
    return this;
  }

  /**
   * Output only. The name of the ImportJob used in the most recent import of this CryptoKeyVersion.
   * Only present if the underlying key material was imported.
   * @return value or {@code null} for none
   */
  public java.lang.String getImportJob() {
    return importJob;
  }

  /**
   * Output only. The name of the ImportJob used in the most recent import of this CryptoKeyVersion.
   * Only present if the underlying key material was imported.
   * @param importJob importJob or {@code null} for none
   */
  public CryptoKeyVersion setImportJob(java.lang.String importJob) {
    this.importJob = importJob;
    return this;
  }

  /**
   * Output only. The time at which this CryptoKeyVersion's key material was most recently imported.
   * @return value or {@code null} for none
   */
  public String getImportTime() {
    return importTime;
  }

  /**
   * Output only. The time at which this CryptoKeyVersion's key material was most recently imported.
   * @param importTime importTime or {@code null} for none
   */
  public CryptoKeyVersion setImportTime(String importTime) {
    this.importTime = importTime;
    return this;
  }

  /**
   * Output only. The resource name for this CryptoKeyVersion in the format
   * `projects/locations/keyRings/cryptoKeys/cryptoKeyVersions`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name for this CryptoKeyVersion in the format
   * `projects/locations/keyRings/cryptoKeys/cryptoKeyVersions`.
   * @param name name or {@code null} for none
   */
  public CryptoKeyVersion setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The ProtectionLevel describing how crypto operations are performed with this
   * CryptoKeyVersion.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtectionLevel() {
    return protectionLevel;
  }

  /**
   * Output only. The ProtectionLevel describing how crypto operations are performed with this
   * CryptoKeyVersion.
   * @param protectionLevel protectionLevel or {@code null} for none
   */
  public CryptoKeyVersion setProtectionLevel(java.lang.String protectionLevel) {
    this.protectionLevel = protectionLevel;
    return this;
  }

  /**
   * Output only. Whether or not this key version is eligible for reimport, by being specified as a
   * target in ImportCryptoKeyVersionRequest.crypto_key_version.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReimportEligible() {
    return reimportEligible;
  }

  /**
   * Output only. Whether or not this key version is eligible for reimport, by being specified as a
   * target in ImportCryptoKeyVersionRequest.crypto_key_version.
   * @param reimportEligible reimportEligible or {@code null} for none
   */
  public CryptoKeyVersion setReimportEligible(java.lang.Boolean reimportEligible) {
    this.reimportEligible = reimportEligible;
    return this;
  }

  /**
   * The current state of the CryptoKeyVersion.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the CryptoKeyVersion.
   * @param state state or {@code null} for none
   */
  public CryptoKeyVersion setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public CryptoKeyVersion set(String fieldName, Object value) {
    return (CryptoKeyVersion) super.set(fieldName, value);
  }

  @Override
  public CryptoKeyVersion clone() {
    return (CryptoKeyVersion) super.clone();
  }

}
