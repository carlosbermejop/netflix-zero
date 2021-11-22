package com.carlos.Exceptions;

import lombok.Data;

@Data
public class MoviesException extends Exception {
    String code;

    public MoviesException(String code, String message) {
        super(message);
        this.setCode(code);
    }
}
