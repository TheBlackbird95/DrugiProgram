package com.bootcamp.nedelja4OOP.nasledjivanje;

public class TestMenadzer {
    public static void main(String[] args) {
        Menadzer milos = new Menadzer("Milos", "Kos", 280895, 900, 0, 10, 0);
        milos.setUspesneProdaje(25);
        assert milos.getUspesneProdaje() == 25;
        milos.racunajBonus();
        assert milos.getBonusZarada() == 22.5;
        assert milos.getBrojDanaGodisnjegOdmora() == 11;
        System.out.println("Regularna plata: " + milos.getMesecnaPlata());
        System.out.println("Bonus na platu: " + milos.getBonusZarada());
        System.out.println("Ukupna plata za ovaj mesec: " + (milos.getMesecnaPlata() + milos.racunajBonus()));
        System.out.println("Planirani godisnji odmor: " + milos.getBrojDanaGodisnjegOdmora());
        System.out.println("Bonus dani za godisnji odmor: " + milos.bonusGodisnjiOdmor());
        System.out.println("Broj dana godisnjeg odmora nakon uracunatog bonusa: " + milos.getBrojDanaGodisnjegOdmora());

        System.out.println(milos.ispis());
        System.out.println("Svi testovi su prosli!");
    }
}
