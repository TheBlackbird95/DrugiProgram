package com.bootcamp.nedelja5OOP.d_16_restoran;

import java.util.ArrayList;

public class Zaposleni {
    private String ime;
    private String pozicija;
    private int godiste;
    private int dnevnica;
    private int sati;
    private int smena;

    private static ArrayList<Zaposleni> sviZaposleni = new ArrayList<>();

    public Zaposleni(String ime, String pozicija, int godiste, int dnevnica, int sati, int smena) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.godiste = godiste;
        this.dnevnica = dnevnica;
        this.sati = sati;
        this.smena = smena;
        sviZaposleni.add(this);
    }

    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public int getGodiste() {
        return godiste;
    }

    public int getDnevnica() {
        return dnevnica;
    }

    public int getSati() {
        return sati;
    }

    public int getSmena() {
        return smena;
    }

    public static ArrayList<Zaposleni> getSviZaposleni() {
        return sviZaposleni;
    }

    public void setDnevnica(int dnevnica) {
        this.dnevnica = dnevnica;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Ime zaposlenog: " + ime + ", pozicija: " + pozicija + ", godiste: " + godiste + ", dnevnica: " + dnevnica + "din, sati: " + sati + ", smena: " + smena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zaposleni)) return false;

        Zaposleni zaposleni = (Zaposleni) o;

        if (getGodiste() != zaposleni.getGodiste()) return false;
        if (getDnevnica() != zaposleni.getDnevnica()) return false;
        if (getSati() != zaposleni.getSati()) return false;
        if (getSmena() != zaposleni.getSmena()) return false;
        if (!getIme().equals(zaposleni.getIme())) return false;
        return getPozicija() != null ? getPozicija().equals(zaposleni.getPozicija()) : zaposleni.getPozicija() == null;
    }
}
