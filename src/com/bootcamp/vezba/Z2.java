package com.bootcamp.vezba;

import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        //2. Napraviti program koji, koristeci WHILE petlju, racuna proizvod unetih brojeva sve
        //dok korisnik ne unese 0

        Scanner s = new Scanner(System.in);
        double proizvod = 1.0;

        while (true){
            System.out.print("Unesite broj za mnozenje, ukoliko unesete 0 program se zavrsava: ");
            double x = s.nextDouble();

            if (x==0) {
                System.out.println("Proizvod je: " + proizvod);
                break;
            }
            proizvod *= x;
        }
    }
}
