package com.bootcamp.nedelja4OOP.nasledjivanje;

public abstract class Radnici { //abstract ne dozvoljava da se definise objekat, radnici su menadzer i fizikalac, ne definisu se ovde
    private String ime;
    private String prezime;
    private int jmbg;
    private double mesecnaPlata;
    private double bonusZarada;
    private int brojDanaGodisnjegOdmora;

    //region Getteri
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getJmbg() {
        return jmbg;
    }

    public double getMesecnaPlata() {
        return mesecnaPlata;
    }

    public double getBonusZarada() {
        return bonusZarada;
    }

    public int getBrojDanaGodisnjegOdmora() {
        return brojDanaGodisnjegOdmora;
    }
    //endregion

    //region Setteri
    public void setMesecnaPlata(double mesecnaPlata) {
        this.mesecnaPlata = mesecnaPlata;
    }

    public void setBonusZarada(double bonusZarada) {
        this.bonusZarada = bonusZarada;
    }

    public void setBrojDanaGodisnjegOdmora(int brojDanaGodisnjegOdmora) {
        this.brojDanaGodisnjegOdmora = brojDanaGodisnjegOdmora;
    }
    //endregion

    public Radnici(String ime, String prezime, int jmbg, double mesecnaPlata, double bonusZarada, int brojDanaGodisnjegOdmora) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.mesecnaPlata = mesecnaPlata;
        this.bonusZarada = bonusZarada;
        this.brojDanaGodisnjegOdmora = brojDanaGodisnjegOdmora;
    }
    public abstract void zdravo();
    public String ispis() {
        return String.format("Ime: %s, Prezime: %s, JMBG: %d, Plata: %.2f", getIme(), getPrezime(), getJmbg(), getMesecnaPlata());
    }
}
