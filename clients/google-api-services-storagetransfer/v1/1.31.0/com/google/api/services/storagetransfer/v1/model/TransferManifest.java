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
 * Specifies where the manifest is located.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransferManifest extends com.google.api.client.json.GenericJson {

  /**
   * Holds URI-encoded path to find the manifest. It can be located in data_source, data_sink, or
   * separately in GCS. For data_source and data_sink, the manifest location is relative to the path
   * specified by that data_source or data_sink. If manifest is in GCS, use format "gs:". If
   * manifest is in data_source, use format "source://". If manifest is in data_sink, use format
   * "sink://".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Holds URI-encoded path to find the manifest. It can be located in data_source, data_sink, or
   * separately in GCS. For data_source and data_sink, the manifest location is relative to the path
   * specified by that data_source or data_sink. If manifest is in GCS, use format "gs:". If
   * manifest is in data_source, use format "source://". If manifest is in data_sink, use format
   * "sink://".
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Holds URI-encoded path to find the manifest. It can be located in data_source, data_sink, or
   * separately in GCS. For data_source and data_sink, the manifest location is relative to the path
   * specified by that data_source or data_sink. If manifest is in GCS, use format "gs:". If
   * manifest is in data_source, use format "source://". If manifest is in data_sink, use format
   * "sink://".
   * @param location location or {@code null} for none
   */
  public TransferManifest setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  @Override
  public TransferManifest set(String fieldName, Object value) {
    return (TransferManifest) super.set(fieldName, value);
  }

  @Override
  public TransferManifest clone() {
    return (TransferManifest) super.clone();
  }

}
