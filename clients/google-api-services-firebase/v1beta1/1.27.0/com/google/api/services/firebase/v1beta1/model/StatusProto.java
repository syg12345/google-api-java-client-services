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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Wire-format for a Status object
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StatusProto extends com.google.api.client.json.GenericJson {

  /**
   * The canonical error code (see codes.proto) that most closely corresponds to this status. May be
   * missing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer canonicalCode;

  /**
   * Numeric code drawn from the space specified below. Often, this is the canonical error space,
   * and code is drawn from google3/util/task/codes.proto
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer code;

  /**
   * Detail message
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * message_set associates an arbitrary proto message with the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MessageSet messageSet;

  /**
   * DEPRECATED.
   *
   * This field was deprecated in 2011 with cl/20297133.  Java support for the field was moved to a
   * proto1 backward compatibility class in April 2017 with cl/142615857 and cl/154123203.  There
   * was never support for this field in Go; if set Go will ignore it. C++ stopped setting
   * StatusProto::payload in October 2015 with cl/106347055, and stopped reading the field in
   * October 2017 with cl/173324114.
   *
   * In general, newly written code should use only "message_set". If you need to maintain backward
   * compatibility with code written before 3/25/2011, do the following:
   *
   * - During the transition period, either (1) set both "payload" and   "message_set", or (2) write
   * the consumer of StatusProto so that it can   forge a MessageSet object from "payload" if
   * "message_set" is missing.   The C++ util::Status implementation does (2).
   *
   * - Once all the consumers are converted to accept "message_set", then   remove the use of
   * "payload" on the producer side.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TypedMessage payload;

  /**
   * The following are usually only present when code != 0 Space to which this status belongs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String space;

  /**
   * The canonical error code (see codes.proto) that most closely corresponds to this status. May be
   * missing.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCanonicalCode() {
    return canonicalCode;
  }

  /**
   * The canonical error code (see codes.proto) that most closely corresponds to this status. May be
   * missing.
   * @param canonicalCode canonicalCode or {@code null} for none
   */
  public StatusProto setCanonicalCode(java.lang.Integer canonicalCode) {
    this.canonicalCode = canonicalCode;
    return this;
  }

  /**
   * Numeric code drawn from the space specified below. Often, this is the canonical error space,
   * and code is drawn from google3/util/task/codes.proto
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCode() {
    return code;
  }

  /**
   * Numeric code drawn from the space specified below. Often, this is the canonical error space,
   * and code is drawn from google3/util/task/codes.proto
   * @param code code or {@code null} for none
   */
  public StatusProto setCode(java.lang.Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Detail message
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Detail message
   * @param message message or {@code null} for none
   */
  public StatusProto setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * message_set associates an arbitrary proto message with the status.
   * @return value or {@code null} for none
   */
  public MessageSet getMessageSet() {
    return messageSet;
  }

  /**
   * message_set associates an arbitrary proto message with the status.
   * @param messageSet messageSet or {@code null} for none
   */
  public StatusProto setMessageSet(MessageSet messageSet) {
    this.messageSet = messageSet;
    return this;
  }

  /**
   * DEPRECATED.
   *
   * This field was deprecated in 2011 with cl/20297133.  Java support for the field was moved to a
   * proto1 backward compatibility class in April 2017 with cl/142615857 and cl/154123203.  There
   * was never support for this field in Go; if set Go will ignore it. C++ stopped setting
   * StatusProto::payload in October 2015 with cl/106347055, and stopped reading the field in
   * October 2017 with cl/173324114.
   *
   * In general, newly written code should use only "message_set". If you need to maintain backward
   * compatibility with code written before 3/25/2011, do the following:
   *
   * - During the transition period, either (1) set both "payload" and   "message_set", or (2) write
   * the consumer of StatusProto so that it can   forge a MessageSet object from "payload" if
   * "message_set" is missing.   The C++ util::Status implementation does (2).
   *
   * - Once all the consumers are converted to accept "message_set", then   remove the use of
   * "payload" on the producer side.
   * @return value or {@code null} for none
   */
  public TypedMessage getPayload() {
    return payload;
  }

  /**
   * DEPRECATED.
   *
   * This field was deprecated in 2011 with cl/20297133.  Java support for the field was moved to a
   * proto1 backward compatibility class in April 2017 with cl/142615857 and cl/154123203.  There
   * was never support for this field in Go; if set Go will ignore it. C++ stopped setting
   * StatusProto::payload in October 2015 with cl/106347055, and stopped reading the field in
   * October 2017 with cl/173324114.
   *
   * In general, newly written code should use only "message_set". If you need to maintain backward
   * compatibility with code written before 3/25/2011, do the following:
   *
   * - During the transition period, either (1) set both "payload" and   "message_set", or (2) write
   * the consumer of StatusProto so that it can   forge a MessageSet object from "payload" if
   * "message_set" is missing.   The C++ util::Status implementation does (2).
   *
   * - Once all the consumers are converted to accept "message_set", then   remove the use of
   * "payload" on the producer side.
   * @param payload payload or {@code null} for none
   */
  public StatusProto setPayload(TypedMessage payload) {
    this.payload = payload;
    return this;
  }

  /**
   * The following are usually only present when code != 0 Space to which this status belongs
   * @return value or {@code null} for none
   */
  public java.lang.String getSpace() {
    return space;
  }

  /**
   * The following are usually only present when code != 0 Space to which this status belongs
   * @param space space or {@code null} for none
   */
  public StatusProto setSpace(java.lang.String space) {
    this.space = space;
    return this;
  }

  @Override
  public StatusProto set(String fieldName, Object value) {
    return (StatusProto) super.set(fieldName, value);
  }

  @Override
  public StatusProto clone() {
    return (StatusProto) super.clone();
  }

}
