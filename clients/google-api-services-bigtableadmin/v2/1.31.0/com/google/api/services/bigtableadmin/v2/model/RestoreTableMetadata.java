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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Metadata type for the long-running operation returned by RestoreTable.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RestoreTableMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackupInfo backupInfo;

  /**
   * Name of the table being created and restored to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If exists, the name of the long-running operation that will be used to track the post-restore
   * optimization process to optimize the performance of the restored table. The metadata type of
   * the long-running operation is OptimizeRestoreTableMetadata. The response type is Empty. This
   * long-running operation may be automatically created by the system if applicable after the
   * RestoreTable long-running operation completes successfully. This operation may not be created
   * if the table is already optimized or the restore was not successful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String optimizeTableOperationName;

  /**
   * The progress of the RestoreTable operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationProgress progress;

  /**
   * The type of the restore source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceType;

  /**
   * @return value or {@code null} for none
   */
  public BackupInfo getBackupInfo() {
    return backupInfo;
  }

  /**
   * @param backupInfo backupInfo or {@code null} for none
   */
  public RestoreTableMetadata setBackupInfo(BackupInfo backupInfo) {
    this.backupInfo = backupInfo;
    return this;
  }

  /**
   * Name of the table being created and restored to.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the table being created and restored to.
   * @param name name or {@code null} for none
   */
  public RestoreTableMetadata setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If exists, the name of the long-running operation that will be used to track the post-restore
   * optimization process to optimize the performance of the restored table. The metadata type of
   * the long-running operation is OptimizeRestoreTableMetadata. The response type is Empty. This
   * long-running operation may be automatically created by the system if applicable after the
   * RestoreTable long-running operation completes successfully. This operation may not be created
   * if the table is already optimized or the restore was not successful.
   * @return value or {@code null} for none
   */
  public java.lang.String getOptimizeTableOperationName() {
    return optimizeTableOperationName;
  }

  /**
   * If exists, the name of the long-running operation that will be used to track the post-restore
   * optimization process to optimize the performance of the restored table. The metadata type of
   * the long-running operation is OptimizeRestoreTableMetadata. The response type is Empty. This
   * long-running operation may be automatically created by the system if applicable after the
   * RestoreTable long-running operation completes successfully. This operation may not be created
   * if the table is already optimized or the restore was not successful.
   * @param optimizeTableOperationName optimizeTableOperationName or {@code null} for none
   */
  public RestoreTableMetadata setOptimizeTableOperationName(java.lang.String optimizeTableOperationName) {
    this.optimizeTableOperationName = optimizeTableOperationName;
    return this;
  }

  /**
   * The progress of the RestoreTable operation.
   * @return value or {@code null} for none
   */
  public OperationProgress getProgress() {
    return progress;
  }

  /**
   * The progress of the RestoreTable operation.
   * @param progress progress or {@code null} for none
   */
  public RestoreTableMetadata setProgress(OperationProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * The type of the restore source.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceType() {
    return sourceType;
  }

  /**
   * The type of the restore source.
   * @param sourceType sourceType or {@code null} for none
   */
  public RestoreTableMetadata setSourceType(java.lang.String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  @Override
  public RestoreTableMetadata set(String fieldName, Object value) {
    return (RestoreTableMetadata) super.set(fieldName, value);
  }

  @Override
  public RestoreTableMetadata clone() {
    return (RestoreTableMetadata) super.clone();
  }

}
