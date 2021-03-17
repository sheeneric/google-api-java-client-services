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

package com.google.api.services.cloudbuild.v1beta1.model;

/**
 * SMTPDelivery is the delivery configuration for an SMTP (email) notification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SMTPDelivery extends com.google.api.client.json.GenericJson {

  /**
   * This is the SMTP account/email that appears in the `From:` of the email. If empty, it is
   * assumed to be sender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fromAddress;

  /**
   * The SMTP sender's password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotifierSecretRef password;

  /**
   * The SMTP port of the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String port;

  /**
   * This is the list of addresses to which we send the email (i.e. in the `To:` of the email).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> recipientAddresses;

  /**
   * This is the SMTP account/email that is used to send the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String senderAddress;

  /**
   * The address of the SMTP server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String server;

  /**
   * This is the SMTP account/email that appears in the `From:` of the email. If empty, it is
   * assumed to be sender.
   * @return value or {@code null} for none
   */
  public java.lang.String getFromAddress() {
    return fromAddress;
  }

  /**
   * This is the SMTP account/email that appears in the `From:` of the email. If empty, it is
   * assumed to be sender.
   * @param fromAddress fromAddress or {@code null} for none
   */
  public SMTPDelivery setFromAddress(java.lang.String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * The SMTP sender's password.
   * @return value or {@code null} for none
   */
  public NotifierSecretRef getPassword() {
    return password;
  }

  /**
   * The SMTP sender's password.
   * @param password password or {@code null} for none
   */
  public SMTPDelivery setPassword(NotifierSecretRef password) {
    this.password = password;
    return this;
  }

  /**
   * The SMTP port of the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getPort() {
    return port;
  }

  /**
   * The SMTP port of the server.
   * @param port port or {@code null} for none
   */
  public SMTPDelivery setPort(java.lang.String port) {
    this.port = port;
    return this;
  }

  /**
   * This is the list of addresses to which we send the email (i.e. in the `To:` of the email).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRecipientAddresses() {
    return recipientAddresses;
  }

  /**
   * This is the list of addresses to which we send the email (i.e. in the `To:` of the email).
   * @param recipientAddresses recipientAddresses or {@code null} for none
   */
  public SMTPDelivery setRecipientAddresses(java.util.List<java.lang.String> recipientAddresses) {
    this.recipientAddresses = recipientAddresses;
    return this;
  }

  /**
   * This is the SMTP account/email that is used to send the message.
   * @return value or {@code null} for none
   */
  public java.lang.String getSenderAddress() {
    return senderAddress;
  }

  /**
   * This is the SMTP account/email that is used to send the message.
   * @param senderAddress senderAddress or {@code null} for none
   */
  public SMTPDelivery setSenderAddress(java.lang.String senderAddress) {
    this.senderAddress = senderAddress;
    return this;
  }

  /**
   * The address of the SMTP server.
   * @return value or {@code null} for none
   */
  public java.lang.String getServer() {
    return server;
  }

  /**
   * The address of the SMTP server.
   * @param server server or {@code null} for none
   */
  public SMTPDelivery setServer(java.lang.String server) {
    this.server = server;
    return this;
  }

  @Override
  public SMTPDelivery set(String fieldName, Object value) {
    return (SMTPDelivery) super.set(fieldName, value);
  }

  @Override
  public SMTPDelivery clone() {
    return (SMTPDelivery) super.clone();
  }

}