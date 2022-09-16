package com.bootcamp.nedelja5OOP.ptice;

import java.util.ArrayList;
import java.util.Collections;

public class Avijarijum {
    private ArrayList<Ptica> ptice;

    public ArrayList<Ptica> getPtice() {
        return ptice;
    }

    public Avijarijum(ArrayList<Ptica> ptice) {
        this.ptice = Ptica.getPtice();
    }

    public void najuspesnijiPredator(){
        double minimum = Double.MIN_VALUE;
        String predator = "";
        for (Ptica ptica : ptice){
            if (ptica.getRasponKrila()>minimum){
                minimum = ptica.getRasponKrila();
                predator = Ptica.class.getSimpleName();
            }
        }
        System.out.println("Najuspesniji predator je: " + predator + " " + minimum);
    }

    public void najvisePolozenihJaja(){
        int minimum = Integer.MIN_VALUE;
        String polagacica = "";
        for (Ptica ptica : ptice){
            if (ptica.getMaksBrojJajaUGnezdu() > minimum){
                minimum = ptica.getMaksBrojJajaUGnezdu();
                polagacica = Ptica.class.getSimpleName();
            }
        }
        System.out.println("Ptica sa najvise polozenih jaja je: " + polagacica + " " + minimum);
    }

    public void sortPticePoRasponuKrila(){
        Collections.sort(ptice);
    }
}
