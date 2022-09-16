package com.bootcamp.nedelja4OOP;

public class TestRadnik {
    public static void main(String[] args) {
        Radnik milos = new Radnik (0, "Milos", "Trainee", 2021, 3600);
        Radnik jovana = new Radnik (1, "Jovana", "Fizikalac", 2022, 3600);
        Radnik marko = new Radnik (1, "Jovana", "Fizikalac", 2023, 3600);

        int ocekivaniRadniStaz = 1;
        assert milos.radniStaz() == ocekivaniRadniStaz;

        ocekivaniRadniStaz = 0;
        assert jovana.radniStaz() == ocekivaniRadniStaz;

        try {
            marko.radniStaz();
        } catch (IllegalArgumentException exception){
            exception.printStackTrace(); //prikazuje gde je greska ali nastavlja testove
            assert exception.getClass() == IllegalArgumentException.class;
        };

        assert marko.getPlata() == 3600;

        assert milos.netoGodisnja()< milos.getPlata();

        System.out.println("Testovi prosli");
    }
}
