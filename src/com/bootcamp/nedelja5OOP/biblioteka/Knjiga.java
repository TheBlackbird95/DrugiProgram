package com.bootcamp.nedelja5OOP.biblioteka;

import java.util.ArrayList;

public class Knjiga implements Comparable{
    private String naslov;
    private String zanr;
    private int godinaIzdavanja;
    private String autor;
    private Integer brProdatihKopija;

    private static ArrayList<Knjiga> sveKnjige = new ArrayList<>();

    public Knjiga (String naslov, String zanr, int godinaIzdavanja, String autor, Integer brProdatihKopija){
        this.naslov = naslov;
        this.zanr = zanr;
        this.godinaIzdavanja = godinaIzdavanja;
        this.autor = autor;
        this.brProdatihKopija = brProdatihKopija;
        sveKnjige.add(this);
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Naslov knjige: " + naslov + ", zanr: " + zanr + ", godinaIzdavanja: " + godinaIzdavanja + ", autor: " + autor + ", brProdatihKopija: " + brProdatihKopija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Knjiga)) return false;

        Knjiga knjiga = (Knjiga) o;

        if (getGodinaIzdavanja() != knjiga.getGodinaIzdavanja()) return false;
        if (getBrProdatihKopija() != knjiga.getBrProdatihKopija()) return false;
        if (!getNaslov().equals(knjiga.getNaslov())) return false;
        if (!getZanr().equals(knjiga.getZanr())) return false;
        return getAutor().equals(knjiga.getAutor());
    }

    public void setBrProdatihKopija(int brProdatihKopija) {
        this.brProdatihKopija = brProdatihKopija;
    }

    //region Getteri

    public static ArrayList<Knjiga> getSveKnjige() {
        return sveKnjige;
    }
    public String getNaslov() {
        return naslov;
    }

    public String getZanr() {
        return zanr;
    }

    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getBrProdatihKopija() {
        return brProdatihKopija;
    }

    @Override
    public int compareTo(Object o) {
        Knjiga knjigaKojaSePoredi = (Knjiga) o;
        return this.getBrProdatihKopija() - knjigaKojaSePoredi.getBrProdatihKopija();
    }
    //endregion
}
