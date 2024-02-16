package com.company.covid.service;

import com.company.covid.dto.PassportDto;
import org.springframework.stereotype.Service;

@Service
public interface PassportService {
    public PassportDto savePassport(PassportDto passportDto);
    public PassportDto getPassport(long id);
}
