package com.bootcamp.nedelja4OOP.nasledjivanje;

public class TestFizikalac {
    public static void main(String[] args) {
        Fizikalac pera = new Fizikalac("Kos", "Milos", 950828, 450, 0,0,10);
        pera.setBrojRadnihSubota(5);
        assert pera.getBrojRadnihSubota() == 5;
        pera.racunajBonus();
        assert pera.getBonusZarada() == 22.5;
        System.out.println("Osnovna zarada: " + pera.getMesecnaPlata());
        System.out.println("Bonus zarada je: " + pera.getBonusZarada());
        System.out.println("Ukupna zarada je: " + (pera.getBonusZarada()+pera.getMesecnaPlata()));
        System.out.println("Osnovni godisnji odmor je: " + pera.getBrojDanaGodisnjegOdmora());
        System.out.println("Bonus dani odmora: " + pera.bonusGodisnjiOdmor());
        System.out.println("Ukupan odmor je: " + pera.getBrojDanaGodisnjegOdmora());
        assert pera.getBrojDanaGodisnjegOdmora() == 11;
        pera.setBrojRadnihSubota(3);
        pera.bonusGodisnjiOdmor();
        assert pera.getBrojDanaGodisnjegOdmora() == 12;
        System.out.println(pera.getBrojDanaGodisnjegOdmora());


        System.out.println(pera.ispis());
        System.out.println("Svi testovi su prosli!");
    }
}
