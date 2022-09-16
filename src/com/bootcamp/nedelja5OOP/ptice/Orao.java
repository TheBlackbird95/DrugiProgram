package com.bootcamp.nedelja5OOP.ptice;

import java.util.ArrayList;

public class Orao extends Ptica implements Predator{
    public Orao(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJajaUGnezdu, double rasponKrila) {
        super(minRasponKrila, maxRasponKrila, omiljenaHrana, staniste, maksBrojJajaUGnezdu, rasponKrila);
    }

    @Override
    public boolean lovi(Ptica p) {
        boolean lov = true;
        String ulov = "";
        if (p.getRasponKrila()>2){
            lov = false;
        }
        return lov;
    }
}
