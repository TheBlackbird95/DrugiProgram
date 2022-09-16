package com.bootcamp.nedelja4OOP.d_14_Milos_Kos;

public class Breskva extends Voce {
     Breskva(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, boja, cenaZaKilogram, sezona);
    }
    public void smanjiCenuBreskva() {
        if (getBoja().equalsIgnoreCase("zelena")){
            setCenaZaKilogram(getCenaZaKilogram()*0.85);
        }
    }
}
