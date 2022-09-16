package com.bootcamp.nedelja4OOP.prodavnica;

public class Roba {
    private final int barKod;
    private double cena;
    private final String naziv;
    private double popust;
    private final Proizvodjac proizvodjac;

    //region Getteri
    public int getBarKod() {
        return barKod;
    }

    public double getCena() {
        return cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getPopust() {
        return popust;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }
    //endregion

    //region Setteri
    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
    //endregion

    public Roba (int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac){
        this.barKod = barKod;
        this.cena = cena;
        this.naziv = naziv;
        this.popust = popust;
        this.proizvodjac = proizvodjac;
    }
    @Override
    public String toString() {
        return  "barKod: " + barKod +
                ", cena: " + cena +
                ", naziv: " + naziv +
                ", popust: " + popust +
                ", proizvodjac: " + proizvodjac;
    }

    public void obracunajPopust () {
        setCena(getCena() - (getCena()*getPopust()/100));
    }

    public void obracunajCenu(){

    }

}
