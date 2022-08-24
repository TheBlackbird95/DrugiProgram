package com.bootcamp.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class D_08_Milos_Kos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite koju duzinu niza zelite: ");
        int x = s.nextInt();
        int[] niz = new int[x];
        int[] noviNiz = new int[niz.length];

        System.out.println("Unesite cele brojeve: ");
        for (int i = 0; i < x; i++) {
            System.out.print((i + 1) + ". broj: ");
            niz[i] = s.nextInt();
        }
        System.out.print("Niz je: ");
        System.out.println(Arrays.toString(niz));

        for (int i = 0; i < niz.length; i++) {
            noviNiz[x - 1] = niz[i];
            x--;
        }
        System.out.print("Resenje prvog dela zadatka: ");
        System.out.println(Arrays.toString(noviNiz));

        //drugi deo
        int l = noviNiz.length;
        int[] kraj = new int[l];

        //izbaci parne brojeve
        for (int i = 0; i < l; i++) {
            if (noviNiz[i] % 2 != 0) {
                kraj[i] = noviNiz[i];
            }
        }
        System.out.print("Niz nakon izbacenih parnih brojeva: ");
        System.out.println(Arrays.toString(kraj));

        //izbaci nule
        int len = 0;
        for (int i=0; i<kraj.length; i++){
            if (kraj[i] != 0)
                len++;
        }
        int [] krajnjiNiz = new int[len];
        for (int i=0, j=0; i<kraj.length; i++){
            if (kraj[i] != 0) {
                krajnjiNiz[j] = kraj[i];
                j++;
            }
        }
        System.out.print("Krajnji niz je: ");
        System.out.println(Arrays.toString(krajnjiNiz));
    }
}