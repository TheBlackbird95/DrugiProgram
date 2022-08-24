package com.bootcamp.nedelja3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class D_12_Milos_Kos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Koliko imena zelite da unesete?");
        int i = s.nextInt();
        imena (i);
    }
    public static String[] imena (int i){
        Scanner s = new Scanner(System.in);
        String [] imena = new String[i];
        for (int j = 0; j < i; j++) {
            System.out.print("Unesite " + (j+1) + ". ime:");
            String ime = s.nextLine();
            imena[j] = ime;
        }
        System.out.println("Uneta imena su: " + Arrays.toString(imena));
        unija(imena);
        return imena;
    }

    public static void unija (String[] imena) {
        String[] novaImena = {"Milos", "Jovana", "Vuk", "Helena"};

        //region UnijaPonavljanje
        String[] unija = new String[imena.length + novaImena.length];
        for (int j = 0; j < imena.length; j++) {
            unija[j] = imena[j];
        }
        for (int j = imena.length, k = 0; k < novaImena.length; k++, j++){
            unija[j] = novaImena[k];
    }
        System.out.println("Unija svih elemenata sa ponavljanjem: " + Arrays.toString(unija));
        //endregion

        //region UnijaBezPonavljanja
        String[] imenaVelika = new String[imena.length];
        for (int i = 0; i< imena.length; i++){
            imena[i] = prvoVeliko(imena[i]);
            imenaVelika[i] = imena[i];
        }
        System.out.println("Uneta imena posle konverzije za pocetno slovo veliko: " + Arrays.toString(imenaVelika));

        HashSet<String> unijaBezPonavljanja = new HashSet<>();
        unijaBezPonavljanja.addAll(Arrays.asList(imenaVelika));
        unijaBezPonavljanja.addAll(Arrays.asList(novaImena));
        System.out.println("Unija svih imena bez ponavljanja: " + unijaBezPonavljanja);
        //endregion

        //region RucnoUnijaBezPonavljanja
        int m = 0;

        for (int i = 0; i < imena.length; i++){
            for (int j = 0; j < novaImena.length; j++){
                if (imena[i].equalsIgnoreCase(novaImena[j])){
                    m++;
                }
            }
        }
        String[] kraj = Arrays.copyOf(imena,(imena.length+ novaImena.length-m));

        for (int i = 0, k = imena.length; i < novaImena.length; i++){
            boolean nijeIstaRec = true;
            for (int j = 0; j < kraj.length; j++){
                if (novaImena[i].equalsIgnoreCase(kraj[j])){
                    nijeIstaRec = false;
                    break;
                }
            }if (nijeIstaRec){
                kraj[k] = novaImena[i];
                k++;
            }
        }
        System.out.println("MUCNO napravljeno: " + Arrays.toString(kraj));
        //endregion
    }
    public static String prvoVeliko(String str) {
        // format clanova niza Aaaaaaaaa..
        String prvoSlovo =  str.substring(0,1);
        String prvoVeliko = prvoSlovo.toUpperCase();
        String nijePrvoSlovo = str.substring(1, str.length());
        String malaSlova = nijePrvoSlovo.toLowerCase();
        String result = prvoVeliko + malaSlova;
        return result;
    }
}
