package com.bootcamp.nedelja2;

import java.util.Scanner;

public class ZadatakNizoviKonstruktor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* ograniceno


        int x;
        System.out.print("Unesite koliko brojeva zelite da unesete: ");
        x = s.nextInt();
        int [] mojNiz = new int[x];
        int i = 0;
        while (i<mojNiz.length){
            System.out.print("Unesite " + (i+1) + ". broj u nizu: ");
            int broj = s.nextInt();
            mojNiz[i] = broj;
            i++;
        }
        System.out.println("Vas niz je: ");
        for (i=0 ; i < mojNiz.length; i++) {
            if (i == mojNiz.length-1) {
                System.out.print(mojNiz[i]);
            } else {
                System.out.print(mojNiz[i] + ", ");
            }
        }

         */
        // neogranicena petlja

        int[] mojNiz = new int[5];
        String unos;
        int j = 0;
        while (true) {
            System.out.print("Unesite broj: ");
            mojNiz[j] = s.nextInt();
            if (mojNiz[j] == 0) break;
            j++;

            if (j == mojNiz.length) { // ukoliko sam dosao do kraja niza
                System.out.print("Unesite 'kraj' za izlaz, ili bilo sta za nastavak: ");
                unos = s.next(); //uzmi unos korisnika
                if (unos.equalsIgnoreCase("kraj")) { //proveri da li je kraj
                    break;
                } else {
                    int[] noviNiz = new int[mojNiz.length * 2]; // 000000000
                    for (int i = 0; i < mojNiz.length; i++) { // pravimo kopiju starog niza
                        noviNiz[i] = mojNiz[i];
                    }
                    mojNiz = noviNiz; //moj niz postaje novi niz
                }

            }
        }

        for (int i = 0; i < mojNiz.length; i++) { // ispis
            if (i == mojNiz.length - 1) {
                System.out.print(mojNiz[i]);
            } else {
                System.out.print(mojNiz[i] + ", ");
            }
        }
    }
}

