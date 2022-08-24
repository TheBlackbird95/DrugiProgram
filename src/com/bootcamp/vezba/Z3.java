package com.bootcamp.vezba;

import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        //  3. Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu. Korisnik
        // preko skenera unese koji broj zeli da prebroji u nizu

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj koji zelite da se prebroji u nizu: ");
        int x = s.nextInt();

        int[] niz = {1,2,3,4,5,6,1,2,3,4,1,2,3,4,5,1,2,3,1,2,1};
        int brojac=0;

        for (int i = 0; i< niz.length; i++){
            if (x == niz[i]){
                brojac++;
            }
        }
        System.out.println("Broj ponavljanja broja " + x + " je " + brojac);
    }
}
