package Ülesanne_5;

import java.util.ArrayList;

public class LotoNumbriTeataja extends Raadiosaatja {

    /*
    Looge Ülesanne_5.Raadiosaatja-le alamklass Ülesanne_5.LotoNumbriTeataja. Lisage parameetriteta meetod loosiJaEdasta, mis genereerib loto
    võidunumbrid (10 suvalist arvu vahemikus 1..100) ja teavitab nendest saatja külge lisatud raadiokuulajaid.
    Saatke kõik numbrid ühe raadiosaatena (ühendage võidunumbrid tühikutega).
     */

    public LotoNumbriTeataja(ArrayList<RaadioKuulaja> raadiokuulajad) {
        super(raadiokuulajad);
    }

    public void loosiJaEdasta(){
        StringBuilder lotonumbrid = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int võidunumber = (int)Math.round(Math.random() * 100);
            lotonumbrid.append(võidunumber + " ");
        }
        super.edasta(lotonumbrid.toString());
    }

}
