package com.bootcamp.nedelja5OOP;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WrapperKlase {
    public static void main(String[] args) {
        int x = 123;
        Integer y = 10;
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(x);
        lista.add(2);
        lista.add(null);
        lista.add(0);
        System.out.println(lista.toString());

        Boolean b = true;
        Short s = 1;
        Double d = 13.21; //..... postoje svi primitivni tipovi
    }
}
