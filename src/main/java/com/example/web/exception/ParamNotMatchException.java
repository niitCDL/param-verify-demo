package com.example.web.exception;

public class ParamNotMatchException extends Exception{
    public ParamNotMatchException() {
    }

    public ParamNotMatchException(String message) {
        super(message);
    }
}
