// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: extensions.proto

package com.v2ray.core.common.protoext;

public final class Extensions {
  private Extensions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.v2ray.core.common.protoext.Extensions.messageOpt);
    registry.add(com.v2ray.core.common.protoext.Extensions.fieldOpt);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int MESSAGE_OPT_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      com.v2ray.core.common.protoext.MessageOpt> messageOpt = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.v2ray.core.common.protoext.MessageOpt.class,
        com.v2ray.core.common.protoext.MessageOpt.getDefaultInstance());
  public static final int FIELD_OPT_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      com.v2ray.core.common.protoext.FieldOpt> fieldOpt = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.v2ray.core.common.protoext.FieldOpt.class,
        com.v2ray.core.common.protoext.FieldOpt.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_common_protoext_MessageOpt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_common_protoext_MessageOpt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_common_protoext_FieldOpt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_common_protoext_FieldOpt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020extensions.proto\022\032v2ray.core.common.pr" +
      "otoext\032 google/protobuf/descriptor.proto" +
      "\"Q\n\nMessageOpt\022\014\n\004type\030\001 \003(\t\022\022\n\nshort_na" +
      "me\030\002 \003(\t\022!\n\027transport_original_name\030\361\237\005 " +
      "\001(\t\"\320\001\n\010FieldOpt\022\021\n\tany_wants\030\001 \003(\t\022\026\n\016a" +
      "llowed_values\030\002 \003(\t\022\033\n\023allowed_value_typ" +
      "es\030\003 \003(\t\022#\n\033convert_time_read_file_into\030" +
      "\004 \001(\t\022\021\n\tforbidden\030\005 \001(\010\022%\n\035convert_time" +
      "_resource_loading\030\006 \001(\t\022\035\n\025convert_time_" +
      "parse_ip\030\007 \001(\t:^\n\013message_opt\022\037.google.p" +
      "rotobuf.MessageOptions\030\320\206\003 \001(\0132&.v2ray.c" +
      "ore.common.protoext.MessageOpt:X\n\tfield_" +
      "opt\022\035.google.protobuf.FieldOptions\030\320\206\003 \001" +
      "(\0132$.v2ray.core.common.protoext.FieldOpt" +
      "Bo\n\036com.v2ray.core.common.protoextP\001Z.gi" +
      "thub.com/v2fly/v2ray-core/v5/common/prot" +
      "oext\252\002\032V2Ray.Core.Common.ProtoExtb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_v2ray_core_common_protoext_MessageOpt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_common_protoext_MessageOpt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_common_protoext_MessageOpt_descriptor,
        new java.lang.String[] { "Type", "ShortName", "TransportOriginalName", });
    internal_static_v2ray_core_common_protoext_FieldOpt_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_common_protoext_FieldOpt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_common_protoext_FieldOpt_descriptor,
        new java.lang.String[] { "AnyWants", "AllowedValues", "AllowedValueTypes", "ConvertTimeReadFileInto", "Forbidden", "ConvertTimeResourceLoading", "ConvertTimeParseIp", });
    messageOpt.internalInit(descriptor.getExtensions().get(0));
    fieldOpt.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
