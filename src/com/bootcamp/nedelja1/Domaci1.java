package com.bootcamp.nedelja1;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite Vasu godinu zaposlenja: ");
        int x = s.nextInt();
        int y = 2022 - x;


        if (y <= 4 && y >= 0) {
            System.out.println("Vi ste junior programer");
        } else if (y > 4 && y <= 8) {
            System.out.println("Vi ste medior programer");
        } else if (y > 8) {
            System.out.println("Vi ste senior programer");
        } else {
            System.out.println("Vas unos je pogresan");
        }
    }
}
