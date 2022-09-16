package com.bootcamp.nedelja4OOP.nasledjivanje;

public class Fizikalac extends Radnici {
    private int brojRadnihSubota;

    Fizikalac(String ime, String prezime, int jmbg, double mesecnaPlata, double bonusZarada, int brojRadnihSubota, int brojDanaGodisnjegOdmora) {
        super(ime, prezime, jmbg, mesecnaPlata, bonusZarada, brojDanaGodisnjegOdmora);
        this.brojRadnihSubota = brojRadnihSubota;
    }

    //region Setteri
    public void setBrojRadnihSubota(int noviBrojRadnihSubota) {
        this.brojRadnihSubota += noviBrojRadnihSubota;
    }
    //endregion

    //region Getteri
    public int getBrojRadnihSubota() {
        return brojRadnihSubota;
    }
    //endregion

    public double racunajBonus() {
        setBonusZarada(getBrojRadnihSubota()*1*getMesecnaPlata() / 100);
        return getBonusZarada();
    }

    public int bonusGodisnjiOdmor() {
        int bonusOdmor = 0;
        while (brojRadnihSubota>=4){
            bonusOdmor++;
            brojRadnihSubota -= 4;
        }
        setBrojDanaGodisnjegOdmora(getBrojDanaGodisnjegOdmora()+bonusOdmor);
        return bonusOdmor;
    }
    @Override
    public void zdravo() {
        System.out.println("Zdravo ja sam Fizikalac");
    }
}
