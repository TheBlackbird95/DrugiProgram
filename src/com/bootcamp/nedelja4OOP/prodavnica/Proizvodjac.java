package com.bootcamp.nedelja4OOP.prodavnica;

public class Proizvodjac {
    private final String naziv;
    private final String lokacija;


    //region Getteri
    public String getNaziv() {
        return naziv;
    }

    public String getLokacija() {
        return lokacija;
    }
    //endregion

    public Proizvodjac(String naziv, String lokacija) {
        this.naziv = naziv;
        this.lokacija = lokacija;
    }

    @Override
    public String toString() {
        return "Naziv: " + this.naziv + ", lokacija: " + this.lokacija;
    }
}