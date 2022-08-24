package com.bootcamp.nedelja1;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite Vasu velicinu majice u cm: ");
        int x = s.nextInt();

        switch (x){
            case 24:
                System.out.println("S velicina");
                break;
            case 30:
                System.out.println("M velicina");
                break;
            case 36:
                System.out.println("L velicina");
                break;
            case 40:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Uneli ste pogresnu velicinu");
        }
    }
}
