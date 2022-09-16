package com.bootcamp.nedelja5OOP.matematika;

public class Kvadrat implements Obim,Povrsina{
    private double a;

    @Override
    public double obim() {
        return 4*a;
    }

    public Kvadrat(double a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a*a;
    }
}
