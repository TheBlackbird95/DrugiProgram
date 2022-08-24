package com.bootcamp.nedelja2;

import java.util.Scanner;

public class DragoljubMenjacnica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menjacne usluge koje pruzamo su: " + System.lineSeparator() + "RSD-EUR" + System.lineSeparator() + "EUR-RSD" + System.lineSeparator() +
                "USD-RSD" + System.lineSeparator() + "RSD-USD" + System.lineSeparator() + "EUR-USD" + System.lineSeparator() + "USD-EUR");
        System.out.print("Usluga koju zelite je: ");
        String usluga = s.nextLine();
        int z = 0;
        int rsd = 1;
        int eur = 120;
        int usd = 110;
        if (usluga.equalsIgnoreCase("rsd-eur")) {
            z = 1;
        } else if (usluga.equalsIgnoreCase("eur-rsd")) {
            z = 2;
        } else if (usluga.equalsIgnoreCase("usd-rsd")) {
            z = 3;
        } else if (usluga.equalsIgnoreCase("rsd-usd")) {
            z = 4;
        } else if (usluga.equalsIgnoreCase("eur-usd")) {
            z = 5;
        } else if (usluga.equalsIgnoreCase("usd-eur")) {
            z = 6;
        } else {
            System.exit(1);
        }
        System.out.print("Unesite kolicinu novca koji zelite da promenite: ");
        double novac = s.nextInt();
        double kraj;
        if (novac <= 0) {
            System.out.println("Uneliste nepravilnu vrednost");
        } else {
            switch (z) {
                case 1:
                    kraj = novac * rsd / eur;
                    System.out.println("Za isplatu: " + kraj + "eur");
                    break;
                case 2:
                    kraj = novac * eur / rsd;
                    System.out.println("Za isplatu:" + kraj + "rsd");
                    break;
                case 3:
                    kraj = novac * usd / rsd;
                    System.out.println("Za isplatu: " + kraj + "rsd");
                    break;
                case 4:
                    kraj = novac * rsd / usd;
                    System.out.println("Za isplatu: " + kraj + "usd");
                    break;
                case 5:
                    kraj = novac * eur / usd;
                    System.out.println("Za isplatu: " + kraj + "usd");
                    break;
                case 6:
                    kraj = novac * usd / eur;
                    System.out.println("Za isplatu: " + kraj + "eur");
                    break;
                default:
                    System.out.println("Odabrali ste nepostojecu uslugu!");
            }
        }
    }
}
