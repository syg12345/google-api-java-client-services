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

package com.google.api.services.privateca.v1beta1.model;

/**
 * An X509Extension specifies an X.509 extension, which may be used in different parts of X.509
 * objects like certificates, CSRs, and CRLs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class X509Extension extends com.google.api.client.json.GenericJson {

  /**
   * Required. Indicates whether or not this extension is critical (i.e., if the client does not
   * know how to handle this extension, the client should consider this to be an error).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean critical;

  /**
   * Required. The OID for this X.509 extension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectId objectId;

  /**
   * Required. The value of this X.509 extension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Required. Indicates whether or not this extension is critical (i.e., if the client does not
   * know how to handle this extension, the client should consider this to be an error).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCritical() {
    return critical;
  }

  /**
   * Required. Indicates whether or not this extension is critical (i.e., if the client does not
   * know how to handle this extension, the client should consider this to be an error).
   * @param critical critical or {@code null} for none
   */
  public X509Extension setCritical(java.lang.Boolean critical) {
    this.critical = critical;
    return this;
  }

  /**
   * Required. The OID for this X.509 extension.
   * @return value or {@code null} for none
   */
  public ObjectId getObjectId() {
    return objectId;
  }

  /**
   * Required. The OID for this X.509 extension.
   * @param objectId objectId or {@code null} for none
   */
  public X509Extension setObjectId(ObjectId objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * Required. The value of this X.509 extension.
   * @see #decodeValue()
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Required. The value of this X.509 extension.
   * @see #getValue()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeValue() {
    return com.google.api.client.util.Base64.decodeBase64(value);
  }

  /**
   * Required. The value of this X.509 extension.
   * @see #encodeValue()
   * @param value value or {@code null} for none
   */
  public X509Extension setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * Required. The value of this X.509 extension.
   * @see #setValue()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public X509Extension encodeValue(byte[] value) {
    this.value = com.google.api.client.util.Base64.encodeBase64URLSafeString(value);
    return this;
  }

  @Override
  public X509Extension set(String fieldName, Object value) {
    return (X509Extension) super.set(fieldName, value);
  }

  @Override
  public X509Extension clone() {
    return (X509Extension) super.clone();
  }

}
