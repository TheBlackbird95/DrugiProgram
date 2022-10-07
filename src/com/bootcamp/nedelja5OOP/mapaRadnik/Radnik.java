package com.bootcamp.nedelja5OOP.mapaRadnik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Radnik {
    private String ime;
    private String departman;
    private double plata;

    public Radnik(String ime, String departman, double plata) {
        this.ime = ime;
        this.departman = departman;
        this.plata = plata;
    }

    public String getIme() {
        return ime;
    }

    public String getDepartman() {
        return departman;
    }

    public double getPlata() {
        return plata;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Ime radnika: " + ime + System.lineSeparator() + "departman: " + departman + System.lineSeparator() + "plata: " + plata;
    }
}