package com.company.covid.exception;

public class PatientRecordNotFoundException extends RuntimeException{
    private String exceptionMsg;
    public PatientRecordNotFoundException(){}
    public PatientRecordNotFoundException(String exceptionMsg){
        this.exceptionMsg = exceptionMsg;
    }
    public String getExceptionMsg(){
        return exceptionMsg;
    }
}
