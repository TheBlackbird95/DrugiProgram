package com.bootcamp.nedelja5OOP.nekeZivotinje;

public class TestZivotinje {
    public static void main(String[] args) {
        Macka macka1 = new Macka("Flekica", "maca", 4,"Viskas");
        Macka macka2 = new Macka("Flekica", "maca", 4, "Viskas");

        System.out.println(macka1.equals(macka2));
        Zivotinje zivuljka = new Zivotinje("dzeki", "pas", 4);
    }
}
