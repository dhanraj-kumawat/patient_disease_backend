package com.company.covid.service.impl;

import com.company.covid.dao.PassportDao;
import com.company.covid.dto.PassportDto;
import com.company.covid.exception.PassportRecordNotFoundException;
import com.company.covid.mapper.PassportMapper;
import com.company.covid.model.Passport;
import com.company.covid.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassportServiceImpl implements PassportService {

    @Autowired
    private PassportDao passportDao;
    @Override
    public PassportDto savePassport(PassportDto passportDto) {
        Passport passport = PassportMapper.toEntity(passportDto);
        Passport dbPassport = passportDao.save(passport);
        PassportDto responsePassportDto = PassportMapper.toDto(dbPassport);
        return responsePassportDto;
    }

    @Override
    public PassportDto getPassport(long id) {
        Optional<Passport> dbPassport = passportDao.findById(id);
        if(dbPassport.isEmpty()){
            throw new PassportRecordNotFoundException("Passport with id: "+ id + " not found!");
        }
        else{
            Passport passport = dbPassport.get();
            return PassportMapper.toDto(passport);
        }
    }
}
