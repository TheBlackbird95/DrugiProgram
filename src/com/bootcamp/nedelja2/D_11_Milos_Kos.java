package com.bootcamp.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class D_11_Milos_Kos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvu rec: ");
        String prva = s.next();
        System.out.print("Unesite drugu rec: ");
        String druga = s.next();
        duzina(prva,druga);
    }
    public static void duzina(String prva, String druga){
        boolean x = (prva.length() == druga.length());
        if (x){
            System.out.println("Reci su iste duzine");
            samoglasnici(prva, druga);
        } else {
            System.out.println("Reci nisu iste duzine");
        }
    }

    public static void samoglasnici(String prva, String druga){
        int j = 0;

        char [] samoglasnici = new char[prva.length()];
        String spojeneReci = prva.toLowerCase() + druga.toLowerCase();
        for (int i = 0; i < spojeneReci.length(); i++){
            if (spojeneReci.charAt(i) == 'a' || spojeneReci.charAt(i) == 'e' || spojeneReci.charAt(i) == 'i' || spojeneReci.charAt(i) == 'o' || spojeneReci.charAt(i) == 'u'){
                samoglasnici[j] = spojeneReci.charAt(i);
                j++;
            }
        }
        char [] kraj = new char [j];

        for (int i=0; i< kraj.length; i++) {
            kraj[i] = samoglasnici[i];
        }
        System.out.println("Samoglasnici su: " + (Arrays.toString(kraj)));
    }
}
