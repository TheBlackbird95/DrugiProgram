package com.bootcamp.nedelja3;

import java.util.Scanner;

public class ZadatakApsolutnaVrednost {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite negativan ceo broj: ");
        int x = s.nextInt();
        apsolutnaVrednost(x);
        System.out.println("Unesite decimalni negativan broj: ");
        double z = s.nextDouble();
        apsolutnaVrednost(z);
    }

    public static int apsolutnaVrednost(int x) {
        int y;
        if (x < 0) {
            y = x*-1;
        } else {
            y = x;
        }
        System.out.println("Apsolutna vrednost ovog celog broja je: " + y);
        return y;
    }

    public static double apsolutnaVrednost(double z) {
        double y;
        if (z < 0) {
            y = z*-1;
        } else {
            y=z;
        }
        System.out.println("Apsolutna vrednost ovog decimalnog broja je: " + y);
        return y;
    }
}
