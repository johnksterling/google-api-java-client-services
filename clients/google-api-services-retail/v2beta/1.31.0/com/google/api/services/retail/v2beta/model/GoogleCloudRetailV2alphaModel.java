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

package com.google.api.services.retail.v2beta.model;

/**
 * Metadata that describes the training and serving parameters of a Model. A Model can be associated
 * with a ServingConfig and then queried through the Predict api.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaModel extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp the Recommendation Model was created at.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The state of data requirements for this model: DATA_OK and DATA_ERROR.
   * Recommendation model cannot be trained if the data is in DATA_ERROR state. Recommendation model
   * can have DATA_ERROR state even if serving state is ACTIVE: models were trained successfully
   * before, but cannot be refreshed because model no longer has sufficient data for training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataState;

  /**
   * Required. The display name of the model. Should be human readable, used to display
   * Recommendation Models in the Retail Pantheon Dashboard. UTF-8 encoded string with limit of 1024
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. If RECOMMENDATIONS_FILTERING_ENABLED, recommendation filtering by attributes is
   * enabled for the model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filteringOption;

  /**
   * Output only. The timestamp when the latest successful tune finished.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastTuneTime;

  /**
   * Required. The fully qualified resource name of the model. Format:
   * projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/models/{model_id}
   * catalog_id has char limit of 50. recommendation_model_id has char limit of 40.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The optimization objective e.g. `cvr`. Currently supported values: `ctr`, `cvr`,
   * `revenue-per-order`. If not specified, we choose default based on model type. Default depends
   * on type of recommendation: `recommended-for-you` => `ctr` `others-you-may-like` => `ctr`
   * `frequently-bought-together` => `revenue_per_order`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String optimizationObjective;

  /**
   * Optional. The page optimization config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaModelPageOptimizationConfig pageOptimizationConfig;

  /**
   * Optional. The state of periodic tuning. The period we use is 3 months - to do a one-off tune
   * earlier use the TuneModel method. Default value is PERIODIC_TUNING_ENABLED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String periodicTuningState;

  /**
   * Output only. The list of valid serving configs associated with the PageOptimizationConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2alphaModelServingConfigList> servingConfigLists;

  /**
   * Output only. The serving state of the model: ACTIVE, NOT_ACTIVE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servingState;

  /**
   * Optional. The training state that the model is in (e.g. TRAINING or PAUSED). Since part of the
   * cost of running the service is frequency of training - this can be used to determine when to
   * train model in order to control cost. If not specified: the default value for CreateModel
   * method is TRAINING. the default value for UpdateModel method is to keep the state the same as
   * before.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trainingState;

  /**
   * Output only. The tune operation associated with the model. Can be used to determine if there is
   * an ongoing tune for this recommendation. Empty field implies no tune is goig on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tuningOperation;

  /**
   * Required. The type of model e.g. `home-page`. Currently supported values: `recommended-for-
   * you`, `others-you-may-like`, `frequently-bought-together`, `page-optimization`, 'similar-
   * items', 'buy-it-again', `recently-viewed`(readonly value).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. Timestamp the Recommendation Model was last updated. E.g. if a Recommendation
   * Model was paused - this would be the time the pause was initiated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp the Recommendation Model was created at.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp the Recommendation Model was created at.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The state of data requirements for this model: DATA_OK and DATA_ERROR.
   * Recommendation model cannot be trained if the data is in DATA_ERROR state. Recommendation model
   * can have DATA_ERROR state even if serving state is ACTIVE: models were trained successfully
   * before, but cannot be refreshed because model no longer has sufficient data for training.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataState() {
    return dataState;
  }

  /**
   * Output only. The state of data requirements for this model: DATA_OK and DATA_ERROR.
   * Recommendation model cannot be trained if the data is in DATA_ERROR state. Recommendation model
   * can have DATA_ERROR state even if serving state is ACTIVE: models were trained successfully
   * before, but cannot be refreshed because model no longer has sufficient data for training.
   * @param dataState dataState or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setDataState(java.lang.String dataState) {
    this.dataState = dataState;
    return this;
  }

  /**
   * Required. The display name of the model. Should be human readable, used to display
   * Recommendation Models in the Retail Pantheon Dashboard. UTF-8 encoded string with limit of 1024
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the model. Should be human readable, used to display
   * Recommendation Models in the Retail Pantheon Dashboard. UTF-8 encoded string with limit of 1024
   * characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. If RECOMMENDATIONS_FILTERING_ENABLED, recommendation filtering by attributes is
   * enabled for the model.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilteringOption() {
    return filteringOption;
  }

  /**
   * Optional. If RECOMMENDATIONS_FILTERING_ENABLED, recommendation filtering by attributes is
   * enabled for the model.
   * @param filteringOption filteringOption or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setFilteringOption(java.lang.String filteringOption) {
    this.filteringOption = filteringOption;
    return this;
  }

  /**
   * Output only. The timestamp when the latest successful tune finished.
   * @return value or {@code null} for none
   */
  public String getLastTuneTime() {
    return lastTuneTime;
  }

  /**
   * Output only. The timestamp when the latest successful tune finished.
   * @param lastTuneTime lastTuneTime or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setLastTuneTime(String lastTuneTime) {
    this.lastTuneTime = lastTuneTime;
    return this;
  }

  /**
   * Required. The fully qualified resource name of the model. Format:
   * projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/models/{model_id}
   * catalog_id has char limit of 50. recommendation_model_id has char limit of 40.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The fully qualified resource name of the model. Format:
   * projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/models/{model_id}
   * catalog_id has char limit of 50. recommendation_model_id has char limit of 40.
   * @param name name or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The optimization objective e.g. `cvr`. Currently supported values: `ctr`, `cvr`,
   * `revenue-per-order`. If not specified, we choose default based on model type. Default depends
   * on type of recommendation: `recommended-for-you` => `ctr` `others-you-may-like` => `ctr`
   * `frequently-bought-together` => `revenue_per_order`
   * @return value or {@code null} for none
   */
  public java.lang.String getOptimizationObjective() {
    return optimizationObjective;
  }

  /**
   * Optional. The optimization objective e.g. `cvr`. Currently supported values: `ctr`, `cvr`,
   * `revenue-per-order`. If not specified, we choose default based on model type. Default depends
   * on type of recommendation: `recommended-for-you` => `ctr` `others-you-may-like` => `ctr`
   * `frequently-bought-together` => `revenue_per_order`
   * @param optimizationObjective optimizationObjective or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setOptimizationObjective(java.lang.String optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
    return this;
  }

  /**
   * Optional. The page optimization config.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModelPageOptimizationConfig getPageOptimizationConfig() {
    return pageOptimizationConfig;
  }

  /**
   * Optional. The page optimization config.
   * @param pageOptimizationConfig pageOptimizationConfig or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setPageOptimizationConfig(GoogleCloudRetailV2alphaModelPageOptimizationConfig pageOptimizationConfig) {
    this.pageOptimizationConfig = pageOptimizationConfig;
    return this;
  }

  /**
   * Optional. The state of periodic tuning. The period we use is 3 months - to do a one-off tune
   * earlier use the TuneModel method. Default value is PERIODIC_TUNING_ENABLED.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeriodicTuningState() {
    return periodicTuningState;
  }

  /**
   * Optional. The state of periodic tuning. The period we use is 3 months - to do a one-off tune
   * earlier use the TuneModel method. Default value is PERIODIC_TUNING_ENABLED.
   * @param periodicTuningState periodicTuningState or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setPeriodicTuningState(java.lang.String periodicTuningState) {
    this.periodicTuningState = periodicTuningState;
    return this;
  }

  /**
   * Output only. The list of valid serving configs associated with the PageOptimizationConfig.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2alphaModelServingConfigList> getServingConfigLists() {
    return servingConfigLists;
  }

  /**
   * Output only. The list of valid serving configs associated with the PageOptimizationConfig.
   * @param servingConfigLists servingConfigLists or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setServingConfigLists(java.util.List<GoogleCloudRetailV2alphaModelServingConfigList> servingConfigLists) {
    this.servingConfigLists = servingConfigLists;
    return this;
  }

  /**
   * Output only. The serving state of the model: ACTIVE, NOT_ACTIVE.
   * @return value or {@code null} for none
   */
  public java.lang.String getServingState() {
    return servingState;
  }

  /**
   * Output only. The serving state of the model: ACTIVE, NOT_ACTIVE.
   * @param servingState servingState or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setServingState(java.lang.String servingState) {
    this.servingState = servingState;
    return this;
  }

  /**
   * Optional. The training state that the model is in (e.g. TRAINING or PAUSED). Since part of the
   * cost of running the service is frequency of training - this can be used to determine when to
   * train model in order to control cost. If not specified: the default value for CreateModel
   * method is TRAINING. the default value for UpdateModel method is to keep the state the same as
   * before.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrainingState() {
    return trainingState;
  }

  /**
   * Optional. The training state that the model is in (e.g. TRAINING or PAUSED). Since part of the
   * cost of running the service is frequency of training - this can be used to determine when to
   * train model in order to control cost. If not specified: the default value for CreateModel
   * method is TRAINING. the default value for UpdateModel method is to keep the state the same as
   * before.
   * @param trainingState trainingState or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setTrainingState(java.lang.String trainingState) {
    this.trainingState = trainingState;
    return this;
  }

  /**
   * Output only. The tune operation associated with the model. Can be used to determine if there is
   * an ongoing tune for this recommendation. Empty field implies no tune is goig on.
   * @return value or {@code null} for none
   */
  public java.lang.String getTuningOperation() {
    return tuningOperation;
  }

  /**
   * Output only. The tune operation associated with the model. Can be used to determine if there is
   * an ongoing tune for this recommendation. Empty field implies no tune is goig on.
   * @param tuningOperation tuningOperation or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setTuningOperation(java.lang.String tuningOperation) {
    this.tuningOperation = tuningOperation;
    return this;
  }

  /**
   * Required. The type of model e.g. `home-page`. Currently supported values: `recommended-for-
   * you`, `others-you-may-like`, `frequently-bought-together`, `page-optimization`, 'similar-
   * items', 'buy-it-again', `recently-viewed`(readonly value).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of model e.g. `home-page`. Currently supported values: `recommended-for-
   * you`, `others-you-may-like`, `frequently-bought-together`, `page-optimization`, 'similar-
   * items', 'buy-it-again', `recently-viewed`(readonly value).
   * @param type type or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. Timestamp the Recommendation Model was last updated. E.g. if a Recommendation
   * Model was paused - this would be the time the pause was initiated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp the Recommendation Model was last updated. E.g. if a Recommendation
   * Model was paused - this would be the time the pause was initiated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModel setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaModel set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaModel) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaModel clone() {
    return (GoogleCloudRetailV2alphaModel) super.clone();
  }

}
