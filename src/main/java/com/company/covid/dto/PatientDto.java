package com.company.covid.dto;

public class PatientDto {
  private long id;
  private String name;
  private String email;
  private String contactNo;
  private PassportDto passportDto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public PassportDto getPassportDto() {
        return passportDto;
    }

    public void setPassportDto(PassportDto passportDto) {
        this.passportDto = passportDto;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", passport=" + passportDto +
                '}';
    }
}
