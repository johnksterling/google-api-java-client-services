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

package com.google.api.services.playdeveloperreporting.v1alpha1.model;

/**
 * Singleton resource representing the set of error report metrics. This metric set contains un-
 * normalized error report counts. **Supported aggregation periods:** * DAILY: metrics are
 * aggregated in calendar date intervals. The default and only supported timezone is
 * `America/Los_Angeles`. **Supported metrics:** * `errorReportCount` (`google.type.Decimal`):
 * Absolute count of individual error reports that have been received for an app. * `distinctUsers`
 * (`google.type.Decimal`): Count of distinct users for which reports have been received. Care must
 * be taken not to aggregate this count further, as it may result in users being counted multiple
 * times. **Required dimension:** This dimension must be always specified in all requests in the
 * `dimensions` field in query requests. * `reportType` (string): the type of error. The value
 * should correspond to one of the possible values in ErrorType. **Supported dimensions:** *
 * `apiLevel` (string): the API level of Android that was running on the user's device. *
 * `versionCode` (int64): version of the app that was running on the user's device. * `deviceModel`
 * (string): unique identifier of the user's device model. * `deviceType` (string): identifier of
 * the device's form factor, e.g., PHONE. * `issueId` (string): the id an error was assigned to. The
 * value should correspond to the `{issue}` component of the issue name. * `deviceRamBucket`
 * (int64): RAM of the device, in MB, in buckets (3GB, 4GB, etc.). * `deviceSocMake` (string): Make
 * of the device's primary system-on-chip, e.g., Samsung.
 * [Reference](https://developer.android.com/reference/android/os/Build#SOC_MANUFACTURER) *
 * `deviceSocModel` (string): Model of the device's primary system-on-chip, e.g., "Exynos 2100".
 * [Reference](https://developer.android.com/reference/android/os/Build#SOC_MODEL) * `deviceCpuMake`
 * (string): Make of the device's CPU, e.g., Qualcomm. * `deviceCpuModel` (string): Model of the
 * device's CPU, e.g., "Kryo 240". * `deviceGpuMake` (string): Make of the device's GPU, e.g., ARM.
 * * `deviceGpuModel` (string): Model of the device's GPU, e.g., Mali. * `deviceGpuVersion`
 * (string): Version of the device's GPU, e.g., T750. * `deviceVulkanVersion` (string): Vulkan
 * version of the device, e.g., "4198400". * `deviceGlEsVersion` (string): OpenGL ES version of the
 * device, e.g., "196610". * `deviceScreenSize` (string): Screen size of the device, e.g., NORMAL,
 * LARGE. * `deviceScreenDpi` (string): Screen density of the device, e.g., mdpi, hdpi. **Required
 * permissions**: to access this resource, the calling user needs the _View app information (read-
 * only)_ permission for the app. **Related metric sets:** * vitals.errors.counts contains
 * normalized metrics about Crashes, another stability metric. * vitals.errors.counts contains
 * normalized metrics about ANRs, another stability metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet extends com.google.api.client.json.GenericJson {

  /**
   * Summary about data freshness in this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePlayDeveloperReportingV1alpha1FreshnessInfo freshnessInfo;

  /**
   * The resource name. Format: apps/{app}/errorCountMetricSet
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Summary about data freshness in this resource.
   * @return value or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1FreshnessInfo getFreshnessInfo() {
    return freshnessInfo;
  }

  /**
   * Summary about data freshness in this resource.
   * @param freshnessInfo freshnessInfo or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet setFreshnessInfo(GooglePlayDeveloperReportingV1alpha1FreshnessInfo freshnessInfo) {
    this.freshnessInfo = freshnessInfo;
    return this;
  }

  /**
   * The resource name. Format: apps/{app}/errorCountMetricSet
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name. Format: apps/{app}/errorCountMetricSet
   * @param name name or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet set(String fieldName, Object value) {
    return (GooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet) super.set(fieldName, value);
  }

  @Override
  public GooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet clone() {
    return (GooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet) super.clone();
  }

}
