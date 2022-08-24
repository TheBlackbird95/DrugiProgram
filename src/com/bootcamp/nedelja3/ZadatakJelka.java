package com.bootcamp.nedelja3;

import java.util.Scanner;

public class ZadatakJelka {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite visinu krosnje jelke: ");
        int x = s.nextInt();

        String razmak = " ";
        String z = "*";
        for (int i=x ; i>1 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print(razmak);
            }
            System.out.println(z);
            z = z + "**";
        }

        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < x ; j++) {
                System.out.print(razmak);
            }
            System.out.println("|");
        }

    }
}
