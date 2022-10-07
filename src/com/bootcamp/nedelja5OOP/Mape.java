package com.bootcamp.nedelja5OOP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mape {
    public static void main(String[] args) {

        // Map<Kljuc, Vrednost>

        Map<Integer, String> ljudi = new HashMap<>();

        ljudi.put(1021, "Pera");
        ljudi.put(1234, "Zika");
        ljudi.put(6789, "Mika");
        ljudi.put(9878, "Raka");

        System.out.println(ljudi);

//        for(Map.Entry<Integer, String> m : ljudi.entrySet())

        Set<Integer> keys = ljudi.keySet();

        for (Integer key : keys){
            System.out.println(key + ", " + ljudi.get(key));
        }

    }
}
