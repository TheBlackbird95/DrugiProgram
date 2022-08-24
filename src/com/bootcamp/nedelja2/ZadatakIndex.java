package com.bootcamp.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class ZadatakIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] niz = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] kopija = Arrays.copyOf(niz, niz.length);
        System.out.println("Unesite brojeve indeksa elemenata kojima zelite da zamenite mesta");
        System.out.print("Prvi element: ");
        int x = s.nextInt();
        System.out.print("Drugi element: ");
        int y = s.nextInt();

        niz[x] = kopija[y];
        niz[y] = kopija[x];

        System.out.println(Arrays.toString(niz));
    }
}
