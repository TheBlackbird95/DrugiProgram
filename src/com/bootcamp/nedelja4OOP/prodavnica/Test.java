package com.bootcamp.nedelja4OOP.prodavnica;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Proizvodjac pera = new Proizvodjac("PeraDOO", "BGD");
        PijacniProizvod luk = new PijacniProizvod(123, 100, "luk", 0, pera, 1, false);
        Meso prase = new Meso(234, 250, "Prasetina", 0,pera,2,"Prasetina");
        MlecniProizvod mleko = new MlecniProizvod(213, 500, "mleko", 0, pera, "PetG");

        //test za promenu cene posle popusta
        System.out.println(luk.getCena());
        luk.setPopust(20);
        luk.obracunajPopust();
        assert luk.getCena() == 80;
        System.out.println(luk.getCena());

        //toString
        System.out.println("Meso: " + prase.toString());
        System.out.println("Pijacni proizvod: " + luk.toString());
        System.out.println("Mlecni proizvod: " + mleko.toString());
        System.out.println("Proizvodjac: " + pera.toString());

        ArrayList<Roba> roba = new ArrayList<>();
        roba.add(luk);
        roba.add(prase);
        roba.add(mleko);
        Kasir kasir = new Kasir();

        Kasa kasa = new Kasa("1", roba, kasir);
        System.out.println(kasa.kreirajRacun());
        System.out.println("Testovi su prosli!");
    }
}
