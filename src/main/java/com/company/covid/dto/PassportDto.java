package com.company.covid.dto;

public class PassportDto {
    private long id;
    private long passportNo;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(long passportNo) {
        this.passportNo = passportNo;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passwordNo=" + passportNo +
                '}';
    }
}
