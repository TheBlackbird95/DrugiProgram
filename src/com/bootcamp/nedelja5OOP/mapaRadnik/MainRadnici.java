package com.bootcamp.nedelja5OOP.mapaRadnik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainRadnici {

    public static double sumaPlata(Map<Integer, Radnik> mapa){
        double suma = 0;
        for(Map.Entry<Integer, Radnik> me : mapa.entrySet()){
            suma += me.getValue().getPlata();
        }
        return suma;
    }

    public static List<Radnik> listaRadnika(Map<Integer,Radnik> mapa, String departman){
        List<Radnik> lista = new ArrayList<>();
        for (Map.Entry<Integer, Radnik> me : mapa.entrySet()){
            if (me.getValue().getDepartman().equalsIgnoreCase(departman)){
                lista.add(me.getValue());
            }
        }
        return lista;
    }



    public static void main(String[] args) {
        Radnik pera = new Radnik("Pera", "D1", 1000);
        Radnik zika = new Radnik("Zika", "D1", 1000);
        Radnik mika = new Radnik("Mika", "D2", 400);
        Radnik joca = new Radnik("Joca", "D1", 1000);

        Map<Integer, Radnik> sviRadnici = new HashMap<>();
        sviRadnici.put(0, pera);
        sviRadnici.put(1, zika);
        sviRadnici.put(2, mika);
        sviRadnici.put(3, joca);

        System.out.println(sumaPlata(sviRadnici));
        System.out.println(listaRadnika(sviRadnici, "d1"));
    }
}
