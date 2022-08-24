package com.bootcamp.nedelja1;

import java.util.Scanner;

public class NekiSkener {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        System.out.print("Unesite mesec ");
        String x = skener.nextLine();

        switch (x.toLowerCase()) {
            case "januar", "mart", "maj", "jul", "avgust", "oktobar", "decembar":
                System.out.println("Mesec " + x + " ima 31 dan");
                break;
            case "april", "jun", "septembar", "novembar":
                System.out.println("Mesec " + x + " ima 30 dana");
                break;
            case "februar":
                System.out.print("Unesite godinu: ");
                int godina = skener.nextInt();                if (godina % 4 == 0) {
                    System.out.println("Februar ove godine ima 29 dana");
                } else {
                    System.out.println("Februar ove godine ima 28 dana");
                }
            default:
                System.out.println("Pogresan unos!");
        }
        }
    }
