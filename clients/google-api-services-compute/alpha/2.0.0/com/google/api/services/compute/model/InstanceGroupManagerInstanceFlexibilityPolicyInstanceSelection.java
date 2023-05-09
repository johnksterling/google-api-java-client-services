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

package com.google.api.services.compute.model;

/**
 * Model definition for InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection extends com.google.api.client.json.GenericJson {

  /**
   * Full machine-type names, e.g. "n1-standard-16".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> machineTypes;

  /**
   * Preference of this instance selection. Lower number means higher preference. MIG will first try
   * to create a VM based on the machine-type with lowest rank and fallback to next rank based on
   * availability. Machine types and instance selections with the same rank have the same
   * preference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rank;

  /**
   * Full machine-type names, e.g. "n1-standard-16".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMachineTypes() {
    return machineTypes;
  }

  /**
   * Full machine-type names, e.g. "n1-standard-16".
   * @param machineTypes machineTypes or {@code null} for none
   */
  public InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection setMachineTypes(java.util.List<java.lang.String> machineTypes) {
    this.machineTypes = machineTypes;
    return this;
  }

  /**
   * Preference of this instance selection. Lower number means higher preference. MIG will first try
   * to create a VM based on the machine-type with lowest rank and fallback to next rank based on
   * availability. Machine types and instance selections with the same rank have the same
   * preference.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRank() {
    return rank;
  }

  /**
   * Preference of this instance selection. Lower number means higher preference. MIG will first try
   * to create a VM based on the machine-type with lowest rank and fallback to next rank based on
   * availability. Machine types and instance selections with the same rank have the same
   * preference.
   * @param rank rank or {@code null} for none
   */
  public InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection setRank(java.lang.Integer rank) {
    this.rank = rank;
    return this;
  }

  @Override
  public InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection set(String fieldName, Object value) {
    return (InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection clone() {
    return (InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection) super.clone();
  }

}