package com.adesso.rideshare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TumKoltuklarDoluException extends RuntimeException {

    public TumKoltuklarDoluException(String message)
    {
        super(message);
    }
}
