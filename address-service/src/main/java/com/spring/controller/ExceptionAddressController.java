package com.spring.controller;

import com.spring.exception.AddressException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAddressController {
    private static final Logger LOGGER= LoggerFactory.getLogger(ExceptionAddressController.class);
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> exception(Exception e){
        LOGGER.error("exception occured: ",e);
        return ResponseEntity.status(500).body("exception from exception controller class");
    }

    @ExceptionHandler(AddressException.class)
    public ResponseEntity<Object> AddressServiceException(AddressException e){
        LOGGER.error("exception occured:",e);
        return ResponseEntity.status(500).body("exception from address exceptioncontroller class");
    }
}
