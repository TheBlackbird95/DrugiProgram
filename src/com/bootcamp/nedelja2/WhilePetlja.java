package com.bootcamp.nedelja2;

import java.util.Scanner;

public class WhilePetlja {
    public static void main(String[] args) {
        /*int jedan = 1;
        while (jedan <= 10) {
            System.out.println(jedan);
            jedan++;
        }
        System.out.println("POLECEMO!");

        int dva = 2;
        while (dva <= 10) {
            System.out.println(dva);
            dva = dva + 2;
        }

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite zeljeni broj: ");
        int korisnik = s.nextInt();
        int tri = 2;
        int suma = 0;
        while (tri<=korisnik) {
            suma = suma + tri;
            tri = tri + 2;
        }
        System.out.println(suma);*/

    Scanner s = new Scanner(System.in);
    System.out.print("Unesite prvi broj:  ");
    int x = s.nextInt();
    System.out.print("Unesite drugi broj:  ");
    int y = s.nextInt();
    int zbir = 0;
    int proizvod = 0;
    if (y>=0 && x>0) {
        while (zbir < y) {
            zbir++;
            proizvod = proizvod + x;
        }
    } else {
        while (Math.abs(zbir) < Math.abs(y)){
            zbir = Math.abs(zbir);
            zbir++;
            proizvod = proizvod + Math.abs(x);


        }

    }
        System.out.println("Proizvod je  " + proizvod);

        }
}
