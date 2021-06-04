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

package com.google.api.services.bigquery.model;

/**
 * Model definition for JobStatistics2.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobStatistics2 extends com.google.api.client.json.GenericJson {

  /**
   * [Output-only] Billing tier for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer billingTier;

  /**
   * [Output-only] Whether the query result was fetched from the query cache.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cacheHit;

  /**
   * [Output-only] [Preview] The number of row access policies affected by a DDL statement. Present
   * only for DROP ALL ROW ACCESS POLICIES queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ddlAffectedRowAccessPolicyCount;

  /**
   * [Output-only] The DDL destination table. Present only for ALTER TABLE RENAME TO queries. Note
   * that ddl_target_table is used just for its type information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableReference ddlDestinationTable;

  /**
   * The DDL operation performed, possibly dependent on the pre-existence of the DDL target.
   * Possible values (new values might be added in the future): "CREATE": The query created the DDL
   * target. "SKIP": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table
   * already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. "REPLACE":
   * The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the
   * table already exists. "DROP": The query deleted the DDL target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ddlOperationPerformed;

  /**
   * [Output-only] The DDL target dataset. Present only for CREATE/ALTER/DROP SCHEMA queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatasetReference ddlTargetDataset;

  /**
   * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RoutineReference ddlTargetRoutine;

  /**
   * [Output-only] [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW
   * ACCESS POLICY queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RowAccessPolicyReference ddlTargetRowAccessPolicy;

  /**
   * [Output-only] The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW
   * ACCESS POLICIES queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableReference ddlTargetTable;

  /**
   * [Output-only] Detailed statistics for DML statements Present only for DML statements INSERT,
   * UPDATE, DELETE or TRUNCATE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object dmlStats;

  /**
   * [Output-only] The original estimate of bytes processed for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long estimatedBytesProcessed;

  /**
   * [Output-only, Beta] Information about create model query job progress.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BigQueryModelTraining modelTraining;

  /**
   * [Output-only, Beta] Deprecated; do not use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer modelTrainingCurrentIteration;

  /**
   * [Output-only, Beta] Deprecated; do not use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long modelTrainingExpectedTotalIteration;

  /**
   * [Output-only] The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numDmlAffectedRows;

  /**
   * [Output-only] Describes execution plan for the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExplainQueryStage> queryPlan;

  static {
    // hack to force ProGuard to consider ExplainQueryStage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ExplainQueryStage.class);
  }

  /**
   * [Output-only] Referenced routines (persistent user-defined functions and stored procedures) for
   * the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RoutineReference> referencedRoutines;

  /**
   * [Output-only] Referenced tables for the job. Queries that reference more than 50 tables will
   * not have a complete list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableReference> referencedTables;

  /**
   * [Output-only] Job resource usage breakdown by reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReservationUsage> reservationUsage;

  static {
    // hack to force ProGuard to consider ReservationUsage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ReservationUsage.class);
  }

  /**
   * [Output-only] The schema of the results. Present only for successful dry run of non-legacy SQL
   * queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableSchema schema;

  /**
   * The type of query statement, if valid. Possible values (new values might be added in the
   * future): "SELECT": SELECT query. "INSERT": INSERT query; see
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
   * "UPDATE": UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-
   * manipulation-language. "DELETE": DELETE query; see
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
   * "MERGE": MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-
   * manipulation-language. "ALTER_TABLE": ALTER TABLE query. "ALTER_VIEW": ALTER VIEW query.
   * "ASSERT": ASSERT condition AS 'description'. "CREATE_FUNCTION": CREATE FUNCTION query.
   * "CREATE_MODEL": CREATE [OR REPLACE] MODEL ... AS SELECT ... . "CREATE_PROCEDURE": CREATE
   * PROCEDURE query. "CREATE_TABLE": CREATE [OR REPLACE] TABLE without AS SELECT.
   * "CREATE_TABLE_AS_SELECT": CREATE [OR REPLACE] TABLE ... AS SELECT ... . "CREATE_VIEW": CREATE
   * [OR REPLACE] VIEW ... AS SELECT ... . "DROP_FUNCTION" : DROP FUNCTION query. "DROP_PROCEDURE":
   * DROP PROCEDURE query. "DROP_TABLE": DROP TABLE query. "DROP_VIEW": DROP VIEW query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statementType;

  /**
   * [Output-only] [Beta] Describes a timeline of job execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QueryTimelineSample> timeline;

  /**
   * [Output-only] Total bytes billed for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalBytesBilled;

  /**
   * [Output-only] Total bytes processed for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalBytesProcessed;

  /**
   * [Output-only] For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the
   * accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown.
   * PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would
   * cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String totalBytesProcessedAccuracy;

  /**
   * [Output-only] Total number of partitions processed from all partitioned tables referenced in
   * the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalPartitionsProcessed;

  /**
   * [Output-only] Slot-milliseconds for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalSlotMs;

  /**
   * Standard SQL only: list of undeclared query parameters detected during a dry run validation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QueryParameter> undeclaredQueryParameters;

  /**
   * [Output-only] Billing tier for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBillingTier() {
    return billingTier;
  }

  /**
   * [Output-only] Billing tier for the job.
   * @param billingTier billingTier or {@code null} for none
   */
  public JobStatistics2 setBillingTier(java.lang.Integer billingTier) {
    this.billingTier = billingTier;
    return this;
  }

  /**
   * [Output-only] Whether the query result was fetched from the query cache.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCacheHit() {
    return cacheHit;
  }

  /**
   * [Output-only] Whether the query result was fetched from the query cache.
   * @param cacheHit cacheHit or {@code null} for none
   */
  public JobStatistics2 setCacheHit(java.lang.Boolean cacheHit) {
    this.cacheHit = cacheHit;
    return this;
  }

  /**
   * [Output-only] [Preview] The number of row access policies affected by a DDL statement. Present
   * only for DROP ALL ROW ACCESS POLICIES queries.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDdlAffectedRowAccessPolicyCount() {
    return ddlAffectedRowAccessPolicyCount;
  }

  /**
   * [Output-only] [Preview] The number of row access policies affected by a DDL statement. Present
   * only for DROP ALL ROW ACCESS POLICIES queries.
   * @param ddlAffectedRowAccessPolicyCount ddlAffectedRowAccessPolicyCount or {@code null} for none
   */
  public JobStatistics2 setDdlAffectedRowAccessPolicyCount(java.lang.Long ddlAffectedRowAccessPolicyCount) {
    this.ddlAffectedRowAccessPolicyCount = ddlAffectedRowAccessPolicyCount;
    return this;
  }

  /**
   * [Output-only] The DDL destination table. Present only for ALTER TABLE RENAME TO queries. Note
   * that ddl_target_table is used just for its type information.
   * @return value or {@code null} for none
   */
  public TableReference getDdlDestinationTable() {
    return ddlDestinationTable;
  }

  /**
   * [Output-only] The DDL destination table. Present only for ALTER TABLE RENAME TO queries. Note
   * that ddl_target_table is used just for its type information.
   * @param ddlDestinationTable ddlDestinationTable or {@code null} for none
   */
  public JobStatistics2 setDdlDestinationTable(TableReference ddlDestinationTable) {
    this.ddlDestinationTable = ddlDestinationTable;
    return this;
  }

  /**
   * The DDL operation performed, possibly dependent on the pre-existence of the DDL target.
   * Possible values (new values might be added in the future): "CREATE": The query created the DDL
   * target. "SKIP": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table
   * already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. "REPLACE":
   * The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the
   * table already exists. "DROP": The query deleted the DDL target.
   * @return value or {@code null} for none
   */
  public java.lang.String getDdlOperationPerformed() {
    return ddlOperationPerformed;
  }

  /**
   * The DDL operation performed, possibly dependent on the pre-existence of the DDL target.
   * Possible values (new values might be added in the future): "CREATE": The query created the DDL
   * target. "SKIP": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table
   * already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. "REPLACE":
   * The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the
   * table already exists. "DROP": The query deleted the DDL target.
   * @param ddlOperationPerformed ddlOperationPerformed or {@code null} for none
   */
  public JobStatistics2 setDdlOperationPerformed(java.lang.String ddlOperationPerformed) {
    this.ddlOperationPerformed = ddlOperationPerformed;
    return this;
  }

  /**
   * [Output-only] The DDL target dataset. Present only for CREATE/ALTER/DROP SCHEMA queries.
   * @return value or {@code null} for none
   */
  public DatasetReference getDdlTargetDataset() {
    return ddlTargetDataset;
  }

  /**
   * [Output-only] The DDL target dataset. Present only for CREATE/ALTER/DROP SCHEMA queries.
   * @param ddlTargetDataset ddlTargetDataset or {@code null} for none
   */
  public JobStatistics2 setDdlTargetDataset(DatasetReference ddlTargetDataset) {
    this.ddlTargetDataset = ddlTargetDataset;
    return this;
  }

  /**
   * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries.
   * @return value or {@code null} for none
   */
  public RoutineReference getDdlTargetRoutine() {
    return ddlTargetRoutine;
  }

  /**
   * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries.
   * @param ddlTargetRoutine ddlTargetRoutine or {@code null} for none
   */
  public JobStatistics2 setDdlTargetRoutine(RoutineReference ddlTargetRoutine) {
    this.ddlTargetRoutine = ddlTargetRoutine;
    return this;
  }

  /**
   * [Output-only] [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW
   * ACCESS POLICY queries.
   * @return value or {@code null} for none
   */
  public RowAccessPolicyReference getDdlTargetRowAccessPolicy() {
    return ddlTargetRowAccessPolicy;
  }

  /**
   * [Output-only] [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW
   * ACCESS POLICY queries.
   * @param ddlTargetRowAccessPolicy ddlTargetRowAccessPolicy or {@code null} for none
   */
  public JobStatistics2 setDdlTargetRowAccessPolicy(RowAccessPolicyReference ddlTargetRowAccessPolicy) {
    this.ddlTargetRowAccessPolicy = ddlTargetRowAccessPolicy;
    return this;
  }

  /**
   * [Output-only] The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW
   * ACCESS POLICIES queries.
   * @return value or {@code null} for none
   */
  public TableReference getDdlTargetTable() {
    return ddlTargetTable;
  }

  /**
   * [Output-only] The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW
   * ACCESS POLICIES queries.
   * @param ddlTargetTable ddlTargetTable or {@code null} for none
   */
  public JobStatistics2 setDdlTargetTable(TableReference ddlTargetTable) {
    this.ddlTargetTable = ddlTargetTable;
    return this;
  }

  /**
   * [Output-only] Detailed statistics for DML statements Present only for DML statements INSERT,
   * UPDATE, DELETE or TRUNCATE.
   * @return value or {@code null} for none
   */
  public java.lang.Object getDmlStats() {
    return dmlStats;
  }

  /**
   * [Output-only] Detailed statistics for DML statements Present only for DML statements INSERT,
   * UPDATE, DELETE or TRUNCATE.
   * @param dmlStats dmlStats or {@code null} for none
   */
  public JobStatistics2 setDmlStats(java.lang.Object dmlStats) {
    this.dmlStats = dmlStats;
    return this;
  }

  /**
   * [Output-only] The original estimate of bytes processed for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEstimatedBytesProcessed() {
    return estimatedBytesProcessed;
  }

  /**
   * [Output-only] The original estimate of bytes processed for the job.
   * @param estimatedBytesProcessed estimatedBytesProcessed or {@code null} for none
   */
  public JobStatistics2 setEstimatedBytesProcessed(java.lang.Long estimatedBytesProcessed) {
    this.estimatedBytesProcessed = estimatedBytesProcessed;
    return this;
  }

  /**
   * [Output-only, Beta] Information about create model query job progress.
   * @return value or {@code null} for none
   */
  public BigQueryModelTraining getModelTraining() {
    return modelTraining;
  }

  /**
   * [Output-only, Beta] Information about create model query job progress.
   * @param modelTraining modelTraining or {@code null} for none
   */
  public JobStatistics2 setModelTraining(BigQueryModelTraining modelTraining) {
    this.modelTraining = modelTraining;
    return this;
  }

  /**
   * [Output-only, Beta] Deprecated; do not use.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getModelTrainingCurrentIteration() {
    return modelTrainingCurrentIteration;
  }

  /**
   * [Output-only, Beta] Deprecated; do not use.
   * @param modelTrainingCurrentIteration modelTrainingCurrentIteration or {@code null} for none
   */
  public JobStatistics2 setModelTrainingCurrentIteration(java.lang.Integer modelTrainingCurrentIteration) {
    this.modelTrainingCurrentIteration = modelTrainingCurrentIteration;
    return this;
  }

  /**
   * [Output-only, Beta] Deprecated; do not use.
   * @return value or {@code null} for none
   */
  public java.lang.Long getModelTrainingExpectedTotalIteration() {
    return modelTrainingExpectedTotalIteration;
  }

  /**
   * [Output-only, Beta] Deprecated; do not use.
   * @param modelTrainingExpectedTotalIteration modelTrainingExpectedTotalIteration or {@code null} for none
   */
  public JobStatistics2 setModelTrainingExpectedTotalIteration(java.lang.Long modelTrainingExpectedTotalIteration) {
    this.modelTrainingExpectedTotalIteration = modelTrainingExpectedTotalIteration;
    return this;
  }

  /**
   * [Output-only] The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumDmlAffectedRows() {
    return numDmlAffectedRows;
  }

  /**
   * [Output-only] The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * @param numDmlAffectedRows numDmlAffectedRows or {@code null} for none
   */
  public JobStatistics2 setNumDmlAffectedRows(java.lang.Long numDmlAffectedRows) {
    this.numDmlAffectedRows = numDmlAffectedRows;
    return this;
  }

  /**
   * [Output-only] Describes execution plan for the query.
   * @return value or {@code null} for none
   */
  public java.util.List<ExplainQueryStage> getQueryPlan() {
    return queryPlan;
  }

  /**
   * [Output-only] Describes execution plan for the query.
   * @param queryPlan queryPlan or {@code null} for none
   */
  public JobStatistics2 setQueryPlan(java.util.List<ExplainQueryStage> queryPlan) {
    this.queryPlan = queryPlan;
    return this;
  }

  /**
   * [Output-only] Referenced routines (persistent user-defined functions and stored procedures) for
   * the job.
   * @return value or {@code null} for none
   */
  public java.util.List<RoutineReference> getReferencedRoutines() {
    return referencedRoutines;
  }

  /**
   * [Output-only] Referenced routines (persistent user-defined functions and stored procedures) for
   * the job.
   * @param referencedRoutines referencedRoutines or {@code null} for none
   */
  public JobStatistics2 setReferencedRoutines(java.util.List<RoutineReference> referencedRoutines) {
    this.referencedRoutines = referencedRoutines;
    return this;
  }

  /**
   * [Output-only] Referenced tables for the job. Queries that reference more than 50 tables will
   * not have a complete list.
   * @return value or {@code null} for none
   */
  public java.util.List<TableReference> getReferencedTables() {
    return referencedTables;
  }

  /**
   * [Output-only] Referenced tables for the job. Queries that reference more than 50 tables will
   * not have a complete list.
   * @param referencedTables referencedTables or {@code null} for none
   */
  public JobStatistics2 setReferencedTables(java.util.List<TableReference> referencedTables) {
    this.referencedTables = referencedTables;
    return this;
  }

  /**
   * [Output-only] Job resource usage breakdown by reservation.
   * @return value or {@code null} for none
   */
  public java.util.List<ReservationUsage> getReservationUsage() {
    return reservationUsage;
  }

  /**
   * [Output-only] Job resource usage breakdown by reservation.
   * @param reservationUsage reservationUsage or {@code null} for none
   */
  public JobStatistics2 setReservationUsage(java.util.List<ReservationUsage> reservationUsage) {
    this.reservationUsage = reservationUsage;
    return this;
  }

  /**
   * [Output-only] The schema of the results. Present only for successful dry run of non-legacy SQL
   * queries.
   * @return value or {@code null} for none
   */
  public TableSchema getSchema() {
    return schema;
  }

  /**
   * [Output-only] The schema of the results. Present only for successful dry run of non-legacy SQL
   * queries.
   * @param schema schema or {@code null} for none
   */
  public JobStatistics2 setSchema(TableSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * The type of query statement, if valid. Possible values (new values might be added in the
   * future): "SELECT": SELECT query. "INSERT": INSERT query; see
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
   * "UPDATE": UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-
   * manipulation-language. "DELETE": DELETE query; see
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
   * "MERGE": MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-
   * manipulation-language. "ALTER_TABLE": ALTER TABLE query. "ALTER_VIEW": ALTER VIEW query.
   * "ASSERT": ASSERT condition AS 'description'. "CREATE_FUNCTION": CREATE FUNCTION query.
   * "CREATE_MODEL": CREATE [OR REPLACE] MODEL ... AS SELECT ... . "CREATE_PROCEDURE": CREATE
   * PROCEDURE query. "CREATE_TABLE": CREATE [OR REPLACE] TABLE without AS SELECT.
   * "CREATE_TABLE_AS_SELECT": CREATE [OR REPLACE] TABLE ... AS SELECT ... . "CREATE_VIEW": CREATE
   * [OR REPLACE] VIEW ... AS SELECT ... . "DROP_FUNCTION" : DROP FUNCTION query. "DROP_PROCEDURE":
   * DROP PROCEDURE query. "DROP_TABLE": DROP TABLE query. "DROP_VIEW": DROP VIEW query.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatementType() {
    return statementType;
  }

  /**
   * The type of query statement, if valid. Possible values (new values might be added in the
   * future): "SELECT": SELECT query. "INSERT": INSERT query; see
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
   * "UPDATE": UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-
   * manipulation-language. "DELETE": DELETE query; see
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
   * "MERGE": MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-
   * manipulation-language. "ALTER_TABLE": ALTER TABLE query. "ALTER_VIEW": ALTER VIEW query.
   * "ASSERT": ASSERT condition AS 'description'. "CREATE_FUNCTION": CREATE FUNCTION query.
   * "CREATE_MODEL": CREATE [OR REPLACE] MODEL ... AS SELECT ... . "CREATE_PROCEDURE": CREATE
   * PROCEDURE query. "CREATE_TABLE": CREATE [OR REPLACE] TABLE without AS SELECT.
   * "CREATE_TABLE_AS_SELECT": CREATE [OR REPLACE] TABLE ... AS SELECT ... . "CREATE_VIEW": CREATE
   * [OR REPLACE] VIEW ... AS SELECT ... . "DROP_FUNCTION" : DROP FUNCTION query. "DROP_PROCEDURE":
   * DROP PROCEDURE query. "DROP_TABLE": DROP TABLE query. "DROP_VIEW": DROP VIEW query.
   * @param statementType statementType or {@code null} for none
   */
  public JobStatistics2 setStatementType(java.lang.String statementType) {
    this.statementType = statementType;
    return this;
  }

  /**
   * [Output-only] [Beta] Describes a timeline of job execution.
   * @return value or {@code null} for none
   */
  public java.util.List<QueryTimelineSample> getTimeline() {
    return timeline;
  }

  /**
   * [Output-only] [Beta] Describes a timeline of job execution.
   * @param timeline timeline or {@code null} for none
   */
  public JobStatistics2 setTimeline(java.util.List<QueryTimelineSample> timeline) {
    this.timeline = timeline;
    return this;
  }

  /**
   * [Output-only] Total bytes billed for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalBytesBilled() {
    return totalBytesBilled;
  }

  /**
   * [Output-only] Total bytes billed for the job.
   * @param totalBytesBilled totalBytesBilled or {@code null} for none
   */
  public JobStatistics2 setTotalBytesBilled(java.lang.Long totalBytesBilled) {
    this.totalBytesBilled = totalBytesBilled;
    return this;
  }

  /**
   * [Output-only] Total bytes processed for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalBytesProcessed() {
    return totalBytesProcessed;
  }

  /**
   * [Output-only] Total bytes processed for the job.
   * @param totalBytesProcessed totalBytesProcessed or {@code null} for none
   */
  public JobStatistics2 setTotalBytesProcessed(java.lang.Long totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
    return this;
  }

  /**
   * [Output-only] For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the
   * accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown.
   * PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would
   * cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
   * @return value or {@code null} for none
   */
  public java.lang.String getTotalBytesProcessedAccuracy() {
    return totalBytesProcessedAccuracy;
  }

  /**
   * [Output-only] For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the
   * accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown.
   * PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would
   * cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
   * @param totalBytesProcessedAccuracy totalBytesProcessedAccuracy or {@code null} for none
   */
  public JobStatistics2 setTotalBytesProcessedAccuracy(java.lang.String totalBytesProcessedAccuracy) {
    this.totalBytesProcessedAccuracy = totalBytesProcessedAccuracy;
    return this;
  }

  /**
   * [Output-only] Total number of partitions processed from all partitioned tables referenced in
   * the job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalPartitionsProcessed() {
    return totalPartitionsProcessed;
  }

  /**
   * [Output-only] Total number of partitions processed from all partitioned tables referenced in
   * the job.
   * @param totalPartitionsProcessed totalPartitionsProcessed or {@code null} for none
   */
  public JobStatistics2 setTotalPartitionsProcessed(java.lang.Long totalPartitionsProcessed) {
    this.totalPartitionsProcessed = totalPartitionsProcessed;
    return this;
  }

  /**
   * [Output-only] Slot-milliseconds for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalSlotMs() {
    return totalSlotMs;
  }

  /**
   * [Output-only] Slot-milliseconds for the job.
   * @param totalSlotMs totalSlotMs or {@code null} for none
   */
  public JobStatistics2 setTotalSlotMs(java.lang.Long totalSlotMs) {
    this.totalSlotMs = totalSlotMs;
    return this;
  }

  /**
   * Standard SQL only: list of undeclared query parameters detected during a dry run validation.
   * @return value or {@code null} for none
   */
  public java.util.List<QueryParameter> getUndeclaredQueryParameters() {
    return undeclaredQueryParameters;
  }

  /**
   * Standard SQL only: list of undeclared query parameters detected during a dry run validation.
   * @param undeclaredQueryParameters undeclaredQueryParameters or {@code null} for none
   */
  public JobStatistics2 setUndeclaredQueryParameters(java.util.List<QueryParameter> undeclaredQueryParameters) {
    this.undeclaredQueryParameters = undeclaredQueryParameters;
    return this;
  }

  @Override
  public JobStatistics2 set(String fieldName, Object value) {
    return (JobStatistics2) super.set(fieldName, value);
  }

  @Override
  public JobStatistics2 clone() {
    return (JobStatistics2) super.clone();
  }

  /**
   * Model definition for JobStatistics2ReservationUsage.
   */
  public static final class ReservationUsage extends com.google.api.client.json.GenericJson {

    /**
     * [Output-only] Reservation name or "unreserved" for on-demand resources usage.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * [Output-only] Slot-milliseconds the job spent in the given reservation.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long slotMs;

    /**
     * [Output-only] Reservation name or "unreserved" for on-demand resources usage.
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * [Output-only] Reservation name or "unreserved" for on-demand resources usage.
     * @param name name or {@code null} for none
     */
    public ReservationUsage setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    /**
     * [Output-only] Slot-milliseconds the job spent in the given reservation.
     * @return value or {@code null} for none
     */
    public java.lang.Long getSlotMs() {
      return slotMs;
    }

    /**
     * [Output-only] Slot-milliseconds the job spent in the given reservation.
     * @param slotMs slotMs or {@code null} for none
     */
    public ReservationUsage setSlotMs(java.lang.Long slotMs) {
      this.slotMs = slotMs;
      return this;
    }

    @Override
    public ReservationUsage set(String fieldName, Object value) {
      return (ReservationUsage) super.set(fieldName, value);
    }

    @Override
    public ReservationUsage clone() {
      return (ReservationUsage) super.clone();
    }

  }

}
