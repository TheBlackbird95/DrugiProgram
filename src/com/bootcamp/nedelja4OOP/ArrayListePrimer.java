package com.bootcamp.nedelja4OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListePrimer {
    public static void main(String[] args) {
        String[] niz = new String[2]; // slicnost ?
        ArrayList<String> lista = new ArrayList<>(); //kreiranje liste
        lista.add("Zdravo"); //dodavanje u listu
        lista.add("ja");
        lista.add("sam");
        lista.add("Program");
        lista.remove(2);

        for (String s : lista) {
            System.out.println(s);
        }
    }
}
