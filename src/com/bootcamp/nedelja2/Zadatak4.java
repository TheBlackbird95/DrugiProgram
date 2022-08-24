package com.bootcamp.nedelja2;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        double proizvod = 1;
        for (int i=0; true; i++){
            System.out.println("Unesite broj: ");
            x = s.nextDouble();
            if (x==0) {
                break;}
            proizvod = proizvod*x;
            System.out.println("Trenutni proizvod je: " + proizvod);
            if (x==1) {
                continue;
            }
        }
        System.out.println("Krajnji proizvod je: " + proizvod);
    }
}
