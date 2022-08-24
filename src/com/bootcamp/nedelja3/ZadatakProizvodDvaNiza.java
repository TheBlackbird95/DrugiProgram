package com.bootcamp.nedelja3;

public class ZadatakProizvodDvaNiza {
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {6, 7, 8, 9, 10};
        System.out.println("Proizvod ova dva niza je: " + proizvod(niz1, niz2));
    }

    public static int proizvod(int[] niz1, int[] niz2) {
        int proizvod = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                proizvod += niz1[i] * niz2[j];
            }
        }
        return proizvod;
    }
}