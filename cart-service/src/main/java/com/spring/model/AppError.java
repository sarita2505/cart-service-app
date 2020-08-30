package com.spring.model;

import org.springframework.http.HttpStatus;

public class AppError {
    private String message;
    private int errorCode;
    private HttpStatus httpStatus;
    private String serviceName = "cart-service";

    public AppError() {
    }

    public AppError(String message, int status) {
        this.message = message;
        this.errorCode = status;
    }

    public AppError(String message, int errorCode, HttpStatus httpStatus) {
        this.message = message;
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public HttpStatus getHttpStatus() {
        if(this.httpStatus==null){
            this.httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return httpStatus;
    }

    @Override
    public String toString() {
        return "AppError{" +
                "message='" + message + '\'' +
                ", status=" + errorCode +
                '}';
    }
}
