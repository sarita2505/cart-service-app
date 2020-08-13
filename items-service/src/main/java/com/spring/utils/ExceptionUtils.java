package com.spring.utils;

import com.spring.model.AppError;

public class ExceptionUtils extends RuntimeException {
    private AppError error;

    public ExceptionUtils(String message, AppError error) {
        super(message);
        this.error = error;
    }

    public ExceptionUtils(Throwable cause, AppError error) {
        super(cause);
        this.error = error;
    }
}
