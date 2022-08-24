package com.bootcamp.nedelja2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Matematika {
    public static void main(String[] args) {
       /*double x = Math.pow(5, 2);
        int y = (int) x;
        System.out.println(x);
        System.out.println(y);

        double koren = Math.sqrt(25);
        System.out.println(koren);

        int z = Math.abs(-123);
        System.out.println(z);

        double q = 3.5;
        double qcell = Math.ceil(q);
        System.out.println(qcell);
        double qfloor = Math.floor(q);
        System.out.println(qfloor);

        double random = Math.random();
        System.out.println(random);

        int ceoRandom = (int) (random * 10) + 1;
        System.out.println(ceoRandom);*/

        Scanner s = new Scanner(System.in);
        double randomBroj = Math.random();
        int ceoBroj = (int) (randomBroj * 100) + 5;
        System.out.println(randomBroj);
        System.out.println(ceoBroj);
        System.out.println("Unesite Vas broj izmedju 5 i 100");
        int brojKorisnika = s.nextInt();

        if (brojKorisnika==ceoBroj) {
            System.out.println("Vi ste pobednik, Vas broj je " + brojKorisnika + " kao i nas broj! " + ceoBroj);
        } else if (brojKorisnika!=ceoBroj) {
            System.out.println("Vise srece drugi put, Vi ste odabrali " + brojKorisnika + " a nas broj je " + ceoBroj);
        }
    }
}
