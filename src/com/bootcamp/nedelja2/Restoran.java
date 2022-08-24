package com.bootcamp.nedelja2;

import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite kolicinu novca kojom raspolazete: ");
        double x = s.nextDouble();
        System.out.println("Nas meni: " + System.lineSeparator() +
                "1. Gulas - 200din" + System.lineSeparator() +
                "2. Paprikas - 250din" + System.lineSeparator() +
                "3. Pasulj - 300din" + System.lineSeparator() +
                "4. Rebarca - 500din" + System.lineSeparator() +
                "5. Skembici - 150din" + System.lineSeparator() +
                "6. Sarma - 220din" + System.lineSeparator() +
                "7. Jagnjetina - 700din");
        System.out.print("Unesite redni broj hrane koju zelite da porucite: ");
        int y = s.nextInt();
        switch (y) {
            case 1:
                int g = 200;
                if (x >= g) {
                    System.out.println("Vas kusur je: " + (x - g));
                    System.out.println("Uzivajte u gulasu");
                } else {
                    System.out.println("Nemate dovoljno novca za gulas");
                }
                break;
            case 2:
                int p = 250;
                if (x >= p) {
                    System.out.println("Vas kusur je: " + (x - p));
                    System.out.println("Uzivajte u paprikasu");
                } else {
                    System.out.println("Nemate dovoljno novca za paprikas");
                }
                break;
            case 3:
                int z = 300;
                if (x >= z) {
                    System.out.println("Vas kusur je: " + (x - z));
                    System.out.println("Uzivajte u pasulju");
                } else {
                    System.out.println("Nemate dovoljno novca za pasulj");
                }
                break;
            case 4:
                int r = 500;
                if (x >= r) {
                    System.out.println("Vas kusur je: " + (x - r));
                    System.out.println("Uzivajte u rebarcima");
                } else {
                    System.out.println("Nemate dovoljno novca za rebarca");
                }
                break;
            case 5:
                int k = 150;
                if (x >= k) {
                    System.out.println("Vas kusur je: " + (x - k));
                    System.out.println("Uzivajte u skembicima");
                } else {
                    System.out.println("Nemate dovoljno novca za skembice");
                }
                break;
            case 6:
                int m = 220;
                if (x >= m) {
                    System.out.println("Vas kusur je: " + (x - m));
                    System.out.println("Uzivajte u sarmi");
                } else {
                    System.out.println("Nemate dovoljno novca za sarmu");
                }
                break;
            case 7:
                int j = 700;
                if (x >= j) {
                    System.out.println("Vas kusur je: " + (x - j));
                    System.out.println("Uzivajte u jagnjetini");
                } else {
                    System.out.println("Nemate dovoljno novca za jagnjetinu");
                }
                break;
            default:
                System.out.println("Odabrali ste nepostojeci artikal!");
        }
    }
}


