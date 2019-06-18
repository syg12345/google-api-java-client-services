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

package com.google.api.services.androidpublisher.model;

/**
 * Model definition for Testers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Testers extends com.google.api.client.json.GenericJson {

  /**
   * A list of all Google Groups, as email addresses, that define testers for this track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> googleGroups;

  /**
   * A list of all Google+ Communities, as URLs, that define testers for this track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> googlePlusCommunities;

  /**
   * A list of all Google Groups, as email addresses, that define testers for this track.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGoogleGroups() {
    return googleGroups;
  }

  /**
   * A list of all Google Groups, as email addresses, that define testers for this track.
   * @param googleGroups googleGroups or {@code null} for none
   */
  public Testers setGoogleGroups(java.util.List<java.lang.String> googleGroups) {
    this.googleGroups = googleGroups;
    return this;
  }

  /**
   * A list of all Google+ Communities, as URLs, that define testers for this track.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGooglePlusCommunities() {
    return googlePlusCommunities;
  }

  /**
   * A list of all Google+ Communities, as URLs, that define testers for this track.
   * @param googlePlusCommunities googlePlusCommunities or {@code null} for none
   */
  public Testers setGooglePlusCommunities(java.util.List<java.lang.String> googlePlusCommunities) {
    this.googlePlusCommunities = googlePlusCommunities;
    return this;
  }

  @Override
  public Testers set(String fieldName, Object value) {
    return (Testers) super.set(fieldName, value);
  }

  @Override
  public Testers clone() {
    return (Testers) super.clone();
  }

}
