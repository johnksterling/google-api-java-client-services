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

package com.google.api.services.androidpublisher.model;

/**
 * A single device tier. Devices matching any of the device groups in device_group_names are
 * considered to match the tier.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceTier extends com.google.api.client.json.GenericJson {

  /**
   * Groups of devices included in this tier. These groups must be defined explicitly under
   * device_groups in this configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> deviceGroupNames;

  /**
   * The priority level of the tier. Tiers are evaluated in descending order of level: the highest
   * level tier has the highest priority. The highest tier matching a given device is selected for
   * that device. You should use a contiguous range of levels for your tiers in a tier set; tier
   * levels in a tier set must be unique. For instance, if your tier set has 4 tiers (including the
   * global fallback), you should define tiers 1, 2 and 3 in this configuration. Note: tier 0 is
   * implicitly defined as a global fallback and selected for devices that don't match any of the
   * tiers explicitly defined here. You mustn't define level 0 explicitly in this configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer level;

  /**
   * Groups of devices included in this tier. These groups must be defined explicitly under
   * device_groups in this configuration.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDeviceGroupNames() {
    return deviceGroupNames;
  }

  /**
   * Groups of devices included in this tier. These groups must be defined explicitly under
   * device_groups in this configuration.
   * @param deviceGroupNames deviceGroupNames or {@code null} for none
   */
  public DeviceTier setDeviceGroupNames(java.util.List<java.lang.String> deviceGroupNames) {
    this.deviceGroupNames = deviceGroupNames;
    return this;
  }

  /**
   * The priority level of the tier. Tiers are evaluated in descending order of level: the highest
   * level tier has the highest priority. The highest tier matching a given device is selected for
   * that device. You should use a contiguous range of levels for your tiers in a tier set; tier
   * levels in a tier set must be unique. For instance, if your tier set has 4 tiers (including the
   * global fallback), you should define tiers 1, 2 and 3 in this configuration. Note: tier 0 is
   * implicitly defined as a global fallback and selected for devices that don't match any of the
   * tiers explicitly defined here. You mustn't define level 0 explicitly in this configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLevel() {
    return level;
  }

  /**
   * The priority level of the tier. Tiers are evaluated in descending order of level: the highest
   * level tier has the highest priority. The highest tier matching a given device is selected for
   * that device. You should use a contiguous range of levels for your tiers in a tier set; tier
   * levels in a tier set must be unique. For instance, if your tier set has 4 tiers (including the
   * global fallback), you should define tiers 1, 2 and 3 in this configuration. Note: tier 0 is
   * implicitly defined as a global fallback and selected for devices that don't match any of the
   * tiers explicitly defined here. You mustn't define level 0 explicitly in this configuration.
   * @param level level or {@code null} for none
   */
  public DeviceTier setLevel(java.lang.Integer level) {
    this.level = level;
    return this;
  }

  @Override
  public DeviceTier set(String fieldName, Object value) {
    return (DeviceTier) super.set(fieldName, value);
  }

  @Override
  public DeviceTier clone() {
    return (DeviceTier) super.clone();
  }

}
