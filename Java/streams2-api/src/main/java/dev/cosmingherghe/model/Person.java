package dev.cosmingherghe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  private Integer id;
  private String firstName;
  private String lastName;
  private String email;
  private String gender;
  private Integer age;
}