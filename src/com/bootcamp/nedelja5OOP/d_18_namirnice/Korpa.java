package com.bootcamp.nedelja5OOP.d_18_namirnice;

import java.util.ArrayList;

public class Korpa implements Racun{
    private ArrayList<Namirnica> novaListaNamirnica = new ArrayList<>();

    public Korpa(ArrayList<Namirnica> novaListaNamirnica) {
        this.novaListaNamirnica = novaListaNamirnica;
    }

    public ArrayList<Namirnica> getNovaListaNamirnica() {
        return novaListaNamirnica;
    }

    @Override
    public void printNamirnice(ArrayList<Namirnica> listaNamirnica) {
        for (Namirnica namirnica : listaNamirnica){
            System.out.println(namirnica.toString());
        }
    }

    @Override
    public int printRacun(ArrayList<Namirnica> listaNamirnica) {
        int sum = 0;
        for (Namirnica namirnica : listaNamirnica){
            sum += namirnica.getCena();
        }
        return sum;
    }

    @Override
    public boolean jeNaSpisku(String unetaNamirnica) {
        boolean naSpisku = false;
        for (Namirnica namirnica : novaListaNamirnica){
            if (namirnica.getNaziv().equalsIgnoreCase(unetaNamirnica)){
                naSpisku = true;
                break;
            }
        }
        return naSpisku;
    }

    @Override
    public boolean naSpisku(Namirnica n) {
        boolean tuJe = false;
        for (Namirnica namirnica : novaListaNamirnica){
            if (namirnica.equals(n)){
                tuJe = true;
                break;
            }
        }
        return tuJe;
    }
}
