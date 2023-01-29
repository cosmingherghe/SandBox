package dev.cosmingherghe.model;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class UtilData {
  public static <T> List<T> getPeople(
      String jsonFile,
      Class<T> clazz)
      throws IOException {
    InputStream inputStream = Resources.getResource(jsonFile).openStream();
    String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
    Type listType = TypeToken.getParameterized(ArrayList.class, clazz).getType();
    return new Gson().fromJson(json, listType);
  }

  public static PersonDTO mapToPersonDTO(Person p) {
    PersonDTO dto = PersonDTO.builder()
        .id(p.getId())
        .name(p.getFirstName() + " " + p.getLastName())
        .age(p.getAge())
        .build();
    return dto;
  }
}
