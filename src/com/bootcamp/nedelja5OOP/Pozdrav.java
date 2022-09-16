package com.bootcamp.nedelja5OOP;

public class Pozdrav {
    public static final String pozdrav = "Zdravo"; // samo jednom se kreira staticka promenljiva
    public String pozdrav2;

    public Pozdrav(String pozdrav2) {
        this.pozdrav2 = pozdrav2;
    }

    public static String getPozdrav() {
        return pozdrav;
    }

    public String getPozdrav2() {
        return pozdrav2;
    }

    public static int duzinaReci(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        Pozdrav cao = new Pozdrav("cao");
        System.out.println(cao.getPozdrav2());
        System.out.println(getPozdrav());
        Pozdrav poz1 = new Pozdrav("cao1");
        Pozdrav poz2 = new Pozdrav("cao2");
        Pozdrav poz3 = new Pozdrav("cao3");
        Pozdrav poz4 = new Pozdrav("cao4");

        int duzina = Pozdrav.duzinaReci(Pozdrav.pozdrav);
        System.out.println(duzina);

    }
}
