package com.example.banksystemmedexception;

public class UgyldigBalanseException extends RuntimeException{
    public UgyldigBalanseException(String melding) {
        super(melding);
    }
}
