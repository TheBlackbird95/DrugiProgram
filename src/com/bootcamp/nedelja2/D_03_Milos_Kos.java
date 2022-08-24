package com.bootcamp.nedelja2;

import java.util.Scanner;

public class D_03_Milos_Kos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj:  ");
        int x = s.nextInt();
        System.out.print("Unesite drugi broj:  ");
        int y = s.nextInt();
        int zbir = 0;
        int proizvod = 0;
        if (y >= 0 && x >= 0) {
            while (zbir < y) {
                zbir++;
                proizvod = proizvod + x;
            }
        } else if (y < 0 && x < 0) {
            while (Math.abs(zbir) < Math.abs(y)) {
                zbir = Math.abs(zbir);
                zbir++;
                proizvod = proizvod + Math.abs(x);
            }
        } else if (y < 0 && x > 0) {
            while (zbir > y) {
                zbir--;
                proizvod = proizvod - x;
            }
        } else if (y > 0 && x < 0) {
            while (zbir < y){
                zbir ++;
                proizvod = proizvod + x;
            }
        }
        System.out.println("Proizvod je  " + proizvod);
    }
}
