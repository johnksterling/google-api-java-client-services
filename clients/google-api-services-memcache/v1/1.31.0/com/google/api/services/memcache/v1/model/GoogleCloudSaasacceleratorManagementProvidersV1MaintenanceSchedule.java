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

package com.google.api.services.memcache.v1.model;

/**
 * Maintenance schedule which is exposed to customer and potentially end user, indicating published
 * upcoming future maintenance schedule
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Memorystore for Memcached API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule extends com.google.api.client.json.GenericJson {

  /**
   * This field is deprecated, and will be always set to true since reschedule can happen multiple
   * times now. This field should not be removed until all service producers remove this for their
   * customers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canReschedule;

  /**
   * The scheduled end time for the maintenance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The rollout management policy this maintenance schedule is associated with. When doing
   * reschedule update request, the reschedule should be against this given policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolloutManagementPolicy;

  /**
   * schedule_deadline_time is the time deadline any schedule start time cannot go beyond, including
   * reschedule. It's normally the initial schedule start time plus maintenance window length (1 day
   * or 1 week). Maintenance cannot be scheduled to start beyond this deadline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleDeadlineTime;

  /**
   * The scheduled start time for the maintenance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * This field is deprecated, and will be always set to true since reschedule can happen multiple
   * times now. This field should not be removed until all service producers remove this for their
   * customers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanReschedule() {
    return canReschedule;
  }

  /**
   * This field is deprecated, and will be always set to true since reschedule can happen multiple
   * times now. This field should not be removed until all service producers remove this for their
   * customers.
   * @param canReschedule canReschedule or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule setCanReschedule(java.lang.Boolean canReschedule) {
    this.canReschedule = canReschedule;
    return this;
  }

  /**
   * The scheduled end time for the maintenance.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The scheduled end time for the maintenance.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The rollout management policy this maintenance schedule is associated with. When doing
   * reschedule update request, the reschedule should be against this given policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getRolloutManagementPolicy() {
    return rolloutManagementPolicy;
  }

  /**
   * The rollout management policy this maintenance schedule is associated with. When doing
   * reschedule update request, the reschedule should be against this given policy.
   * @param rolloutManagementPolicy rolloutManagementPolicy or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule setRolloutManagementPolicy(java.lang.String rolloutManagementPolicy) {
    this.rolloutManagementPolicy = rolloutManagementPolicy;
    return this;
  }

  /**
   * schedule_deadline_time is the time deadline any schedule start time cannot go beyond, including
   * reschedule. It's normally the initial schedule start time plus maintenance window length (1 day
   * or 1 week). Maintenance cannot be scheduled to start beyond this deadline.
   * @return value or {@code null} for none
   */
  public String getScheduleDeadlineTime() {
    return scheduleDeadlineTime;
  }

  /**
   * schedule_deadline_time is the time deadline any schedule start time cannot go beyond, including
   * reschedule. It's normally the initial schedule start time plus maintenance window length (1 day
   * or 1 week). Maintenance cannot be scheduled to start beyond this deadline.
   * @param scheduleDeadlineTime scheduleDeadlineTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule setScheduleDeadlineTime(String scheduleDeadlineTime) {
    this.scheduleDeadlineTime = scheduleDeadlineTime;
    return this;
  }

  /**
   * The scheduled start time for the maintenance.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The scheduled start time for the maintenance.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule) super.clone();
  }

}
