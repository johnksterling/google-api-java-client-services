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

package com.google.api.services.addressvalidation.v1.model;

/**
 * Plus code (http://plus.codes) is a location reference with two formats: global code defining a
 * 14mx14m (1/8000th of a degree) or smaller rectangle, and compound code, replacing the prefix with
 * a reference location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Address Validation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsAddressvalidationV1PlusCode extends com.google.api.client.json.GenericJson {

  /**
   * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing the suffix of the global
   * code and replacing the prefix with a formatted name of a reference entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compoundCode;

  /**
   * Place's global (full) code, such as "9FWM33GV+HQ", representing an 1/8000 by 1/8000 degree area
   * (~14 by 14 meters).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String globalCode;

  /**
   * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing the suffix of the global
   * code and replacing the prefix with a formatted name of a reference entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompoundCode() {
    return compoundCode;
  }

  /**
   * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing the suffix of the global
   * code and replacing the prefix with a formatted name of a reference entity.
   * @param compoundCode compoundCode or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1PlusCode setCompoundCode(java.lang.String compoundCode) {
    this.compoundCode = compoundCode;
    return this;
  }

  /**
   * Place's global (full) code, such as "9FWM33GV+HQ", representing an 1/8000 by 1/8000 degree area
   * (~14 by 14 meters).
   * @return value or {@code null} for none
   */
  public java.lang.String getGlobalCode() {
    return globalCode;
  }

  /**
   * Place's global (full) code, such as "9FWM33GV+HQ", representing an 1/8000 by 1/8000 degree area
   * (~14 by 14 meters).
   * @param globalCode globalCode or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1PlusCode setGlobalCode(java.lang.String globalCode) {
    this.globalCode = globalCode;
    return this;
  }

  @Override
  public GoogleMapsAddressvalidationV1PlusCode set(String fieldName, Object value) {
    return (GoogleMapsAddressvalidationV1PlusCode) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsAddressvalidationV1PlusCode clone() {
    return (GoogleMapsAddressvalidationV1PlusCode) super.clone();
  }

}
