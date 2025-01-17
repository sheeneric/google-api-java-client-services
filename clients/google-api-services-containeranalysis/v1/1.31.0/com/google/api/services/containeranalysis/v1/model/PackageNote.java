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

package com.google.api.services.containeranalysis.v1.model;

/**
 * This represents a particular package that is distributed over various channels. E.g., glibc (aka
 * libc6) is distributed by many, at various versions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PackageNote extends com.google.api.client.json.GenericJson {

  /**
   * The various channels by which a package is distributed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Distribution> distribution;

  static {
    // hack to force ProGuard to consider Distribution used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Distribution.class);
  }

  /**
   * Required. Immutable. The name of the package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The various channels by which a package is distributed.
   * @return value or {@code null} for none
   */
  public java.util.List<Distribution> getDistribution() {
    return distribution;
  }

  /**
   * The various channels by which a package is distributed.
   * @param distribution distribution or {@code null} for none
   */
  public PackageNote setDistribution(java.util.List<Distribution> distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Required. Immutable. The name of the package.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Immutable. The name of the package.
   * @param name name or {@code null} for none
   */
  public PackageNote setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public PackageNote set(String fieldName, Object value) {
    return (PackageNote) super.set(fieldName, value);
  }

  @Override
  public PackageNote clone() {
    return (PackageNote) super.clone();
  }

}
