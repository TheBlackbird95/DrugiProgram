package com.bootcamp.nedelja5OOP.matematika;

public class PravougliTrougao implements Obim,Povrsina {
    private double a;
    private double b;
    private double c;

    public PravougliTrougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double obim() {
        return a+b+c;
    }

    @Override
    public double povrsina() {
        return a*b/2;
    }
}
