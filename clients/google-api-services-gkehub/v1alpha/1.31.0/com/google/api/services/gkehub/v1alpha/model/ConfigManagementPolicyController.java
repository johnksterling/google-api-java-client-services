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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * Configuration for Policy Controller
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementPolicyController extends com.google.api.client.json.GenericJson {

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long auditIntervalSeconds;

  /**
   * Enables the installation of Policy Controller. If false, the rest of PolicyController fields
   * take no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exemptableNamespaces;

  /**
   * Logs all denies and dry run failures.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean logDeniesEnabled;

  /**
   * Monitoring specifies the configuration of monitoring.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementPolicyControllerMonitoring monitoring;

  /**
   * Enable users to try out mutation for PolicyController.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mutationEnabled;

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean referentialRulesEnabled;

  /**
   * Installs the default template library along with Policy Controller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean templateLibraryInstalled;

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAuditIntervalSeconds() {
    return auditIntervalSeconds;
  }

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * @param auditIntervalSeconds auditIntervalSeconds or {@code null} for none
   */
  public ConfigManagementPolicyController setAuditIntervalSeconds(java.lang.Long auditIntervalSeconds) {
    this.auditIntervalSeconds = auditIntervalSeconds;
    return this;
  }

  /**
   * Enables the installation of Policy Controller. If false, the rest of PolicyController fields
   * take no effect.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Enables the installation of Policy Controller. If false, the rest of PolicyController fields
   * take no effect.
   * @param enabled enabled or {@code null} for none
   */
  public ConfigManagementPolicyController setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExemptableNamespaces() {
    return exemptableNamespaces;
  }

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * @param exemptableNamespaces exemptableNamespaces or {@code null} for none
   */
  public ConfigManagementPolicyController setExemptableNamespaces(java.util.List<java.lang.String> exemptableNamespaces) {
    this.exemptableNamespaces = exemptableNamespaces;
    return this;
  }

  /**
   * Logs all denies and dry run failures.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLogDeniesEnabled() {
    return logDeniesEnabled;
  }

  /**
   * Logs all denies and dry run failures.
   * @param logDeniesEnabled logDeniesEnabled or {@code null} for none
   */
  public ConfigManagementPolicyController setLogDeniesEnabled(java.lang.Boolean logDeniesEnabled) {
    this.logDeniesEnabled = logDeniesEnabled;
    return this;
  }

  /**
   * Monitoring specifies the configuration of monitoring.
   * @return value or {@code null} for none
   */
  public ConfigManagementPolicyControllerMonitoring getMonitoring() {
    return monitoring;
  }

  /**
   * Monitoring specifies the configuration of monitoring.
   * @param monitoring monitoring or {@code null} for none
   */
  public ConfigManagementPolicyController setMonitoring(ConfigManagementPolicyControllerMonitoring monitoring) {
    this.monitoring = monitoring;
    return this;
  }

  /**
   * Enable users to try out mutation for PolicyController.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMutationEnabled() {
    return mutationEnabled;
  }

  /**
   * Enable users to try out mutation for PolicyController.
   * @param mutationEnabled mutationEnabled or {@code null} for none
   */
  public ConfigManagementPolicyController setMutationEnabled(java.lang.Boolean mutationEnabled) {
    this.mutationEnabled = mutationEnabled;
    return this;
  }

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReferentialRulesEnabled() {
    return referentialRulesEnabled;
  }

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * @param referentialRulesEnabled referentialRulesEnabled or {@code null} for none
   */
  public ConfigManagementPolicyController setReferentialRulesEnabled(java.lang.Boolean referentialRulesEnabled) {
    this.referentialRulesEnabled = referentialRulesEnabled;
    return this;
  }

  /**
   * Installs the default template library along with Policy Controller.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTemplateLibraryInstalled() {
    return templateLibraryInstalled;
  }

  /**
   * Installs the default template library along with Policy Controller.
   * @param templateLibraryInstalled templateLibraryInstalled or {@code null} for none
   */
  public ConfigManagementPolicyController setTemplateLibraryInstalled(java.lang.Boolean templateLibraryInstalled) {
    this.templateLibraryInstalled = templateLibraryInstalled;
    return this;
  }

  @Override
  public ConfigManagementPolicyController set(String fieldName, Object value) {
    return (ConfigManagementPolicyController) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementPolicyController clone() {
    return (ConfigManagementPolicyController) super.clone();
  }

}
