/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1beta1;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the instance, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the instance, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the instance (2048 characters or less).
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the instance (2048 characters or less).
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The instance state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Instance.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The instance state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Instance.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.filestore.v1beta1.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the instance state, if available.
   * </pre>
   *
   * <code>string status_message = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the instance state, if available.
   * </pre>
   *
   * <code>string status_message = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The service tier of the instance.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Instance.Tier tier = 8;</code>
   *
   * @return The enum numeric value on the wire for tier.
   */
  int getTierValue();
  /**
   *
   *
   * <pre>
   * The service tier of the instance.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Instance.Tier tier = 8;</code>
   *
   * @return The tier.
   */
  com.google.cloud.filestore.v1beta1.Instance.Tier getTier();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  java.util.List<com.google.cloud.filestore.v1beta1.FileShareConfig> getFileSharesList();
  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  com.google.cloud.filestore.v1beta1.FileShareConfig getFileShares(int index);
  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  int getFileSharesCount();
  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  java.util.List<? extends com.google.cloud.filestore.v1beta1.FileShareConfigOrBuilder>
      getFileSharesOrBuilderList();
  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  com.google.cloud.filestore.v1beta1.FileShareConfigOrBuilder getFileSharesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  java.util.List<com.google.cloud.filestore.v1beta1.NetworkConfig> getNetworksList();
  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  com.google.cloud.filestore.v1beta1.NetworkConfig getNetworks(int index);
  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  int getNetworksCount();
  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  java.util.List<? extends com.google.cloud.filestore.v1beta1.NetworkConfigOrBuilder>
      getNetworksOrBuilderList();
  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  com.google.cloud.filestore.v1beta1.NetworkConfigOrBuilder getNetworksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Server-specified ETag for the instance resource to prevent simultaneous
   * updates from overwriting each other.
   * </pre>
   *
   * <code>string etag = 12;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Server-specified ETag for the instance resource to prevent simultaneous
   * updates from overwriting each other.
   * </pre>
   *
   * <code>string etag = 12;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the satisfiesPzs field is set.
   */
  boolean hasSatisfiesPzs();
  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The satisfiesPzs.
   */
  com.google.protobuf.BoolValue getSatisfiesPzs();
  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.BoolValueOrBuilder getSatisfiesPzsOrBuilder();
}
