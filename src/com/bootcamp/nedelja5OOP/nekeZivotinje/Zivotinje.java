package com.bootcamp.nedelja5OOP.nekeZivotinje;

public class Zivotinje {
    private String ime;
    private String rasa;
    protected int brojNogu;

    public Zivotinje(String ime, String rasa, int brojNogu) {
        this.ime = ime;
        this.rasa = rasa;
        this.brojNogu = brojNogu;
    }

    public String getIme() {
        return ime;
    }

    public String getRasa() {
        return rasa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Zivotinje" +
                "ime: " + ime + '\'' +
                ", rasa: " + rasa;
    }

    public void javiSe(){
        System.out.println("fijufiju");
    }
}
