public class Isik {

    /*
Ülesanne 3 (kontroll)
Täiendage nüüd klassi Isik nii, et seal oleks vähemasti neli isendivälja (nimi, pikkus, isikukood ja näiteks mass).
Klassis peab olema konstruktor, mis väljad väärtustab. Isendiväljadele peavad olema vastavad get- ja set-meetodid
(isikukood seatakse konstruktoris ja hiljem seda muuta ei saa, pikkuse ja massi muutmisel tuleb kontrollida, kas uued
andmed üldse sobivad). Samuti klassis on meetod toString ning lisaks veel mõned meetodid (nt. kehamassiindeksi või
suusa pikkuse arvutamiseks). Vähemasti üks meetod peaks vajama ka argumente. (Argumentideks peaksid olema lisaandmed,
mitte isendiväljad.) Katsetage loodud meetodeid testklassis.

     */

    private String nimi;
    private double pikkus;
    private double kehakaal;
    private String sugu;

    public Isik(String isikuNimi, double isikuPikkus, double isikuKehakaal, String isikuSugu) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
        kehakaal = isikuKehakaal;
        sugu = isikuSugu;

    }

    public Isik(String nimetu, double v) {
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus;
    }

    public double getKehakaal() {
        return kehakaal;
    }

    public void setKehakaal(double kehakaal) {
        this.kehakaal = kehakaal;
    }

    public String getSugu() {
        return sugu;
    }

    public void setSugu(String sugu) {
        this.sugu = sugu;
    }

    public Isik() {
        this("Nimetu", 0.0);
    }



}
