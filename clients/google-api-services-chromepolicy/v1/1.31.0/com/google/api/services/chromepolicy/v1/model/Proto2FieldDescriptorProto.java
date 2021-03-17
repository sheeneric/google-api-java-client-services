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

package com.google.api.services.chromepolicy.v1.model;

/**
 * Describes a field within a message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Proto2FieldDescriptorProto extends com.google.api.client.json.GenericJson {

  /**
   * For numeric types, contains the original text representation of the value. For booleans, "true"
   * or "false". For strings, contains the default text contents (not escaped in any way). For
   * bytes, contains the C escaped value. All bytes >= 128 are escaped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultValue;

  /**
   * JSON name of this field. The value is set by protocol compiler. If the user has set a
   * "json_name" option on this field, that option's value will be used. Otherwise, it's deduced
   * from the field's name by converting it to camelCase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jsonName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer number;

  /**
   * If set, gives the index of a oneof in the containing type's oneof_decl list. This field is a
   * member of that oneof.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer oneofIndex;

  /**
   * If true, this is a proto3 "optional". When a proto3 field is optional, it tracks presence
   * regardless of field type. When proto3_optional is true, this field must be belong to a oneof to
   * signal to old proto3 clients that presence is tracked for this field. This oneof is known as a
   * "synthetic" oneof, and this field must be its sole member (each proto3 optional field gets its
   * own synthetic oneof). Synthetic oneofs exist in the descriptor only, and do not generate any
   * API. Synthetic oneofs must be ordered after all "real" oneofs. For message fields,
   * proto3_optional doesn't create any semantic change, since non-repeated message fields always
   * track presence. However it still indicates the semantic detail of whether the user wrote
   * "optional" or not. This can be useful for round-tripping the .proto file. For consistency we
   * give message fields a synthetic oneof also, even though it is not required to track presence.
   * This is especially important because the parser can't tell if a field is a message or an enum,
   * so it must always create a synthetic oneof. Proto2 optional fields do not set this flag,
   * because they already indicate optional with `LABEL_OPTIONAL`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean proto3Optional;

  /**
   * If type_name is set, this need not be set. If both this and type_name are set, this must be one
   * of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * For message and enum types, this is the name of the type. If the name starts with a '.', it is
   * fully-qualified. Otherwise, C++-like scoping rules are used to find the type (i.e. first the
   * nested types within this message are searched, then within the parent, on up to the root
   * namespace).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String typeName;

  /**
   * For numeric types, contains the original text representation of the value. For booleans, "true"
   * or "false". For strings, contains the default text contents (not escaped in any way). For
   * bytes, contains the C escaped value. All bytes >= 128 are escaped.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultValue() {
    return defaultValue;
  }

  /**
   * For numeric types, contains the original text representation of the value. For booleans, "true"
   * or "false". For strings, contains the default text contents (not escaped in any way). For
   * bytes, contains the C escaped value. All bytes >= 128 are escaped.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public Proto2FieldDescriptorProto setDefaultValue(java.lang.String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * JSON name of this field. The value is set by protocol compiler. If the user has set a
   * "json_name" option on this field, that option's value will be used. Otherwise, it's deduced
   * from the field's name by converting it to camelCase.
   * @return value or {@code null} for none
   */
  public java.lang.String getJsonName() {
    return jsonName;
  }

  /**
   * JSON name of this field. The value is set by protocol compiler. If the user has set a
   * "json_name" option on this field, that option's value will be used. Otherwise, it's deduced
   * from the field's name by converting it to camelCase.
   * @param jsonName jsonName or {@code null} for none
   */
  public Proto2FieldDescriptorProto setJsonName(java.lang.String jsonName) {
    this.jsonName = jsonName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * @param label label or {@code null} for none
   */
  public Proto2FieldDescriptorProto setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Proto2FieldDescriptorProto setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumber() {
    return number;
  }

  /**
   * @param number number or {@code null} for none
   */
  public Proto2FieldDescriptorProto setNumber(java.lang.Integer number) {
    this.number = number;
    return this;
  }

  /**
   * If set, gives the index of a oneof in the containing type's oneof_decl list. This field is a
   * member of that oneof.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOneofIndex() {
    return oneofIndex;
  }

  /**
   * If set, gives the index of a oneof in the containing type's oneof_decl list. This field is a
   * member of that oneof.
   * @param oneofIndex oneofIndex or {@code null} for none
   */
  public Proto2FieldDescriptorProto setOneofIndex(java.lang.Integer oneofIndex) {
    this.oneofIndex = oneofIndex;
    return this;
  }

  /**
   * If true, this is a proto3 "optional". When a proto3 field is optional, it tracks presence
   * regardless of field type. When proto3_optional is true, this field must be belong to a oneof to
   * signal to old proto3 clients that presence is tracked for this field. This oneof is known as a
   * "synthetic" oneof, and this field must be its sole member (each proto3 optional field gets its
   * own synthetic oneof). Synthetic oneofs exist in the descriptor only, and do not generate any
   * API. Synthetic oneofs must be ordered after all "real" oneofs. For message fields,
   * proto3_optional doesn't create any semantic change, since non-repeated message fields always
   * track presence. However it still indicates the semantic detail of whether the user wrote
   * "optional" or not. This can be useful for round-tripping the .proto file. For consistency we
   * give message fields a synthetic oneof also, even though it is not required to track presence.
   * This is especially important because the parser can't tell if a field is a message or an enum,
   * so it must always create a synthetic oneof. Proto2 optional fields do not set this flag,
   * because they already indicate optional with `LABEL_OPTIONAL`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProto3Optional() {
    return proto3Optional;
  }

  /**
   * If true, this is a proto3 "optional". When a proto3 field is optional, it tracks presence
   * regardless of field type. When proto3_optional is true, this field must be belong to a oneof to
   * signal to old proto3 clients that presence is tracked for this field. This oneof is known as a
   * "synthetic" oneof, and this field must be its sole member (each proto3 optional field gets its
   * own synthetic oneof). Synthetic oneofs exist in the descriptor only, and do not generate any
   * API. Synthetic oneofs must be ordered after all "real" oneofs. For message fields,
   * proto3_optional doesn't create any semantic change, since non-repeated message fields always
   * track presence. However it still indicates the semantic detail of whether the user wrote
   * "optional" or not. This can be useful for round-tripping the .proto file. For consistency we
   * give message fields a synthetic oneof also, even though it is not required to track presence.
   * This is especially important because the parser can't tell if a field is a message or an enum,
   * so it must always create a synthetic oneof. Proto2 optional fields do not set this flag,
   * because they already indicate optional with `LABEL_OPTIONAL`.
   * @param proto3Optional proto3Optional or {@code null} for none
   */
  public Proto2FieldDescriptorProto setProto3Optional(java.lang.Boolean proto3Optional) {
    this.proto3Optional = proto3Optional;
    return this;
  }

  /**
   * If type_name is set, this need not be set. If both this and type_name are set, this must be one
   * of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * If type_name is set, this need not be set. If both this and type_name are set, this must be one
   * of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
   * @param type type or {@code null} for none
   */
  public Proto2FieldDescriptorProto setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * For message and enum types, this is the name of the type. If the name starts with a '.', it is
   * fully-qualified. Otherwise, C++-like scoping rules are used to find the type (i.e. first the
   * nested types within this message are searched, then within the parent, on up to the root
   * namespace).
   * @return value or {@code null} for none
   */
  public java.lang.String getTypeName() {
    return typeName;
  }

  /**
   * For message and enum types, this is the name of the type. If the name starts with a '.', it is
   * fully-qualified. Otherwise, C++-like scoping rules are used to find the type (i.e. first the
   * nested types within this message are searched, then within the parent, on up to the root
   * namespace).
   * @param typeName typeName or {@code null} for none
   */
  public Proto2FieldDescriptorProto setTypeName(java.lang.String typeName) {
    this.typeName = typeName;
    return this;
  }

  @Override
  public Proto2FieldDescriptorProto set(String fieldName, Object value) {
    return (Proto2FieldDescriptorProto) super.set(fieldName, value);
  }

  @Override
  public Proto2FieldDescriptorProto clone() {
    return (Proto2FieldDescriptorProto) super.clone();
  }

}