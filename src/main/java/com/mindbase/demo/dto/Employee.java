package com.mindbase.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {
  private String uid;
  private String username;
  private String firstname;
  private String lastname;
  private String address;
}
