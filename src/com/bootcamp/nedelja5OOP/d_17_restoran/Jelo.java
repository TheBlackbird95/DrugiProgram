package com.bootcamp.nedelja5OOP.d_17_restoran;

import java.util.ArrayList;

public class Jelo {
    private String naziv;
    private double cena;
    private String vrsta;
    private static ArrayList<Jelo> meni = new ArrayList<>();

    public Jelo(String naziv, double cena, String vrsta) {
        this.naziv = naziv;
        this.cena = cena;
        this.vrsta = vrsta;
        meni.add(this);
    }

    public static ArrayList<Jelo> getMeni() {
        return meni;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Jelo -> " + "naziv: " + naziv + ", cena: " + cena;
    }
}
