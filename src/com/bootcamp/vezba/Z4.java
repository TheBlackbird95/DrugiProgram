package com.bootcamp.vezba;

import java.util.Arrays;

public class Z4 {
    public static void main(String[] args) {
        int[] niz = {1,2,3,4,5};

        int[] obrnutiNiz = new int[niz.length];
        for (int i = 0, j = niz.length-1; i< niz.length; i++, j--){
            obrnutiNiz[i] = niz[j];
        }
        System.out.println("Niz " + Arrays.toString(niz) + " u obrnutom smeru je " + Arrays.toString(obrnutiNiz));
    }
}
