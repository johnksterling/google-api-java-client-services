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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * PackageInfoNote represents an SPDX Package Information section: https://spdx.github.io/spdx-
 * spec/3-package-information/
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PackageInfoNote extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether the file content of this package has been available for or subjected to
   * analysis when creating the SPDX document
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean analyzed;

  /**
   * A place for the SPDX data creator to record, at the package level, acknowledgements that may be
   * needed to be communicated in some contexts
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attribution;

  /**
   * Provide an independently reproducible mechanism that permits unique identification of a
   * specific package that correlates to the data in this SPDX file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String checksum;

  /**
   * Identify the copyright holders of the package, as well as any dates present
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String copyright;

  /**
   * A more detailed description of the package
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detailedDescription;

  /**
   * This section identifies the download Universal Resource Locator (URL), or a specific location
   * within a version control system (VCS) for the package at the time that the SPDX file was
   * created
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadLocation;

  /**
   * ExternalRef
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExternalRef> externalRefs;

  static {
    // hack to force ProGuard to consider ExternalRef used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ExternalRef.class);
  }

  /**
   * Contain the license the SPDX file creator has concluded as governing the This field is to
   * contain a list of all licenses found in the package. The relationship between licenses (i.e.,
   * conjunctive, disjunctive) is not specified in this field – it is simply a listing of all
   * licenses found
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> filesLicenseInfo;

  /**
   * Provide a place for the SPDX file creator to record a web site that serves as the package's
   * home page
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String homePage;

  /**
   * List the licenses that have been declared by the authors of the package
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private License licenseDeclared;

  /**
   * If the package identified in the SPDX file originated from a different person or organization
   * than identified as Package Supplier, this field identifies from where or whom the package
   * originally came
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originator;

  /**
   * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageType;

  /**
   * A short description of the package
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String summaryDescription;

  /**
   * Identify the actual distribution source for the package/directory identified in the SPDX file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String supplier;

  /**
   * Identify the full name of the package as given by the Package Originator
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * This field provides an independently reproducible mechanism identifying specific contents of a
   * package based on the actual files (except the SPDX file itself, if it is included in the
   * package) that make up each package and that correlates to the data in this SPDX file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verificationCode;

  /**
   * Identify the version of the package
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Indicates whether the file content of this package has been available for or subjected to
   * analysis when creating the SPDX document
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAnalyzed() {
    return analyzed;
  }

  /**
   * Indicates whether the file content of this package has been available for or subjected to
   * analysis when creating the SPDX document
   * @param analyzed analyzed or {@code null} for none
   */
  public PackageInfoNote setAnalyzed(java.lang.Boolean analyzed) {
    this.analyzed = analyzed;
    return this;
  }

  /**
   * A place for the SPDX data creator to record, at the package level, acknowledgements that may be
   * needed to be communicated in some contexts
   * @return value or {@code null} for none
   */
  public java.lang.String getAttribution() {
    return attribution;
  }

  /**
   * A place for the SPDX data creator to record, at the package level, acknowledgements that may be
   * needed to be communicated in some contexts
   * @param attribution attribution or {@code null} for none
   */
  public PackageInfoNote setAttribution(java.lang.String attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * Provide an independently reproducible mechanism that permits unique identification of a
   * specific package that correlates to the data in this SPDX file
   * @return value or {@code null} for none
   */
  public java.lang.String getChecksum() {
    return checksum;
  }

  /**
   * Provide an independently reproducible mechanism that permits unique identification of a
   * specific package that correlates to the data in this SPDX file
   * @param checksum checksum or {@code null} for none
   */
  public PackageInfoNote setChecksum(java.lang.String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Identify the copyright holders of the package, as well as any dates present
   * @return value or {@code null} for none
   */
  public java.lang.String getCopyright() {
    return copyright;
  }

  /**
   * Identify the copyright holders of the package, as well as any dates present
   * @param copyright copyright or {@code null} for none
   */
  public PackageInfoNote setCopyright(java.lang.String copyright) {
    this.copyright = copyright;
    return this;
  }

  /**
   * A more detailed description of the package
   * @return value or {@code null} for none
   */
  public java.lang.String getDetailedDescription() {
    return detailedDescription;
  }

  /**
   * A more detailed description of the package
   * @param detailedDescription detailedDescription or {@code null} for none
   */
  public PackageInfoNote setDetailedDescription(java.lang.String detailedDescription) {
    this.detailedDescription = detailedDescription;
    return this;
  }

  /**
   * This section identifies the download Universal Resource Locator (URL), or a specific location
   * within a version control system (VCS) for the package at the time that the SPDX file was
   * created
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadLocation() {
    return downloadLocation;
  }

  /**
   * This section identifies the download Universal Resource Locator (URL), or a specific location
   * within a version control system (VCS) for the package at the time that the SPDX file was
   * created
   * @param downloadLocation downloadLocation or {@code null} for none
   */
  public PackageInfoNote setDownloadLocation(java.lang.String downloadLocation) {
    this.downloadLocation = downloadLocation;
    return this;
  }

  /**
   * ExternalRef
   * @return value or {@code null} for none
   */
  public java.util.List<ExternalRef> getExternalRefs() {
    return externalRefs;
  }

  /**
   * ExternalRef
   * @param externalRefs externalRefs or {@code null} for none
   */
  public PackageInfoNote setExternalRefs(java.util.List<ExternalRef> externalRefs) {
    this.externalRefs = externalRefs;
    return this;
  }

  /**
   * Contain the license the SPDX file creator has concluded as governing the This field is to
   * contain a list of all licenses found in the package. The relationship between licenses (i.e.,
   * conjunctive, disjunctive) is not specified in this field – it is simply a listing of all
   * licenses found
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFilesLicenseInfo() {
    return filesLicenseInfo;
  }

  /**
   * Contain the license the SPDX file creator has concluded as governing the This field is to
   * contain a list of all licenses found in the package. The relationship between licenses (i.e.,
   * conjunctive, disjunctive) is not specified in this field – it is simply a listing of all
   * licenses found
   * @param filesLicenseInfo filesLicenseInfo or {@code null} for none
   */
  public PackageInfoNote setFilesLicenseInfo(java.util.List<java.lang.String> filesLicenseInfo) {
    this.filesLicenseInfo = filesLicenseInfo;
    return this;
  }

  /**
   * Provide a place for the SPDX file creator to record a web site that serves as the package's
   * home page
   * @return value or {@code null} for none
   */
  public java.lang.String getHomePage() {
    return homePage;
  }

  /**
   * Provide a place for the SPDX file creator to record a web site that serves as the package's
   * home page
   * @param homePage homePage or {@code null} for none
   */
  public PackageInfoNote setHomePage(java.lang.String homePage) {
    this.homePage = homePage;
    return this;
  }

  /**
   * List the licenses that have been declared by the authors of the package
   * @return value or {@code null} for none
   */
  public License getLicenseDeclared() {
    return licenseDeclared;
  }

  /**
   * List the licenses that have been declared by the authors of the package
   * @param licenseDeclared licenseDeclared or {@code null} for none
   */
  public PackageInfoNote setLicenseDeclared(License licenseDeclared) {
    this.licenseDeclared = licenseDeclared;
    return this;
  }

  /**
   * If the package identified in the SPDX file originated from a different person or organization
   * than identified as Package Supplier, this field identifies from where or whom the package
   * originally came
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginator() {
    return originator;
  }

  /**
   * If the package identified in the SPDX file originated from a different person or organization
   * than identified as Package Supplier, this field identifies from where or whom the package
   * originally came
   * @param originator originator or {@code null} for none
   */
  public PackageInfoNote setOriginator(java.lang.String originator) {
    this.originator = originator;
    return this;
  }

  /**
   * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageType() {
    return packageType;
  }

  /**
   * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
   * @param packageType packageType or {@code null} for none
   */
  public PackageInfoNote setPackageType(java.lang.String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * A short description of the package
   * @return value or {@code null} for none
   */
  public java.lang.String getSummaryDescription() {
    return summaryDescription;
  }

  /**
   * A short description of the package
   * @param summaryDescription summaryDescription or {@code null} for none
   */
  public PackageInfoNote setSummaryDescription(java.lang.String summaryDescription) {
    this.summaryDescription = summaryDescription;
    return this;
  }

  /**
   * Identify the actual distribution source for the package/directory identified in the SPDX file
   * @return value or {@code null} for none
   */
  public java.lang.String getSupplier() {
    return supplier;
  }

  /**
   * Identify the actual distribution source for the package/directory identified in the SPDX file
   * @param supplier supplier or {@code null} for none
   */
  public PackageInfoNote setSupplier(java.lang.String supplier) {
    this.supplier = supplier;
    return this;
  }

  /**
   * Identify the full name of the package as given by the Package Originator
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Identify the full name of the package as given by the Package Originator
   * @param title title or {@code null} for none
   */
  public PackageInfoNote setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * This field provides an independently reproducible mechanism identifying specific contents of a
   * package based on the actual files (except the SPDX file itself, if it is included in the
   * package) that make up each package and that correlates to the data in this SPDX file
   * @return value or {@code null} for none
   */
  public java.lang.String getVerificationCode() {
    return verificationCode;
  }

  /**
   * This field provides an independently reproducible mechanism identifying specific contents of a
   * package based on the actual files (except the SPDX file itself, if it is included in the
   * package) that make up each package and that correlates to the data in this SPDX file
   * @param verificationCode verificationCode or {@code null} for none
   */
  public PackageInfoNote setVerificationCode(java.lang.String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

  /**
   * Identify the version of the package
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Identify the version of the package
   * @param version version or {@code null} for none
   */
  public PackageInfoNote setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public PackageInfoNote set(String fieldName, Object value) {
    return (PackageInfoNote) super.set(fieldName, value);
  }

  @Override
  public PackageInfoNote clone() {
    return (PackageInfoNote) super.clone();
  }

}
