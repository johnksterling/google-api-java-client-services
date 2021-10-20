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

package com.google.api.services.storagetransfer.v1.model;

/**
 * A collection of counters that report the progress of a transfer operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransferCounters extends com.google.api.client.json.GenericJson {

  /**
   * Bytes that are copied to the data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesCopiedToSink;

  /**
   * Bytes that are deleted from the data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesDeletedFromSink;

  /**
   * Bytes that are deleted from the data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesDeletedFromSource;

  /**
   * Bytes that failed to be deleted from the data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesFailedToDeleteFromSink;

  /**
   * Bytes found in the data source that are scheduled to be transferred, excluding any that are
   * filtered based on object conditions or skipped due to sync.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesFoundFromSource;

  /**
   * Bytes found only in the data sink that are scheduled to be deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesFoundOnlyFromSink;

  /**
   * Bytes in the data source that failed to be transferred or that failed to be deleted after being
   * transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesFromSourceFailed;

  /**
   * Bytes in the data source that are not transferred because they already exist in the data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesFromSourceSkippedBySync;

  /**
   * For transfers involving PosixFilesystem only. Number of listing failures for each directory
   * found at the source. Potential failures when listing a directory include permission failure or
   * block failure. If listing a directory fails, no files in the directory are transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long directoriesFailedToListFromSource;

  /**
   * For transfers involving PosixFilesystem only. Number of directories found while listing. For
   * example, if the root directory of the transfer is `base/` and there are two other directories,
   * `a/` and `b/` under this directory, the count after listing `base/`, `base/a/` and `base/b/` is
   * 3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long directoriesFoundFromSource;

  /**
   * For transfers involving PosixFilesystem only. Number of successful listings for each directory
   * found at the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long directoriesSuccessfullyListedFromSource;

  /**
   * Number of successfully cleaned up intermediate objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long intermediateObjectsCleanedUp;

  /**
   * Number of intermediate objects failed cleaned up.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long intermediateObjectsFailedCleanedUp;

  /**
   * Objects that are copied to the data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectsCopiedToSink;

  /**
   * Objects that are deleted from the data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectsDeletedFromSink;

  /**
   * Objects that are deleted from the data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectsDeletedFromSource;

  /**
   * Objects that failed to be deleted from the data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectsFailedToDeleteFromSink;

  /**
   * Objects found in the data source that are scheduled to be transferred, excluding any that are
   * filtered based on object conditions or skipped due to sync.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectsFoundFromSource;

  /**
   * Objects found only in the data sink that are scheduled to be deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectsFoundOnlyFromSink;

  /**
   * Objects in the data source that failed to be transferred or that failed to be deleted after
   * being transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectsFromSourceFailed;

  /**
   * Objects in the data source that are not transferred because they already exist in the data
   * sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectsFromSourceSkippedBySync;

  /**
   * Bytes that are copied to the data sink.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesCopiedToSink() {
    return bytesCopiedToSink;
  }

  /**
   * Bytes that are copied to the data sink.
   * @param bytesCopiedToSink bytesCopiedToSink or {@code null} for none
   */
  public TransferCounters setBytesCopiedToSink(java.lang.Long bytesCopiedToSink) {
    this.bytesCopiedToSink = bytesCopiedToSink;
    return this;
  }

  /**
   * Bytes that are deleted from the data sink.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesDeletedFromSink() {
    return bytesDeletedFromSink;
  }

  /**
   * Bytes that are deleted from the data sink.
   * @param bytesDeletedFromSink bytesDeletedFromSink or {@code null} for none
   */
  public TransferCounters setBytesDeletedFromSink(java.lang.Long bytesDeletedFromSink) {
    this.bytesDeletedFromSink = bytesDeletedFromSink;
    return this;
  }

  /**
   * Bytes that are deleted from the data source.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesDeletedFromSource() {
    return bytesDeletedFromSource;
  }

  /**
   * Bytes that are deleted from the data source.
   * @param bytesDeletedFromSource bytesDeletedFromSource or {@code null} for none
   */
  public TransferCounters setBytesDeletedFromSource(java.lang.Long bytesDeletedFromSource) {
    this.bytesDeletedFromSource = bytesDeletedFromSource;
    return this;
  }

  /**
   * Bytes that failed to be deleted from the data sink.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesFailedToDeleteFromSink() {
    return bytesFailedToDeleteFromSink;
  }

  /**
   * Bytes that failed to be deleted from the data sink.
   * @param bytesFailedToDeleteFromSink bytesFailedToDeleteFromSink or {@code null} for none
   */
  public TransferCounters setBytesFailedToDeleteFromSink(java.lang.Long bytesFailedToDeleteFromSink) {
    this.bytesFailedToDeleteFromSink = bytesFailedToDeleteFromSink;
    return this;
  }

  /**
   * Bytes found in the data source that are scheduled to be transferred, excluding any that are
   * filtered based on object conditions or skipped due to sync.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesFoundFromSource() {
    return bytesFoundFromSource;
  }

  /**
   * Bytes found in the data source that are scheduled to be transferred, excluding any that are
   * filtered based on object conditions or skipped due to sync.
   * @param bytesFoundFromSource bytesFoundFromSource or {@code null} for none
   */
  public TransferCounters setBytesFoundFromSource(java.lang.Long bytesFoundFromSource) {
    this.bytesFoundFromSource = bytesFoundFromSource;
    return this;
  }

  /**
   * Bytes found only in the data sink that are scheduled to be deleted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesFoundOnlyFromSink() {
    return bytesFoundOnlyFromSink;
  }

  /**
   * Bytes found only in the data sink that are scheduled to be deleted.
   * @param bytesFoundOnlyFromSink bytesFoundOnlyFromSink or {@code null} for none
   */
  public TransferCounters setBytesFoundOnlyFromSink(java.lang.Long bytesFoundOnlyFromSink) {
    this.bytesFoundOnlyFromSink = bytesFoundOnlyFromSink;
    return this;
  }

  /**
   * Bytes in the data source that failed to be transferred or that failed to be deleted after being
   * transferred.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesFromSourceFailed() {
    return bytesFromSourceFailed;
  }

  /**
   * Bytes in the data source that failed to be transferred or that failed to be deleted after being
   * transferred.
   * @param bytesFromSourceFailed bytesFromSourceFailed or {@code null} for none
   */
  public TransferCounters setBytesFromSourceFailed(java.lang.Long bytesFromSourceFailed) {
    this.bytesFromSourceFailed = bytesFromSourceFailed;
    return this;
  }

  /**
   * Bytes in the data source that are not transferred because they already exist in the data sink.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesFromSourceSkippedBySync() {
    return bytesFromSourceSkippedBySync;
  }

  /**
   * Bytes in the data source that are not transferred because they already exist in the data sink.
   * @param bytesFromSourceSkippedBySync bytesFromSourceSkippedBySync or {@code null} for none
   */
  public TransferCounters setBytesFromSourceSkippedBySync(java.lang.Long bytesFromSourceSkippedBySync) {
    this.bytesFromSourceSkippedBySync = bytesFromSourceSkippedBySync;
    return this;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of listing failures for each directory
   * found at the source. Potential failures when listing a directory include permission failure or
   * block failure. If listing a directory fails, no files in the directory are transferred.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDirectoriesFailedToListFromSource() {
    return directoriesFailedToListFromSource;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of listing failures for each directory
   * found at the source. Potential failures when listing a directory include permission failure or
   * block failure. If listing a directory fails, no files in the directory are transferred.
   * @param directoriesFailedToListFromSource directoriesFailedToListFromSource or {@code null} for none
   */
  public TransferCounters setDirectoriesFailedToListFromSource(java.lang.Long directoriesFailedToListFromSource) {
    this.directoriesFailedToListFromSource = directoriesFailedToListFromSource;
    return this;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of directories found while listing. For
   * example, if the root directory of the transfer is `base/` and there are two other directories,
   * `a/` and `b/` under this directory, the count after listing `base/`, `base/a/` and `base/b/` is
   * 3.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDirectoriesFoundFromSource() {
    return directoriesFoundFromSource;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of directories found while listing. For
   * example, if the root directory of the transfer is `base/` and there are two other directories,
   * `a/` and `b/` under this directory, the count after listing `base/`, `base/a/` and `base/b/` is
   * 3.
   * @param directoriesFoundFromSource directoriesFoundFromSource or {@code null} for none
   */
  public TransferCounters setDirectoriesFoundFromSource(java.lang.Long directoriesFoundFromSource) {
    this.directoriesFoundFromSource = directoriesFoundFromSource;
    return this;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of successful listings for each directory
   * found at the source.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDirectoriesSuccessfullyListedFromSource() {
    return directoriesSuccessfullyListedFromSource;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of successful listings for each directory
   * found at the source.
   * @param directoriesSuccessfullyListedFromSource directoriesSuccessfullyListedFromSource or {@code null} for none
   */
  public TransferCounters setDirectoriesSuccessfullyListedFromSource(java.lang.Long directoriesSuccessfullyListedFromSource) {
    this.directoriesSuccessfullyListedFromSource = directoriesSuccessfullyListedFromSource;
    return this;
  }

  /**
   * Number of successfully cleaned up intermediate objects.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntermediateObjectsCleanedUp() {
    return intermediateObjectsCleanedUp;
  }

  /**
   * Number of successfully cleaned up intermediate objects.
   * @param intermediateObjectsCleanedUp intermediateObjectsCleanedUp or {@code null} for none
   */
  public TransferCounters setIntermediateObjectsCleanedUp(java.lang.Long intermediateObjectsCleanedUp) {
    this.intermediateObjectsCleanedUp = intermediateObjectsCleanedUp;
    return this;
  }

  /**
   * Number of intermediate objects failed cleaned up.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntermediateObjectsFailedCleanedUp() {
    return intermediateObjectsFailedCleanedUp;
  }

  /**
   * Number of intermediate objects failed cleaned up.
   * @param intermediateObjectsFailedCleanedUp intermediateObjectsFailedCleanedUp or {@code null} for none
   */
  public TransferCounters setIntermediateObjectsFailedCleanedUp(java.lang.Long intermediateObjectsFailedCleanedUp) {
    this.intermediateObjectsFailedCleanedUp = intermediateObjectsFailedCleanedUp;
    return this;
  }

  /**
   * Objects that are copied to the data sink.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectsCopiedToSink() {
    return objectsCopiedToSink;
  }

  /**
   * Objects that are copied to the data sink.
   * @param objectsCopiedToSink objectsCopiedToSink or {@code null} for none
   */
  public TransferCounters setObjectsCopiedToSink(java.lang.Long objectsCopiedToSink) {
    this.objectsCopiedToSink = objectsCopiedToSink;
    return this;
  }

  /**
   * Objects that are deleted from the data sink.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectsDeletedFromSink() {
    return objectsDeletedFromSink;
  }

  /**
   * Objects that are deleted from the data sink.
   * @param objectsDeletedFromSink objectsDeletedFromSink or {@code null} for none
   */
  public TransferCounters setObjectsDeletedFromSink(java.lang.Long objectsDeletedFromSink) {
    this.objectsDeletedFromSink = objectsDeletedFromSink;
    return this;
  }

  /**
   * Objects that are deleted from the data source.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectsDeletedFromSource() {
    return objectsDeletedFromSource;
  }

  /**
   * Objects that are deleted from the data source.
   * @param objectsDeletedFromSource objectsDeletedFromSource or {@code null} for none
   */
  public TransferCounters setObjectsDeletedFromSource(java.lang.Long objectsDeletedFromSource) {
    this.objectsDeletedFromSource = objectsDeletedFromSource;
    return this;
  }

  /**
   * Objects that failed to be deleted from the data sink.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectsFailedToDeleteFromSink() {
    return objectsFailedToDeleteFromSink;
  }

  /**
   * Objects that failed to be deleted from the data sink.
   * @param objectsFailedToDeleteFromSink objectsFailedToDeleteFromSink or {@code null} for none
   */
  public TransferCounters setObjectsFailedToDeleteFromSink(java.lang.Long objectsFailedToDeleteFromSink) {
    this.objectsFailedToDeleteFromSink = objectsFailedToDeleteFromSink;
    return this;
  }

  /**
   * Objects found in the data source that are scheduled to be transferred, excluding any that are
   * filtered based on object conditions or skipped due to sync.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectsFoundFromSource() {
    return objectsFoundFromSource;
  }

  /**
   * Objects found in the data source that are scheduled to be transferred, excluding any that are
   * filtered based on object conditions or skipped due to sync.
   * @param objectsFoundFromSource objectsFoundFromSource or {@code null} for none
   */
  public TransferCounters setObjectsFoundFromSource(java.lang.Long objectsFoundFromSource) {
    this.objectsFoundFromSource = objectsFoundFromSource;
    return this;
  }

  /**
   * Objects found only in the data sink that are scheduled to be deleted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectsFoundOnlyFromSink() {
    return objectsFoundOnlyFromSink;
  }

  /**
   * Objects found only in the data sink that are scheduled to be deleted.
   * @param objectsFoundOnlyFromSink objectsFoundOnlyFromSink or {@code null} for none
   */
  public TransferCounters setObjectsFoundOnlyFromSink(java.lang.Long objectsFoundOnlyFromSink) {
    this.objectsFoundOnlyFromSink = objectsFoundOnlyFromSink;
    return this;
  }

  /**
   * Objects in the data source that failed to be transferred or that failed to be deleted after
   * being transferred.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectsFromSourceFailed() {
    return objectsFromSourceFailed;
  }

  /**
   * Objects in the data source that failed to be transferred or that failed to be deleted after
   * being transferred.
   * @param objectsFromSourceFailed objectsFromSourceFailed or {@code null} for none
   */
  public TransferCounters setObjectsFromSourceFailed(java.lang.Long objectsFromSourceFailed) {
    this.objectsFromSourceFailed = objectsFromSourceFailed;
    return this;
  }

  /**
   * Objects in the data source that are not transferred because they already exist in the data
   * sink.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectsFromSourceSkippedBySync() {
    return objectsFromSourceSkippedBySync;
  }

  /**
   * Objects in the data source that are not transferred because they already exist in the data
   * sink.
   * @param objectsFromSourceSkippedBySync objectsFromSourceSkippedBySync or {@code null} for none
   */
  public TransferCounters setObjectsFromSourceSkippedBySync(java.lang.Long objectsFromSourceSkippedBySync) {
    this.objectsFromSourceSkippedBySync = objectsFromSourceSkippedBySync;
    return this;
  }

  @Override
  public TransferCounters set(String fieldName, Object value) {
    return (TransferCounters) super.set(fieldName, value);
  }

  @Override
  public TransferCounters clone() {
    return (TransferCounters) super.clone();
  }

}
