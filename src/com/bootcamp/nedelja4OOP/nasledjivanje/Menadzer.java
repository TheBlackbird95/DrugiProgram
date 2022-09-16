package com.bootcamp.nedelja4OOP.nasledjivanje;

public class Menadzer extends Radnici{
    private int uspesneProdaje;

    //region Setteri
    public void setUspesneProdaje(int uspesneProdaje) {
        this.uspesneProdaje = uspesneProdaje;
    }
    //endregion

    //region Getteri
    public int getUspesneProdaje() {
        return uspesneProdaje;
    }
    //endregion

    Menadzer(String ime, String prezime, int jmbg, double mesecnaPlata, double bonusZarada, int brojDanaGodisnjegOdmora, int uspesneProdaje){
        super(ime, prezime, jmbg, mesecnaPlata, bonusZarada, brojDanaGodisnjegOdmora);;
        this.uspesneProdaje = uspesneProdaje;
    }

    public double racunajBonus() {
        setBonusZarada(getUspesneProdaje()*getMesecnaPlata()*2/100);
        return getBonusZarada();
    }

    public int bonusGodisnjiOdmor() {
        int bonusOdmor = 0;
        while (uspesneProdaje>=10){
            bonusOdmor++;
            uspesneProdaje -= 10;
        }
        setBrojDanaGodisnjegOdmora(getBrojDanaGodisnjegOdmora() + bonusOdmor);
        return bonusOdmor;
    }
    @Override
    public void zdravo() {
        System.out.println("Zdravo ja sam Menadzer");
    }
}
