package com.bootcamp.nedelja3;

import java.util.Arrays;
import java.util.Scanner;

public class ZadatakDodavanjeUNiz {
    public static void main(String[] args) {
        /*Zadatak2: Napraviti metodu public static int[] ubaciElement(int[] niz,
        int element, int index) koja ubacuje element na dati index a cuva redosled elemenata.
        npr > {1,2,3}, 99, 1 -> {1, 99, 2, 3}. Povratni tip je novi niz.
         */
        int [] niz = {1,2,3,4};
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj koji zelite da ubacite: ");
        int x = s.nextInt();
        System.out.print("Unesite na koji index zelite da ubacite broj: ");
        int i = s.nextInt();
        dodavanje (niz,x,i);
    }
    public static int[] dodavanje (int[] niz, int x, int i) {
        int [] noviNiz = new int[niz.length+1];
        for (int j = 0, k = 0; j < noviNiz.length; j++){
            if (i == j){
                noviNiz[j] = x;
            } else {
                noviNiz[j] = niz[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(noviNiz));
        return noviNiz;
    }
}
