package com.spring.controller;

import com.spring.error.AppCartException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> appException(Exception e) {
        LOGGER.error("exception occured");
        printLogs(e);
        return new ResponseEntity<Object>("exception occured", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AppCartException.class)
    public ResponseEntity<Object> cartRequestException(AppCartException e) {
        LOGGER.error("cart exception occured");
        printLogs(e);
        return new ResponseEntity<>(e.getAppError().getHttpStatus());
    }

    private void printLogs(Throwable e)
    {
        LOGGER.error(e.toString(),e);
    }
}
