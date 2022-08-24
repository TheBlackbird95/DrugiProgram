package com.bootcamp.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class ZadatakSamoglasnici {
    public static void main(String[] args) {
        char[] slova = {'a','b','c','d','e','f','g'};

        char[] samoglasnici = new char[slova.length];

        int j = 0;

        for (int i = 0; i < slova.length; i++){
            if (slova[i] == 'a' || slova[i]== 'e' || slova[i]== 'i' || slova[i]== 'o' || slova[i]== 'u'){
                samoglasnici[j] = slova[i];
                j++;
            }
        }
        char [] kraj = new char [j];

        for (int i=0; i< kraj.length; i++) {
            kraj[i] = samoglasnici[i];
        }
        System.out.println(Arrays.toString(kraj));
    }
}
