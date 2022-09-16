package com.bootcamp.nedelja4OOP.d_15_Milos_Kos;

import java.util.ArrayList;

public class TestAutomobili {
    public static void main(String[] args) {
        Automobil seat = new Automobil("seat", "bela", 747, 2020, 19000);
        Automobil bmw2 = new Automobil("BMW", "bela", 987, 2015, 17000);
        Automobil jugo = new Automobil("jugo", "crvena", 1, 1997, 800);
        Automobil bmw = new Automobil("bmw", "crvena", 1323, 1995, 8000);
        Automobil mercedes = new Automobil("mercedes", "bela", 123123, 1999, 9000);
        System.out.println(jugo.toString());
        System.out.println("Cena BMW pre promene: " + bmw.getCena());
        bmw.oldTimer();
        assert bmw.getCena() == 5600;
        System.out.println("Nova cena BMW-a je: " + bmw.getCena());
        mercedes.oldTimer();
        assert mercedes.getCena() == 7200;
        System.out.println("Nova cena Mercedesa je: " + mercedes.getCena());

        ArrayList<Automobil> automobili = new ArrayList<>();
        automobili.add(mercedes);
        automobili.add(seat);
        automobili.add(bmw);
        automobili.add(bmw2);
        automobili.add(jugo);

        assert bmw.cenaManja(automobili, 10000).size() == 3;
        System.out.println(bmw.cenaManja(automobili, 10000).toString().replaceAll("Podaci", "\n Podaci").replace("[", "").replace("]", ""));

        assert bmw.sviBeli(automobili).size() == 3;
        System.out.println(bmw.sviBeli(automobili).toString().replaceAll("Podaci", "\n Podaci").replace("[", "").replace("]", ""));
    }
}
