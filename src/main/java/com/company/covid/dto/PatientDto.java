package com.company.covid.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDto {
  private long id;
  private String name;
  private String email;
  private String contactNo;
  private PassportDto passportDto;


}
