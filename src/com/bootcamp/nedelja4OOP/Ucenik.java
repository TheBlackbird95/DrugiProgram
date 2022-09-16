package com.bootcamp.nedelja4OOP;

public class Ucenik {
    private String ime;
    private String prezime;
    private int godine;
    private int[] ocene;

    Ucenik (String ime, String prezime, int godine, int[] ocene){
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.ocene = ocene;
    }
    //region Getteri
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public int getGodine(){
        return godine;
    }
    public int[] getOcene() {
        return ocene;
    }
    //endregion

    //Setter
    public void setOcene(int[] noveOcene){
        this.ocene = noveOcene;
    }

    public static String notifikacija (int[] ocene) {
        String ocena = "Ucenik nema jedinicu";
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 1) {
                ocena  = "Ucenik ima jedinicu";
                break;
            }
        }
        return ocena;
    }

    public static double prosek (int[] ocene){
        double sum = 0;
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 1){
                throw new IllegalArgumentException("Ucenik je nedovoljan, prosek se ne racuna ukoliko ucenik ima zakljucenu jedinicu!");
            }
            if (ocene[i] > 5){
                throw new IllegalArgumentException("Uceniku je upisana veca ocena od 5, sto je nemoguce!");
            }
            sum += ocene[i];
        }
        return sum/ocene.length;
    }

    public static void main(String[] args) {
        Ucenik milos = new Ucenik("Milos", "Kos", 27, new int[]{3,4,5,5,4,5,5});
        System.out.println(prosek(milos.getOcene()));
        milos.setOcene(new int[] {3,2,3,4,1,5});
        System.out.println(notifikacija(milos.getOcene()));
        System.out.println(prosek(milos.getOcene()));
    }
}
