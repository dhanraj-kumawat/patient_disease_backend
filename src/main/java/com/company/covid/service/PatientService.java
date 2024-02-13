package com.company.covid.service;

import com.company.covid.dto.PatientDto;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    public PatientDto createPatient(PatientDto patientDto);
}
