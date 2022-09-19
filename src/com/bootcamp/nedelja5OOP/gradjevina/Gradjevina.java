package com.bootcamp.nedelja5OOP.gradjevina;

import java.util.ArrayList;

public class Gradjevina implements Posao {
    private ArrayList<Radnik> radnici = new ArrayList<>();

    public Gradjevina(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    @Override
    public void dajOtkazPrvojSmeniFizikalaca() {
        for (int i = 0; i < radnici.size(); i++) {
            if (radnici.get(i) instanceof Fizikalac && radnici.get(i).getSmena() == 1) {
                radnici.remove(radnici.get(i));
            }
        }
    }

    @Override
    public boolean jeRadnik(Radnik r) {
        boolean jeste = false;
        for (Radnik radnik : radnici) {
            if (r.equals(radnik)) {
                jeste = true;
                break;
            }
        }
        return jeste;
    }

    @Override
    public double ukupnaPlataRadnikaDrugeSmene() {
        double sum = 0;
        for (Radnik radnik : radnici) {
            if (radnik.getSmena() == 2) {
                sum += radnik.getPlata();
            }
        }
        return sum;
    }

    @Override
    public ArrayList<Radnik> dobroPlaceni(double suma) {
        ArrayList<Radnik> placeni = new ArrayList<>();
        for (Radnik radnik : radnici){
            if (radnik.getPlata()>suma){
                placeni.add(radnik);
            }
        }
        return placeni;
    }
}
