package com.bootcamp.nedelja5OOP.d_18_namirnice;

import java.util.ArrayList;

public interface Racun {
    void printNamirnice(ArrayList<Namirnica> listaNamirnica);
    int printRacun(ArrayList<Namirnica> listaNamirnica);
    boolean jeNaSpisku(String unetaNamirnica);
    boolean naSpisku(Namirnica n);
}
