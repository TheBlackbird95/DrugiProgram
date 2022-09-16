package com.bootcamp.nedelja4OOP.prodavnica;

public class MlecniProizvod extends Roba {
    private final String tipPakovanja;

    public String getTipPakovanja() {
        return tipPakovanja;
    }

    public MlecniProizvod(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac, String tipPakovanja) {
        super(barKod, cena, naziv, popust, proizvodjac);
        this.tipPakovanja = tipPakovanja;
    }

    @Override
    public void obracunajCenu() {
        if (tipPakovanja.equalsIgnoreCase("PetG")){
            setCena(getCena() * 1.1);
        } else if (tipPakovanja.equalsIgnoreCase("kesa"))
            setCena(getCena() * 0.8);
        }

    @Override
    public String toString() {
        return super.toString() + ", tip pakovanja: " + getTipPakovanja();
    }
}
