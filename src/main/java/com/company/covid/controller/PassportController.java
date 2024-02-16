package com.company.covid.controller;

import com.company.covid.dto.PassportDto;
import com.company.covid.model.Passport;
import com.company.covid.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PassportController {
    @Autowired
    private PassportService passportService;

    @PostMapping("/passports")
    public PassportDto savePassport(@RequestBody PassportDto passportDto){
       return passportService.savePassport(passportDto);
    }

    @GetMapping("/passports/{id}")
    public PassportDto getPassport(@PathVariable long id){
        return passportService.getPassport(id);
    }
}
