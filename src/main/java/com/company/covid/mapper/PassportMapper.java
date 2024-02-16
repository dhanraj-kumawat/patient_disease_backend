package com.company.covid.mapper;

import com.company.covid.dto.PassportDto;
import com.company.covid.model.Passport;

public class PassportMapper {
    public static PassportDto toDto(Passport passport){
        PassportDto passportDto = new PassportDto();
        passportDto.setId(passport.getId());
        passportDto.setPassportNo(passport.getPassportNo());
        return passportDto;
    }

    public static Passport toEntity(PassportDto passportDto){
        Passport passport = new Passport();
        passport.setPassportNo(passportDto.getPassportNo());
        return passport;
    }
}
