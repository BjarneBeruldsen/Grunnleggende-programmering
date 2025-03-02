package com.example.banksystemmedexception;

public class UgyldigPinException extends RuntimeException{
    public UgyldigPinException(String melding) {
        super(melding);
    }
}
