package com.spring.exceptioncontroller;

import com.google.inject.internal.cglib.core.$ReflectUtils;
import com.spring.model.AppError;
import com.spring.utils.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ItemExceptionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemExceptionController.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> exception(Exception e) {
        LOGGER.error(e.toString(), e);
        return new ResponseEntity<Object>("exception occured", HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(ExceptionUtils.class)
    public ResponseEntity<Object> ItemsException(ExceptionUtils utils) {
        LOGGER.info("items exception");
        return new ResponseEntity<>(new AppError("items exception occured", 500), HttpStatus.NOT_ACCEPTABLE);
    }
}
