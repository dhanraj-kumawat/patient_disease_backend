package com.company.covid.service.impl;

import com.company.covid.dto.PatientDto;
import com.company.covid.model.Passport;
import com.company.covid.model.Patient;
import com.company.covid.service.PatientService;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = new Patient();
        patient.setId(patientDto.getId());
        patient.setName(patientDto.getName());
        patient.setEmail(patientDto.getEmail());
        patient.setContactNo(patientDto.getContactNo());
        Passport passport = new Passport();
        passport.setId(patientDto.getPassportDto().getId());
        passport.setPasswordNo(patientDto.getPassportDto().getPasswordNo());
        return patientDto;
    }
}
