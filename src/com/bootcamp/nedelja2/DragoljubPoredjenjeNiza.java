package com.bootcamp.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class DragoljubPoredjenjeNiza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite koju duzinu niza zelite: ");
        int x = s.nextInt();
        int[] niz1 = new int[x];
        int[] niz2 = new int[niz1.length];

        System.out.println("Unesite cele brojeve za prvi niz: ");
        for (int i = 0; i < x; i++) {
            System.out.print((i + 1) + ". broj: ");
            niz1[i] = s.nextInt();
        }
        System.out.println("Unesite cele brojeve za drugi niz: ");
        for (int i = 0; i < x; i++) {
            System.out.print((i + 1) + ". broj: ");
            niz2[i] = s.nextInt();
        }

        System.out.print("Prvi niz je: ");
        System.out.println(Arrays.toString(niz1));

        System.out.print("Drugi niz je: ");
        System.out.println(Arrays.toString(niz2));

        for (int i = 0; i<x; i++) {
            if (niz1[i] != niz2[i]){
                System.out.println("Nizovi nisu identicni");
                System.exit(0);
            }
        }
        System.out.println("Nizovi su identicni");
    }
}
