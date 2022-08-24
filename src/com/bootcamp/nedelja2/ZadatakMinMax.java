package com.bootcamp.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class ZadatakMinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite koju duzinu niza zelite: ");
        int x = s.nextInt();
        int[] niz = new int[x];

        System.out.println("Unesite cele brojeve: ");
        for (int i = 0; i < x; i++) {
            System.out.print((i+1) + ". broj: ");
            niz[i] = s.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < x; j++) {
            if (niz[j]<min){
                min = niz[j];
            }
        }
        System.out.println("Minimum je: " + min);




//        Arrays.sort(niz);
//        System.out.println("Najmanja vrednost ovog niza: " + niz[0]);
//        System.out.println("Najveca vrednost ovog niza: " + niz[niz.length-1]);
    }
}
