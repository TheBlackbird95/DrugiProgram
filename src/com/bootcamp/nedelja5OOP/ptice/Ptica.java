package com.bootcamp.nedelja5OOP.ptice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ptica implements Comparable<Ptica> {
    private double minRasponKrila;
    private double maxRasponKrila;
    private ArrayList<String> omiljenaHrana;
    private String staniste;
    private int maksBrojJajaUGnezdu;
    private double rasponKrila;
    private static ArrayList<Ptica> ptice = new ArrayList<>();

    public Ptica(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJajaUGnezdu, double rasponKrila) {
        this.minRasponKrila = minRasponKrila;
        this.maxRasponKrila = maxRasponKrila;
        this.omiljenaHrana = omiljenaHrana;
        this.staniste = staniste;
        this.maksBrojJajaUGnezdu = maksBrojJajaUGnezdu;
        this.rasponKrila = rasponKrila;
        ptice.add(this);
    }

    //region Getteri


    public static ArrayList<Ptica> getPtice() {
        return ptice;
    }

    public double getRasponKrila() {
        return rasponKrila;
    }

    public double getMinRasponKrila() {
        return minRasponKrila;
    }

    public double getMaxRasponKrila() {
        return maxRasponKrila;
    }

    public ArrayList<String> getOmiljenaHrana() {
        return omiljenaHrana;
    }

    public String getStaniste() {
        return staniste;
    }

    public int getMaksBrojJajaUGnezdu() {
        return maksBrojJajaUGnezdu;
    }
    //endregion


    public void setMaksBrojJajaUGnezdu(int maksBrojJajaUGnezdu) {
        this.maksBrojJajaUGnezdu = maksBrojJajaUGnezdu;
    }

    public void setRasponKrila(double rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Minimalni raspon krila je: " + minRasponKrila + ", maksimalni raspon krila je: " + maxRasponKrila + ", omiljena hrana je: " + omiljenaHrana + ", staniste: " + staniste
                + ", maksimalan broj jaja u gnezdu je: " + maksBrojJajaUGnezdu + ", trenutni raspon krila: " + rasponKrila;
    }

    public void generateRasponKrila() {
        DecimalFormat df = new DecimalFormat("0.00");
        setRasponKrila(Double.parseDouble(df.format(ThreadLocalRandom.current().nextDouble(getMinRasponKrila(), getMaxRasponKrila()))));
    }

    public boolean polaganjeJaja(int brojJaja) {
        boolean jaja = false;
        if (brojJaja <= getMaksBrojJajaUGnezdu()) {
            jaja = true;
        }
        setMaksBrojJajaUGnezdu(getMaksBrojJajaUGnezdu() - brojJaja);
        return jaja;
    }

    @Override
    public int compareTo(Ptica drugaPtica) {
        return Double.compare(this.rasponKrila, drugaPtica.getRasponKrila());
    }
}

