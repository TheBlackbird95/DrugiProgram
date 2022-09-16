package com.bootcamp.nedelja5OOP.biologija;

public class ZivoBice {
    private String staniste;
    private int brojNogu;

    public ZivoBice(String staniste, int brojNogu) {
        this.staniste = staniste;
        this.brojNogu = brojNogu;
    }

    public String getStaniste() {
        return staniste;
    }

    public int getBrojNogu() {
        return brojNogu;
    }
}
