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
 * Model definition for RouterInterface.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterInterface extends com.google.api.client.json.GenericJson {

  /**
   * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP
   * address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do
   * not truncate the address as it represents the IP address of the interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipRange;

  /**
   * URI of the linked Interconnect attachment. It must be in the same region as the router. Each
   * interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment,
   * or a virtual machine instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedInterconnectAttachment;

  /**
   * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface
   * can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a
   * virtual machine instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedVpnTunnel;

  /**
   * [Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the
   * default value and can be managed directly by users.  - MANAGED_BY_ATTACHMENT is an interface
   * that is configured and managed by Cloud Interconnect, specifically, by an
   * InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this
   * type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managementType;

  /**
   * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP
   * address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do
   * not truncate the address as it represents the IP address of the interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpRange() {
    return ipRange;
  }

  /**
   * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP
   * address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do
   * not truncate the address as it represents the IP address of the interface.
   * @param ipRange ipRange or {@code null} for none
   */
  public RouterInterface setIpRange(java.lang.String ipRange) {
    this.ipRange = ipRange;
    return this;
  }

  /**
   * URI of the linked Interconnect attachment. It must be in the same region as the router. Each
   * interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment,
   * or a virtual machine instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedInterconnectAttachment() {
    return linkedInterconnectAttachment;
  }

  /**
   * URI of the linked Interconnect attachment. It must be in the same region as the router. Each
   * interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment,
   * or a virtual machine instance.
   * @param linkedInterconnectAttachment linkedInterconnectAttachment or {@code null} for none
   */
  public RouterInterface setLinkedInterconnectAttachment(java.lang.String linkedInterconnectAttachment) {
    this.linkedInterconnectAttachment = linkedInterconnectAttachment;
    return this;
  }

  /**
   * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface
   * can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a
   * virtual machine instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedVpnTunnel() {
    return linkedVpnTunnel;
  }

  /**
   * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface
   * can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a
   * virtual machine instance.
   * @param linkedVpnTunnel linkedVpnTunnel or {@code null} for none
   */
  public RouterInterface setLinkedVpnTunnel(java.lang.String linkedVpnTunnel) {
    this.linkedVpnTunnel = linkedVpnTunnel;
    return this;
  }

  /**
   * [Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the
   * default value and can be managed directly by users.  - MANAGED_BY_ATTACHMENT is an interface
   * that is configured and managed by Cloud Interconnect, specifically, by an
   * InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this
   * type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagementType() {
    return managementType;
  }

  /**
   * [Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the
   * default value and can be managed directly by users.  - MANAGED_BY_ATTACHMENT is an interface
   * that is configured and managed by Cloud Interconnect, specifically, by an
   * InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this
   * type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * @param managementType managementType or {@code null} for none
   */
  public RouterInterface setManagementType(java.lang.String managementType) {
    this.managementType = managementType;
    return this;
  }

  /**
   * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public RouterInterface setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public RouterInterface set(String fieldName, Object value) {
    return (RouterInterface) super.set(fieldName, value);
  }

  @Override
  public RouterInterface clone() {
    return (RouterInterface) super.clone();
  }

}
