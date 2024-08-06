package com.konexinnovation.exceptions;

public class ValidationNotMatchSong extends AssertionError{
    public static final String VALIDATION_NOT_MATCH = "The validation don´t match. $s";

    public ValidationNotMatchSong(String message, Throwable cause){
        super(message, cause);
    }
}
