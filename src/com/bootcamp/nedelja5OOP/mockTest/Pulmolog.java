package com.bootcamp.nedelja5OOP.mockTest;

import java.util.ArrayList;

public class Pulmolog extends Lekar{
    public Pulmolog(int id, String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenata) {
        super(id, ime, prezime, pacijenti, brojPacijenata);
    }

    @Override
    boolean prihvati(Pacijent p) {
        boolean prihvacen = false;
        if (brojPacijenata < 100){
            prihvacen = true;
            getPacijenti().add(p);
            setBrojPacijenata(getBrojPacijenata()+1);
        }
        return prihvacen;
    }

    @Override
    double plata() {
        return brojPacijenata * 350;
    }
}
