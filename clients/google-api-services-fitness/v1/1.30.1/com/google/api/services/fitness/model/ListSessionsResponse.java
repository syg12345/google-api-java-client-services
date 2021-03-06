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

package com.google.api.services.fitness.model;

/**
 * Model definition for ListSessionsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListSessionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * If includeDeleted is set to true in the request, and startTime and endTime are omitted, this
   * will include sessions which were deleted since the last sync.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Session> deletedSession;

  /**
   * Flag to indicate server has more data to transfer. DO NOT USE THIS FIELD. It is never populated
   * in responses from the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasMoreData;

  /**
   * The sync token which is used to sync further changes. This will only be provided if both
   * startTime and endTime are omitted from the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Sessions with an end time that is between startTime and endTime of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Session> session;

  /**
   * If includeDeleted is set to true in the request, and startTime and endTime are omitted, this
   * will include sessions which were deleted since the last sync.
   * @return value or {@code null} for none
   */
  public java.util.List<Session> getDeletedSession() {
    return deletedSession;
  }

  /**
   * If includeDeleted is set to true in the request, and startTime and endTime are omitted, this
   * will include sessions which were deleted since the last sync.
   * @param deletedSession deletedSession or {@code null} for none
   */
  public ListSessionsResponse setDeletedSession(java.util.List<Session> deletedSession) {
    this.deletedSession = deletedSession;
    return this;
  }

  /**
   * Flag to indicate server has more data to transfer. DO NOT USE THIS FIELD. It is never populated
   * in responses from the server.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasMoreData() {
    return hasMoreData;
  }

  /**
   * Flag to indicate server has more data to transfer. DO NOT USE THIS FIELD. It is never populated
   * in responses from the server.
   * @param hasMoreData hasMoreData or {@code null} for none
   */
  public ListSessionsResponse setHasMoreData(java.lang.Boolean hasMoreData) {
    this.hasMoreData = hasMoreData;
    return this;
  }

  /**
   * The sync token which is used to sync further changes. This will only be provided if both
   * startTime and endTime are omitted from the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The sync token which is used to sync further changes. This will only be provided if both
   * startTime and endTime are omitted from the request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListSessionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Sessions with an end time that is between startTime and endTime of the request.
   * @return value or {@code null} for none
   */
  public java.util.List<Session> getSession() {
    return session;
  }

  /**
   * Sessions with an end time that is between startTime and endTime of the request.
   * @param session session or {@code null} for none
   */
  public ListSessionsResponse setSession(java.util.List<Session> session) {
    this.session = session;
    return this;
  }

  @Override
  public ListSessionsResponse set(String fieldName, Object value) {
    return (ListSessionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListSessionsResponse clone() {
    return (ListSessionsResponse) super.clone();
  }

}
