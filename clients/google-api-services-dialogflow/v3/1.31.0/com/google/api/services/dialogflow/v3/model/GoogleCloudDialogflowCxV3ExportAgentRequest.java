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

package com.google.api.services.dialogflow.v3.model;

/**
 * The request message for Agents.ExportAgent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ExportAgentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the
   * agent to. The format of this URI must be `gs:`. If left unspecified, the serialized agent is
   * returned inline. Dialogflow performs a write operation for the Cloud Storage object on the
   * caller's behalf, so your request authentication must have write permissions for the object. For
   * more information, see [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentUri;

  /**
   * Optional. The data format of the exported agent. If not specified, `BLOB` is assumed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataFormat;

  /**
   * Optional. Environment name. If not set, draft environment is assumed. Format:
   * `projects//locations//agents//environments/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String environment;

  /**
   * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the
   * agent to. The format of this URI must be `gs:`. If left unspecified, the serialized agent is
   * returned inline. Dialogflow performs a write operation for the Cloud Storage object on the
   * caller's behalf, so your request authentication must have write permissions for the object. For
   * more information, see [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentUri() {
    return agentUri;
  }

  /**
   * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the
   * agent to. The format of this URI must be `gs:`. If left unspecified, the serialized agent is
   * returned inline. Dialogflow performs a write operation for the Cloud Storage object on the
   * caller's behalf, so your request authentication must have write permissions for the object. For
   * more information, see [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * @param agentUri agentUri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ExportAgentRequest setAgentUri(java.lang.String agentUri) {
    this.agentUri = agentUri;
    return this;
  }

  /**
   * Optional. The data format of the exported agent. If not specified, `BLOB` is assumed.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataFormat() {
    return dataFormat;
  }

  /**
   * Optional. The data format of the exported agent. If not specified, `BLOB` is assumed.
   * @param dataFormat dataFormat or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ExportAgentRequest setDataFormat(java.lang.String dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }

  /**
   * Optional. Environment name. If not set, draft environment is assumed. Format:
   * `projects//locations//agents//environments/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvironment() {
    return environment;
  }

  /**
   * Optional. Environment name. If not set, draft environment is assumed. Format:
   * `projects//locations//agents//environments/`.
   * @param environment environment or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ExportAgentRequest setEnvironment(java.lang.String environment) {
    this.environment = environment;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ExportAgentRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ExportAgentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ExportAgentRequest clone() {
    return (GoogleCloudDialogflowCxV3ExportAgentRequest) super.clone();
  }

}
