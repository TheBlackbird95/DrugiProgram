package com.bootcamp.nedelja3;

import java.util.Scanner;

public class ZadatakStepenovanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite osnovni broj: ");
        double x = s.nextDouble();
        System.out.print("Unesite stepen broja: ");
        int y = s.nextInt();
        stepen(x, y);
    }

    public static double stepen(double x, int y) {
        double rezultat = 1;
        for (int i = 0; i < Math.abs(y); i++) {
            rezultat = rezultat * x;
        }
            if (y < 0) {
                rezultat = 1 / rezultat;
            }
        System.out.println(rezultat);
        return rezultat;
    }
}
