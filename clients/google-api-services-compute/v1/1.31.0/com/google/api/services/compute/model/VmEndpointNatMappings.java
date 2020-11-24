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
 * Contain information of Nat mapping for a VM endpoint (i.e., NIC).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VmEndpointNatMappings extends com.google.api.client.json.GenericJson {

  /**
   * Name of the VM instance which the endpoint belongs to
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VmEndpointNatMappingsInterfaceNatMappings> interfaceNatMappings;

  /**
   * Name of the VM instance which the endpoint belongs to
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceName() {
    return instanceName;
  }

  /**
   * Name of the VM instance which the endpoint belongs to
   * @param instanceName instanceName or {@code null} for none
   */
  public VmEndpointNatMappings setInstanceName(java.lang.String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<VmEndpointNatMappingsInterfaceNatMappings> getInterfaceNatMappings() {
    return interfaceNatMappings;
  }

  /**
   * @param interfaceNatMappings interfaceNatMappings or {@code null} for none
   */
  public VmEndpointNatMappings setInterfaceNatMappings(java.util.List<VmEndpointNatMappingsInterfaceNatMappings> interfaceNatMappings) {
    this.interfaceNatMappings = interfaceNatMappings;
    return this;
  }

  @Override
  public VmEndpointNatMappings set(String fieldName, Object value) {
    return (VmEndpointNatMappings) super.set(fieldName, value);
  }

  @Override
  public VmEndpointNatMappings clone() {
    return (VmEndpointNatMappings) super.clone();
  }

}
