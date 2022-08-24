package com.bootcamp.nedelja1;

import java.util.Scanner;

public class CeoBroj {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int GodinaRodjenja = s.nextInt();
        int TrenutnaGodina;
        int c;

        TrenutnaGodina = 2022;
        c = TrenutnaGodina - GodinaRodjenja;
        if (c >= 18) {
            System.out.println("Vi ste punoletni, i imate " + c + " godina");
        }
        else {
            System.out.println("Vi jos uvek niste punoletni");
        }

    }
}
