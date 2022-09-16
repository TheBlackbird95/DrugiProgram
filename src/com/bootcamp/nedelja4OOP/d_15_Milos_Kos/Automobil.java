package com.bootcamp.nedelja4OOP.d_15_Milos_Kos;

import java.time.LocalDate;
import java.util.ArrayList;

//region Konstruktor
public class Automobil {
    private final String marka;
    private String boja;
    private final int brSasije;
    private final int godiste;
    private double cena;

    public Automobil(String marka, String boja, int brSasije, int godiste, int cena) {
        this.marka = marka;
        this.boja = boja;
        this.brSasije = brSasije;
        this.godiste = godiste;
        this.cena = cena;
    }
    //endregion

    //region Setteri
    public void setCena(double cena) {
        this.cena = cena;
    }
    public void setBoja(String boja) {
        this.boja = boja;
    }
    //endregion

    //region Getteri
    public String getMarka() {
        return marka;
    }

    public String getBoja() {
        return boja;
    }

    public int getBrSasije() {
        return brSasije;
    }

    public int getGodiste() {
        return godiste;
    }

    public double getCena() {
        return cena;
    }
    //endregion

    public String toString() {
        return "Podaci vaseg automobila su -> " + "marka: " + marka + ", boja: " + boja + ", brSasije: " + brSasije + ", godiste: " + godiste + ", cena: " + cena;
    }

    public void oldTimer() {
        if (marka.equalsIgnoreCase("Mercedes") && LocalDate.now().getYear() - godiste > 20){
            setCena(cena*0.8);
        } else if (marka.equalsIgnoreCase("bmw") && LocalDate.now().getYear() - godiste > 25){
            setCena(cena*0.7);
        }
    }

    public ArrayList<Automobil> cenaManja (ArrayList<Automobil> automobili, int svotaNovca){
        ArrayList<Automobil> manjaCena = new ArrayList<>();
        for (int i = 0; i < automobili.size(); i++) {
            if (automobili.get(i).getCena() <= svotaNovca) {
                manjaCena.add(automobili.get(i));
            }
        }
        return manjaCena;
    }

    public ArrayList<Automobil> sviBeli (ArrayList<Automobil> automobili) {
        ArrayList<Automobil> listaBelih = new ArrayList<>();
        for (Automobil automobil : automobili) {
            if (automobil.getBoja().equalsIgnoreCase("bela")) {
                listaBelih.add(automobil);
            }
        }
        return listaBelih;
    }
}
