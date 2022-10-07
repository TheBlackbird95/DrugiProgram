package com.bootcamp.nedelja5OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapeZadatak {
    public static void main(String[] args) {
        /**Napraviti mapu ucenika, gde ce kljuc biti njegovo ime i ocena njegova vrednost, implentirati sledece metode:
         -koja stampa u posebnoj liniji kljuc a posebnoj vrednost
         -koji racuna prosecnu ocenu svih ucenika
         -koji pravi praznu listu u koju ce dodati sve ucenike koji imaju jedinice, zatim istampati tu listu*/

        Map<String, Integer> ucenici = new HashMap<>();
        ucenici.put("Pera", 5);
        ucenici.put("Zika", 3);
        ucenici.put("Mika", 1);

        Set<String> keys = ucenici.keySet();

        for (String key : keys){
            System.out.println(key + ", " + ucenici.get(key));
        }

        int sum = 0;
        for (String key : keys){
            sum += ucenici.get(key);
        }
        System.out.println(sum/ucenici.size());

        ArrayList<String> losiUcenici = new ArrayList<>();
        for (String key : keys){
            if (ucenici.get(key)==1){
              losiUcenici.add(key);
            }
        }
        System.out.println(losiUcenici);

         }
}
