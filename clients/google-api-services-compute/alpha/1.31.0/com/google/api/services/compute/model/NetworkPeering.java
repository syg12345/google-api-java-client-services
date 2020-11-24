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
 * A network peering attached to a network resource. The message includes the peering name, peer
 * network, peering state, and a flag indicating whether Google Compute Engine should automatically
 * create routes for the peering.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkPeering extends com.google.api.client.json.GenericJson {

  /**
   * Whether Cloud Routers in this network can automatically advertise subnets from the peer
   * network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean advertisePeerSubnetsViaRouters;

  /**
   * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates
   * whether full mesh connectivity is created and managed automatically between peered networks.
   * Currently this field should always be true since Google Compute Engine will automatically
   * create and manage subnetwork routes between two networks when peering state is ACTIVE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoCreateRoutes;

  /**
   * Indicates whether full mesh connectivity is created and managed automatically between peered
   * networks. Currently this field should always be true since Google Compute Engine will
   * automatically create and manage subnetwork routes between two networks when peering state is
   * ACTIVE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exchangeSubnetRoutes;

  /**
   * Whether to export the custom routes to peer network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exportCustomRoutes;

  /**
   * Whether subnet routes with public IP range are exported. The default value is true, all subnet
   * routes are exported. The IPv4 special-use ranges
   * (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not
   * controlled by this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exportSubnetRoutesWithPublicIp;

  /**
   * Whether to import the custom routes from peer network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean importCustomRoutes;

  /**
   * Whether subnet routes with public IP range are imported. The default value is false. The IPv4
   * special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported
   * from peers and are not controlled by this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean importSubnetRoutesWithPublicIp;

  /**
   * Name of this peering. Provided by the client when the peering is created. The name must comply
   * with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the
   * following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The URL of the peer network. It can be either full URL or partial URL. The peer network may
   * belong to a different project. If the partial URL does not contain project, it is assumed that
   * the peer network is in the same project as the current network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Maximum Transmission Unit in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer peerMtu;

  /**
   * [Output Only] State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE`
   * when there's a matching configuration in the peer network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * [Output Only] Details about the current state of the peering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateDetails;

  /**
   * Whether Cloud Routers in this network can automatically advertise subnets from the peer
   * network.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdvertisePeerSubnetsViaRouters() {
    return advertisePeerSubnetsViaRouters;
  }

  /**
   * Whether Cloud Routers in this network can automatically advertise subnets from the peer
   * network.
   * @param advertisePeerSubnetsViaRouters advertisePeerSubnetsViaRouters or {@code null} for none
   */
  public NetworkPeering setAdvertisePeerSubnetsViaRouters(java.lang.Boolean advertisePeerSubnetsViaRouters) {
    this.advertisePeerSubnetsViaRouters = advertisePeerSubnetsViaRouters;
    return this;
  }

  /**
   * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates
   * whether full mesh connectivity is created and managed automatically between peered networks.
   * Currently this field should always be true since Google Compute Engine will automatically
   * create and manage subnetwork routes between two networks when peering state is ACTIVE.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoCreateRoutes() {
    return autoCreateRoutes;
  }

  /**
   * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates
   * whether full mesh connectivity is created and managed automatically between peered networks.
   * Currently this field should always be true since Google Compute Engine will automatically
   * create and manage subnetwork routes between two networks when peering state is ACTIVE.
   * @param autoCreateRoutes autoCreateRoutes or {@code null} for none
   */
  public NetworkPeering setAutoCreateRoutes(java.lang.Boolean autoCreateRoutes) {
    this.autoCreateRoutes = autoCreateRoutes;
    return this;
  }

  /**
   * Indicates whether full mesh connectivity is created and managed automatically between peered
   * networks. Currently this field should always be true since Google Compute Engine will
   * automatically create and manage subnetwork routes between two networks when peering state is
   * ACTIVE.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExchangeSubnetRoutes() {
    return exchangeSubnetRoutes;
  }

  /**
   * Indicates whether full mesh connectivity is created and managed automatically between peered
   * networks. Currently this field should always be true since Google Compute Engine will
   * automatically create and manage subnetwork routes between two networks when peering state is
   * ACTIVE.
   * @param exchangeSubnetRoutes exchangeSubnetRoutes or {@code null} for none
   */
  public NetworkPeering setExchangeSubnetRoutes(java.lang.Boolean exchangeSubnetRoutes) {
    this.exchangeSubnetRoutes = exchangeSubnetRoutes;
    return this;
  }

  /**
   * Whether to export the custom routes to peer network.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExportCustomRoutes() {
    return exportCustomRoutes;
  }

  /**
   * Whether to export the custom routes to peer network.
   * @param exportCustomRoutes exportCustomRoutes or {@code null} for none
   */
  public NetworkPeering setExportCustomRoutes(java.lang.Boolean exportCustomRoutes) {
    this.exportCustomRoutes = exportCustomRoutes;
    return this;
  }

  /**
   * Whether subnet routes with public IP range are exported. The default value is true, all subnet
   * routes are exported. The IPv4 special-use ranges
   * (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not
   * controlled by this field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExportSubnetRoutesWithPublicIp() {
    return exportSubnetRoutesWithPublicIp;
  }

  /**
   * Whether subnet routes with public IP range are exported. The default value is true, all subnet
   * routes are exported. The IPv4 special-use ranges
   * (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not
   * controlled by this field.
   * @param exportSubnetRoutesWithPublicIp exportSubnetRoutesWithPublicIp or {@code null} for none
   */
  public NetworkPeering setExportSubnetRoutesWithPublicIp(java.lang.Boolean exportSubnetRoutesWithPublicIp) {
    this.exportSubnetRoutesWithPublicIp = exportSubnetRoutesWithPublicIp;
    return this;
  }

  /**
   * Whether to import the custom routes from peer network.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getImportCustomRoutes() {
    return importCustomRoutes;
  }

  /**
   * Whether to import the custom routes from peer network.
   * @param importCustomRoutes importCustomRoutes or {@code null} for none
   */
  public NetworkPeering setImportCustomRoutes(java.lang.Boolean importCustomRoutes) {
    this.importCustomRoutes = importCustomRoutes;
    return this;
  }

  /**
   * Whether subnet routes with public IP range are imported. The default value is false. The IPv4
   * special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported
   * from peers and are not controlled by this field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getImportSubnetRoutesWithPublicIp() {
    return importSubnetRoutesWithPublicIp;
  }

  /**
   * Whether subnet routes with public IP range are imported. The default value is false. The IPv4
   * special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported
   * from peers and are not controlled by this field.
   * @param importSubnetRoutesWithPublicIp importSubnetRoutesWithPublicIp or {@code null} for none
   */
  public NetworkPeering setImportSubnetRoutesWithPublicIp(java.lang.Boolean importSubnetRoutesWithPublicIp) {
    this.importSubnetRoutesWithPublicIp = importSubnetRoutesWithPublicIp;
    return this;
  }

  /**
   * Name of this peering. Provided by the client when the peering is created. The name must comply
   * with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the
   * following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this peering. Provided by the client when the peering is created. The name must comply
   * with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the
   * following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public NetworkPeering setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The URL of the peer network. It can be either full URL or partial URL. The peer network may
   * belong to a different project. If the partial URL does not contain project, it is assumed that
   * the peer network is in the same project as the current network.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The URL of the peer network. It can be either full URL or partial URL. The peer network may
   * belong to a different project. If the partial URL does not contain project, it is assumed that
   * the peer network is in the same project as the current network.
   * @param network network or {@code null} for none
   */
  public NetworkPeering setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Maximum Transmission Unit in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPeerMtu() {
    return peerMtu;
  }

  /**
   * Maximum Transmission Unit in bytes.
   * @param peerMtu peerMtu or {@code null} for none
   */
  public NetworkPeering setPeerMtu(java.lang.Integer peerMtu) {
    this.peerMtu = peerMtu;
    return this;
  }

  /**
   * [Output Only] State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE`
   * when there's a matching configuration in the peer network.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output Only] State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE`
   * when there's a matching configuration in the peer network.
   * @param state state or {@code null} for none
   */
  public NetworkPeering setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * [Output Only] Details about the current state of the peering.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateDetails() {
    return stateDetails;
  }

  /**
   * [Output Only] Details about the current state of the peering.
   * @param stateDetails stateDetails or {@code null} for none
   */
  public NetworkPeering setStateDetails(java.lang.String stateDetails) {
    this.stateDetails = stateDetails;
    return this;
  }

  @Override
  public NetworkPeering set(String fieldName, Object value) {
    return (NetworkPeering) super.set(fieldName, value);
  }

  @Override
  public NetworkPeering clone() {
    return (NetworkPeering) super.clone();
  }

}
