package com.bootcamp.nedelja5OOP.nekeZivotinje;

public class Pas extends Zivotinje {
    private String boja;
    public Pas(String ime, String rasa, int brojNogu, String boja){
        super(ime, rasa, brojNogu);
        this.boja = boja;
    }

    @Override
    public void javiSe(){
        System.out.println("Av av");
    }

    @Override
    public String toString () {
        return super.toString() + "boja: " + boja;
    }
}
