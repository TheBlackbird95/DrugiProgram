package com.bootcamp.nedelja5OOP.biologija;

public class Covek extends ZivoBice implements Pokret{ //moze vise stvari da se implementira, neogranicen broj interfejsa, ali metode moraju da se definisu na drugom mestu!!!
    private String jezik;
    private String ime;
    public Covek(String staniste, int brojNogu, String jezik, String ime) {
        super(staniste, brojNogu);
        this.jezik = jezik;
    }

    public static void main(String[] args) {
        Covek cova = new Covek("stalno", 2, "srpski", "Coki");
        System.out.println(cova.getStaniste());
        cova.kreceSe(cova.getBrojNogu());
    }

    @Override
    public void kreceSe(int brojNogu) {
            System.out.println("Krece se uz pomoc " + getBrojNogu() + " nogu!");
    }
}
