package com.spring.exception;

import com.spring.model.AppError;

public class AddressException extends RuntimeException {
    private AppError error;

    public AddressException(String message, AppError error) {
        super(message);
        this.error = error;
    }

    public AddressException(Throwable cause, AppError error) {
        super(cause);
        this.error = error;
    }
}
