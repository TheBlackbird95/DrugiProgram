package com.bootcamp.nedelja4OOP.prodavnica;

public class Meso extends Roba{
    private double tezina;
    private String tip;

    public Meso(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac, double tezina, String tip) {
        super(barKod, cena, naziv, popust, proizvodjac);
        this.tezina = tezina;
        this.tip = tip;
    }
    //region Getteri
    public double getTezina() {
        return tezina;
    }

    public String getTip() {
        return tip;
    }
    //endregion

    @Override
    public void obracunajCenu() {
        setCena(getCena()*tezina/1000);
    }

    @Override
    public String toString() {
        return super.toString() + ", tezina: " + getTezina() + ", tip: " + getTip();
    }
}
