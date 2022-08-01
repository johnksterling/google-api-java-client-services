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

package com.google.api.services.servicemanagement;

/**
 * Available OAuth 2.0 scopes for use with the Service Management API.
 *
 * @since 1.4
 */
public class ServiceManagementScopes {

  /** See, edit, configure, and delete your Google Cloud data and see the email address for your Google Account.. */
  public static final String CLOUD_PLATFORM = "https://www.googleapis.com/auth/cloud-platform";

  /** View your data across Google Cloud services and see the email address of your Google Account. */
  public static final String CLOUD_PLATFORM_READ_ONLY = "https://www.googleapis.com/auth/cloud-platform.read-only";

  /** Manage your Google API service configuration. */
  public static final String SERVICE_MANAGEMENT = "https://www.googleapis.com/auth/service.management";

  /** View your Google API service configuration. */
  public static final String SERVICE_MANAGEMENT_READONLY = "https://www.googleapis.com/auth/service.management.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(CLOUD_PLATFORM);
    set.add(CLOUD_PLATFORM_READ_ONLY);
    set.add(SERVICE_MANAGEMENT);
    set.add(SERVICE_MANAGEMENT_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private ServiceManagementScopes() {
  }
}
