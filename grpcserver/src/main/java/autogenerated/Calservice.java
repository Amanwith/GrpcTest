// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calservice.proto

package autogenerated;

public final class Calservice {
  private Calservice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectBookByIDRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectBookByIDRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectBookByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectBookByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExactBookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExactBookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VagueBookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VagueBookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_addResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_addResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020calservice.proto\"#\n\025SelectBookByIDRequ" +
      "est\022\n\n\002id\030\001 \001(\t\"\'\n\027SelectBookByNameReque" +
      "st\022\014\n\004name\030\001 \001(\t\"\033\n\rDeleteRequest\022\n\n\002id\030" +
      "\001 \001(\t\"\'\n\013BookRequest\022\n\n\002id\030\001 \001(\t\022\014\n\004name" +
      "\030\002 \001(\t\"/\n\021ExactBookResponse\022\032\n\004book\030\001 \001(" +
      "\0132\014.BookRequest\"3\n\021VagueBookResponse\022\036\n\010" +
      "bookList\030\001 \003(\0132\014.BookRequest\"\036\n\013addRespo" +
      "nse\022\017\n\007success\030\001 \001(\010\"!\n\016deleteResponse\022\017" +
      "\n\007success\030\001 \001(\0102\334\001\n\016LibraryService\022#\n\003ad" +
      "d\022\014.BookRequest\032\014.addResponse\"\000\0229\n\tquery" +
      "ById\022\026.SelectBookByIDRequest\032\022.ExactBook" +
      "Response\"\000\022=\n\013queryByName\022\030.SelectBookBy" +
      "NameRequest\032\022.VagueBookResponse\"\000\022+\n\006del" +
      "ete\022\016.DeleteRequest\032\017.deleteResponse\"\000B\021" +
      "\n\rautogeneratedP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SelectBookByIDRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SelectBookByIDRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelectBookByIDRequest_descriptor,
        new String[] { "Id", });
    internal_static_SelectBookByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SelectBookByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelectBookByNameRequest_descriptor,
        new String[] { "Name", });
    internal_static_DeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_DeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteRequest_descriptor,
        new String[] { "Id", });
    internal_static_BookRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_BookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BookRequest_descriptor,
        new String[] { "Id", "Name", });
    internal_static_ExactBookResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ExactBookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExactBookResponse_descriptor,
        new String[] { "entity.Book", });
    internal_static_VagueBookResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_VagueBookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VagueBookResponse_descriptor,
        new String[] { "BookList", });
    internal_static_addResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_addResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_addResponse_descriptor,
        new String[] { "Success", });
    internal_static_deleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_deleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteResponse_descriptor,
        new String[] { "Success", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
