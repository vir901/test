package org.example;

public class InvalidEmailOrPasswordException extends RuntimeException {

    private static final String MESSAGE = "Invalid Email or Password";

    public InvalidEmailOrPasswordException() {
        super(MESSAGE);
    }

}
