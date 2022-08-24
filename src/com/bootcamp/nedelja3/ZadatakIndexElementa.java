package com.bootcamp.nedelja3;

import java.util.Arrays;
import java.util.Scanner;

public class ZadatakIndexElementa {
    public static void main(String[] args) {
        int[] niz = {0,1,2,3,4,5,6};
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite trazeni broj: ");
        int x = s.nextInt();

        System.out.println("Trazeni broj se nalazi na indexu: " + trazenje(niz,x));

        int z = Arrays.binarySearch(niz,x);
        System.out.println("Trazeni broj se nalazi na indexu: " + z);
    }

    public static int trazenje (int[] niz, int x) {
        int y = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == x) {
                y = i;
            }
        }
        return y;
    }
}
