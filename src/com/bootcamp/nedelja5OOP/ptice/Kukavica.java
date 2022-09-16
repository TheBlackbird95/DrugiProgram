package com.bootcamp.nedelja5OOP.ptice;

import java.util.ArrayList;

public class Kukavica extends Ptica implements Kradljivica{
    public Kukavica(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJajaUGnezdu, double rasponKrila) {
        super(minRasponKrila, maxRasponKrila, omiljenaHrana, staniste, maksBrojJajaUGnezdu, rasponKrila);
    }

    @Override
    public boolean kukavicjeJaje(Ptica p, int i) {
        boolean polozila = false;
        if (i <= p.getMaksBrojJajaUGnezdu()){
            polozila = true;
            p.setMaksBrojJajaUGnezdu(p.getMaksBrojJajaUGnezdu()-i);
        }
        return polozila;
    }
}
