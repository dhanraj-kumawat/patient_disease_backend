package com.company.covid.dto;

public class PassportDto {
    private long id;
    private long passwordNo;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPasswordNo() {
        return passwordNo;
    }

    public void setPasswordNo(long passwordNo) {
        this.passwordNo = passwordNo;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passwordNo=" + passwordNo +
                '}';
    }
}
