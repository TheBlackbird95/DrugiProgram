package com.bootcamp.nedelja5OOP.gradjevina;

public class Fizikalac extends Radnik{
    public Fizikalac(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    public void povisica() {
        if (getSmena()==2){
            setPlata(getPlata()*1.2);
        }
    }

}
