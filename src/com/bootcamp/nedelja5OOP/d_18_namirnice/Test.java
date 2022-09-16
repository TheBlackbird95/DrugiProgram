package com.bootcamp.nedelja5OOP.d_18_namirnice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Namirnica hleb = new Namirnica("hleb", 50);
        Namirnica mleko = new Namirnica("mleko", 150);
        Namirnica slicice = new Namirnica("slicice", 90);
        Namirnica novine = new Namirnica("novine", 60);
        Namirnica bounty = new Namirnica("bounty", 80);

        ArrayList<Namirnica> sveNamirnice = new ArrayList<>(List.of(hleb,mleko,slicice,novine,bounty));
        Korpa sve = new Korpa(sveNamirnice);

        sve.printNamirnice(sve.getNovaListaNamirnica());

        System.out.println("Cena svih namirnica je: " + sve.printRacun(sve.getNovaListaNamirnica()));

        System.out.println(sve.jeNaSpisku("hleb"));

        System.out.println(sve.naSpisku(new Namirnica("hleb", 50)));
        sve.printNamirnice(sve.getNovaListaNamirnica());
        System.out.println(sve.naSpisku(new Namirnica("jogurt", 90)));
    }
}
