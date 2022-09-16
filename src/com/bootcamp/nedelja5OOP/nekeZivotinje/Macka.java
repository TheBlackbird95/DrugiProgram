package com.bootcamp.nedelja5OOP.nekeZivotinje;

public class Macka extends Zivotinje {
    private String omiljenaHrana;

    public String getOmiljenaHrana() {
        return omiljenaHrana;
    }

    public Macka (String ime, String rasa, int brojNogu, String omiljenaHrana){
        super(ime, rasa, brojNogu);
        this.omiljenaHrana = omiljenaHrana;
    }

    @Override
    public void javiSe() {
        System.out.println("mjau");
    }

    @Override
    public String toString(){
        return super.toString() + "Omiljena hrana: " + omiljenaHrana;
    }

    @Override
    public boolean equals(Object object) {
        Macka macaKojaSePoredi = (Macka) object;

        return this.getIme().equals(macaKojaSePoredi.getIme()) &&
                this.getRasa().equals(macaKojaSePoredi.getRasa()) &&
                this.getOmiljenaHrana().equals(macaKojaSePoredi.getOmiljenaHrana());
    }
}
