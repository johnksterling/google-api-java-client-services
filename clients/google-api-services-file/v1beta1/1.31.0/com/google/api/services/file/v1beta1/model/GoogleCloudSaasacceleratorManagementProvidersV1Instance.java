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

package com.google.api.services.file.v1beta1.model;

/**
 * Model definition for GoogleCloudSaasacceleratorManagementProvidersV1Instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSaasacceleratorManagementProvidersV1Instance extends com.google.api.client.json.GenericJson {

  /**
   * consumer_defined_name is the name that is set by the consumer. On the other hand Name field
   * represents system-assigned id of an instance so consumers are not necessarily aware of it.
   * consumer_defined_name is used for notification/UI purposes for consumer to recognize their
   * instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerDefinedName;

  /**
   * Output only. Timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The instance_type of this instance of format:
   * projects/{project_number}/locations/{location_id}/instanceTypes/{instance_type_id}. Instance
   * Type represents a high-level tier or SKU of the service that this instance belong to. When
   * enabled(eg: Maintenance Rollout), Rollout uses 'instance_type' along with 'software_versions'
   * to determine whether instance needs an update or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceType;

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Deprecated. The MaintenancePolicies that have been attached to the instance. The key must be of
   * the type name of the oneof policy name defined in MaintenancePolicy, and the referenced policy
   * must define the same policy type. For complete details of MaintenancePolicy, please refer to go
   * /cloud-saas-mw-ug.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> maintenancePolicyNames;

  /**
   * The MaintenanceSchedule contains the scheduling information of published maintenance schedule
   * with same key as software_versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule> maintenanceSchedules;

  /**
   * Optional. The MaintenanceSettings associated with instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings maintenanceSettings;

  /**
   * Unique name of the resource. It uses the form:
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}` Note: This name is
   * passed, stored and logged across the rollout system. So use of consumer project_id or any other
   * consumer PII in the name is strongly discouraged for wipeout (go/wipeout) compliance. See
   * go/elysium/project_ids#storage-guidance for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. notification_parameter are information that service producers may like to include
   * that is not relevant to Rollout. This parameter will only be passed to Gamma and Cloud Logging
   * for notification/logging purpose.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter> notificationParameters;

  /**
   * Output only. Custom string attributes used primarily to expose producer-specific information in
   * monitoring dashboards. See go/get-instance-metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> producerMetadata;

  /**
   * Output only. The list of data plane resources provisioned for this instance, e.g. compute VMs.
   * See go/get-instance-metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource> provisionedResources;

  /**
   * Link to the SLM instance template. Only populated when updating SLM instances via SSA's
   * Actuation service adaptor. Service producers with custom control plane (e.g. Cloud SQL) doesn't
   * need to populate this field. Instead they should use software_versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String slmInstanceTemplate;

  /**
   * Output only. SLO metadata for instance classification in the Standardized dataplane SLO
   * platform. See go/cloud-ssa-standard-slo for feature description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata sloMetadata;

  /**
   * Software versions that are used to deploy this instance. This can be mutated by rollout
   * services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> softwareVersions;

  /**
   * Output only. Current lifecycle state of the resource (e.g. if it's being created or ready to
   * use).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. ID of the associated GCP tenant project. See go/get-instance-metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantProjectId;

  /**
   * Output only. Timestamp when the resource was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * consumer_defined_name is the name that is set by the consumer. On the other hand Name field
   * represents system-assigned id of an instance so consumers are not necessarily aware of it.
   * consumer_defined_name is used for notification/UI purposes for consumer to recognize their
   * instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerDefinedName() {
    return consumerDefinedName;
  }

  /**
   * consumer_defined_name is the name that is set by the consumer. On the other hand Name field
   * represents system-assigned id of an instance so consumers are not necessarily aware of it.
   * consumer_defined_name is used for notification/UI purposes for consumer to recognize their
   * instances.
   * @param consumerDefinedName consumerDefinedName or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setConsumerDefinedName(java.lang.String consumerDefinedName) {
    this.consumerDefinedName = consumerDefinedName;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The instance_type of this instance of format:
   * projects/{project_number}/locations/{location_id}/instanceTypes/{instance_type_id}. Instance
   * Type represents a high-level tier or SKU of the service that this instance belong to. When
   * enabled(eg: Maintenance Rollout), Rollout uses 'instance_type' along with 'software_versions'
   * to determine whether instance needs an update or not.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceType() {
    return instanceType;
  }

  /**
   * Optional. The instance_type of this instance of format:
   * projects/{project_number}/locations/{location_id}/instanceTypes/{instance_type_id}. Instance
   * Type represents a high-level tier or SKU of the service that this instance belong to. When
   * enabled(eg: Maintenance Rollout), Rollout uses 'instance_type' along with 'software_versions'
   * to determine whether instance needs an update or not.
   * @param instanceType instanceType or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setInstanceType(java.lang.String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Deprecated. The MaintenancePolicies that have been attached to the instance. The key must be of
   * the type name of the oneof policy name defined in MaintenancePolicy, and the referenced policy
   * must define the same policy type. For complete details of MaintenancePolicy, please refer to go
   * /cloud-saas-mw-ug.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMaintenancePolicyNames() {
    return maintenancePolicyNames;
  }

  /**
   * Deprecated. The MaintenancePolicies that have been attached to the instance. The key must be of
   * the type name of the oneof policy name defined in MaintenancePolicy, and the referenced policy
   * must define the same policy type. For complete details of MaintenancePolicy, please refer to go
   * /cloud-saas-mw-ug.
   * @param maintenancePolicyNames maintenancePolicyNames or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setMaintenancePolicyNames(java.util.Map<String, java.lang.String> maintenancePolicyNames) {
    this.maintenancePolicyNames = maintenancePolicyNames;
    return this;
  }

  /**
   * The MaintenanceSchedule contains the scheduling information of published maintenance schedule
   * with same key as software_versions.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule> getMaintenanceSchedules() {
    return maintenanceSchedules;
  }

  /**
   * The MaintenanceSchedule contains the scheduling information of published maintenance schedule
   * with same key as software_versions.
   * @param maintenanceSchedules maintenanceSchedules or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setMaintenanceSchedules(java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule> maintenanceSchedules) {
    this.maintenanceSchedules = maintenanceSchedules;
    return this;
  }

  /**
   * Optional. The MaintenanceSettings associated with instance.
   * @return value or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings getMaintenanceSettings() {
    return maintenanceSettings;
  }

  /**
   * Optional. The MaintenanceSettings associated with instance.
   * @param maintenanceSettings maintenanceSettings or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setMaintenanceSettings(GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings maintenanceSettings) {
    this.maintenanceSettings = maintenanceSettings;
    return this;
  }

  /**
   * Unique name of the resource. It uses the form:
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}` Note: This name is
   * passed, stored and logged across the rollout system. So use of consumer project_id or any other
   * consumer PII in the name is strongly discouraged for wipeout (go/wipeout) compliance. See
   * go/elysium/project_ids#storage-guidance for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Unique name of the resource. It uses the form:
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}` Note: This name is
   * passed, stored and logged across the rollout system. So use of consumer project_id or any other
   * consumer PII in the name is strongly discouraged for wipeout (go/wipeout) compliance. See
   * go/elysium/project_ids#storage-guidance for more details.
   * @param name name or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. notification_parameter are information that service producers may like to include
   * that is not relevant to Rollout. This parameter will only be passed to Gamma and Cloud Logging
   * for notification/logging purpose.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter> getNotificationParameters() {
    return notificationParameters;
  }

  /**
   * Optional. notification_parameter are information that service producers may like to include
   * that is not relevant to Rollout. This parameter will only be passed to Gamma and Cloud Logging
   * for notification/logging purpose.
   * @param notificationParameters notificationParameters or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setNotificationParameters(java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter> notificationParameters) {
    this.notificationParameters = notificationParameters;
    return this;
  }

  /**
   * Output only. Custom string attributes used primarily to expose producer-specific information in
   * monitoring dashboards. See go/get-instance-metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getProducerMetadata() {
    return producerMetadata;
  }

  /**
   * Output only. Custom string attributes used primarily to expose producer-specific information in
   * monitoring dashboards. See go/get-instance-metadata.
   * @param producerMetadata producerMetadata or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setProducerMetadata(java.util.Map<String, java.lang.String> producerMetadata) {
    this.producerMetadata = producerMetadata;
    return this;
  }

  /**
   * Output only. The list of data plane resources provisioned for this instance, e.g. compute VMs.
   * See go/get-instance-metadata.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource> getProvisionedResources() {
    return provisionedResources;
  }

  /**
   * Output only. The list of data plane resources provisioned for this instance, e.g. compute VMs.
   * See go/get-instance-metadata.
   * @param provisionedResources provisionedResources or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setProvisionedResources(java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource> provisionedResources) {
    this.provisionedResources = provisionedResources;
    return this;
  }

  /**
   * Link to the SLM instance template. Only populated when updating SLM instances via SSA's
   * Actuation service adaptor. Service producers with custom control plane (e.g. Cloud SQL) doesn't
   * need to populate this field. Instead they should use software_versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getSlmInstanceTemplate() {
    return slmInstanceTemplate;
  }

  /**
   * Link to the SLM instance template. Only populated when updating SLM instances via SSA's
   * Actuation service adaptor. Service producers with custom control plane (e.g. Cloud SQL) doesn't
   * need to populate this field. Instead they should use software_versions.
   * @param slmInstanceTemplate slmInstanceTemplate or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setSlmInstanceTemplate(java.lang.String slmInstanceTemplate) {
    this.slmInstanceTemplate = slmInstanceTemplate;
    return this;
  }

  /**
   * Output only. SLO metadata for instance classification in the Standardized dataplane SLO
   * platform. See go/cloud-ssa-standard-slo for feature description.
   * @return value or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata getSloMetadata() {
    return sloMetadata;
  }

  /**
   * Output only. SLO metadata for instance classification in the Standardized dataplane SLO
   * platform. See go/cloud-ssa-standard-slo for feature description.
   * @param sloMetadata sloMetadata or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setSloMetadata(GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata sloMetadata) {
    this.sloMetadata = sloMetadata;
    return this;
  }

  /**
   * Software versions that are used to deploy this instance. This can be mutated by rollout
   * services.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getSoftwareVersions() {
    return softwareVersions;
  }

  /**
   * Software versions that are used to deploy this instance. This can be mutated by rollout
   * services.
   * @param softwareVersions softwareVersions or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setSoftwareVersions(java.util.Map<String, java.lang.String> softwareVersions) {
    this.softwareVersions = softwareVersions;
    return this;
  }

  /**
   * Output only. Current lifecycle state of the resource (e.g. if it's being created or ready to
   * use).
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Current lifecycle state of the resource (e.g. if it's being created or ready to
   * use).
   * @param state state or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. ID of the associated GCP tenant project. See go/get-instance-metadata.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantProjectId() {
    return tenantProjectId;
  }

  /**
   * Output only. ID of the associated GCP tenant project. See go/get-instance-metadata.
   * @param tenantProjectId tenantProjectId or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setTenantProjectId(java.lang.String tenantProjectId) {
    this.tenantProjectId = tenantProjectId;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1Instance) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1Instance) super.clone();
  }

}
