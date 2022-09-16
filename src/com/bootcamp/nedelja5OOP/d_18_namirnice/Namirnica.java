package com.bootcamp.nedelja5OOP.d_18_namirnice;

import java.util.ArrayList;

public class Namirnica{
    private String naziv;
    private double cena;

    public Namirnica(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Naziv: " + naziv + ", cena: " + cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Namirnica)) return false;

        Namirnica namirnica = (Namirnica) o;

        if (Double.compare(namirnica.getCena(), getCena()) != 0) return false;
        return getNaziv().equals(namirnica.getNaziv());
    }
}
