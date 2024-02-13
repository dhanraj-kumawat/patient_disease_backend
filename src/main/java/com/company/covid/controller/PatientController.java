package com.company.covid.controller;

import com.company.covid.dto.PatientDto;
import com.company.covid.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @PostMapping("/patients")
    public PatientDto createPatient(@RequestBody PatientDto patientDto){
        return patientService.createPatient(patientDto);
    }
}
