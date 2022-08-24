package com.bootcamp.vezba;

import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        /*  5. Napisati program koji racuna potrosnju goriva. Korisnik unosi distancu, tip vozila i
        tip goriva, a program ispisuje koliko ce goriva biti potroseno i koja je ukupna cena.
        Motor trosi 5 litara na 100 km
        Automobil trosi 9 litara na 100 km
        Kamion trosi 15 litara na 100 km
        Tipovi goriva su:
        Benzin kosta 170 dinara po litru
        Dizel kosta 190 dinara po litru*/

        Scanner s = new Scanner(System.in);
        System.out.println("Da li vozite automobil, motor ili kamion?");
        String vozilo = s.next();
        System.out.println("Da li vozilo koristi benzin ili dizel?");
        String gorivo = s.next();
        System.out.print("Unesite distancu: ");
        int x = s.nextInt();
        double potrosnja;

        int y = 0;
        if (vozilo.equalsIgnoreCase("automobil") && gorivo.equalsIgnoreCase("benzin")){
            y = 1;
        } else if (vozilo.equalsIgnoreCase("automobil") && gorivo.equalsIgnoreCase("dizel")) {
            y = 2;
        } else if (vozilo.equalsIgnoreCase("kamion") && gorivo.equalsIgnoreCase("benzin")) {
            y = 3;
        } else if (vozilo.equalsIgnoreCase("kamion") && gorivo.equalsIgnoreCase("dizel")) {
            y = 4;
        } else if (vozilo.equalsIgnoreCase("motor") && gorivo.equalsIgnoreCase("dizel")) {
            y = 5;
        } else if (vozilo.equalsIgnoreCase("motor") && gorivo.equalsIgnoreCase("benzin")) {
            y = 6;
        } else {
            System.out.println("Pogresan unos, pokrenite program ponovo!");
        }

        switch (y){
            case 1:
                potrosnja = (x * 9.0 / 100) * 170;
                System.out.println("Ova distanca ce Vas kostati: " + potrosnja);
                break;
            case 2:
                potrosnja = (x * 9.0 / 100) * 190;
                System.out.println("Ova distanca ce Vas kostati: " + potrosnja);
                break;
            case 3:
                potrosnja = (x * 15.0 / 100) *170;
                System.out.println("Ova distanca ce Vas kostati: " + potrosnja);
                break;
            case 4:
                potrosnja = (x * 15.0 / 100) *190;
                System.out.println("Ova distanca ce Vas kostati: " + potrosnja);
                break;
            case 5:
                potrosnja = (x * 5.0 / 100) *170;
                System.out.println("Ova distanca ce Vas kostati: " + potrosnja);
                break;
            case 6:
                potrosnja = (x * 5.0 / 100) *190;
                System.out.println("Ova distanca ce Vas kostati: " + potrosnja);
                break;
            default:
                System.out.println("Pogresan unos, pokrenite program ponovo!");
        }
    }
}