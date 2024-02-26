package com.heseos.crms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "")
public class BadRequestException extends Exception{
    public BadRequestException(String cause) {
        super(cause);
    }
}
