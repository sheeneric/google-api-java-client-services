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

package com.google.api.services.policysimulator.v1beta1.model;

/**
 * A resource describing a `Replay`, or simulation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Simulator API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicysimulatorV1Replay extends com.google.api.client.json.GenericJson {

  /**
   * Required. The configuration used for the `Replay`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPolicysimulatorV1ReplayConfig config;

  /**
   * Output only. The resource name of the `Replay`, which has the following format:
   * `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where
   * `{resource-id}` is the ID of the project, folder, or organization that owns the Replay.
   * Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-
   * 8e03-479ce1833c36`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Summary statistics about the replayed log entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPolicysimulatorV1ReplayResultsSummary resultsSummary;

  /**
   * Output only. The current state of the `Replay`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. The configuration used for the `Replay`.
   * @return value or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1ReplayConfig getConfig() {
    return config;
  }

  /**
   * Required. The configuration used for the `Replay`.
   * @param config config or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1Replay setConfig(GoogleCloudPolicysimulatorV1ReplayConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Output only. The resource name of the `Replay`, which has the following format:
   * `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where
   * `{resource-id}` is the ID of the project, folder, or organization that owns the Replay.
   * Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-
   * 8e03-479ce1833c36`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the `Replay`, which has the following format:
   * `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where
   * `{resource-id}` is the ID of the project, folder, or organization that owns the Replay.
   * Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-
   * 8e03-479ce1833c36`
   * @param name name or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1Replay setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Summary statistics about the replayed log entries.
   * @return value or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1ReplayResultsSummary getResultsSummary() {
    return resultsSummary;
  }

  /**
   * Output only. Summary statistics about the replayed log entries.
   * @param resultsSummary resultsSummary or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1Replay setResultsSummary(GoogleCloudPolicysimulatorV1ReplayResultsSummary resultsSummary) {
    this.resultsSummary = resultsSummary;
    return this;
  }

  /**
   * Output only. The current state of the `Replay`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the `Replay`.
   * @param state state or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1Replay setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudPolicysimulatorV1Replay set(String fieldName, Object value) {
    return (GoogleCloudPolicysimulatorV1Replay) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicysimulatorV1Replay clone() {
    return (GoogleCloudPolicysimulatorV1Replay) super.clone();
  }

}