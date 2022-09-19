package com.bootcamp.nedelja5OOP.gradjevina;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Fizikalac fizikalac1 = new Fizikalac(1, "fizikalac1", 100, 2);
        SefSmene sef = new SefSmene(0, "sef", 200, 3);
        Masinovodja masinovodja = new Masinovodja(2, "masinovodja", 150, 1);
        Fizikalac fizikalacotkaz = new Fizikalac(3, "otkaz", 100,1);

        ArrayList<Radnik> radnici = new ArrayList<>(List.of(fizikalac1,sef,masinovodja,fizikalacotkaz));

        Gradjevina gradjevina = new Gradjevina(radnici);

        for (Radnik radnik : radnici){
            System.out.println(radnik.getIme() + ": " + radnik.getPlata());
        }
        fizikalac1.povisica();
        sef.povisica();
        masinovodja.povisica();
        for (Radnik radnik : radnici){
            System.out.println(radnik.getIme() + ": " + radnik.getPlata());
        }
        System.out.println(radnici.toString());
        gradjevina.dajOtkazPrvojSmeniFizikalaca();
        System.out.println(radnici.toString());

        System.out.println(gradjevina.jeRadnik(new Fizikalac(5,"pera",150,6)));
        System.out.println(gradjevina.jeRadnik(new Fizikalac(3, "otkaz", 100,1)));

        System.out.println(gradjevina.ukupnaPlataRadnikaDrugeSmene());
        System.out.println(gradjevina.dobroPlaceni(150).toString());
    }
}
