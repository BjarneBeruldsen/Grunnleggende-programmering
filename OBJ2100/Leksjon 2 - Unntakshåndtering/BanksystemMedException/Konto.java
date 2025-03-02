package com.example.banksystemmedexception;

public class Konto {
    private int balanse;
    private int pin;
    public Konto(int balanse, int pin) {
        setBalanse(balanse);
        setPin(pin);
    }


    public void uttak(int beløp) {
        if(beløp <= 0) {
            throw new UgyldigbeløpException(beløp, "Må være større enn 0");
        }
        else if(beløp > balanse ) {
            throw new UgyldigBalanseException("Kan ikke ta ut mer enn på konto");
        }
        else {
            setBalanse(balanse - beløp);
        }
    }

    public void insetting(int beløp) {
        if(beløp <= 0) {
            throw new UgyldigbeløpException(beløp, "Må være større enn 0");
        }
        else {
            setBalanse(balanse + beløp);
        }
    }

    public void seBalanse() {
        System.out.println("Balanse: " + balanse);
    }

    public int getBalanse() {
      return balanse;
    }

    public int getPin() {
        return pin;
    }

    public void setBalanse(int balanse) {
        if(this.balanse < 0) {
            throw new UgyldigBalanseException("Balanse kan ikke være negativ");
        }
        this.balanse = balanse;
    }

    public void setPin(int pin) {
        if(pin < 1000 || pin > 9999) {
            throw new UgyldigPinException("Pin må ha 4 siffer");
        }
        else {
            this.pin = pin;
        }
    }

    public boolean sjekkPin(int pin) {
        if(this.pin != pin) {
            throw new UgyldigPinException("Pin-koden er feil!");
        }
        return true;
    }
}
