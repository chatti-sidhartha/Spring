package com.sidhartha.springdemo.exception;

import java.util.Map;

public class ErrorResponse {
    private String message;
    private int  status;
    private Boolean success;
    private Map<String,String> errors;


    public ErrorResponse(String message,int status,Boolean success,Map<String,String> errors){
        this.message = message;
        this.status = status;
        this.success = success;
        this.errors = errors;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public Boolean getSuccess() {
        return success;
    }
}
