package com.bootcamp.nedelja4OOP;

import java.time.LocalDate;

public class Radnik {

    private final int id;
    private final String ime;
    private String pozicija;
    private final int godinaPocetka;
    private int godisnjaPlata;

    Radnik(int id, String ime, String pozicija, int godinaPocetka, int godisnjaPlata) {
        this.id = id;
        this.ime = ime;
        this.pozicija = pozicija;
        this.godinaPocetka = godinaPocetka;
        this.godisnjaPlata = godisnjaPlata;
    }

    //region Getteri
    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public int getGodinaPocetka() {
        return godinaPocetka;
    }

    public int getPlata() {
        return godisnjaPlata;
    }
    //endregion

    //region Setteri

    //Pozicija
    public void setPozicija(String novaPozicija) {
        this.pozicija = novaPozicija;
    }

    //Plata

    public void setPlata(int novaPlata) {
        this.godisnjaPlata = novaPlata;
    }


    //endregion

    public int radniStaz() {
        if (godinaPocetka > LocalDate.now().getYear()){
            throw new IllegalArgumentException (String.format("Godina zaposlenja %d ne moze biti veca od trenutne godine %d",
                    godinaPocetka, LocalDate.now().getYear()));
        }
        return LocalDate.now().getYear() - godinaPocetka;
    }

    public double netoGodisnja() {
        return godisnjaPlata * 0.7;
    }

    public double netoMesecna() {
        return netoGodisnja() / 12;
    }


    public double mesecnaPlata() {
        return godisnjaPlata / 12;
    }

    public double plataRadnika() {
        double trazenaPlata = 0;
        if ((mesecnaPlata() == 250 && pozicija.equalsIgnoreCase("fizikalac")) || (mesecnaPlata() == 500 && pozicija.equalsIgnoreCase("inzenjer")))
            trazenaPlata = mesecnaPlata();
        return trazenaPlata;
    }

    public static void main(String[] args) {
    }
}
