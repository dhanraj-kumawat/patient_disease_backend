package com.company.covid.controller;

import com.company.covid.dto.PatientDto;
import com.company.covid.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/patients/{id}")
    public PatientDto getPatient(@PathVariable long id){
        return patientService.getPatient(id);
    }

    @GetMapping("/patients")
    public List<PatientDto> getPatients(){
        return patientService.getPatients();
    }

    @DeleteMapping("/patients/{id}")
    public PatientDto deletePatient(@PathVariable long id){
        return patientService.deletePatient(id);
    }
}
