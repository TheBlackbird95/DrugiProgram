package com.bootcamp.nedelja5OOP.mapaRadnik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainRadnici2 {

    public static void grupisi(List<Radnik> radnici, Map<String, List<Radnik>> mapa){
        for (Radnik r : radnici) {
            if(mapa.containsKey(r.getDepartman())) {
                mapa.get(r.getDepartman()).add(r);
            } else {
                List<Radnik> lista = new ArrayList<>();
                lista.add(r);
                mapa.put(r.getDepartman(), lista);
            }
        }
    }

    public static double sumaPlata(List<Radnik> radnici, Map<String, List<Radnik>> mapa, String departman){
        double suma = 0;
        for (Map.Entry<String, List<Radnik>> me : mapa.entrySet()){
            if (me.getKey().equalsIgnoreCase(departman)){
                for (Radnik r : me.getValue()) {
                    suma += r.getPlata();
                }
            }
        }
        return suma;
    }

    public static void main(String[] args) {

        Radnik pera = new Radnik("Pera", "D1", 1000);
        Radnik zika = new Radnik("Zika", "D1", 1000);
        Radnik mika = new Radnik("Mika", "D2", 400);
        Radnik joca = new Radnik("Joca", "D1", 1000);

        List<Radnik> radnici = new ArrayList<>();
        radnici.add(pera);
        radnici.add(zika);
        radnici.add(mika);
        radnici.add(joca);

        Map<String, List<Radnik>> mapa = new HashMap<>();

        grupisi(radnici, mapa);
        System.out.println(mapa);

        System.out.println(sumaPlata(radnici, mapa, "d1"));
    }
}
