package com.bootcamp.nedelja5OOP.biblioteka;

import java.util.Collection;
import java.util.Collections;

public class TestKnjizara {
    public static void main(String[] args) {
        Knjiga prva = new HororKnjiga("Vrisak", "horor", 1991, "Pera Petrovic", 1011);
        Knjiga druga = new Romantika("Limunada", "romantika", 2000, "Ljubinka Ljupkic", 20000);
        Knjiga treca = new Triler("Misterija reke Nil", "triler", 1999, "Pera Petrovic", 555);
        Knjiga cetvrta = new Knjiga("Hari Poter Nesto Novo", "fantastika", 2022, "J K Rowling", null);

        Knjizara knjizara = new Knjizara(prva.getSveKnjige());
        System.out.println("Knjige autora Pera Petrovic su: " + System.lineSeparator() + knjizara.autoroveKnjige("Pera Petrovic", prva.getSveKnjige()).toString() + System.lineSeparator());

        cetvrta.setBrProdatihKopija(12000);
        System.out.println("Najprodavanije knjige su, pre sortiranja: " + System.lineSeparator() + knjizara.bestSeller(prva.getSveKnjige()).toString());

        Collections.sort(prva.getSveKnjige());
        System.out.println("Najprodavanije knjige su, posle sortiranja: " + System.lineSeparator() + prva.getSveKnjige().toString());
    }
}
