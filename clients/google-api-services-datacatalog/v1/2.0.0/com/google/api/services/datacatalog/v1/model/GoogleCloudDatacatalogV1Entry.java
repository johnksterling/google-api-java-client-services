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

package com.google.api.services.datacatalog.v1.model;

/**
 * Entry metadata. A Data Catalog entry represents another resource in Google Cloud Platform (such
 * as a BigQuery dataset or a Pub/Sub topic) or outside of it. You can use the `linked_resource`
 * field in the entry resource to refer to the original resource ID of the source system. An entry
 * resource contains resource details, for example, its schema. Additionally, you can attach
 * flexible metadata to an entry in the form of a Tag.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1Entry extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name
   * pattern. For more information, see [Introduction to partitioned tables]
   * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1BigQueryDateShardedSpec bigqueryDateShardedSpec;

  /**
   * Output only. Specification that applies to a BigQuery table. Valid only for entries with the
   * `TABLE` type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1BigQueryTableSpec bigqueryTableSpec;

  /**
   * Business Context of the entry. Not supported for BigQuery datasets
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1BusinessContext businessContext;

  /**
   * Output only. Physical location of the entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1DataSource dataSource;

  /**
   * Specification that applies to a data source connection. Valid only for entries with the
   * `DATA_SOURCE_CONNECTION` type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1DataSourceConnectionSpec dataSourceConnectionSpec;

  /**
   * Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1DatabaseTableSpec databaseTableSpec;

  /**
   * Entry description that can consist of several sentences or paragraphs that describe entry
   * contents. The description must not contain Unicode non-characters as well as C0 and C1 control
   * codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The
   * maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display name of an entry. The name must contain only Unicode letters, numbers (0-9),
   * underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum size
   * is 200 bytes when encoded in UTF-8. Default value is an empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Specification that applies to a fileset resource. Valid only for entries with the `FILESET`
   * type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1FilesetSpec filesetSpec;

  /**
   * Fully qualified name (FQN) of the resource. Set automatically for entries representing
   * resources from synced systems. Settable only during creation and read-only afterwards. Can be
   * used for search and lookup of the entries. FQNs take two forms: * For non-regionalized
   * resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized
   * resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example
   * for a DPMS table:
   * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullyQualifiedName;

  /**
   * Specification that applies to a Cloud Storage fileset. Valid only for entries with the
   * `FILESET` type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1GcsFilesetSpec gcsFilesetSpec;

  /**
   * Output only. Indicates the entry's source system that Data Catalog integrates with, such as
   * BigQuery, Pub/Sub, or Dataproc Metastore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String integratedSystem;

  /**
   * Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached
   * only to custom entries. Synced entries have unmodifiable labels that come from the source
   * system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The resource this metadata entry refers to. For Google Cloud Platform resources,
   * `linked_resource` is the [Full Resource Name]
   * (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the
   * `linked_resource` for a table resource from BigQuery is:
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * Output only when the entry is one of the types in the `EntryType` enum. For entries with a
   * `user_specified_type`, this field is optional and defaults to an empty string. The resource
   * string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.),
   * colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded
   * in UTF-8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedResource;

  /**
   * Output only. The resource name of an entry in URL format. Note: The entry itself and its child
   * resources might not be stored in the location specified in its name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Additional information related to the entry. Private to the current user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1PersonalDetails personalDetails;

  /**
   * Specification that applies to a user-defined function or procedure. Valid only for entries with
   * the `ROUTINE` type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1RoutineSpec routineSpec;

  /**
   * Schema of the entry. An entry might not have any schema attached to it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1Schema schema;

  /**
   * Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the
   * entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this
   * field is optional and defaults to an empty timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1SystemTimestamps sourceSystemTimestamps;

  /**
   * The type of the entry. Only used for entries with types listed in the `EntryType` enum.
   * Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must
   * use the `user_specified_type`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. Resource usage statistics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1UsageSignal usageSignal;

  /**
   * Indicates the entry's source system that Data Catalog doesn't automatically integrate with. The
   * `user_specified_system` string has the following limitations: * Is case insensitive. * Must
   * begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must
   * be at least 1 character and at most 64 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userSpecifiedSystem;

  /**
   * Custom entry type that doesn't match any of the values allowed for input and listed in the
   * `EntryType` enum. When creating an entry, first check the type values in the enum. If there are
   * no appropriate types for the new entry, provide a custom value, for example, `my_special_type`.
   * The `user_specified_type` string has the following limitations: * Is case insensitive. * Must
   * begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must
   * be at least 1 character and at most 64 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userSpecifiedType;

  /**
   * Output only. Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name
   * pattern. For more information, see [Introduction to partitioned tables]
   * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1BigQueryDateShardedSpec getBigqueryDateShardedSpec() {
    return bigqueryDateShardedSpec;
  }

  /**
   * Output only. Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name
   * pattern. For more information, see [Introduction to partitioned tables]
   * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
   * @param bigqueryDateShardedSpec bigqueryDateShardedSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setBigqueryDateShardedSpec(GoogleCloudDatacatalogV1BigQueryDateShardedSpec bigqueryDateShardedSpec) {
    this.bigqueryDateShardedSpec = bigqueryDateShardedSpec;
    return this;
  }

  /**
   * Output only. Specification that applies to a BigQuery table. Valid only for entries with the
   * `TABLE` type.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1BigQueryTableSpec getBigqueryTableSpec() {
    return bigqueryTableSpec;
  }

  /**
   * Output only. Specification that applies to a BigQuery table. Valid only for entries with the
   * `TABLE` type.
   * @param bigqueryTableSpec bigqueryTableSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setBigqueryTableSpec(GoogleCloudDatacatalogV1BigQueryTableSpec bigqueryTableSpec) {
    this.bigqueryTableSpec = bigqueryTableSpec;
    return this;
  }

  /**
   * Business Context of the entry. Not supported for BigQuery datasets
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1BusinessContext getBusinessContext() {
    return businessContext;
  }

  /**
   * Business Context of the entry. Not supported for BigQuery datasets
   * @param businessContext businessContext or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setBusinessContext(GoogleCloudDatacatalogV1BusinessContext businessContext) {
    this.businessContext = businessContext;
    return this;
  }

  /**
   * Output only. Physical location of the entry.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1DataSource getDataSource() {
    return dataSource;
  }

  /**
   * Output only. Physical location of the entry.
   * @param dataSource dataSource or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setDataSource(GoogleCloudDatacatalogV1DataSource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Specification that applies to a data source connection. Valid only for entries with the
   * `DATA_SOURCE_CONNECTION` type.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1DataSourceConnectionSpec getDataSourceConnectionSpec() {
    return dataSourceConnectionSpec;
  }

  /**
   * Specification that applies to a data source connection. Valid only for entries with the
   * `DATA_SOURCE_CONNECTION` type.
   * @param dataSourceConnectionSpec dataSourceConnectionSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setDataSourceConnectionSpec(GoogleCloudDatacatalogV1DataSourceConnectionSpec dataSourceConnectionSpec) {
    this.dataSourceConnectionSpec = dataSourceConnectionSpec;
    return this;
  }

  /**
   * Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1DatabaseTableSpec getDatabaseTableSpec() {
    return databaseTableSpec;
  }

  /**
   * Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
   * @param databaseTableSpec databaseTableSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setDatabaseTableSpec(GoogleCloudDatacatalogV1DatabaseTableSpec databaseTableSpec) {
    this.databaseTableSpec = databaseTableSpec;
    return this;
  }

  /**
   * Entry description that can consist of several sentences or paragraphs that describe entry
   * contents. The description must not contain Unicode non-characters as well as C0 and C1 control
   * codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The
   * maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Entry description that can consist of several sentences or paragraphs that describe entry
   * contents. The description must not contain Unicode non-characters as well as C0 and C1 control
   * codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The
   * maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display name of an entry. The name must contain only Unicode letters, numbers (0-9),
   * underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum size
   * is 200 bytes when encoded in UTF-8. Default value is an empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name of an entry. The name must contain only Unicode letters, numbers (0-9),
   * underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum size
   * is 200 bytes when encoded in UTF-8. Default value is an empty string.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Specification that applies to a fileset resource. Valid only for entries with the `FILESET`
   * type.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1FilesetSpec getFilesetSpec() {
    return filesetSpec;
  }

  /**
   * Specification that applies to a fileset resource. Valid only for entries with the `FILESET`
   * type.
   * @param filesetSpec filesetSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setFilesetSpec(GoogleCloudDatacatalogV1FilesetSpec filesetSpec) {
    this.filesetSpec = filesetSpec;
    return this;
  }

  /**
   * Fully qualified name (FQN) of the resource. Set automatically for entries representing
   * resources from synced systems. Settable only during creation and read-only afterwards. Can be
   * used for search and lookup of the entries. FQNs take two forms: * For non-regionalized
   * resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized
   * resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example
   * for a DPMS table:
   * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
   * @return value or {@code null} for none
   */
  public java.lang.String getFullyQualifiedName() {
    return fullyQualifiedName;
  }

  /**
   * Fully qualified name (FQN) of the resource. Set automatically for entries representing
   * resources from synced systems. Settable only during creation and read-only afterwards. Can be
   * used for search and lookup of the entries. FQNs take two forms: * For non-regionalized
   * resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized
   * resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example
   * for a DPMS table:
   * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
   * @param fullyQualifiedName fullyQualifiedName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setFullyQualifiedName(java.lang.String fullyQualifiedName) {
    this.fullyQualifiedName = fullyQualifiedName;
    return this;
  }

  /**
   * Specification that applies to a Cloud Storage fileset. Valid only for entries with the
   * `FILESET` type.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1GcsFilesetSpec getGcsFilesetSpec() {
    return gcsFilesetSpec;
  }

  /**
   * Specification that applies to a Cloud Storage fileset. Valid only for entries with the
   * `FILESET` type.
   * @param gcsFilesetSpec gcsFilesetSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setGcsFilesetSpec(GoogleCloudDatacatalogV1GcsFilesetSpec gcsFilesetSpec) {
    this.gcsFilesetSpec = gcsFilesetSpec;
    return this;
  }

  /**
   * Output only. Indicates the entry's source system that Data Catalog integrates with, such as
   * BigQuery, Pub/Sub, or Dataproc Metastore.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntegratedSystem() {
    return integratedSystem;
  }

  /**
   * Output only. Indicates the entry's source system that Data Catalog integrates with, such as
   * BigQuery, Pub/Sub, or Dataproc Metastore.
   * @param integratedSystem integratedSystem or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setIntegratedSystem(java.lang.String integratedSystem) {
    this.integratedSystem = integratedSystem;
    return this;
  }

  /**
   * Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached
   * only to custom entries. Synced entries have unmodifiable labels that come from the source
   * system.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached
   * only to custom entries. Synced entries have unmodifiable labels that come from the source
   * system.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The resource this metadata entry refers to. For Google Cloud Platform resources,
   * `linked_resource` is the [Full Resource Name]
   * (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the
   * `linked_resource` for a table resource from BigQuery is:
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * Output only when the entry is one of the types in the `EntryType` enum. For entries with a
   * `user_specified_type`, this field is optional and defaults to an empty string. The resource
   * string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.),
   * colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded
   * in UTF-8.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedResource() {
    return linkedResource;
  }

  /**
   * The resource this metadata entry refers to. For Google Cloud Platform resources,
   * `linked_resource` is the [Full Resource Name]
   * (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the
   * `linked_resource` for a table resource from BigQuery is:
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * Output only when the entry is one of the types in the `EntryType` enum. For entries with a
   * `user_specified_type`, this field is optional and defaults to an empty string. The resource
   * string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.),
   * colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded
   * in UTF-8.
   * @param linkedResource linkedResource or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setLinkedResource(java.lang.String linkedResource) {
    this.linkedResource = linkedResource;
    return this;
  }

  /**
   * Output only. The resource name of an entry in URL format. Note: The entry itself and its child
   * resources might not be stored in the location specified in its name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of an entry in URL format. Note: The entry itself and its child
   * resources might not be stored in the location specified in its name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Additional information related to the entry. Private to the current user.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1PersonalDetails getPersonalDetails() {
    return personalDetails;
  }

  /**
   * Output only. Additional information related to the entry. Private to the current user.
   * @param personalDetails personalDetails or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setPersonalDetails(GoogleCloudDatacatalogV1PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
    return this;
  }

  /**
   * Specification that applies to a user-defined function or procedure. Valid only for entries with
   * the `ROUTINE` type.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1RoutineSpec getRoutineSpec() {
    return routineSpec;
  }

  /**
   * Specification that applies to a user-defined function or procedure. Valid only for entries with
   * the `ROUTINE` type.
   * @param routineSpec routineSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setRoutineSpec(GoogleCloudDatacatalogV1RoutineSpec routineSpec) {
    this.routineSpec = routineSpec;
    return this;
  }

  /**
   * Schema of the entry. An entry might not have any schema attached to it.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Schema getSchema() {
    return schema;
  }

  /**
   * Schema of the entry. An entry might not have any schema attached to it.
   * @param schema schema or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setSchema(GoogleCloudDatacatalogV1Schema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the
   * entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this
   * field is optional and defaults to an empty timestamp.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1SystemTimestamps getSourceSystemTimestamps() {
    return sourceSystemTimestamps;
  }

  /**
   * Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the
   * entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this
   * field is optional and defaults to an empty timestamp.
   * @param sourceSystemTimestamps sourceSystemTimestamps or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setSourceSystemTimestamps(GoogleCloudDatacatalogV1SystemTimestamps sourceSystemTimestamps) {
    this.sourceSystemTimestamps = sourceSystemTimestamps;
    return this;
  }

  /**
   * The type of the entry. Only used for entries with types listed in the `EntryType` enum.
   * Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must
   * use the `user_specified_type`.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the entry. Only used for entries with types listed in the `EntryType` enum.
   * Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must
   * use the `user_specified_type`.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. Resource usage statistics.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1UsageSignal getUsageSignal() {
    return usageSignal;
  }

  /**
   * Output only. Resource usage statistics.
   * @param usageSignal usageSignal or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setUsageSignal(GoogleCloudDatacatalogV1UsageSignal usageSignal) {
    this.usageSignal = usageSignal;
    return this;
  }

  /**
   * Indicates the entry's source system that Data Catalog doesn't automatically integrate with. The
   * `user_specified_system` string has the following limitations: * Is case insensitive. * Must
   * begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must
   * be at least 1 character and at most 64 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserSpecifiedSystem() {
    return userSpecifiedSystem;
  }

  /**
   * Indicates the entry's source system that Data Catalog doesn't automatically integrate with. The
   * `user_specified_system` string has the following limitations: * Is case insensitive. * Must
   * begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must
   * be at least 1 character and at most 64 characters long.
   * @param userSpecifiedSystem userSpecifiedSystem or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setUserSpecifiedSystem(java.lang.String userSpecifiedSystem) {
    this.userSpecifiedSystem = userSpecifiedSystem;
    return this;
  }

  /**
   * Custom entry type that doesn't match any of the values allowed for input and listed in the
   * `EntryType` enum. When creating an entry, first check the type values in the enum. If there are
   * no appropriate types for the new entry, provide a custom value, for example, `my_special_type`.
   * The `user_specified_type` string has the following limitations: * Is case insensitive. * Must
   * begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must
   * be at least 1 character and at most 64 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserSpecifiedType() {
    return userSpecifiedType;
  }

  /**
   * Custom entry type that doesn't match any of the values allowed for input and listed in the
   * `EntryType` enum. When creating an entry, first check the type values in the enum. If there are
   * no appropriate types for the new entry, provide a custom value, for example, `my_special_type`.
   * The `user_specified_type` string has the following limitations: * Is case insensitive. * Must
   * begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must
   * be at least 1 character and at most 64 characters long.
   * @param userSpecifiedType userSpecifiedType or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Entry setUserSpecifiedType(java.lang.String userSpecifiedType) {
    this.userSpecifiedType = userSpecifiedType;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1Entry set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1Entry) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1Entry clone() {
    return (GoogleCloudDatacatalogV1Entry) super.clone();
  }

}
