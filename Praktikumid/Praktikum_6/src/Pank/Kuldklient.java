package Pank;

public class Kuldklient extends Klient {

    private String kliendiHaldur;

    public Kuldklient(int isikukood, double saldo, double aktsiaPortfelliVäärtus, String kliendiHaldur) {
        super(isikukood, saldo, aktsiaPortfelliVäärtus); // Pank.Klient konstruktori käivitamine
        this.kliendiHaldur = kliendiHaldur;
    }

    public String getKliendiHaldur() {
        return kliendiHaldur;
    }

    public void setKliendiHaldur(String kliendiHaldur) {
        this.kliendiHaldur = kliendiHaldur;
    }

    @Override
    public double arvutaTehinguTasud() {
        return 10.0; // alati sama teenustasu sõltumata tehingute arvust
    }

    @Override
    public double arvutaPortfelliHaldustasu() {
        if(getAktsiaPortfelliVäärtus() < 50000) {
            return 0;
        }
        return getAktsiaPortfelliVäärtus() * 0.005;
    }

}