package com.bootcamp.nedelja4OOP.prodavnica;

public class PijacniProizvod extends Roba {
    private double tezina;
    private boolean uvoz;

    public PijacniProizvod(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac, double tezina, boolean uvoz) {
        super(barKod, cena, naziv, popust, proizvodjac);
        this.tezina = tezina;
        this.uvoz = uvoz;
    }
    //region Getteri
    public double getTezina() {
        return tezina;
    }

    public boolean getUvoz() {
        return uvoz;
    }
    //endregion

    @Override
    public void obracunajCenu() {
        setCena(getCena()*tezina/1000);
    }


    @Override
    public String toString() {
        return super.toString() + ", tezina: " + getTezina() + ", uvoz: " + getUvoz();
    }
}
