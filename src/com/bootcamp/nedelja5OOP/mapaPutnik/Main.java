package com.bootcamp.nedelja5OOP.mapaPutnik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Putnik pera = new Putnik("Biznis", 1, 500);
        Putnik zika = new Putnik("Ekonomik", 51, 120);
        Putnik mika = new Putnik("Biznis", 2, 440);
        Putnik joca = new Putnik("Ekonomik", 52, 90);

        List<Putnik> sviPutnici = new ArrayList<>();
        sviPutnici.add(pera);
        sviPutnici.add(zika);
        sviPutnici.add(mika);
        sviPutnici.add(joca);

        Map<String, List<Putnik>> mapa = new HashMap<>();

        pera.grupisi(mapa, sviPutnici);
        System.out.println(mapa);

        System.out.println("Prosecna cena biznis klase je: " + pera.prosecnaCenaKlase(mapa,"biznis"));
        System.out.println(" Prosecna cena ekonomik klase je: " + pera.prosecnaCenaKlase(mapa,"ekonomik"));

        System.out.println("Lista WizzAir putnika: " + pera.jeftinijeKarte(mapa,150));
    }
}
