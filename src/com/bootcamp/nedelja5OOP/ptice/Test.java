package com.bootcamp.nedelja5OOP.ptice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Avijarijum avijarijum = new Avijarijum(Ptica.getPtice());

        Ptica ptica = new Ptica (1.1, 1.9, new ArrayList<>(List.of( "crv","puz golac","glista")), "krosnja", 5, 0);
        Orao orao = new Orao(2.1, 2.7, new ArrayList<>(List.of( "veverica","zmija","mis")), "krov", 3, 0);
        Kukavica kukavica = new Kukavica(0.1,0.5,new ArrayList<>(List.of( "smrdibuba","komarac","muva")),"drvo", 19,0);
        Albatros albatros = new Albatros(3.1, 3.7, new ArrayList<>(List.of( "losos","ajkula","drakula")), "gnezdo", 4, 0);

        ptica.generateRasponKrila();
        orao.generateRasponKrila();
        kukavica.generateRasponKrila();
        albatros.generateRasponKrila();
        System.out.println("Ptica: " + ptica.getRasponKrila() + " Orao: " + orao.getRasponKrila()+ " Kukavica: " + kukavica.getRasponKrila() + " Albatros: " + albatros.getRasponKrila());

        System.out.println(Ptica.getPtice().toString());
        avijarijum.sortPticePoRasponuKrila();
        System.out.println(Ptica.getPtice().toString());

        System.out.println("Orao moze da ulovi albatrosa : " + orao.lovi(albatros));
        System.out.println("Orao moze da ulovi kukavicu : " + orao.lovi(kukavica));

        System.out.println(kukavica.kukavicjeJaje(ptica, 5));
        System.out.println(kukavica.kukavicjeJaje(ptica, 2));

        avijarijum.najuspesnijiPredator();
        avijarijum.najvisePolozenihJaja();
    }
}
