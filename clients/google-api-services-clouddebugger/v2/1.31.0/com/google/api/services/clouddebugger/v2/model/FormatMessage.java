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

package com.google.api.services.clouddebugger.v2.model;

/**
 * Represents a message with parameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Debugger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FormatMessage extends com.google.api.client.json.GenericJson {

  /**
   * Format template for the message. The `format` uses placeholders `$0`, `$1`, etc. to reference
   * parameters. `$$` can be used to denote the `$` character. Examples: * `Failed to load '$0'
   * which helps debug $1 the first time it is loaded. Again, $0 is very important.` * `Please pay
   * $$10 to use $0 instead of $1.`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Optional parameters to be embedded into the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> parameters;

  /**
   * Format template for the message. The `format` uses placeholders `$0`, `$1`, etc. to reference
   * parameters. `$$` can be used to denote the `$` character. Examples: * `Failed to load '$0'
   * which helps debug $1 the first time it is loaded. Again, $0 is very important.` * `Please pay
   * $$10 to use $0 instead of $1.`
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * Format template for the message. The `format` uses placeholders `$0`, `$1`, etc. to reference
   * parameters. `$$` can be used to denote the `$` character. Examples: * `Failed to load '$0'
   * which helps debug $1 the first time it is loaded. Again, $0 is very important.` * `Please pay
   * $$10 to use $0 instead of $1.`
   * @param format format or {@code null} for none
   */
  public FormatMessage setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Optional parameters to be embedded into the message.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getParameters() {
    return parameters;
  }

  /**
   * Optional parameters to be embedded into the message.
   * @param parameters parameters or {@code null} for none
   */
  public FormatMessage setParameters(java.util.List<java.lang.String> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public FormatMessage set(String fieldName, Object value) {
    return (FormatMessage) super.set(fieldName, value);
  }

  @Override
  public FormatMessage clone() {
    return (FormatMessage) super.clone();
  }

}
