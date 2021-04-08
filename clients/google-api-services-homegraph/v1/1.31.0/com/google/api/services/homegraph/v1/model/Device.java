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

package com.google.api.services.homegraph.v1.model;

/**
 * Third-party device definition. Next ID = 14
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the HomeGraph API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Device extends com.google.api.client.json.GenericJson {

  /**
   * Attributes for the traits supported by the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> attributes;

  /**
   * Custom device attributes stored in Home Graph and provided to your smart home Action in each
   * [QUERY](https://developers.google.com/assistant/smarthome/reference/intent/query) and
   * [EXECUTE](https://developers.google.com/assistant/smarthome/reference/intent/execute) intent.
   * Data in this object has a few constraints: No sensitive information, including but not limited
   * to Personally Identifiable Information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> customData;

  /**
   * Device manufacturer, model, hardware version, and software version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceInfo deviceInfo;

  /**
   * Third-party device ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Names given to this device by your smart home Action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceNames name;

  /**
   * Indicates whether your smart home Action will report notifications to Google for this device
   * via ReportStateAndNotification. If your smart home Action enables users to control device
   * notifications, you should update this field and call RequestSyncDevices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean notificationSupportedByAgent;

  /**
   * Alternate IDs associated with this device. This is used to identify cloud synced devices
   * enabled for [local
   * fulfillment](https://developers.google.com/assistant/smarthome/concepts/local).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AgentOtherDeviceId> otherDeviceIds;

  static {
    // hack to force ProGuard to consider AgentOtherDeviceId used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AgentOtherDeviceId.class);
  }

  /**
   * Suggested name for the room where this device is installed. Google attempts to use this value
   * during user setup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roomHint;

  /**
   * Suggested name for the structure where this device is installed. Google attempts to use this
   * value during user setup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String structureHint;

  /**
   * Traits supported by the device. See [device
   * traits](https://developers.google.com/assistant/smarthome/traits).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> traits;

  /**
   * Hardware type of the device. See [device
   * types](https://developers.google.com/assistant/smarthome/guides).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Indicates whether your smart home Action will report state of this device to Google via
   * ReportStateAndNotification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean willReportState;

  /**
   * Attributes for the traits supported by the device.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getAttributes() {
    return attributes;
  }

  /**
   * Attributes for the traits supported by the device.
   * @param attributes attributes or {@code null} for none
   */
  public Device setAttributes(java.util.Map<String, java.lang.Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Custom device attributes stored in Home Graph and provided to your smart home Action in each
   * [QUERY](https://developers.google.com/assistant/smarthome/reference/intent/query) and
   * [EXECUTE](https://developers.google.com/assistant/smarthome/reference/intent/execute) intent.
   * Data in this object has a few constraints: No sensitive information, including but not limited
   * to Personally Identifiable Information.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getCustomData() {
    return customData;
  }

  /**
   * Custom device attributes stored in Home Graph and provided to your smart home Action in each
   * [QUERY](https://developers.google.com/assistant/smarthome/reference/intent/query) and
   * [EXECUTE](https://developers.google.com/assistant/smarthome/reference/intent/execute) intent.
   * Data in this object has a few constraints: No sensitive information, including but not limited
   * to Personally Identifiable Information.
   * @param customData customData or {@code null} for none
   */
  public Device setCustomData(java.util.Map<String, java.lang.Object> customData) {
    this.customData = customData;
    return this;
  }

  /**
   * Device manufacturer, model, hardware version, and software version.
   * @return value or {@code null} for none
   */
  public DeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  /**
   * Device manufacturer, model, hardware version, and software version.
   * @param deviceInfo deviceInfo or {@code null} for none
   */
  public Device setDeviceInfo(DeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

  /**
   * Third-party device ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Third-party device ID.
   * @param id id or {@code null} for none
   */
  public Device setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Names given to this device by your smart home Action.
   * @return value or {@code null} for none
   */
  public DeviceNames getName() {
    return name;
  }

  /**
   * Names given to this device by your smart home Action.
   * @param name name or {@code null} for none
   */
  public Device setName(DeviceNames name) {
    this.name = name;
    return this;
  }

  /**
   * Indicates whether your smart home Action will report notifications to Google for this device
   * via ReportStateAndNotification. If your smart home Action enables users to control device
   * notifications, you should update this field and call RequestSyncDevices.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNotificationSupportedByAgent() {
    return notificationSupportedByAgent;
  }

  /**
   * Indicates whether your smart home Action will report notifications to Google for this device
   * via ReportStateAndNotification. If your smart home Action enables users to control device
   * notifications, you should update this field and call RequestSyncDevices.
   * @param notificationSupportedByAgent notificationSupportedByAgent or {@code null} for none
   */
  public Device setNotificationSupportedByAgent(java.lang.Boolean notificationSupportedByAgent) {
    this.notificationSupportedByAgent = notificationSupportedByAgent;
    return this;
  }

  /**
   * Alternate IDs associated with this device. This is used to identify cloud synced devices
   * enabled for [local
   * fulfillment](https://developers.google.com/assistant/smarthome/concepts/local).
   * @return value or {@code null} for none
   */
  public java.util.List<AgentOtherDeviceId> getOtherDeviceIds() {
    return otherDeviceIds;
  }

  /**
   * Alternate IDs associated with this device. This is used to identify cloud synced devices
   * enabled for [local
   * fulfillment](https://developers.google.com/assistant/smarthome/concepts/local).
   * @param otherDeviceIds otherDeviceIds or {@code null} for none
   */
  public Device setOtherDeviceIds(java.util.List<AgentOtherDeviceId> otherDeviceIds) {
    this.otherDeviceIds = otherDeviceIds;
    return this;
  }

  /**
   * Suggested name for the room where this device is installed. Google attempts to use this value
   * during user setup.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoomHint() {
    return roomHint;
  }

  /**
   * Suggested name for the room where this device is installed. Google attempts to use this value
   * during user setup.
   * @param roomHint roomHint or {@code null} for none
   */
  public Device setRoomHint(java.lang.String roomHint) {
    this.roomHint = roomHint;
    return this;
  }

  /**
   * Suggested name for the structure where this device is installed. Google attempts to use this
   * value during user setup.
   * @return value or {@code null} for none
   */
  public java.lang.String getStructureHint() {
    return structureHint;
  }

  /**
   * Suggested name for the structure where this device is installed. Google attempts to use this
   * value during user setup.
   * @param structureHint structureHint or {@code null} for none
   */
  public Device setStructureHint(java.lang.String structureHint) {
    this.structureHint = structureHint;
    return this;
  }

  /**
   * Traits supported by the device. See [device
   * traits](https://developers.google.com/assistant/smarthome/traits).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTraits() {
    return traits;
  }

  /**
   * Traits supported by the device. See [device
   * traits](https://developers.google.com/assistant/smarthome/traits).
   * @param traits traits or {@code null} for none
   */
  public Device setTraits(java.util.List<java.lang.String> traits) {
    this.traits = traits;
    return this;
  }

  /**
   * Hardware type of the device. See [device
   * types](https://developers.google.com/assistant/smarthome/guides).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Hardware type of the device. See [device
   * types](https://developers.google.com/assistant/smarthome/guides).
   * @param type type or {@code null} for none
   */
  public Device setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates whether your smart home Action will report state of this device to Google via
   * ReportStateAndNotification.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWillReportState() {
    return willReportState;
  }

  /**
   * Indicates whether your smart home Action will report state of this device to Google via
   * ReportStateAndNotification.
   * @param willReportState willReportState or {@code null} for none
   */
  public Device setWillReportState(java.lang.Boolean willReportState) {
    this.willReportState = willReportState;
    return this;
  }

  @Override
  public Device set(String fieldName, Object value) {
    return (Device) super.set(fieldName, value);
  }

  @Override
  public Device clone() {
    return (Device) super.clone();
  }

}
