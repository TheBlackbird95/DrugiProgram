package com.bootcamp.nedelja2;

import java.util.Scanner;

public class ZadatakStringMetode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Uneiste neku rec ili recenicu");
        String rec = s.nextLine();
        int brojKaraktera = 0;
        int index = 0;
        char trazeniKarakter = 'o';

        while (index < rec.length()) {
            char karakterUReci = rec.toLowerCase().charAt(index);
            if (karakterUReci == trazeniKarakter) {
               brojKaraktera++;
            }
            index++;
        }
        System.out.println("Slova 'o' u Vasoj reci ili recenici ima: " + brojKaraktera);
    }
}
