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

package com.google.api.services.slides.v1.model;

/**
 * The page background fill.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PageBackgroundFill extends com.google.api.client.json.GenericJson {

  /**
   * The background fill property state. Updating the fill on a page will implicitly update this
   * field to `RENDERED`, unless another value is specified in the same request. To have no fill on
   * a page, set this field to `NOT_RENDERED`. In this case, any other fill fields set in the same
   * request will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String propertyState;

  /**
   * Solid color fill.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SolidFill solidFill;

  /**
   * Stretched picture fill.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StretchedPictureFill stretchedPictureFill;

  /**
   * The background fill property state. Updating the fill on a page will implicitly update this
   * field to `RENDERED`, unless another value is specified in the same request. To have no fill on
   * a page, set this field to `NOT_RENDERED`. In this case, any other fill fields set in the same
   * request will be ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getPropertyState() {
    return propertyState;
  }

  /**
   * The background fill property state. Updating the fill on a page will implicitly update this
   * field to `RENDERED`, unless another value is specified in the same request. To have no fill on
   * a page, set this field to `NOT_RENDERED`. In this case, any other fill fields set in the same
   * request will be ignored.
   * @param propertyState propertyState or {@code null} for none
   */
  public PageBackgroundFill setPropertyState(java.lang.String propertyState) {
    this.propertyState = propertyState;
    return this;
  }

  /**
   * Solid color fill.
   * @return value or {@code null} for none
   */
  public SolidFill getSolidFill() {
    return solidFill;
  }

  /**
   * Solid color fill.
   * @param solidFill solidFill or {@code null} for none
   */
  public PageBackgroundFill setSolidFill(SolidFill solidFill) {
    this.solidFill = solidFill;
    return this;
  }

  /**
   * Stretched picture fill.
   * @return value or {@code null} for none
   */
  public StretchedPictureFill getStretchedPictureFill() {
    return stretchedPictureFill;
  }

  /**
   * Stretched picture fill.
   * @param stretchedPictureFill stretchedPictureFill or {@code null} for none
   */
  public PageBackgroundFill setStretchedPictureFill(StretchedPictureFill stretchedPictureFill) {
    this.stretchedPictureFill = stretchedPictureFill;
    return this;
  }

  @Override
  public PageBackgroundFill set(String fieldName, Object value) {
    return (PageBackgroundFill) super.set(fieldName, value);
  }

  @Override
  public PageBackgroundFill clone() {
    return (PageBackgroundFill) super.clone();
  }

}
