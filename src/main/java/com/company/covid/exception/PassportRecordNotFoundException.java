package com.company.covid.exception;

public class PassportRecordNotFoundException extends RuntimeException{
    private String exceptionMsg;
    public PassportRecordNotFoundException(){}
    public PassportRecordNotFoundException(String exceptionMsg){
        this.exceptionMsg = exceptionMsg;
    }
    public String getExceptionMsg(){
        return exceptionMsg;
    }
}
