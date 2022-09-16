package com.bootcamp.nedelja5OOP.nekeZivotinje;

import java.util.ArrayList;

public class Park {

    private ArrayList<Zivotinje> zivotinja;
    private double povrsina;

    public Park(ArrayList<Zivotinje> zivotnja, double povrsina){
        this.zivotinja = zivotnja;
        this.povrsina = povrsina;
    }

    public static void main(String[] args) {
        ArrayList<Zivotinje> listaZivotinja = new ArrayList<>();
        double povrsinaParka = 100; //nije bitno da li se zove povrsina, povrsinaParka ili kakogod
        Macka macka = new Macka("Flekica", "maca", 4,"Viskas");
        Zivotinje macka2 = new Macka("Pega", "maca", 4,"granule"); //nije bitno da li je tip zivotinja ili macka jer su povezani
        listaZivotinja.add(macka);
        Pas pas = new Pas("Dzeki", "jazavicar", 4, "crna");

        Park parkic = new Park(listaZivotinja, povrsinaParka);
    }
}
