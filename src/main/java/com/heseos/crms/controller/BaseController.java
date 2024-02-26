package com.heseos.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BaseController {
    @ExceptionHandler({Exception.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Bad request")
    public void handleAllExceptions(){
    }
}
