package com.bootcamp.nedelja5OOP.d_16_restoran;

import java.util.ArrayList;

public class Restoran {
    private ArrayList<Zaposleni> spisakZaposlenih;

    public Restoran(ArrayList<Zaposleni> spisakZaposlenih) {
        this.spisakZaposlenih = spisakZaposlenih;
    }

    public ArrayList<Zaposleni> konobarSmena(int smena) {
        ArrayList<Zaposleni> konobari = new ArrayList<>();
        for (Zaposleni zaposleni : spisakZaposlenih) {
            if (smena == zaposleni.getSmena() && zaposleni.getPozicija().equalsIgnoreCase("konobar")) {
                konobari.add(zaposleni);
            }
        }
        return konobari;
    }

    public void povecajCenuTrecojSmeni(ArrayList<Zaposleni> sviZaposleni) {
        for (Zaposleni zaposleni : sviZaposleni) {
            if (3 == zaposleni.getSmena()) {
                zaposleni.setDnevnica((int) (zaposleni.getDnevnica() * 1.3));
            }
        }
    }
}
