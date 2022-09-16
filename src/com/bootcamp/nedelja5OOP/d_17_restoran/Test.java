package com.bootcamp.nedelja5OOP.d_17_restoran;

public class Test {
    public static void main(String[] args) {
        Jelo susi = new Jelo("susi", 200,"azijsko");
        Jelo vasabi = new Jelo("vasabi", 100, "azijsko");
        Jelo kobasice = new Jelo("kobasice", 70, "austrijsko");
        Jelo pica = new Jelo("pica", 350,"italijansko");
        Jelo pirinac = new Jelo("pirinac", 80, "azijsko");

        Restoran mojRestoran = new Restoran("Blackbird", Jelo.getMeni(), 200);

        //System.out.println(Jelo.getMeni().toString());

        //System.out.println(mojRestoran.toString());

        System.out.println("Broj stolova pre rezervacije: " + mojRestoran.getBrSlobodnihStolova());
        mojRestoran.rezervisiSto();
        assert mojRestoran.getBrSlobodnihStolova() == 199;
        System.out.println("Broj stolova nakon rezervacije: " + mojRestoran.getBrSlobodnihStolova());

        System.out.println(System.lineSeparator() + "Sva jela azijskog porekla su: ");
        mojRestoran.stampajNaziveJela("azijsko");

        System.out.println(System.lineSeparator() + "Najskuplje jelo je: " + mojRestoran.najskupljeJelo());
    }
}
