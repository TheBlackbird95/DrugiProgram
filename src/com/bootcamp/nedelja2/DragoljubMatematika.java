package com.bootcamp.nedelja2;

import java.util.Scanner;

public class DragoljubMatematika {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dva broja:");
        System.out.print("Prvi broj: ");
        int p = s.nextInt();
        System.out.print("Drugi broj: ");
        int q = s.nextInt();
        System.out.print("Unesite znak operacije koju zelite da izvrsimo: ");
        char z = s.next().charAt(0);
        double x = (double) p;
        double y = (double) q;
        double resenje;

        if (z == '+') {
            z = 1;
        } else if (z == '-') {
            z = 2;
        } else if (z == '*') {
            z = 3;
        } else if (z == '/') {
            z = 4;
        } else {
            System.out.println("Uneli ste pogresnu operaciju");
        }

        switch (z){
            case 1:
                resenje=x+y;
                System.out.println("Zbir brojeva je: " + resenje);
                break;
            case 2:
                resenje=x-y;
                System.out.println("Razlika brojeva je: " + resenje);
                break;
            case 3:
                resenje=x*y;
                System.out.println("Proizvod brojeva je: " + resenje);
                break;
            case 4:
                resenje=x/y;
                System.out.println("Kolicnik brojeva je: " + resenje);
                break;
            default:
                System.out.println("Odabrali ste nepostojecu operaciju!");
        }
    }
}
