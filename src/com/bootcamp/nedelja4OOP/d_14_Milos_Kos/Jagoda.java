package com.bootcamp.nedelja4OOP.d_14_Milos_Kos;

public class Jagoda extends Voce {
    Jagoda(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, boja, cenaZaKilogram, sezona);
    }
    public void povecajCenuJagoda() {
        if (!getSezona().equalsIgnoreCase("prolece")){
            setCenaZaKilogram(getCenaZaKilogram()*1.2);
        }
    }
}
