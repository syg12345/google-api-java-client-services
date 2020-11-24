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

package com.google.api.services.compute.model;

/**
 * Represents a InPlaceSnapshot resource.
 *
 * You can use in-place snapshots to create disk rollback points quickly.. (== resource_for
 * {$api_version}.inPlaceSnapshots ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InPlaceSnapshot extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] Size of the source disk, specified in GB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * Specifies to create an application consistent in-place snapshot by informing the OS to prepare
   * for the snapshot process. Currently only supported on Windows instances using the Volume Shadow
   * Copy Service (VSS).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean guestFlush;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#inPlaceSnapshot for InPlaceSnapshot
   * resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this InPlaceSnapshot, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a InPlaceSnapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels to apply to this InPlaceSnapshot. These can be later modified by the setLabels method.
   * Label values may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] URL of the region where the in-place snapshot resides. You must specify this
   * field as part of the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource's resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * URL of the source disk used to create this in-place snapshot. Note that the source disk must be
   * in the same zone/region as the in-place snapshot to be created. This can be a full or valid
   * partial URL. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk  -
   * projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDisk;

  /**
   * [Output Only] The ID value of the disk used to create this InPlaceSnapshot. This value may be
   * used to determine whether the InPlaceSnapshot was taken from the current or a previous instance
   * of a given disk name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDiskId;

  /**
   * [Output Only] The status of the inPlaceSnapshot. This can be CREATING, DELETING, FAILED, or
   * READY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] URL of the zone where the in-place snapshot resides. You must specify this field
   * as part of the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public InPlaceSnapshot setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public InPlaceSnapshot setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] Size of the source disk, specified in GB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * [Output Only] Size of the source disk, specified in GB.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public InPlaceSnapshot setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Specifies to create an application consistent in-place snapshot by informing the OS to prepare
   * for the snapshot process. Currently only supported on Windows instances using the Volume Shadow
   * Copy Service (VSS).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGuestFlush() {
    return guestFlush;
  }

  /**
   * Specifies to create an application consistent in-place snapshot by informing the OS to prepare
   * for the snapshot process. Currently only supported on Windows instances using the Volume Shadow
   * Copy Service (VSS).
   * @param guestFlush guestFlush or {@code null} for none
   */
  public InPlaceSnapshot setGuestFlush(java.lang.Boolean guestFlush) {
    this.guestFlush = guestFlush;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public InPlaceSnapshot setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#inPlaceSnapshot for InPlaceSnapshot
   * resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#inPlaceSnapshot for InPlaceSnapshot
   * resources.
   * @param kind kind or {@code null} for none
   */
  public InPlaceSnapshot setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this InPlaceSnapshot, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a InPlaceSnapshot.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this InPlaceSnapshot, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a InPlaceSnapshot.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this InPlaceSnapshot, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a InPlaceSnapshot.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public InPlaceSnapshot setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this InPlaceSnapshot, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a InPlaceSnapshot.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public InPlaceSnapshot encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels to apply to this InPlaceSnapshot. These can be later modified by the setLabels method.
   * Label values may be empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this InPlaceSnapshot. These can be later modified by the setLabels method.
   * Label values may be empty.
   * @param labels labels or {@code null} for none
   */
  public InPlaceSnapshot setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public InPlaceSnapshot setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] URL of the region where the in-place snapshot resides. You must specify this
   * field as part of the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the in-place snapshot resides. You must specify this
   * field as part of the HTTP request URL. It is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public InPlaceSnapshot setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public InPlaceSnapshot setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource's resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource's resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public InPlaceSnapshot setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * URL of the source disk used to create this in-place snapshot. Note that the source disk must be
   * in the same zone/region as the in-place snapshot to be created. This can be a full or valid
   * partial URL. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk  -
   * projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDisk() {
    return sourceDisk;
  }

  /**
   * URL of the source disk used to create this in-place snapshot. Note that the source disk must be
   * in the same zone/region as the in-place snapshot to be created. This can be a full or valid
   * partial URL. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk  -
   * projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
   * @param sourceDisk sourceDisk or {@code null} for none
   */
  public InPlaceSnapshot setSourceDisk(java.lang.String sourceDisk) {
    this.sourceDisk = sourceDisk;
    return this;
  }

  /**
   * [Output Only] The ID value of the disk used to create this InPlaceSnapshot. This value may be
   * used to determine whether the InPlaceSnapshot was taken from the current or a previous instance
   * of a given disk name.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDiskId() {
    return sourceDiskId;
  }

  /**
   * [Output Only] The ID value of the disk used to create this InPlaceSnapshot. This value may be
   * used to determine whether the InPlaceSnapshot was taken from the current or a previous instance
   * of a given disk name.
   * @param sourceDiskId sourceDiskId or {@code null} for none
   */
  public InPlaceSnapshot setSourceDiskId(java.lang.String sourceDiskId) {
    this.sourceDiskId = sourceDiskId;
    return this;
  }

  /**
   * [Output Only] The status of the inPlaceSnapshot. This can be CREATING, DELETING, FAILED, or
   * READY.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the inPlaceSnapshot. This can be CREATING, DELETING, FAILED, or
   * READY.
   * @param status status or {@code null} for none
   */
  public InPlaceSnapshot setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] URL of the zone where the in-place snapshot resides. You must specify this field
   * as part of the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the zone where the in-place snapshot resides. You must specify this field
   * as part of the HTTP request URL. It is not settable as a field in the request body.
   * @param zone zone or {@code null} for none
   */
  public InPlaceSnapshot setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public InPlaceSnapshot set(String fieldName, Object value) {
    return (InPlaceSnapshot) super.set(fieldName, value);
  }

  @Override
  public InPlaceSnapshot clone() {
    return (InPlaceSnapshot) super.clone();
  }

}
