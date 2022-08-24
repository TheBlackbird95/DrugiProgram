package com.bootcamp.nedelja3;

import java.util.Arrays;

public class ZadatakUbacivanjeUNiz {
    public static void main(String[] args) {
        int[] prviNiz = {1, 2, 3, 4};
        int[] drugiNiz = {8, 9, 5, 6, 7};
        presek(prviNiz, drugiNiz);
    }

    public static int[] presek(int[] prviNiz, int[] drugiNiz) {
        int j = 0;
        for (int i = 0; i < prviNiz.length; i++) {
            for (int k = 0; k < drugiNiz.length; k++) {
                if (prviNiz[i] == drugiNiz[k]) {
                    j++;
                }
            }
        }
        int[] kraj = new int[j];
        int z = 0;
        for (int i = 0; i < prviNiz.length; i++) {
            for (int k = 0; k < drugiNiz.length; k++) {
                if (prviNiz[i] == drugiNiz[k]) {
                    kraj[z] = prviNiz[i];
                    z++;
                }
            }
        }
        System.out.print(Arrays.toString(kraj));
        return kraj;
    }
}
