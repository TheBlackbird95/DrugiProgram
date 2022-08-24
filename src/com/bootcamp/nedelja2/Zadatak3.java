package com.bootcamp.nedelja2;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int brojPonavljanja = 0;
        String trazenaRec = "cool";
        for (; true; ) {
            System.out.println("Unesite string koji sadrzi bar jednom 'cool': ");
            String text = s.nextLine().toLowerCase();
            if (text.contains(trazenaRec)) {
                brojPonavljanja++;
            }
            if (text.contains("cao")) {
                System.out.println("Program je prekinut!");
                break;
            }
        }
        System.out.println("Broj ponavljanja reci 'cool' je: " + brojPonavljanja);
    }
}
