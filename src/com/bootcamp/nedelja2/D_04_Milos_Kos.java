package com.bootcamp.nedelja2;

import java.util.Scanner;

public class D_04_Milos_Kos {
    public static void main(String[] args) {
        //Istampati sve samoglasnike iz proizvoljnog stringa.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite zeljenu rec ili recenicu: ");
        String string = s.nextLine();

        int i = 0;
        while (i < string.length()) {
            if (string.toLowerCase().charAt(i)=='a') {
                System.out.println("String sadrzi slovo 'a'.");
            } else if (string.toLowerCase().charAt(i)=='e') {
                System.out.println("String sadrzi slovo 'e'.");
            } else if (string.toLowerCase().charAt(i)=='i') {
                System.out.println("String sadrzi slovo 'i'.");
            } else if (string.toLowerCase().charAt(i)=='o') {
                System.out.println("String sadrzi slovo 'o'.");
            } else if (string.toLowerCase().charAt(i)=='u') {
                System.out.println("String sadrzi slovo 'u'.");
            } i++;
        }

    }
}
