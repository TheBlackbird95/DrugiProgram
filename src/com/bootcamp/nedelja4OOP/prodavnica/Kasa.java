package com.bootcamp.nedelja4OOP.prodavnica;

import java.util.ArrayList;

public class Kasa {

    //region Getteri
    public String getId() {
        return id;
    }

    public ArrayList<Roba> getRoba() {
        return roba;
    }

    public Kasir getKasir() {
        return kasir;
    }
    //endregion

    private final String id;
    private final ArrayList<Roba> roba;
    private final Kasir kasir;

    public Kasa(String id, ArrayList<Roba> roba, Kasir kasir) {
        this.id = id;
        this.roba = roba;
        this.kasir = kasir;
    }

    public String kreirajRacun (){
        return roba.toString();
    }
}
