import java.util.ArrayList;
import java.util.Collections;

public class Loosiratas {

    // Siin hoiame külastajate andmeid
    private ArrayList<Külastaja> loosiratas = new ArrayList<>();

    // Siaa sordime loosirattast TOP n andmed
    private ArrayList<Külastaja> aktivistid = new ArrayList<>();

    // Lisame külastaja loosirattasse
    public void lisaKülastaja(Külastaja külastaja) {
        loosiratas.add(külastaja);

    }
    // Leiame kõige aktiivsemad...
    public ArrayList<Külastaja> kõigeAktiivsemad(int n) {
        Collections.sort(loosiratas, Collections.reverseOrder());
        if (n > loosiratas.size()) {
            n = loosiratas.size();
        }
        for (int i = 0; i < n; i++) {
            aktivistid.add(loosiratas.get(i));
        }
        return aktivistid;
    }

    // Loosime aktivistidest või külastajatest õnneliku
    public Külastaja loosiVõitja (ArrayList aktivistid) {
        if (aktivistid.size() < 3) {
            int random = (int) Math.round(Math.random() * loosiratas.size());
            return loosiratas.get(random);
        }
        int random = (int) Math.round(Math.random() * aktivistid.size());
        return (Külastaja) aktivistid.get(random);
    }
}
