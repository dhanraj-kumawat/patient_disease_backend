package com.company.covid.exception;

import com.company.covid.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// global exception handler
@ControllerAdvice
public class CovidExceptionHandler {
    @ExceptionHandler(PatientRecordNotFoundException.class)
    public ResponseEntity<ApiResponse> handlePatientRecordNotFoundException(PatientRecordNotFoundException e){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(null);
        apiResponse.setApiTimestamp(new Date());
        apiResponse.setStatus(HttpStatus.NOT_FOUND.name());
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("error", e.getExceptionMsg());
        apiResponse.setError(errorMap);
        apiResponse.setPath(null);
        return ResponseEntity.ok().body(apiResponse);
    }
    @ExceptionHandler(PassportRecordNotFoundException.class)
    public ResponseEntity<ApiResponse> handlePassportRecordNotFoundException(PassportRecordNotFoundException e){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(null);
        apiResponse.setApiTimestamp(new Date());
        apiResponse.setStatus(HttpStatus.NOT_FOUND.name());
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("error", e.getExceptionMsg());
        apiResponse.setError(errorMap);
        apiResponse.setPath(null);
        return ResponseEntity.ok().body(apiResponse);
    }
}
