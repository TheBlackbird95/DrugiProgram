package com.bootcamp.nedelja5OOP.matematika;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Pravougaonik pravougaonik = new Pravougaonik(2,5);
        Kvadrat kvadrat = new Kvadrat(3);
        PravougliTrougao trougao = new PravougliTrougao(1,2,3);

        ArrayList<Obim> listaTela = new ArrayList<>();
        listaTela.add(pravougaonik);
        listaTela.add(kvadrat);
        listaTela.add(trougao);

        for (Obim tela : listaTela){
            System.out.println(tela.getClass().getSimpleName()+ " " + tela.obim());
        }

        System.out.println("Povrsina pravouganika je: " + pravougaonik.povrsina());
        System.out.println("Povrsina kvadrata je: " + kvadrat.povrsina());
        System.out.println("Povrsina trougla je: " + trougao.povrsina());
        System.out.println("Obim pravouganika je: " + pravougaonik.obim());
        System.out.println("Obim kvadrata je: " + kvadrat.obim());
        System.out.println("Obim trougla je: " + trougao.obim());
    }
}
