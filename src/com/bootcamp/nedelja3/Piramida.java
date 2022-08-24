package com.bootcamp.nedelja3;

import java.util.Scanner;

public class Piramida {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite koju visinu piramide zelite: ");
        int i = s.nextInt();
        piramida(i);
    }

    public static void piramida(int i) {
        String zvezda = "*";
        for (int k = 0; k < i; k++) {
            for (int j = 0; j < i; j++) {
                System.out.println(zvezda);
                break;
            }
            zvezda = zvezda + "*";
        }
    }
}

