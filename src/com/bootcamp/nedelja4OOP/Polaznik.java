package com.bootcamp.nedelja4OOP;

public class Polaznik {
    int jmbg;
    int godine;
    String ime;
    String prezime;


    Polaznik(int jmbg /* int noviJmbg */, int godine, String ime, String prezime) {
        this.jmbg=jmbg; /* jmbg = noviJmbg */
        this.godine=godine;
        this.ime=ime;
        this.prezime=prezime;
    }

    public static void main(String[] args) {
        Polaznik milos = new Polaznik(280895, 27, "Milos", "Kos");
        System.out.println(milos.jmbg);
        System.out.println(milos.jePunoletan());

        Polaznik jovana = new Polaznik(190598, 24, "Jovana", "Babic");
        System.out.println(jovana.godine);

        Polaznik[] polaznici = new Polaznik[2];
        polaznici[0] = milos;
        polaznici[1] = jovana;

        double prosek = 0;
        for (int i = 0; i < polaznici.length; i++) {
            prosek+= polaznici[i].godine;
        }
        prosek = prosek/ polaznici.length;
        System.out.println("Prosek godina polaznika je " + prosek);
        System.out.println(prosekGodina(polaznici));

        milos.izmeniGodine();
        System.out.println(milos.godine);
    }

    static double prosekGodina(Polaznik[] listaPolaznika) {
        double prosek = 0;
        for (int i = 0; i < listaPolaznika.length; i++) {
            prosek+= listaPolaznika[i].godine;
        }
        prosek = prosek/ listaPolaznika.length;
        return prosek;
    }

    public boolean jePunoletan() {
        return godine >= 18;
    }

    void izmeniGodine () {
        godine = godine+1;
    }
}
