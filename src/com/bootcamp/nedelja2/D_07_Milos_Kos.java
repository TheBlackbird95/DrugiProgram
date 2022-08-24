package com.bootcamp.nedelja2;

import java.util.Scanner;

public class D_07_Milos_Kos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] imena = new String[5];

        System.out.println("Unesite 5 imena: ");
        int i;
        int j;
        for (i = 0; i < imena.length; i++) {
            System.out.print((i + 1) + ".");
            imena[i] = s.next().toUpperCase();
        }

        for (j = 0; j < imena.length; j++) {
            if (imena[j].charAt(0) == 'M') {
                System.out.println(imena[j]);
            }
        }
    }
}