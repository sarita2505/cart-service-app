package com.spring.error;

import com.spring.model.AppError;

public class AppCartException extends RuntimeException {
    private AppError error;

    public AppCartException(String message, AppError error) {
        super(message);
        this.error = error;
    }

    public AppCartException(Throwable cause, AppError error) {
        super(cause);
        this.error = error;
    }
}
