package com.bootcamp.nedelja2;

import java.util.Scanner;

public class ZadatakKonstruktorKola {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] mojNiz = new String[5];

        System.out.println("Unesite 5 marki automobila: ");
        int i;
        int j;
        for (i = 0; i < mojNiz.length; i++) {
            System.out.print((i + 1) + ".");
            mojNiz[i] = s.next().toLowerCase();
        }
        System.out.println("Unesite marku automobila");
        String auto = s.next().toLowerCase();
        for (j = 0; j < mojNiz.length; j++) {
            if (auto.equals(mojNiz[j].toLowerCase())) {
                System.out.println("Marka automobila " +auto + " se nalazi u nizu");
                break;
            }
        }
        if (j == mojNiz.length){
            System.out.println("Marka " + auto + " se ne nalazi u nizu");
        }
    }
}
