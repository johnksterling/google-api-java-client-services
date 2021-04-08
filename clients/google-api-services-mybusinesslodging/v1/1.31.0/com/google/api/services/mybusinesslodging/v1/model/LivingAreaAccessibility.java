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

package com.google.api.services.mybusinesslodging.v1.model;

/**
 * Accessibility features of the living area.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Lodging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LivingAreaAccessibility extends com.google.api.client.json.GenericJson {

  /**
   * ADA compliant unit. A guestroom designed to accommodate the physical challenges of a guest with
   * mobility and/or auditory and/or visual issues, as determined by legislative policy. Usually
   * features enlarged doorways, roll-in showers with seats, bathroom grab bars, and communication
   * equipment for the hearing and sight challenged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adaCompliantUnit;

  /**
   * ADA compliant unit exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adaCompliantUnitException;

  /**
   * Hearing-accessible doorbell. A visual indicator(s) of a knock or ring at the door.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hearingAccessibleDoorbell;

  /**
   * Hearing-accessible doorbell exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hearingAccessibleDoorbellException;

  /**
   * Hearing-accessible fire alarm. A device that gives warning of a fire through flashing lights.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hearingAccessibleFireAlarm;

  /**
   * Hearing-accessible fire alarm exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hearingAccessibleFireAlarmException;

  /**
   * Hearing-accessible unit. A guestroom designed to accommodate the physical challenges of a guest
   * with auditory issues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hearingAccessibleUnit;

  /**
   * Hearing-accessible unit exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hearingAccessibleUnitException;

  /**
   * Mobility-accessible bathtub. A bathtub that accomodates the physically challenged with
   * additional railings or hand grips, a transfer seat or lift, and/or a door to enable walking
   * into the tub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mobilityAccessibleBathtub;

  /**
   * Mobility-accessible bathtub exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mobilityAccessibleBathtubException;

  /**
   * Mobility-accessible shower. A shower with an enlarged door or access point to accommodate a
   * wheelchair or a waterproof seat for the physically challenged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mobilityAccessibleShower;

  /**
   * Mobility-accessible shower exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mobilityAccessibleShowerException;

  /**
   * Mobility-accessible toilet. A toilet with a higher seat, grab bars, and/or a larger area around
   * it to accommodate the physically challenged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mobilityAccessibleToilet;

  /**
   * Mobility-accessible toilet exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mobilityAccessibleToiletException;

  /**
   * Mobility-accessible unit. A guestroom designed to accommodate the physical challenges of a
   * guest with mobility and/or auditory and/or visual issues. Usually features enlarged doorways,
   * roll-in showers with seats, bathroom grab bars, and communication equipment for the hearing and
   * sight challenged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mobilityAccessibleUnit;

  /**
   * Mobility-accessible unit exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mobilityAccessibleUnitException;

  /**
   * ADA compliant unit. A guestroom designed to accommodate the physical challenges of a guest with
   * mobility and/or auditory and/or visual issues, as determined by legislative policy. Usually
   * features enlarged doorways, roll-in showers with seats, bathroom grab bars, and communication
   * equipment for the hearing and sight challenged.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdaCompliantUnit() {
    return adaCompliantUnit;
  }

  /**
   * ADA compliant unit. A guestroom designed to accommodate the physical challenges of a guest with
   * mobility and/or auditory and/or visual issues, as determined by legislative policy. Usually
   * features enlarged doorways, roll-in showers with seats, bathroom grab bars, and communication
   * equipment for the hearing and sight challenged.
   * @param adaCompliantUnit adaCompliantUnit or {@code null} for none
   */
  public LivingAreaAccessibility setAdaCompliantUnit(java.lang.Boolean adaCompliantUnit) {
    this.adaCompliantUnit = adaCompliantUnit;
    return this;
  }

  /**
   * ADA compliant unit exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdaCompliantUnitException() {
    return adaCompliantUnitException;
  }

  /**
   * ADA compliant unit exception.
   * @param adaCompliantUnitException adaCompliantUnitException or {@code null} for none
   */
  public LivingAreaAccessibility setAdaCompliantUnitException(java.lang.String adaCompliantUnitException) {
    this.adaCompliantUnitException = adaCompliantUnitException;
    return this;
  }

  /**
   * Hearing-accessible doorbell. A visual indicator(s) of a knock or ring at the door.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHearingAccessibleDoorbell() {
    return hearingAccessibleDoorbell;
  }

  /**
   * Hearing-accessible doorbell. A visual indicator(s) of a knock or ring at the door.
   * @param hearingAccessibleDoorbell hearingAccessibleDoorbell or {@code null} for none
   */
  public LivingAreaAccessibility setHearingAccessibleDoorbell(java.lang.Boolean hearingAccessibleDoorbell) {
    this.hearingAccessibleDoorbell = hearingAccessibleDoorbell;
    return this;
  }

  /**
   * Hearing-accessible doorbell exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getHearingAccessibleDoorbellException() {
    return hearingAccessibleDoorbellException;
  }

  /**
   * Hearing-accessible doorbell exception.
   * @param hearingAccessibleDoorbellException hearingAccessibleDoorbellException or {@code null} for none
   */
  public LivingAreaAccessibility setHearingAccessibleDoorbellException(java.lang.String hearingAccessibleDoorbellException) {
    this.hearingAccessibleDoorbellException = hearingAccessibleDoorbellException;
    return this;
  }

  /**
   * Hearing-accessible fire alarm. A device that gives warning of a fire through flashing lights.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHearingAccessibleFireAlarm() {
    return hearingAccessibleFireAlarm;
  }

  /**
   * Hearing-accessible fire alarm. A device that gives warning of a fire through flashing lights.
   * @param hearingAccessibleFireAlarm hearingAccessibleFireAlarm or {@code null} for none
   */
  public LivingAreaAccessibility setHearingAccessibleFireAlarm(java.lang.Boolean hearingAccessibleFireAlarm) {
    this.hearingAccessibleFireAlarm = hearingAccessibleFireAlarm;
    return this;
  }

  /**
   * Hearing-accessible fire alarm exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getHearingAccessibleFireAlarmException() {
    return hearingAccessibleFireAlarmException;
  }

  /**
   * Hearing-accessible fire alarm exception.
   * @param hearingAccessibleFireAlarmException hearingAccessibleFireAlarmException or {@code null} for none
   */
  public LivingAreaAccessibility setHearingAccessibleFireAlarmException(java.lang.String hearingAccessibleFireAlarmException) {
    this.hearingAccessibleFireAlarmException = hearingAccessibleFireAlarmException;
    return this;
  }

  /**
   * Hearing-accessible unit. A guestroom designed to accommodate the physical challenges of a guest
   * with auditory issues.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHearingAccessibleUnit() {
    return hearingAccessibleUnit;
  }

  /**
   * Hearing-accessible unit. A guestroom designed to accommodate the physical challenges of a guest
   * with auditory issues.
   * @param hearingAccessibleUnit hearingAccessibleUnit or {@code null} for none
   */
  public LivingAreaAccessibility setHearingAccessibleUnit(java.lang.Boolean hearingAccessibleUnit) {
    this.hearingAccessibleUnit = hearingAccessibleUnit;
    return this;
  }

  /**
   * Hearing-accessible unit exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getHearingAccessibleUnitException() {
    return hearingAccessibleUnitException;
  }

  /**
   * Hearing-accessible unit exception.
   * @param hearingAccessibleUnitException hearingAccessibleUnitException or {@code null} for none
   */
  public LivingAreaAccessibility setHearingAccessibleUnitException(java.lang.String hearingAccessibleUnitException) {
    this.hearingAccessibleUnitException = hearingAccessibleUnitException;
    return this;
  }

  /**
   * Mobility-accessible bathtub. A bathtub that accomodates the physically challenged with
   * additional railings or hand grips, a transfer seat or lift, and/or a door to enable walking
   * into the tub.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMobilityAccessibleBathtub() {
    return mobilityAccessibleBathtub;
  }

  /**
   * Mobility-accessible bathtub. A bathtub that accomodates the physically challenged with
   * additional railings or hand grips, a transfer seat or lift, and/or a door to enable walking
   * into the tub.
   * @param mobilityAccessibleBathtub mobilityAccessibleBathtub or {@code null} for none
   */
  public LivingAreaAccessibility setMobilityAccessibleBathtub(java.lang.Boolean mobilityAccessibleBathtub) {
    this.mobilityAccessibleBathtub = mobilityAccessibleBathtub;
    return this;
  }

  /**
   * Mobility-accessible bathtub exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getMobilityAccessibleBathtubException() {
    return mobilityAccessibleBathtubException;
  }

  /**
   * Mobility-accessible bathtub exception.
   * @param mobilityAccessibleBathtubException mobilityAccessibleBathtubException or {@code null} for none
   */
  public LivingAreaAccessibility setMobilityAccessibleBathtubException(java.lang.String mobilityAccessibleBathtubException) {
    this.mobilityAccessibleBathtubException = mobilityAccessibleBathtubException;
    return this;
  }

  /**
   * Mobility-accessible shower. A shower with an enlarged door or access point to accommodate a
   * wheelchair or a waterproof seat for the physically challenged.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMobilityAccessibleShower() {
    return mobilityAccessibleShower;
  }

  /**
   * Mobility-accessible shower. A shower with an enlarged door or access point to accommodate a
   * wheelchair or a waterproof seat for the physically challenged.
   * @param mobilityAccessibleShower mobilityAccessibleShower or {@code null} for none
   */
  public LivingAreaAccessibility setMobilityAccessibleShower(java.lang.Boolean mobilityAccessibleShower) {
    this.mobilityAccessibleShower = mobilityAccessibleShower;
    return this;
  }

  /**
   * Mobility-accessible shower exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getMobilityAccessibleShowerException() {
    return mobilityAccessibleShowerException;
  }

  /**
   * Mobility-accessible shower exception.
   * @param mobilityAccessibleShowerException mobilityAccessibleShowerException or {@code null} for none
   */
  public LivingAreaAccessibility setMobilityAccessibleShowerException(java.lang.String mobilityAccessibleShowerException) {
    this.mobilityAccessibleShowerException = mobilityAccessibleShowerException;
    return this;
  }

  /**
   * Mobility-accessible toilet. A toilet with a higher seat, grab bars, and/or a larger area around
   * it to accommodate the physically challenged.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMobilityAccessibleToilet() {
    return mobilityAccessibleToilet;
  }

  /**
   * Mobility-accessible toilet. A toilet with a higher seat, grab bars, and/or a larger area around
   * it to accommodate the physically challenged.
   * @param mobilityAccessibleToilet mobilityAccessibleToilet or {@code null} for none
   */
  public LivingAreaAccessibility setMobilityAccessibleToilet(java.lang.Boolean mobilityAccessibleToilet) {
    this.mobilityAccessibleToilet = mobilityAccessibleToilet;
    return this;
  }

  /**
   * Mobility-accessible toilet exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getMobilityAccessibleToiletException() {
    return mobilityAccessibleToiletException;
  }

  /**
   * Mobility-accessible toilet exception.
   * @param mobilityAccessibleToiletException mobilityAccessibleToiletException or {@code null} for none
   */
  public LivingAreaAccessibility setMobilityAccessibleToiletException(java.lang.String mobilityAccessibleToiletException) {
    this.mobilityAccessibleToiletException = mobilityAccessibleToiletException;
    return this;
  }

  /**
   * Mobility-accessible unit. A guestroom designed to accommodate the physical challenges of a
   * guest with mobility and/or auditory and/or visual issues. Usually features enlarged doorways,
   * roll-in showers with seats, bathroom grab bars, and communication equipment for the hearing and
   * sight challenged.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMobilityAccessibleUnit() {
    return mobilityAccessibleUnit;
  }

  /**
   * Mobility-accessible unit. A guestroom designed to accommodate the physical challenges of a
   * guest with mobility and/or auditory and/or visual issues. Usually features enlarged doorways,
   * roll-in showers with seats, bathroom grab bars, and communication equipment for the hearing and
   * sight challenged.
   * @param mobilityAccessibleUnit mobilityAccessibleUnit or {@code null} for none
   */
  public LivingAreaAccessibility setMobilityAccessibleUnit(java.lang.Boolean mobilityAccessibleUnit) {
    this.mobilityAccessibleUnit = mobilityAccessibleUnit;
    return this;
  }

  /**
   * Mobility-accessible unit exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getMobilityAccessibleUnitException() {
    return mobilityAccessibleUnitException;
  }

  /**
   * Mobility-accessible unit exception.
   * @param mobilityAccessibleUnitException mobilityAccessibleUnitException or {@code null} for none
   */
  public LivingAreaAccessibility setMobilityAccessibleUnitException(java.lang.String mobilityAccessibleUnitException) {
    this.mobilityAccessibleUnitException = mobilityAccessibleUnitException;
    return this;
  }

  @Override
  public LivingAreaAccessibility set(String fieldName, Object value) {
    return (LivingAreaAccessibility) super.set(fieldName, value);
  }

  @Override
  public LivingAreaAccessibility clone() {
    return (LivingAreaAccessibility) super.clone();
  }

}
