import java.util.ArrayList;
import java.util.List;

public class Klient {

    public int getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(int isikukood) {
        this.isikukood = isikukood;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getAktsiaportfelliVäärtus() {
        return aktsiaPortfelliVäärtus;
    }

    public void setAktsiaportfelliVäärtus(double aktsiaportfelliVäärtus) {
        this.aktsiaPortfelliVäärtus = aktsiaportfelliVäärtus;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Klient(int isikukood, double saldo, double aktsiaPortfelliVäärtus) {
        this.isikukood = isikukood;
        this.saldo = saldo;
        this.aktsiaPortfelliVäärtus = aktsiaPortfelliVäärtus;
    }

    private int isikukood;
    private double saldo;
    private double aktsiaPortfelliVäärtus;

    private List<String> tehingud = new ArrayList<>();


    public void teostaÜlekanne(String kontole, double summa) {
        tehingud.add("ülekanne kontole " + kontole + ", summa " + summa);
        saldo -= summa;
    }

    public double arvutaTehinguTasud() {
        return 0.1 * tehingud.size();
    }

    public double arvutaPortfelliHaldustasu() {
        return getAktsiaPortfelliVäärtus() * 0.005 ;
    }

    public double getAktsiaPortfelliVäärtus() {
        return aktsiaPortfelliVäärtus;
    }

    public String toString() {
        return "klient " + isikukood + ", saldo " + saldo;
    }
}

