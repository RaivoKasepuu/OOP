package Ülesanne_5;

import java.util.ArrayList;

public class ValiRaadiosaatja extends Raadiosaatja{

    /*
    Looge Raadiosaatja alamklass ValiRaadiosaatja, mille edasta meetod edastab saated suurte tähtedega (KARJUB!).
     */
    public ValiRaadiosaatja(ArrayList<RaadioKuulaja> raadiokuulajad) {
        super(raadiokuulajad);
    }

    @Override
    public void edasta(String raadiosaade){
        for (RaadioKuulaja raadiokuulaja: super.getRaadiokuulajad()) {
            raadiokuulaja.kuula(raadiosaade.toUpperCase());
        }
    }

}
