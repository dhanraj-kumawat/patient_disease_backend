package com.company.covid.mapper;

import com.company.covid.dto.PassportDto;
import com.company.covid.dto.PatientDto;
import com.company.covid.model.Passport;
import com.company.covid.model.Patient;

public class PatientMapper {
    public static Patient toEntity(PatientDto patientDto){
        Patient patient = new Patient();
        patient.setName(patientDto.getName());
        patient.setEmail(patientDto.getEmail());
        patient.setContactNo(patientDto.getContactNo());

        Passport passport = new Passport();
        passport.setPassportNo(patientDto.getPassportDto().getPassportNo());
        patient.setPassport(passport);

        return patient;
    }
    public static PatientDto toDto(Patient patient){
        PatientDto patientDto = new PatientDto();
        patientDto.setId(patient.getId());
        patientDto.setEmail(patient.getEmail());
        patientDto.setName(patient.getName());
        patientDto.setContactNo(patient.getContactNo());

        PassportDto passportDto = new PassportDto();
        passportDto.setId(patient.getPassport().getId());
        passportDto.setPassportNo(patient.getPassport().getPassportNo());
        patientDto.setPassportDto(passportDto);

        return patientDto;
    }
}
