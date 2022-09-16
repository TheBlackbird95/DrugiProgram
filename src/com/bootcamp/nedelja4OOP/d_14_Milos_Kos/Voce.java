package com.bootcamp.nedelja4OOP.d_14_Milos_Kos;

public abstract class Voce {
        private String ime;
        private String boja;
        private double cenaZaKilogram;
        private String sezona;

    //region Getteri
    public String getIme() {
        return ime;
    }

    public String getSezona() {
        return sezona;
    }

    public double getCenaZaKilogram() {
        return cenaZaKilogram;
    }

    public String getBoja() {
        return boja;
    }
    //endregion

    //region Setteri
    public void setSezona(String sezona) {
        this.sezona = sezona;
    }
    public void setCenaZaKilogram(double cenaZaKilogram) {
        this.cenaZaKilogram = cenaZaKilogram;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
    //endregion

    public Voce (String ime, String sezona, double cenaZaKilogram, String boja){
        this.ime = ime;
        this.sezona = sezona;
        this.cenaZaKilogram = cenaZaKilogram;
        this.boja = boja;
    }

    public boolean jeSezona (String sezona){
        boolean sezVoca = false;
        if (sezona.equalsIgnoreCase(getSezona())){
            sezVoca = true;
        }
        return sezVoca;
    }

    public double sumaVoca(double pare) {
        return pare/getCenaZaKilogram();
    }
}
