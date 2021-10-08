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
 * A collection of user data indexed by row, column, and timestamp. Each table is served using the
 * resources of its parent cluster.
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
public final class Table extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Map from cluster ID to per-cluster table state. If it could not be determined
   * whether or not the table has data in a particular cluster (for example, if its zone is
   * unavailable), then there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ClusterState> clusterStates;

  static {
    // hack to force ProGuard to consider ClusterState used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ClusterState.class);
  }

  /**
   * The column families configured for this table, mapped by column family ID. Views:
   * `SCHEMA_VIEW`, `FULL`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ColumnFamily> columnFamilies;

  static {
    // hack to force ProGuard to consider ColumnFamily used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ColumnFamily.class);
  }

  /**
   * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table.
   * Timestamps not matching the granularity will be rejected. If unspecified at creation time, the
   * value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String granularity;

  /**
   * The unique name of the table. Values are of the form
   * `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. Views: `NAME_ONLY`,
   * `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. If this table was restored from another data source (e.g. a backup), this field
   * will be populated with information about the restore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RestoreInfo restoreInfo;

  /**
   * Output only. Map from cluster ID to per-cluster table state. If it could not be determined
   * whether or not the table has data in a particular cluster (for example, if its zone is
   * unavailable), then there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ClusterState> getClusterStates() {
    return clusterStates;
  }

  /**
   * Output only. Map from cluster ID to per-cluster table state. If it could not be determined
   * whether or not the table has data in a particular cluster (for example, if its zone is
   * unavailable), then there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
   * @param clusterStates clusterStates or {@code null} for none
   */
  public Table setClusterStates(java.util.Map<String, ClusterState> clusterStates) {
    this.clusterStates = clusterStates;
    return this;
  }

  /**
   * The column families configured for this table, mapped by column family ID. Views:
   * `SCHEMA_VIEW`, `FULL`
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ColumnFamily> getColumnFamilies() {
    return columnFamilies;
  }

  /**
   * The column families configured for this table, mapped by column family ID. Views:
   * `SCHEMA_VIEW`, `FULL`
   * @param columnFamilies columnFamilies or {@code null} for none
   */
  public Table setColumnFamilies(java.util.Map<String, ColumnFamily> columnFamilies) {
    this.columnFamilies = columnFamilies;
    return this;
  }

  /**
   * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table.
   * Timestamps not matching the granularity will be rejected. If unspecified at creation time, the
   * value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGranularity() {
    return granularity;
  }

  /**
   * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table.
   * Timestamps not matching the granularity will be rejected. If unspecified at creation time, the
   * value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
   * @param granularity granularity or {@code null} for none
   */
  public Table setGranularity(java.lang.String granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   * The unique name of the table. Values are of the form
   * `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. Views: `NAME_ONLY`,
   * `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique name of the table. Values are of the form
   * `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. Views: `NAME_ONLY`,
   * `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
   * @param name name or {@code null} for none
   */
  public Table setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. If this table was restored from another data source (e.g. a backup), this field
   * will be populated with information about the restore.
   * @return value or {@code null} for none
   */
  public RestoreInfo getRestoreInfo() {
    return restoreInfo;
  }

  /**
   * Output only. If this table was restored from another data source (e.g. a backup), this field
   * will be populated with information about the restore.
   * @param restoreInfo restoreInfo or {@code null} for none
   */
  public Table setRestoreInfo(RestoreInfo restoreInfo) {
    this.restoreInfo = restoreInfo;
    return this;
  }

  @Override
  public Table set(String fieldName, Object value) {
    return (Table) super.set(fieldName, value);
  }

  @Override
  public Table clone() {
    return (Table) super.clone();
  }

}
