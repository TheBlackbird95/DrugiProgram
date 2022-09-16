package com.bootcamp.nedelja5OOP.d_16_restoran;

public class Test {
    public static void main(String[] args) {
        Zaposleni prvi = new Konobar("Milos", "konobar", 1995,1800, 8, 2);
        Zaposleni drugi = new Kuvar("Pera", "kuvar", 1997, 2500, 12, 1);
        Zaposleni treci = new Zaposleni("Zika", "izbacivac", 1990, 2000, 6, 3);
        Zaposleni cetvrti = new Konobar("Marta", "konobar", 1992, 1800,8,3);
        Zaposleni peti = new Konobar("Darko", "konobar", 1995,1800, 8, 2);
        Zaposleni sesti = new Konobar("Zarko", "konobar", 1995,1800, 8, 2);
        Zaposleni sedmi = new Konobar("Marko", "konobar", 1995,1800, 8, 2);
        Restoran restoran = new Restoran(prvi.getSviZaposleni());

        System.out.println(prvi.getSviZaposleni().toString());

        System.out.println(System.lineSeparator() + restoran.konobarSmena(2).toString() + System.lineSeparator());
        System.out.println("Martina plata pre povecanja: " + cetvrti.getDnevnica() + ", i Zikina dnevnica pre povecanja: " + treci.getDnevnica());
        restoran.povecajCenuTrecojSmeni(cetvrti.getSviZaposleni());
        System.out.println("Martina plata posle povecanja: " + cetvrti.getDnevnica() +", i Zikina dnevnica posle povecanja: " + treci.getDnevnica());
    }
}