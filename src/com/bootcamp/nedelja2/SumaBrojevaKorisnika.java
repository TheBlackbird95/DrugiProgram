package com.bootcamp.nedelja2;

import java.util.Scanner;

public class SumaBrojevaKorisnika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double suma = 0;
        do {
            System.out.println("Unesite broj: ");
            double korisnikovBroj = scanner.nextDouble();
            suma += korisnikovBroj;

            System.out.println("Za zavrsetak unesite 'kraj', za nastavak unesite bilo sta: ");
            input = scanner.next().toLowerCase();
            if (input.equals("kraj")) {
                System.out.println("Kraj igre");
            }
            else {
                System.out.println("Nastavljamo igru");
            }
        } while (!input.equals("kraj"));
        System.out.println("Suma brojeva je: " + suma);
    }
}
