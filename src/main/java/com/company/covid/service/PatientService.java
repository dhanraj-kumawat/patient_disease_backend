package com.company.covid.service;

import com.company.covid.dto.PatientDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface PatientService {

    public PatientDto createPatient(PatientDto patientDto);

    public PatientDto getPatient(long id);
    public List<PatientDto> getPatients();
}
