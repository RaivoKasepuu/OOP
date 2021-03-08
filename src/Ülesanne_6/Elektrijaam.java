package Ülesanne_6;

public class Elektrijaam {

    /*
Ülesanne 6 (kontroll)
Klassis Elektrijaam on double tüüpi isendiväli elektrihind, mis väärtustatakse konstruktoris.
Hinnal on ka vastavad get- ja set-meetodid.

Klassis Ülesanne_6.TestKlass.Elektriauto on privaatsed isendiväljad automargi (String) jaoks, elektrikulu (double) 100 km-ile jaoks (kWh/100km),
laadimisaja minutites (int) jaoks, sõiduulatuse (mis näitab, mitu kilomeetrit on võimalik sõita ühe laadimisega)
(int) jaoks ja elektrijaama (Elektrijaam) jaoks. Klassis on konstruktor, mis väärtustab kõik väljad.
On ka vähemalt järgmised meetodid:

Laadimisaja ja elektrijaama jaoks on vastavad get- ja set-meetodid.
set-meetodis on laadimisaja jaoks andmete sobivuse kontroll.
Ilma argumentideta isendimeetod (double-tüüpi) maksumus100, mis näitab sajakilomeetrilise reisi maksumust (elektrikulu
korda elektri hind).
Isendimeetod (double-tüüpi) maksumus, mis saab argumendina täisarvu (teepikkus kilomeetrites) ja näitab reisi maksumust
antud autoga (teepikkus korda sajakilomeetrilise reisi maksumus ja jagatud sajaga). (Kasutada vastavat meetodit).
double-tüüpi isendimeetod reisiKestus, millel on 2 argumenti: teepikkus kilomeetrites (int-tüüpi) ja keskmine kiirus
km/h (double-tüüpi). Meetod reisiKestus tagastab reisiks kulutatud aja ((teepikkus/sõiduulatus)*laadimisaeg tundides +
teepikkus/kiirus).
On ka meetod toString, mis võimaldab auto infot mõistikult ekraanil kujutada, tuues välja ka 100-kilomeetrilise reisi
maksumuse. (Kasutada vastavat meetodit).
Lisaks koostage testklass (peaklass). Testklassis luuakse elektrijaama isend, kus elektrihinnaks määratakse 0,15
(eur/kWh) ja erinevad autod. Testklassis testitakse ka erinevate isendimeetodite tööd. Testimisel väljastada alati ka
kommentaar tekstina, et mida parasjagu väljastatakse. Väljund peab olema viisakas ja loetav.

Andmed testimiseks leiate nt. lehelt http://www.elektriauto.ee/.

     */

    double elektrihind;

    public Elektrijaam(double elektrihind) {
        this.elektrihind = elektrihind;
    }

    public double getElektrihind() {
        return elektrihind;
    }

    public void setElektrihind(double elektrihind) {
        this.elektrihind = elektrihind;
    }


}
