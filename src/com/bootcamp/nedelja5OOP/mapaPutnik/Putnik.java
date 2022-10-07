package com.bootcamp.nedelja5OOP.mapaPutnik;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Putnik {
    private String klasa;
    private int brojSedista;
    private double cenaSedista;

    public Putnik(String klasa, int brojSedista, double cenaSedista) {
        this.klasa = klasa;
        this.brojSedista = brojSedista;
        this.cenaSedista = cenaSedista;
    }

    public String getKlasa() {
        return klasa;
    }

    public int getBrojSedista() {
        return brojSedista;
    }

    public double getCenaSedista() {
        return cenaSedista;
    }

    @Override
    public String toString() {
        return "Klasa putnika: " + klasa + ", brojSedista: " + brojSedista + ", cenaSedista: " + cenaSedista + System.lineSeparator();
    }

    public void grupisi (Map<String, List<Putnik>> map, List<Putnik> putnici){
        for (Putnik p : putnici){
            if (map.containsKey(p.klasa)){
                map.get(p.klasa).add(p);
            } else {
                List<Putnik> lista = new ArrayList<>();
                lista.add(p);
                map.put(p.klasa, lista);
            }
        }
    }

    public double prosecnaCenaKlase(Map<String, List<Putnik>> map, String klasa){
        double suma = 0;
        int brojac = 0;
        for (Map.Entry<String, List<Putnik>> me : map.entrySet()){
            if (me.getKey().equalsIgnoreCase(klasa)){
                for (Putnik p : me.getValue()){
                    suma += p.cenaSedista;
                    brojac++;
                }
            }
        }
        return suma/brojac;
    }

    public List<Putnik> jeftinijeKarte(Map<String, List<Putnik>> map, double vrednost){
        List<Putnik> volimWizzAir = new ArrayList<>();
        for (Map.Entry<String, List<Putnik>> me : map.entrySet()){
            for (Putnik p : me.getValue()){
                if (p.cenaSedista < vrednost){
                    volimWizzAir.add(p);
                }
            }
        }
        return volimWizzAir;
    }
}
