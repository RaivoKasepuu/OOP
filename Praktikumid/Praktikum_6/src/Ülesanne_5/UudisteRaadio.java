package Ülesanne_5;

import java.util.ArrayList;
import java.util.List;

public class UudisteRaadio extends Raadiosaatja{

    /*
    Looge Raadiosaatjale alamklass Ülesanne_5.UudisteRaadio, millel on meetod signatuuriga
    void uuendaAktuaalsedUudised(List<String> uudised) aktuaalsete uudiste määramiseks.
    Uudiste edastamiseks peab olema klassis parameetriteta meetod
    edastaUudised (edastab järjest kõik aktuaalsed uudised eraldi raadiosaadetena).

     */

    private ArrayList<String> aktuaalsedUudised = new ArrayList<>();

    public UudisteRaadio(ArrayList<RaadioKuulaja> raadiokuulajad, ArrayList<String> aktuaalsedUudised) {
        super(raadiokuulajad);
        this.aktuaalsedUudised = aktuaalsedUudised;
    }

    void uuendaAktuaalsedUudised (ArrayList<String> uudised){
        aktuaalsedUudised.add(uudised.toString());
    }

    void edastaUudised(){
        for (String uudis:aktuaalsedUudised) {
            super.edasta(uudis);
        }
    }

}
