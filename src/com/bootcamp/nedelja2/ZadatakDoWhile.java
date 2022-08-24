package com.bootcamp.nedelja2;

import java.util.Locale;
import java.util.Scanner;

public class ZadatakDoWhile {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input;
        do {
            System.out.print("Unesite prvi broj: ");
            double x = s.nextDouble();
            System.out.print("Unesite drugi broj: ");
            double y = s.nextDouble();
            double z;
            z = x + y;
            System.out.println("Zbir Vasih brojeva je: " + z);

            System.out.println("Ukoliko zelite da prekinete sabiranje, upisite 'kraj', za nastavak upisite bilo sta");
            input = s.next();
            if (input.toLowerCase().equals("kraj")){
                System.out.println("Kraj sabiranja");
            } else {
                System.out.println("Nastavljamo sabiranje");
            }
        } while (!input.toLowerCase().equals("kraj"));
    }
}
