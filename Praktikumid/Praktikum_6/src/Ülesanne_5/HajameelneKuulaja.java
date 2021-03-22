package Ülesanne_5;

import java.util.ArrayList;

public class HajameelneKuulaja extends RaadioKuulaja {


    /*
    Looge Ülesanne_5.RaadioKuulaja alamklass Ülesanne_5.HajameelneKuulaja, mis jätab kuuldud saateid meelde üle ühe
    (esimene saade jääb meelde, teine ei jää, kolmas jälle jääb jne.)
     */


    public HajameelneKuulaja(String raadioKuulaja) {
        super(raadioKuulaja);
    }

    public HajameelneKuulaja() {
        super();

    }

    @Override
    public void kuula(String raadiosaade) {
        super.kuula(raadiosaade);
    }


    @Override
    public ArrayList<String> meenuta() {
        ArrayList<String> hajameelsedRaadiokuulajadList = new ArrayList<>();

        for (int i = 0; i < super.getRaadioSaated().size(); i += 2) {
            hajameelsedRaadiokuulajadList.add(getRaadioSaated().toString());
        }
        return hajameelsedRaadiokuulajadList;

    }
}
