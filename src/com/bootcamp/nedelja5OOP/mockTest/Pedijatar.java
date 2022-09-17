package com.bootcamp.nedelja5OOP.mockTest;

import java.util.ArrayList;

public class Pedijatar extends Lekar {
    public Pedijatar(int id, String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenata) {
        super(id, ime, prezime, pacijenti, brojPacijenata);
    }

    @Override
    boolean prihvati(Pacijent p) {
        boolean prihvacen = false;
        if (p.getBrojGodina() > 18 && brojPacijenata < 200){
            prihvacen = true;
            getPacijenti().add(p);
            setBrojPacijenata(getBrojPacijenata()+1);
        }
        return prihvacen;
    }

    @Override
    double plata() {
        int novac = getBrojPacijenata() * 300;
        for (Pacijent pacijent : getPacijenti()) {
            if (pacijent.getBrojGodina() < 5) {
                novac += 100;
            }
        }
        return novac;
    }
}
