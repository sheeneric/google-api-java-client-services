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

package com.google.api.services.chromepolicy.v1.model;

/**
 * Response message for getting the resolved policy value for a specific target.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromePolicyV1ResolveResponse extends com.google.api.client.json.GenericJson {

  /**
   * The page token used to get the next set of resolved policies found by the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of resolved policies found by the resolve request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromePolicyV1ResolvedPolicy> resolvedPolicies;

  /**
   * The page token used to get the next set of resolved policies found by the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The page token used to get the next set of resolved policies found by the request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleChromePolicyV1ResolveResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of resolved policies found by the resolve request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromePolicyV1ResolvedPolicy> getResolvedPolicies() {
    return resolvedPolicies;
  }

  /**
   * The list of resolved policies found by the resolve request.
   * @param resolvedPolicies resolvedPolicies or {@code null} for none
   */
  public GoogleChromePolicyV1ResolveResponse setResolvedPolicies(java.util.List<GoogleChromePolicyV1ResolvedPolicy> resolvedPolicies) {
    this.resolvedPolicies = resolvedPolicies;
    return this;
  }

  @Override
  public GoogleChromePolicyV1ResolveResponse set(String fieldName, Object value) {
    return (GoogleChromePolicyV1ResolveResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleChromePolicyV1ResolveResponse clone() {
    return (GoogleChromePolicyV1ResolveResponse) super.clone();
  }

}