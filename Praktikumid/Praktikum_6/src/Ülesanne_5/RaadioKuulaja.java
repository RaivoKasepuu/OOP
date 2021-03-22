package Ülesanne_5;

import java.util.ArrayList;
import java.util.List;

public class RaadioKuulaja {

    /*
    Looge klass Ülesanne_5.RaadioKuulaja. Lisage meetod kuula, mis võtab parameetriks sõne kujul raadiosaate ja jätab selle meelde.
    Klassis peab olema ka meetod meenuta, mis tagastab kõik kuuldud saated sõnede listina.

     */
private ArrayList<String> raadioSaated = new ArrayList<>();
private String raadioKuulaja;

    public RaadioKuulaja(String raadioKuulaja) {
        this.raadioKuulaja = raadioKuulaja;
    }

    public RaadioKuulaja() {

    }

    @Override
    public String toString() {
        return "RaadioKuulaja{ " + raadioKuulaja + " raadioSaated=" + raadioSaated +" }";
    }

    public ArrayList<String> getRaadioSaated() {
        return raadioSaated;
    }

    public String getRaadioKuulaja() {
        return raadioKuulaja;
    }

    public void kuula (String raadioSaade) {
        raadioSaated.add(raadioSaade);

    }

    public List<String> meenuta () {
        return raadioSaated;
    }


}
