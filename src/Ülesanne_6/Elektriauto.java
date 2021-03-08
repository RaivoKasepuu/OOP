package Ülesanne_6;

public class Elektriauto {


        /*
        Klassis Ülesanne_6.TestKlass.Elektriauto on privaatsed isendiväljad automargi (String) jaoks, elektrikulu (double) 100 km-ile jaoks (kWh/100km),
    laadimisaja minutites (int) jaoks, sõiduulatuse (mis näitab, mitu kilomeetrit on võimalik sõita ühe laadimisega)
    (int) jaoks ja elektrijaama (Elektrijaam) jaoks. Klassis on konstruktor, mis väärtustab kõik väljad.
    On ka vähemalt järgmised meetodid:

    Laadimisaja ja elektrijaama jaoks on vastavad get- ja set-meetodid.
    set-meetodis on laadimisaja jaoks andmete sobivuse kontroll.

         */

    private String automark;
    private double elektrikulu;
    private int laadimisaeg;
    private int sõiduUlatus;


    Elektriauto(String automark, double elektrikulu, int laadimisaeg, int sõiduUlatus) {
        this.automark = automark;
        this.elektrikulu = elektrikulu;
        this.laadimisaeg = laadimisaeg;
        this.sõiduUlatus = sõiduUlatus;
    }

    public String getAutomark() {
        return automark;
    }

    public void setAutomark(String automark) {
        this.automark = automark;
    }

    public double getElektrikulu() {
        return elektrikulu;
    }

    public void setElektrikulu(double elektrikulu) {
        this.elektrikulu = elektrikulu;
    }

    public int getLaadimisaeg() {
        return laadimisaeg;
    }

    public void setLaadimisaeg(int laadimisaeg) {
        this.laadimisaeg = laadimisaeg;
    }

    public int getSõiduulatus() {
        return sõiduUlatus;
    }

    public void setSõiduulatus(int sõiduulatus) {
        this.sõiduUlatus = sõiduulatus;
    }

    /*
    Isendimeetod (double-tüüpi) maksumus, mis saab argumendina täisarvu (teepikkus kilomeetrites) ja näitab reisi maksumust
antud autoga (teepikkus korda sajakilomeetrilise reisi maksumus ja jagatud sajaga). (Kasutada vastavat meetodit).

*/
    private double maksumus(int teepikkus) {
        return 1.0;
    }

        /*
    double-tüüpi isendimeetod reisiKestus, millel on 2 argumenti: teepikkus kilomeetrites (int-tüüpi) ja keskmine kiirus
    km/h (double-tüüpi). Meetod reisiKestus tagastab reisiks kulutatud aja ((teepikkus/sõiduulatus)*laadimisaeg tundides +
    teepikkus/kiirus).
    */

    private double reisiKestvus(int teepikkus, double keskmineKiirus) {
        return teepikkus / keskmineKiirus;
    }


        /*
    On ka meetod toString, mis võimaldab auto infot mõistikult ekraanil kujutada, tuues välja ka 100-kilomeetrilise reisi
    maksumuse. (Kasutada vastavat meetodit).
         */

        /*
        Ilma argumentideta isendimeetod (double-tüüpi) maksumus100, mis näitab sajakilomeetrilise reisi maksumust (elektrikulu
    korda elektri hind).
         */

    private double maksumus100() {
        return elektrikulu;
    }


}
