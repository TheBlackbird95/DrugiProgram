package com.bootcamp.nedelja5OOP.biblioteka;

import java.util.ArrayList;

public class Knjizara{
    private ArrayList<Knjiga> knjige;

    public Knjizara(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }

    public ArrayList<Knjiga> autoroveKnjige (String autor, ArrayList <Knjiga> knjige){
        ArrayList<Knjiga> knjigeAutora = new ArrayList<>();
        for (Knjiga knjiga : knjige) {
            if (autor.equalsIgnoreCase(knjiga.getAutor())) {
                knjigeAutora.add(knjiga);
            }
        }
        return knjigeAutora;
    }

    public ArrayList<Knjiga> bestSeller (ArrayList<Knjiga> knjige){
        ArrayList<Knjiga> najprodavanije = new ArrayList<>();
        for (Knjiga knjiga : knjige){
            int brProdatih;
            if (knjiga.getBrProdatihKopija() == null){
                brProdatih = 0;
            } else brProdatih = knjiga.getBrProdatihKopija();
            if ( brProdatih >= 1000){
                najprodavanije.add(knjiga);
            }
        }
        return najprodavanije;
    }
}
