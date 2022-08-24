package com.bootcamp.nedelja2;

import java.util.Scanner;

public class DragoljubVreme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj sekundi: ");
        int sekunde = s.nextInt();
        // 100 / 60 = 1, ostatak 40 => x = 100%60                sekunde=unos%60;
        int y = sekunde%60;
        int minuti = sekunde/60;
        int sati = 0;

        if (minuti >= 60){
            sati = minuti/60;
            minuti = minuti%60;
        }

        System.out.println("Uneto vreme je " + sati +"h " + minuti+ "min " + y + "sek");
    }
}
