package com.bootcamp.nedelja5OOP.d_17_restoran;

import java.util.ArrayList;
import java.util.Arrays;

public class Restoran implements Guzva {
    private String naziv;
    private ArrayList<Jelo> meni;
    private int brSlobodnihStolova;

    public Restoran(String naziv, ArrayList<Jelo> meni, int brSlobodnihStolova) {
        this.naziv = naziv;
        this.meni = Jelo.getMeni();
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public String getNaziv() {
        return naziv;
    }

    public ArrayList<Jelo> getMeni() {
        return meni;
    }

    public int getBrSlobodnihStolova() {
        return brSlobodnihStolova;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    @Override
    public String najskupljeJelo() {
        double najskuplje = Integer.MIN_VALUE;
        String jelo = "";
        for (Jelo value : meni) {
            if (value.getCena() > najskuplje) {
                najskuplje = value.getCena();
                jelo = value.getNaziv();
            }
        }
        return jelo;
    }

    @Override
    public void rezervisiSto() {
        setBrSlobodnihStolova(getBrSlobodnihStolova()-1);
    }

    @Override
    public void stampajNaziveJela(String vrsta) {
        for (Jelo jelo : meni) {
            if (jelo.getVrsta().equalsIgnoreCase(vrsta)){
                System.out.println(jelo.getNaziv());
            }
        }
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Naziv restorana : " + naziv + System.lineSeparator() + "Meni:" + Arrays.toString(meni.toArray()) + System.lineSeparator() + "broj slobodnih stolova: " + brSlobodnihStolova;
    }
}
