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

package com.google.api.services.osconfig.v1.model;

/**
 * Patch deployments are configurations that individual patch jobs use to complete a patch. These
 * configurations include instance filter, package repository settings, and a schedule. For more
 * information about creating and managing patch deployments, see [Scheduling patch
 * jobs](https://cloud.google.com/compute/docs/os-patch-management/schedule-patch-jobs).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PatchDeployment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time the patch deployment was created. Timestamp is in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Description of the patch deployment. Length of the description is limited to 1024
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Duration of the patch. After the duration ends, the patch times out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Required. VM instances to patch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PatchInstanceFilter instanceFilter;

  /**
   * Output only. The last time a patch job was started by this deployment. Timestamp is in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastExecuteTime;

  /**
   * Unique name for the patch deployment resource in a project. The patch deployment name is in the
   * form: `projects/{project_id}/patchDeployments/{patch_deployment_id}`. This field is ignored
   * when you create a new patch deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Schedule a one-time execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OneTimeSchedule oneTimeSchedule;

  /**
   * Optional. Patch configuration that is applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PatchConfig patchConfig;

  /**
   * Required. Schedule recurring executions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RecurringSchedule recurringSchedule;

  /**
   * Output only. Time the patch deployment was last updated. Timestamp is in
   * [RFC3339]("https://www.ietf.org/rfc/rfc3339.txt) text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Time the patch deployment was created. Timestamp is in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time the patch deployment was created. Timestamp is in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @param createTime createTime or {@code null} for none
   */
  public PatchDeployment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Description of the patch deployment. Length of the description is limited to 1024
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the patch deployment. Length of the description is limited to 1024
   * characters.
   * @param description description or {@code null} for none
   */
  public PatchDeployment setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Duration of the patch. After the duration ends, the patch times out.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Optional. Duration of the patch. After the duration ends, the patch times out.
   * @param duration duration or {@code null} for none
   */
  public PatchDeployment setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Required. VM instances to patch.
   * @return value or {@code null} for none
   */
  public PatchInstanceFilter getInstanceFilter() {
    return instanceFilter;
  }

  /**
   * Required. VM instances to patch.
   * @param instanceFilter instanceFilter or {@code null} for none
   */
  public PatchDeployment setInstanceFilter(PatchInstanceFilter instanceFilter) {
    this.instanceFilter = instanceFilter;
    return this;
  }

  /**
   * Output only. The last time a patch job was started by this deployment. Timestamp is in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @return value or {@code null} for none
   */
  public String getLastExecuteTime() {
    return lastExecuteTime;
  }

  /**
   * Output only. The last time a patch job was started by this deployment. Timestamp is in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @param lastExecuteTime lastExecuteTime or {@code null} for none
   */
  public PatchDeployment setLastExecuteTime(String lastExecuteTime) {
    this.lastExecuteTime = lastExecuteTime;
    return this;
  }

  /**
   * Unique name for the patch deployment resource in a project. The patch deployment name is in the
   * form: `projects/{project_id}/patchDeployments/{patch_deployment_id}`. This field is ignored
   * when you create a new patch deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Unique name for the patch deployment resource in a project. The patch deployment name is in the
   * form: `projects/{project_id}/patchDeployments/{patch_deployment_id}`. This field is ignored
   * when you create a new patch deployment.
   * @param name name or {@code null} for none
   */
  public PatchDeployment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Schedule a one-time execution.
   * @return value or {@code null} for none
   */
  public OneTimeSchedule getOneTimeSchedule() {
    return oneTimeSchedule;
  }

  /**
   * Required. Schedule a one-time execution.
   * @param oneTimeSchedule oneTimeSchedule or {@code null} for none
   */
  public PatchDeployment setOneTimeSchedule(OneTimeSchedule oneTimeSchedule) {
    this.oneTimeSchedule = oneTimeSchedule;
    return this;
  }

  /**
   * Optional. Patch configuration that is applied.
   * @return value or {@code null} for none
   */
  public PatchConfig getPatchConfig() {
    return patchConfig;
  }

  /**
   * Optional. Patch configuration that is applied.
   * @param patchConfig patchConfig or {@code null} for none
   */
  public PatchDeployment setPatchConfig(PatchConfig patchConfig) {
    this.patchConfig = patchConfig;
    return this;
  }

  /**
   * Required. Schedule recurring executions.
   * @return value or {@code null} for none
   */
  public RecurringSchedule getRecurringSchedule() {
    return recurringSchedule;
  }

  /**
   * Required. Schedule recurring executions.
   * @param recurringSchedule recurringSchedule or {@code null} for none
   */
  public PatchDeployment setRecurringSchedule(RecurringSchedule recurringSchedule) {
    this.recurringSchedule = recurringSchedule;
    return this;
  }

  /**
   * Output only. Time the patch deployment was last updated. Timestamp is in
   * [RFC3339]("https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time the patch deployment was last updated. Timestamp is in
   * [RFC3339]("https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @param updateTime updateTime or {@code null} for none
   */
  public PatchDeployment setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public PatchDeployment set(String fieldName, Object value) {
    return (PatchDeployment) super.set(fieldName, value);
  }

  @Override
  public PatchDeployment clone() {
    return (PatchDeployment) super.clone();
  }

}
