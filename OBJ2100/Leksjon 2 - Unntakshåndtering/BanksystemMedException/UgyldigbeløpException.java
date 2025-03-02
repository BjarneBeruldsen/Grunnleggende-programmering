package com.example.banksystemmedexception;

public class UgyldigbeløpException extends RuntimeException{
    private int beløp;
    public UgyldigbeløpException(int beløp, String melding) {
        super("Ugyldig beløp: " + beløp + " " +  melding);
    }
}
