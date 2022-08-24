package com.bootcamp.nedelja1;

import java.util.Scanner;

public class DanUNedelji {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite Vas broj:");
        int x = s.nextInt();

        if (x==1){
            System.out.println("Odabrali ste - PONEDELJAK");
        }
        else if (x==2){
            System.out.println("Odabrali ste - UTORAK");
        }
        else if (x==3){
            System.out.println("Odabrali ste - SREDA");
        }
        else if (x==4){
            System.out.println("Odabrali ste - CETVRTAK");
        }
        else if (x==5){
            System.out.println("Odabrali ste - PETAK");
        }
        else if (x==6){
            System.out.println("Odabrali ste - SUBOTA");
        }
        else if (x==7){
            System.out.println("Odabrali ste - NEDELJA");
        }
        else {
            System.out.println("Odabrali ste NEPOZNAT DAN U NEDELJU");
        }
    }
}
