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

package com.google.api.services.analyticsdata.v1beta.model;

/**
 * The sort options.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderBy extends com.google.api.client.json.GenericJson {

  /**
   * If true, sorts by descending order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean desc;

  /**
   * Sorts results by a dimension's values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionOrderBy dimension;

  /**
   * Sorts results by a metric's values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricOrderBy metric;

  /**
   * Sorts results by a metric's values within a pivot column group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PivotOrderBy pivot;

  /**
   * If true, sorts by descending order.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDesc() {
    return desc;
  }

  /**
   * If true, sorts by descending order.
   * @param desc desc or {@code null} for none
   */
  public OrderBy setDesc(java.lang.Boolean desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Sorts results by a dimension's values.
   * @return value or {@code null} for none
   */
  public DimensionOrderBy getDimension() {
    return dimension;
  }

  /**
   * Sorts results by a dimension's values.
   * @param dimension dimension or {@code null} for none
   */
  public OrderBy setDimension(DimensionOrderBy dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * Sorts results by a metric's values.
   * @return value or {@code null} for none
   */
  public MetricOrderBy getMetric() {
    return metric;
  }

  /**
   * Sorts results by a metric's values.
   * @param metric metric or {@code null} for none
   */
  public OrderBy setMetric(MetricOrderBy metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Sorts results by a metric's values within a pivot column group.
   * @return value or {@code null} for none
   */
  public PivotOrderBy getPivot() {
    return pivot;
  }

  /**
   * Sorts results by a metric's values within a pivot column group.
   * @param pivot pivot or {@code null} for none
   */
  public OrderBy setPivot(PivotOrderBy pivot) {
    this.pivot = pivot;
    return this;
  }

  @Override
  public OrderBy set(String fieldName, Object value) {
    return (OrderBy) super.set(fieldName, value);
  }

  @Override
  public OrderBy clone() {
    return (OrderBy) super.clone();
  }

}
