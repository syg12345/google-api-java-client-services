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

package com.google.api.services.firebasedynamiclinks.v1.model;

/**
 * Android related attributes to the Dynamic Link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Dynamic Links API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidInfo extends com.google.api.client.json.GenericJson {

  /**
   * Link to open on Android if the app is not installed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String androidFallbackLink;

  /**
   * If specified, this overrides the ‘link’ parameter on Android.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String androidLink;

  /**
   * Minimum version code for the Android app. If the installed app’s version code is lower, then
   * the user is taken to the Play Store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String androidMinPackageVersionCode;

  /**
   * Android package name of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String androidPackageName;

  /**
   * Link to open on Android if the app is not installed.
   * @return value or {@code null} for none
   */
  public java.lang.String getAndroidFallbackLink() {
    return androidFallbackLink;
  }

  /**
   * Link to open on Android if the app is not installed.
   * @param androidFallbackLink androidFallbackLink or {@code null} for none
   */
  public AndroidInfo setAndroidFallbackLink(java.lang.String androidFallbackLink) {
    this.androidFallbackLink = androidFallbackLink;
    return this;
  }

  /**
   * If specified, this overrides the ‘link’ parameter on Android.
   * @return value or {@code null} for none
   */
  public java.lang.String getAndroidLink() {
    return androidLink;
  }

  /**
   * If specified, this overrides the ‘link’ parameter on Android.
   * @param androidLink androidLink or {@code null} for none
   */
  public AndroidInfo setAndroidLink(java.lang.String androidLink) {
    this.androidLink = androidLink;
    return this;
  }

  /**
   * Minimum version code for the Android app. If the installed app’s version code is lower, then
   * the user is taken to the Play Store.
   * @return value or {@code null} for none
   */
  public java.lang.String getAndroidMinPackageVersionCode() {
    return androidMinPackageVersionCode;
  }

  /**
   * Minimum version code for the Android app. If the installed app’s version code is lower, then
   * the user is taken to the Play Store.
   * @param androidMinPackageVersionCode androidMinPackageVersionCode or {@code null} for none
   */
  public AndroidInfo setAndroidMinPackageVersionCode(java.lang.String androidMinPackageVersionCode) {
    this.androidMinPackageVersionCode = androidMinPackageVersionCode;
    return this;
  }

  /**
   * Android package name of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getAndroidPackageName() {
    return androidPackageName;
  }

  /**
   * Android package name of the app.
   * @param androidPackageName androidPackageName or {@code null} for none
   */
  public AndroidInfo setAndroidPackageName(java.lang.String androidPackageName) {
    this.androidPackageName = androidPackageName;
    return this;
  }

  @Override
  public AndroidInfo set(String fieldName, Object value) {
    return (AndroidInfo) super.set(fieldName, value);
  }

  @Override
  public AndroidInfo clone() {
    return (AndroidInfo) super.clone();
  }

}
