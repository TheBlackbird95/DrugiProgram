package com.bootcamp.nedelja5OOP.gradjevina;

//
//        Napraviti klasu Radnik
//        -int id
//        -String ime
//        -double plata
//        -int smena
//
//        Klasa takodje definise metod:
//        void povisica()
//
//        Klasa SefSmene nasledjuje Radnik, i dobija povisicu od 30% ukoliko radi 3 smenu
//        Klasa Fizikalac nasledjuje Radnik i dobija povisicu od 20% ako radi 2 smenu
//        Klasa Masinovodja nasledjuje Radnik i dobija povisicu 25% ako radi 1 smenu
//
//        Interfejs posao definise metode:
//
//        void dajOtkazPrvojSmeniFizikalaca() - izbacuje sa liste sve fizikalce koji rade prvu smenu
//
//        boolean jeRadnik(Radnik r) - koji vraca true ako se radnik nalazi na spisku radnika
//
//        double ukupnaPlataRadnikaDrugeSmene() - stampa ukupnu sumu novca koju zaradjuju svi radnici u drugoj smeni
//
//        ArrayList<Radnik> dobroPlaceni(double suma) - vratiti listu radnika koji imaju platu vecu od suma
//
//        Klasa Gradjevina implementira interfejs Posao i ima:
//        -ArrayList<Radnik> radnici
//
//        Testirati sve u posebnoj klasi
//        *Implementirati dodatne get,set i toString metode*


import java.util.ArrayList;

public abstract class Radnik {
    private int id;
    private String ime;
    private double plata;
    private int smena;

    public Radnik(int id, String ime, double plata, int smena) {
        this.id = id;
        this.ime = ime;
        this.plata = plata;
        this.smena = smena;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public double getPlata() {
        return plata;
    }

    public int getSmena() {
        return smena;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }

    public abstract void povisica();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Radnik)) return false;

        Radnik radnik = (Radnik) o;

        if (getId() != radnik.getId()) return false;
        if (Double.compare(radnik.getPlata(), getPlata()) != 0) return false;
        if (getSmena() != radnik.getSmena()) return false;
        return getIme() != null ? getIme().equals(radnik.getIme()) : radnik.getIme() == null;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "ID radnika: " + id + ", ime: " + ime + ", plata: " + plata + ", smena: " + smena;
    }
}
