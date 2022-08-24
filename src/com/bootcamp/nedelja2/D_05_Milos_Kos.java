package com.bootcamp.nedelja2;

public class D_05_Milos_Kos {
    public static void main(String[] args) {
        //Uneti string "ITBootCamp" i stampati sve karaktere osim slova C. (Obratiti paznju na velicinu fonta)
        String itb = "ITBootCamp";
        System.out.println("Resenje zadatka u jednom redu: " + itb.replaceAll("C", ""));

        /*int i = 0;
        System.out.println("Resenje zadatka u vise redova: ");
        while (i < itb.length()) {
            if (itb.charAt(i) == 'C') {
                i++;
            } else {
                System.out.println(itb.charAt(i));
                i++;
            }
        }*/

        for (int i = 0; i < itb.length(); i++){
            if (itb.charAt(i)=='C') continue;
            System.out.println(itb.charAt(i));
        }
    }
}
