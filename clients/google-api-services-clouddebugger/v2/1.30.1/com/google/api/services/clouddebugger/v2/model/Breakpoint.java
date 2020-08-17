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
 * ------------------------------------------------------------------------------ ## Breakpoint (the
 * resource) Represents the breakpoint specification, status and results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Debugger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Breakpoint extends com.google.api.client.json.GenericJson {

  /**
   * Action that the agent should perform when the code at the breakpoint location is hit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * The deadline for the breakpoint to stay in CANARY_ACTIVE state. The value is meaningless when
   * the breakpoint is not in CANARY_ACTIVE state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String canaryExpireTime;

  /**
   * Condition that triggers the breakpoint. The condition is a compound boolean expression composed
   * using expressions in a programming language at the source location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * Time this breakpoint was created by the server in seconds resolution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Values of evaluated expressions at breakpoint time. The evaluated expressions appear in exactly
   * the same order they are listed in the `expressions` field. The `name` field holds the original
   * expression text, the `value` or `members` field holds the result of the evaluated expression.
   * If the expression cannot be evaluated, the `status` inside the `Variable` will indicate an
   * error and contain the error text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Variable> evaluatedExpressions;

  /**
   * List of read-only expressions to evaluate at the breakpoint location. The expressions are
   * composed using expressions in the programming language at the source location. If the
   * breakpoint action is `LOG`, the evaluated expressions are included in log statements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> expressions;

  /**
   * Time this breakpoint was finalized as seen by the server in seconds resolution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String finalTime;

  /**
   * Breakpoint identifier, unique in the scope of the debuggee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * When true, indicates that this is a final result and the breakpoint state will not change from
   * here on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isFinalState;

  /**
   * A set of custom breakpoint properties, populated by the agent, to be displayed to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Breakpoint source location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceLocation location;

  /**
   * Indicates the severity of the log. Only relevant when action is `LOG`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logLevel;

  /**
   * Only relevant when action is `LOG`. Defines the message to log when the breakpoint hits. The
   * message may include parameter placeholders `$0`, `$1`, etc. These placeholders are replaced
   * with the evaluated value of the appropriate expression. Expressions not referenced in
   * `log_message_format` are not logged. Example: `Message received, id = $0, count = $1` with
   * `expressions` = `[ message.id, message.count ]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logMessageFormat;

  /**
   * The stack at breakpoint time, where stack_frames[0] represents the most recently entered
   * function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StackFrame> stackFrames;

  /**
   * The current state of the breakpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Breakpoint status. The status includes an error flag and a human readable message. This field
   * is usually unset. The message can be either informational or an error message. Regardless,
   * clients should always display the text message back to the user. Error status indicates
   * complete failure of the breakpoint. Example (non-final state): `Still loading symbols...`
   * Examples (final state): * `Invalid line number` referring to location * `Field f not found in
   * class C` referring to condition
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StatusMessage status;

  /**
   * E-mail address of the user that created this breakpoint
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEmail;

  /**
   * The `variable_table` exists to aid with computation, memory and network traffic optimization.
   * It enables storing a variable once and reference it from multiple variables, including
   * variables stored in the `variable_table` itself. For example, the same `this` object, which may
   * appear at many levels of the stack, can have all of its data stored once in this table. The
   * stack frame variables then would hold only a reference to it. The variable `var_table_index`
   * field is an index into this repeated field. The stored objects are nameless and get their name
   * from the referencing variable. The effective variable is a merge of the referencing variable
   * and the referenced variable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Variable> variableTable;

  /**
   * Action that the agent should perform when the code at the breakpoint location is hit.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Action that the agent should perform when the code at the breakpoint location is hit.
   * @param action action or {@code null} for none
   */
  public Breakpoint setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * The deadline for the breakpoint to stay in CANARY_ACTIVE state. The value is meaningless when
   * the breakpoint is not in CANARY_ACTIVE state.
   * @return value or {@code null} for none
   */
  public String getCanaryExpireTime() {
    return canaryExpireTime;
  }

  /**
   * The deadline for the breakpoint to stay in CANARY_ACTIVE state. The value is meaningless when
   * the breakpoint is not in CANARY_ACTIVE state.
   * @param canaryExpireTime canaryExpireTime or {@code null} for none
   */
  public Breakpoint setCanaryExpireTime(String canaryExpireTime) {
    this.canaryExpireTime = canaryExpireTime;
    return this;
  }

  /**
   * Condition that triggers the breakpoint. The condition is a compound boolean expression composed
   * using expressions in a programming language at the source location.
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * Condition that triggers the breakpoint. The condition is a compound boolean expression composed
   * using expressions in a programming language at the source location.
   * @param condition condition or {@code null} for none
   */
  public Breakpoint setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Time this breakpoint was created by the server in seconds resolution.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Time this breakpoint was created by the server in seconds resolution.
   * @param createTime createTime or {@code null} for none
   */
  public Breakpoint setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Values of evaluated expressions at breakpoint time. The evaluated expressions appear in exactly
   * the same order they are listed in the `expressions` field. The `name` field holds the original
   * expression text, the `value` or `members` field holds the result of the evaluated expression.
   * If the expression cannot be evaluated, the `status` inside the `Variable` will indicate an
   * error and contain the error text.
   * @return value or {@code null} for none
   */
  public java.util.List<Variable> getEvaluatedExpressions() {
    return evaluatedExpressions;
  }

  /**
   * Values of evaluated expressions at breakpoint time. The evaluated expressions appear in exactly
   * the same order they are listed in the `expressions` field. The `name` field holds the original
   * expression text, the `value` or `members` field holds the result of the evaluated expression.
   * If the expression cannot be evaluated, the `status` inside the `Variable` will indicate an
   * error and contain the error text.
   * @param evaluatedExpressions evaluatedExpressions or {@code null} for none
   */
  public Breakpoint setEvaluatedExpressions(java.util.List<Variable> evaluatedExpressions) {
    this.evaluatedExpressions = evaluatedExpressions;
    return this;
  }

  /**
   * List of read-only expressions to evaluate at the breakpoint location. The expressions are
   * composed using expressions in the programming language at the source location. If the
   * breakpoint action is `LOG`, the evaluated expressions are included in log statements.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExpressions() {
    return expressions;
  }

  /**
   * List of read-only expressions to evaluate at the breakpoint location. The expressions are
   * composed using expressions in the programming language at the source location. If the
   * breakpoint action is `LOG`, the evaluated expressions are included in log statements.
   * @param expressions expressions or {@code null} for none
   */
  public Breakpoint setExpressions(java.util.List<java.lang.String> expressions) {
    this.expressions = expressions;
    return this;
  }

  /**
   * Time this breakpoint was finalized as seen by the server in seconds resolution.
   * @return value or {@code null} for none
   */
  public String getFinalTime() {
    return finalTime;
  }

  /**
   * Time this breakpoint was finalized as seen by the server in seconds resolution.
   * @param finalTime finalTime or {@code null} for none
   */
  public Breakpoint setFinalTime(String finalTime) {
    this.finalTime = finalTime;
    return this;
  }

  /**
   * Breakpoint identifier, unique in the scope of the debuggee.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Breakpoint identifier, unique in the scope of the debuggee.
   * @param id id or {@code null} for none
   */
  public Breakpoint setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * When true, indicates that this is a final result and the breakpoint state will not change from
   * here on.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsFinalState() {
    return isFinalState;
  }

  /**
   * When true, indicates that this is a final result and the breakpoint state will not change from
   * here on.
   * @param isFinalState isFinalState or {@code null} for none
   */
  public Breakpoint setIsFinalState(java.lang.Boolean isFinalState) {
    this.isFinalState = isFinalState;
    return this;
  }

  /**
   * A set of custom breakpoint properties, populated by the agent, to be displayed to the user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * A set of custom breakpoint properties, populated by the agent, to be displayed to the user.
   * @param labels labels or {@code null} for none
   */
  public Breakpoint setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Breakpoint source location.
   * @return value or {@code null} for none
   */
  public SourceLocation getLocation() {
    return location;
  }

  /**
   * Breakpoint source location.
   * @param location location or {@code null} for none
   */
  public Breakpoint setLocation(SourceLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Indicates the severity of the log. Only relevant when action is `LOG`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogLevel() {
    return logLevel;
  }

  /**
   * Indicates the severity of the log. Only relevant when action is `LOG`.
   * @param logLevel logLevel or {@code null} for none
   */
  public Breakpoint setLogLevel(java.lang.String logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  /**
   * Only relevant when action is `LOG`. Defines the message to log when the breakpoint hits. The
   * message may include parameter placeholders `$0`, `$1`, etc. These placeholders are replaced
   * with the evaluated value of the appropriate expression. Expressions not referenced in
   * `log_message_format` are not logged. Example: `Message received, id = $0, count = $1` with
   * `expressions` = `[ message.id, message.count ]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogMessageFormat() {
    return logMessageFormat;
  }

  /**
   * Only relevant when action is `LOG`. Defines the message to log when the breakpoint hits. The
   * message may include parameter placeholders `$0`, `$1`, etc. These placeholders are replaced
   * with the evaluated value of the appropriate expression. Expressions not referenced in
   * `log_message_format` are not logged. Example: `Message received, id = $0, count = $1` with
   * `expressions` = `[ message.id, message.count ]`.
   * @param logMessageFormat logMessageFormat or {@code null} for none
   */
  public Breakpoint setLogMessageFormat(java.lang.String logMessageFormat) {
    this.logMessageFormat = logMessageFormat;
    return this;
  }

  /**
   * The stack at breakpoint time, where stack_frames[0] represents the most recently entered
   * function.
   * @return value or {@code null} for none
   */
  public java.util.List<StackFrame> getStackFrames() {
    return stackFrames;
  }

  /**
   * The stack at breakpoint time, where stack_frames[0] represents the most recently entered
   * function.
   * @param stackFrames stackFrames or {@code null} for none
   */
  public Breakpoint setStackFrames(java.util.List<StackFrame> stackFrames) {
    this.stackFrames = stackFrames;
    return this;
  }

  /**
   * The current state of the breakpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the breakpoint.
   * @param state state or {@code null} for none
   */
  public Breakpoint setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Breakpoint status. The status includes an error flag and a human readable message. This field
   * is usually unset. The message can be either informational or an error message. Regardless,
   * clients should always display the text message back to the user. Error status indicates
   * complete failure of the breakpoint. Example (non-final state): `Still loading symbols...`
   * Examples (final state): * `Invalid line number` referring to location * `Field f not found in
   * class C` referring to condition
   * @return value or {@code null} for none
   */
  public StatusMessage getStatus() {
    return status;
  }

  /**
   * Breakpoint status. The status includes an error flag and a human readable message. This field
   * is usually unset. The message can be either informational or an error message. Regardless,
   * clients should always display the text message back to the user. Error status indicates
   * complete failure of the breakpoint. Example (non-final state): `Still loading symbols...`
   * Examples (final state): * `Invalid line number` referring to location * `Field f not found in
   * class C` referring to condition
   * @param status status or {@code null} for none
   */
  public Breakpoint setStatus(StatusMessage status) {
    this.status = status;
    return this;
  }

  /**
   * E-mail address of the user that created this breakpoint
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEmail() {
    return userEmail;
  }

  /**
   * E-mail address of the user that created this breakpoint
   * @param userEmail userEmail or {@code null} for none
   */
  public Breakpoint setUserEmail(java.lang.String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The `variable_table` exists to aid with computation, memory and network traffic optimization.
   * It enables storing a variable once and reference it from multiple variables, including
   * variables stored in the `variable_table` itself. For example, the same `this` object, which may
   * appear at many levels of the stack, can have all of its data stored once in this table. The
   * stack frame variables then would hold only a reference to it. The variable `var_table_index`
   * field is an index into this repeated field. The stored objects are nameless and get their name
   * from the referencing variable. The effective variable is a merge of the referencing variable
   * and the referenced variable.
   * @return value or {@code null} for none
   */
  public java.util.List<Variable> getVariableTable() {
    return variableTable;
  }

  /**
   * The `variable_table` exists to aid with computation, memory and network traffic optimization.
   * It enables storing a variable once and reference it from multiple variables, including
   * variables stored in the `variable_table` itself. For example, the same `this` object, which may
   * appear at many levels of the stack, can have all of its data stored once in this table. The
   * stack frame variables then would hold only a reference to it. The variable `var_table_index`
   * field is an index into this repeated field. The stored objects are nameless and get their name
   * from the referencing variable. The effective variable is a merge of the referencing variable
   * and the referenced variable.
   * @param variableTable variableTable or {@code null} for none
   */
  public Breakpoint setVariableTable(java.util.List<Variable> variableTable) {
    this.variableTable = variableTable;
    return this;
  }

  @Override
  public Breakpoint set(String fieldName, Object value) {
    return (Breakpoint) super.set(fieldName, value);
  }

  @Override
  public Breakpoint clone() {
    return (Breakpoint) super.clone();
  }

}
