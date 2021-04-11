package com.adesso.rideshare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SeyahatNotFoundException extends RuntimeException {

    public SeyahatNotFoundException(String message)
    {
        super(message);
    }
}
