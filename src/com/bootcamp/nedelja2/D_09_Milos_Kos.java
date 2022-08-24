package com.bootcamp.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class D_09_Milos_Kos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite koju duzinu niza zelite: ");
        int x = s.nextInt();
        int[] niz = new int[x];

        System.out.println("Unesite cele brojeve: ");
        for (int i = 0; i < x; i++) {
            System.out.print((i + 1) + ". broj: ");
            niz[i] = s.nextInt();
        }
        System.out.print("Niz je: ");
        System.out.println(Arrays.toString(niz));

        System.out.print("Unesite prvi index koji zelite da obrisete: ");
        int prvi = s.nextInt();
        System.out.print("Unesite drugi index koji zelite da obrisete: ");
        int drugi = s.nextInt();
        int[] noviNiz = new int[niz.length - 2];
        int j = 0;

        for (int i = 0; i < niz.length; i++) {
            if (i != prvi && i!=drugi) {
                noviNiz[j] = niz[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(noviNiz));
    }
}
