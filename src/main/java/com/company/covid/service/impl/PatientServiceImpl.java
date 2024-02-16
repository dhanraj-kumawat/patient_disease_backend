package com.company.covid.service.impl;

import com.company.covid.dao.PassportDao;
import com.company.covid.dao.PatientDao;
import com.company.covid.dto.PassportDto;
import com.company.covid.dto.PatientDto;
import com.company.covid.exception.PatientRecordNotFoundException;
import com.company.covid.mapper.PassportMapper;
import com.company.covid.mapper.PatientMapper;
import com.company.covid.model.Passport;
import com.company.covid.model.Patient;
import com.company.covid.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;
    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = PatientMapper.toEntity(patientDto);
        Patient dbPatient = patientDao.save(patient);

        PatientDto responsePatientDto = PatientMapper.toDto(dbPatient);
        return responsePatientDto;
    }

    @Override
    public PatientDto getPatient(long id) {
        Optional<Patient> dbPatient = patientDao.findById(id);
        if(dbPatient.isEmpty()){
            throw new PatientRecordNotFoundException("patient with id: "+id+ " not found!");
        }
        else{
            // unwrapping data form optional class
            Patient patient = dbPatient.get();
            return PatientMapper.toDto(patient);
        }
    }

    @Override
    public List<PatientDto> getPatients() {
        List<PatientDto> patientDtos = new ArrayList<>();
        patientDao.findAll().stream().forEach((patient -> { patientDtos.add(PatientMapper.toDto(patient));}));
        return patientDtos;
    }
}
