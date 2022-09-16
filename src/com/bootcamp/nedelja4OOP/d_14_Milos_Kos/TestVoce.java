package com.bootcamp.nedelja4OOP.d_14_Milos_Kos;

public class TestVoce {
    public static void main(String[] args) {

        Jagoda prva = new Jagoda("prva", "crvena", 0,"");
        prva.setCenaZaKilogram(100);
        assert prva.getCenaZaKilogram() == 100;
        System.out.println("Mozete kupiti " + prva.sumaVoca(200) + "kg jagoda");

        prva.setSezona("leto");
        prva.povecajCenuJagoda();
        assert prva.getCenaZaKilogram() == 120;
        assert !prva.jeSezona("prolece");

        prva.setCenaZaKilogram(100);
        prva.setSezona("PROLECE");
        assert prva.getCenaZaKilogram() == 100;
        assert prva.jeSezona("prolece");

        System.out.println("Testovi za jagodu su prosli!");



        Breskva druga = new Breskva("druga", "", 0, "leto");

        druga.setCenaZaKilogram(100);
        assert druga.getCenaZaKilogram() == 100;
        System.out.println("Mozete kupiti " + druga.sumaVoca(200) + "kg breskvi");


        druga.setBoja("narandzasta");
        assert druga.getCenaZaKilogram() == 100;

        assert druga.jeSezona("leto");
        druga.setBoja("zElEnA");
        druga.smanjiCenuBreskva();
        assert druga.getCenaZaKilogram() == 85;
        System.out.println("Mozete kupiti " + druga.sumaVoca(200) + "kg breskvi");

        System.out.println("Testovi za breskvu su prosli!");
    }
}
