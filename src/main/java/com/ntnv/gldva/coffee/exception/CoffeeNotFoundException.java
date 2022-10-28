package com.ntnv.gldva.coffee.exception;

public class CoffeeNotFoundException extends Exception {
    public CoffeeNotFoundException(String message) {
        super(message);
    }

    public CoffeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}