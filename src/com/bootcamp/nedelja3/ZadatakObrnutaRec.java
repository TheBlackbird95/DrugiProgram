package com.bootcamp.nedelja3;

import java.util.Scanner;

public class ZadatakObrnutaRec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite rec: ");
        String rec = s.nextLine();
        System.out.print("Obrnuta rec je: ");
        obrnutaRec(rec);
        noviPalindrom(rec);
    }
    public static void obrnutaRec(String rec){
        StringBuilder novaRec = new StringBuilder();

        for (int i = rec.length()-1; i>=0; i--){
            novaRec.append(rec.charAt(i));
        }
        System.out.println(novaRec);
        palindrom(String.valueOf(novaRec), rec);
    }

    public static void palindrom (String novaRec, String rec){
        if (rec.toLowerCase().replaceAll(" ", "").equals(novaRec.toLowerCase().replaceAll(" ", ""))){
            System.out.println("Rec je palindrom");
        } else {
            System.out.println("Rec nije palindrom");
        }
    }
    public static boolean noviPalindrom (String rec){
        boolean jePalindrom = true;
        for (int i = 0, j = rec.length()-1; i<rec.length(); i++,j--){
            if (rec.charAt(i) != rec.charAt(j)){
                System.out.println("Rec nije polindrom");
                jePalindrom = false;
                break;
            }
        }
        if (jePalindrom) {
            System.out.println("Rec je palindrom");
        }
        return jePalindrom;
    }
}
