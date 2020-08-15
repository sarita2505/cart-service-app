package com.spring.model;

public class AppError {
    private String message;
    private int status;
    private String serviceName = "cart-service";

    public AppError() {
    }

    public AppError(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "AppError{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
