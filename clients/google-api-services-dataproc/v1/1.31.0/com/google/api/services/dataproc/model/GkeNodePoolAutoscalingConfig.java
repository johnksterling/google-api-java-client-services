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

package com.google.api.services.dataproc.model;

/**
 * GkeNodePoolAutoscaling contains information the cluster autoscaler needs to adjust the size of
 * the node pool to the current cluster usage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GkeNodePoolAutoscalingConfig extends com.google.api.client.json.GenericJson {

  /**
   * The maximum number of nodes in the node pool. Must be >= min_node_count, and must be > 0. Note:
   * Quota must be sufficient to scale up the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxNodeCount;

  /**
   * The minimum number of nodes in the node pool. Must be >= 0 and <= max_node_count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minNodeCount;

  /**
   * The maximum number of nodes in the node pool. Must be >= min_node_count, and must be > 0. Note:
   * Quota must be sufficient to scale up the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxNodeCount() {
    return maxNodeCount;
  }

  /**
   * The maximum number of nodes in the node pool. Must be >= min_node_count, and must be > 0. Note:
   * Quota must be sufficient to scale up the cluster.
   * @param maxNodeCount maxNodeCount or {@code null} for none
   */
  public GkeNodePoolAutoscalingConfig setMaxNodeCount(java.lang.Integer maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
    return this;
  }

  /**
   * The minimum number of nodes in the node pool. Must be >= 0 and <= max_node_count.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinNodeCount() {
    return minNodeCount;
  }

  /**
   * The minimum number of nodes in the node pool. Must be >= 0 and <= max_node_count.
   * @param minNodeCount minNodeCount or {@code null} for none
   */
  public GkeNodePoolAutoscalingConfig setMinNodeCount(java.lang.Integer minNodeCount) {
    this.minNodeCount = minNodeCount;
    return this;
  }

  @Override
  public GkeNodePoolAutoscalingConfig set(String fieldName, Object value) {
    return (GkeNodePoolAutoscalingConfig) super.set(fieldName, value);
  }

  @Override
  public GkeNodePoolAutoscalingConfig clone() {
    return (GkeNodePoolAutoscalingConfig) super.clone();
  }

}
