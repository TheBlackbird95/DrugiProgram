package com.bootcamp.nedelja2;

import java.util.Scanner;

public class D_D03_1_Milos_Kos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int x = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int y = s.nextInt();

        int sum = 0;
        while (x != 0) {
            sum = sum + y;
            x--;
        }
        System.out.println("Proizvod je: " + sum);
    }

}
