package com.company.covid.service.impl;

import com.company.covid.dao.PassportDao;
import com.company.covid.dao.PatientDao;
import com.company.covid.dto.PassportDto;
import com.company.covid.dto.PatientDto;
import com.company.covid.model.Passport;
import com.company.covid.model.Patient;
import com.company.covid.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDao patientDao;
    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = new Patient();
//        patient.setId(patientDto.getId());
        patient.setName(patientDto.getName());
        patient.setEmail(patientDto.getEmail());
        patient.setContactNo(patientDto.getContactNo());
        Passport passport = new Passport();
//        passport.setId(patientDto.getPassportDto().getId());
        passport.setPassportNo(patientDto.getPassportDto().getPassportNo());
        patient.setPassport(passport);

        Patient dbPatient = patientDao.save(patient);



        PatientDto responsePatient = new PatientDto();
        responsePatient.setId(dbPatient.getId());
        responsePatient.setEmail(dbPatient.getEmail());
        responsePatient.setName(dbPatient.getName());
        responsePatient.setContactNo(dbPatient.getContactNo());

        PassportDto passportDto = new PassportDto();
        passportDto.setId(dbPatient.getPassport().getId());
        passportDto.setPassportNo(dbPatient.getPassport().getPassportNo());
        responsePatient.setPassportDto(passportDto);

        return responsePatient;
    }
}
