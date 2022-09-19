package com.bootcamp.nedelja5OOP.gradjevina;

public class Masinovodja extends Radnik{
    public Masinovodja(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    public void povisica() {
        if (getSmena()==1){
            setPlata(getPlata()*1.25);
        }
    }
}
