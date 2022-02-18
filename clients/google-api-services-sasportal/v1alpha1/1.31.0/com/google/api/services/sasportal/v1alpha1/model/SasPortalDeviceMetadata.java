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

package com.google.api.services.sasportal.v1alpha1.model;

/**
 * Device data overridable by both SAS Portal and registration requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalDeviceMetadata extends com.google.api.client.json.GenericJson {

  /**
   * If populated, the Antenna Model Pattern to use. Format is: RecordCreatorId:PatternId
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String antennaModel;

  /**
   * CCG. A group of CBSDs in the same ICG requesting a common primary channel assignment. See
   * CBRSA-TS-2001 V3.0.0 for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commonChannelGroup;

  /**
   * ICG. A group of CBSDs that manage their own interference with the group. See CBRSA-TS-2001
   * V3.0.0 for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interferenceCoordinationGroup;

  /**
   * Output only. Whether a CPI has validated to have coordinated with the National Quiet Zone
   * office.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean nrqzValidated;

  /**
   * If populated, the Antenna Model Pattern to use. Format is: RecordCreatorId:PatternId
   * @return value or {@code null} for none
   */
  public java.lang.String getAntennaModel() {
    return antennaModel;
  }

  /**
   * If populated, the Antenna Model Pattern to use. Format is: RecordCreatorId:PatternId
   * @param antennaModel antennaModel or {@code null} for none
   */
  public SasPortalDeviceMetadata setAntennaModel(java.lang.String antennaModel) {
    this.antennaModel = antennaModel;
    return this;
  }

  /**
   * CCG. A group of CBSDs in the same ICG requesting a common primary channel assignment. See
   * CBRSA-TS-2001 V3.0.0 for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommonChannelGroup() {
    return commonChannelGroup;
  }

  /**
   * CCG. A group of CBSDs in the same ICG requesting a common primary channel assignment. See
   * CBRSA-TS-2001 V3.0.0 for more details.
   * @param commonChannelGroup commonChannelGroup or {@code null} for none
   */
  public SasPortalDeviceMetadata setCommonChannelGroup(java.lang.String commonChannelGroup) {
    this.commonChannelGroup = commonChannelGroup;
    return this;
  }

  /**
   * ICG. A group of CBSDs that manage their own interference with the group. See CBRSA-TS-2001
   * V3.0.0 for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterferenceCoordinationGroup() {
    return interferenceCoordinationGroup;
  }

  /**
   * ICG. A group of CBSDs that manage their own interference with the group. See CBRSA-TS-2001
   * V3.0.0 for more details.
   * @param interferenceCoordinationGroup interferenceCoordinationGroup or {@code null} for none
   */
  public SasPortalDeviceMetadata setInterferenceCoordinationGroup(java.lang.String interferenceCoordinationGroup) {
    this.interferenceCoordinationGroup = interferenceCoordinationGroup;
    return this;
  }

  /**
   * Output only. Whether a CPI has validated to have coordinated with the National Quiet Zone
   * office.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNrqzValidated() {
    return nrqzValidated;
  }

  /**
   * Output only. Whether a CPI has validated to have coordinated with the National Quiet Zone
   * office.
   * @param nrqzValidated nrqzValidated or {@code null} for none
   */
  public SasPortalDeviceMetadata setNrqzValidated(java.lang.Boolean nrqzValidated) {
    this.nrqzValidated = nrqzValidated;
    return this;
  }

  @Override
  public SasPortalDeviceMetadata set(String fieldName, Object value) {
    return (SasPortalDeviceMetadata) super.set(fieldName, value);
  }

  @Override
  public SasPortalDeviceMetadata clone() {
    return (SasPortalDeviceMetadata) super.clone();
  }

}
