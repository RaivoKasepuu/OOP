package Ülesanne_5;

import java.util.ArrayList;
import java.util.List;

public class Raadiosaatja {

        /*
        Looge klass Ülesanne_5.Raadiosaatja, mis suudab raadiosaateid esitada mitmele kuulajale.
        Äsja loodud Raadiosaatja ei tunne ühtegi kuulajat.
        Kuulajate lisamiseks peab olema meetod lisaKuulaja, mis jätab argumendiks antud RaadioKuulaja
        meelde. Meetod edasta peab võtma argumendiks sõnena antud raadiosaate ja edastama selle kõigile lisatud
        kuulajatele (st. pöörduma nende kuula meetodi poole).
         */


    private ArrayList<RaadioKuulaja> raadiokuulajad;

    public Raadiosaatja(ArrayList<RaadioKuulaja> raadiokuulajad) {
        this.raadiokuulajad = raadiokuulajad;
    }

    public Raadiosaatja() {

    }


    public void lisaKuulaja(RaadioKuulaja raadiokuulaja){
        raadiokuulajad.add(raadiokuulaja);
    }

    public void edasta(String raadiosaade){
        for (RaadioKuulaja raadiokuulaja: raadiokuulajad) {
            raadiokuulaja.kuula(raadiosaade);
        }
    }

    public List<RaadioKuulaja> getRaadiokuulajad() {
        return raadiokuulajad;
    }

}
