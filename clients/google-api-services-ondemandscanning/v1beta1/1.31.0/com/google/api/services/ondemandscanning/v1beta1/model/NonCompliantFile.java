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

package com.google.api.services.ondemandscanning.v1beta1.model;

/**
 * Details about files that caused a compliance check to fail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NonCompliantFile extends com.google.api.client.json.GenericJson {

  /**
   * Command to display the non-compliant files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayCommand;

  /**
   * display_command is a single command that can be used to display a list of non compliant files.
   * When there is no such command, we can also iterate a list of non compliant file using 'path'.
   * Empty if `display_command` is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Explains why a file is non compliant for a CIS check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Command to display the non-compliant files.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayCommand() {
    return displayCommand;
  }

  /**
   * Command to display the non-compliant files.
   * @param displayCommand displayCommand or {@code null} for none
   */
  public NonCompliantFile setDisplayCommand(java.lang.String displayCommand) {
    this.displayCommand = displayCommand;
    return this;
  }

  /**
   * display_command is a single command that can be used to display a list of non compliant files.
   * When there is no such command, we can also iterate a list of non compliant file using 'path'.
   * Empty if `display_command` is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * display_command is a single command that can be used to display a list of non compliant files.
   * When there is no such command, we can also iterate a list of non compliant file using 'path'.
   * Empty if `display_command` is set.
   * @param path path or {@code null} for none
   */
  public NonCompliantFile setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Explains why a file is non compliant for a CIS check.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Explains why a file is non compliant for a CIS check.
   * @param reason reason or {@code null} for none
   */
  public NonCompliantFile setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public NonCompliantFile set(String fieldName, Object value) {
    return (NonCompliantFile) super.set(fieldName, value);
  }

  @Override
  public NonCompliantFile clone() {
    return (NonCompliantFile) super.clone();
  }

}
