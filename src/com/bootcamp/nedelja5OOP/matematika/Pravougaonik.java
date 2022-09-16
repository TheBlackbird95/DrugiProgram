package com.bootcamp.nedelja5OOP.matematika;

public class Pravougaonik implements Obim, Povrsina {
    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obim() {
        return (2*a + 2*b);
    }

    @Override
    public double povrsina() {
        return a*b;
    }
}
