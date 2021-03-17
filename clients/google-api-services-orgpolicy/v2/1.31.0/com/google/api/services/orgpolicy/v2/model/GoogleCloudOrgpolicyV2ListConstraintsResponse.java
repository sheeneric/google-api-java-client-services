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

package com.google.api.services.orgpolicy.v2.model;

/**
 * The response returned from the ListConstraints method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Organization Policy API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudOrgpolicyV2ListConstraintsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The collection of constraints that are available on the targeted resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudOrgpolicyV2Constraint> constraints;

  static {
    // hack to force ProGuard to consider GoogleCloudOrgpolicyV2Constraint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudOrgpolicyV2Constraint.class);
  }

  /**
   * Page token used to retrieve the next page. This is currently not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The collection of constraints that are available on the targeted resource.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudOrgpolicyV2Constraint> getConstraints() {
    return constraints;
  }

  /**
   * The collection of constraints that are available on the targeted resource.
   * @param constraints constraints or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ListConstraintsResponse setConstraints(java.util.List<GoogleCloudOrgpolicyV2Constraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Page token used to retrieve the next page. This is currently not used.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Page token used to retrieve the next page. This is currently not used.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ListConstraintsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudOrgpolicyV2ListConstraintsResponse set(String fieldName, Object value) {
    return (GoogleCloudOrgpolicyV2ListConstraintsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudOrgpolicyV2ListConstraintsResponse clone() {
    return (GoogleCloudOrgpolicyV2ListConstraintsResponse) super.clone();
  }

}