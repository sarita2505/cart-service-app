package com.spring.utils;

import com.spring.model.AppError;

public class ItemServiceException extends RuntimeException {
    private AppError error;

    public ItemServiceException(String message, AppError error) {
        super(message);
        this.error = error;
    }

    public ItemServiceException(Throwable cause, AppError error) {
        super(cause);
        this.error = error;
    }
}
