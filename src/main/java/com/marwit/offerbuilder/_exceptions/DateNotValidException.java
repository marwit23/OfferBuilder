package com.marwit.offerbuilder._exceptions;

public class DateNotValidException extends RuntimeException {
    public DateNotValidException(){
        super("Input date is not valid.");
    }
}
