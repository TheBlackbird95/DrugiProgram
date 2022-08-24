package com.bootcamp.vezba;

import java.util.Arrays;

public class Z1 {
    public static void main(String[] args) {
        // 1. Napraviti program koji nalazi najveci broj u nizu i vraca informaciju da li je taj
        // najveci broj paran

        //region For
        int[] niz = {5,18,2,165,87,3};
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        for (int i = 0; i< niz.length; i++){
            if (niz[i]>a){
                a = niz[i];
            } else if (niz[i]<b){
                b = niz[i];
            }
        }
        System.out.println("Najveca vrednost u nizu je: " + a);
        System.out.println("Najmanja vrednost u nizu je: " + b);
        //endregion

        //region Sort
        Arrays.sort(niz);
        System.out.println("Najveca vrednost u nizu je: " + niz[niz.length-1]);
        System.out.println("Najmanja vrednost u nizu je: " + niz[0]);
        //endregion

        if (a%2==0){
            System.out.println("Najveca vrednost je parna");
        } else {
            System.out.println("Najveca vrednost je neparna");
        }
    }
}
