/*
 * Cloud Resource Service API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OsType
 */
@JsonAdapter(OsType.Adapter.class)
public enum OsType {
  
  WINDOWS("windows"),
  
  UBUNTU("ubuntu"),
  
  DEBIAN("debian"),
  
  FREEBSD("freebsd");

  private String value;

  OsType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OsType fromValue(String text) {
    for (OsType b : OsType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OsType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OsType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OsType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OsType.fromValue(String.valueOf(value));
    }
  }
}
