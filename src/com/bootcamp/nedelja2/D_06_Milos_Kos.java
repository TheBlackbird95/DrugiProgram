package com.bootcamp.nedelja2;

import java.util.Scanner;

public class D_06_Milos_Kos {
    public static void main(String[] args) {
        //Napisati pomocu petlje program koji racuna sumu kvadratnih vrednost od 1 2 3 i 5, ako korisnik unese
        //0, izlazi iz programa. (Obratiti paznju na negativne brojeve)
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (; true; ) {
            System.out.print("Unesite broj od 1 do 5 za igru, 0 da prekinete: ");
            int x = s.nextInt();
            if (Math.abs(x) == 4) {
                System.out.println("Ovaj broj se ne racuna :)");
                continue;
            }
            if (x == 0) {
                System.out.println("Igra je zavrsena!");
                break;
            }
            if (Math.abs(x) > 5) {
                System.out.println("Pogresan unos!");
            }
            sum += Math.pow(x, 2);
            System.out.println("Trenutna suma je: " + sum);
        }
    }
}
