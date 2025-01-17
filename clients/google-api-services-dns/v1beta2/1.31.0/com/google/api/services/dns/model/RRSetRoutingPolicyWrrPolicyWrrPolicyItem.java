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

package com.google.api.services.dns.model;

/**
 * Model definition for RRSetRoutingPolicyWrrPolicyWrrPolicyItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RRSetRoutingPolicyWrrPolicyWrrPolicyItem extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> rrdatas;

  /**
   * DNSSEC generated signatures for the above wrr_rrdata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> signatureRrdatas;

  /**
   * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems
   * are configured, the probability of returning an rrset is proportional to its weight relative to
   * the sum of weights configured for all items. This weight should be non-negative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double weight;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public RRSetRoutingPolicyWrrPolicyWrrPolicyItem setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRrdatas() {
    return rrdatas;
  }

  /**
   * @param rrdatas rrdatas or {@code null} for none
   */
  public RRSetRoutingPolicyWrrPolicyWrrPolicyItem setRrdatas(java.util.List<java.lang.String> rrdatas) {
    this.rrdatas = rrdatas;
    return this;
  }

  /**
   * DNSSEC generated signatures for the above wrr_rrdata.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSignatureRrdatas() {
    return signatureRrdatas;
  }

  /**
   * DNSSEC generated signatures for the above wrr_rrdata.
   * @param signatureRrdatas signatureRrdatas or {@code null} for none
   */
  public RRSetRoutingPolicyWrrPolicyWrrPolicyItem setSignatureRrdatas(java.util.List<java.lang.String> signatureRrdatas) {
    this.signatureRrdatas = signatureRrdatas;
    return this;
  }

  /**
   * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems
   * are configured, the probability of returning an rrset is proportional to its weight relative to
   * the sum of weights configured for all items. This weight should be non-negative.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWeight() {
    return weight;
  }

  /**
   * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems
   * are configured, the probability of returning an rrset is proportional to its weight relative to
   * the sum of weights configured for all items. This weight should be non-negative.
   * @param weight weight or {@code null} for none
   */
  public RRSetRoutingPolicyWrrPolicyWrrPolicyItem setWeight(java.lang.Double weight) {
    this.weight = weight;
    return this;
  }

  @Override
  public RRSetRoutingPolicyWrrPolicyWrrPolicyItem set(String fieldName, Object value) {
    return (RRSetRoutingPolicyWrrPolicyWrrPolicyItem) super.set(fieldName, value);
  }

  @Override
  public RRSetRoutingPolicyWrrPolicyWrrPolicyItem clone() {
    return (RRSetRoutingPolicyWrrPolicyWrrPolicyItem) super.clone();
  }

}
