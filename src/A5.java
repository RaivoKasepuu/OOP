import java.util.ArrayList;
import java.util.Arrays;

public class A5 {

    /*
Ülesanne A5 (kontroll) --> P5 (kontroll)
Veepargi erinevatele atraktsioonidele lastakse lapsi vastavalt kasvule. Kõige väiksemad (60-100 cm) lapsed saavad minna
väikelaste atraktsioonidele. Keskmised lapsed (101-140 cm) saavad minna lasteatraktsioonidele. Suuremad lapsed
(141-200 cm) saavad minna täiskasvanute atraktsioonidele.

Koostage meetod, mille argumentideks oleksid pikkuse alumine ja ülemine piir ja mis tagastaks juhuslikult genereeritud
täisarvu antud vahemikust. Kasutage juhuarvu genereerimisel ja ümardamisel klassi Math vastavaid meetodeid. (Tegelikult
on olemas ka klass Random, aga ärgem seda veel puutugem, kuna seal pole staatilisi meetodeid.)

Koostage meetod, mille argumentideks oleksid laste arv, pikkuste alumine ja ülemine piir. Looge meetodis massiiviloome
abil täisarvude massiiv, mis sisaldab laste pikkusi, mis on juhuslikult genereeritud kasutades eelmist meetodit. Meetodi
tagastustüüp peaks olema int[].

Viimast meetodit peameetodis rakendades luua 10-liikmeline massiiv väiksemate laste jaoks, 15-liikmeline massiiv
keskmiste laste jaoks ja 20-liikmeline massiiv suuremate laste jaoks.

Väljastage peameetodis eraldi tsüklite abil ekraanile iga massiivi kõik elemendid. Seejärel väljastada tsükli ja
valikulause (if) abil ainult need esimese massiivi elemendid, mille väärtus on üle 80. Katsetage mõlemat for-tsükli
versiooni.

Koostage meetod, mis leiab laste pikkuste harmoonilise keskmise. Formaalseks parameetriks on siis täisarvude massiiv.
Rakendage seda meetodit. (Harmooniline keskmine on aritmeetilisest ja geomeetrilisest keskmisest vähem tuntud, aga
mitmetel juhtudel siiski väga kasulik (näiteks keskmise kiiruse arvutamisel, kui võrdne teepikkus läbitakse erinevate
ühtlaste kiirustega). Käesolevas pikkuste näites on see küll pigem kunstlik.)

Paberile/dokumenti kirjutada harmoonilise keskmise definitsioon ja koht, kust te selle leidsite (kui te seda peast ei
teadnud).

Kui olete juba hulk aega proovinud ülesannet iseseisvalt lahendada ja see ikka ei õnnestu, siis võib-olla saate abi
murelahendajalt. Püütud on tüüpilisemaid probleemseid kohti selgitada ja anda vihjeid.

     */

    public static void main(String[] args) {
        System.out.println("Ülesanne A5");
        int[] väikesed = massiiviGeneraator(10, 60, 100);
        int[] keskmised = massiiviGeneraator(15, 101, 140);
        int[] suured = massiiviGeneraator(20, 141, 200);

        System.out.println(Arrays.toString(väikesed));
        System.out.println(Arrays.toString(keskmised));
        System.out.println(Arrays.toString(suured));

        System.out.println("----------------------------------------------------");

        System.out.println("Väikesed lapsed:");
        for (int i = 0; i < väikesed.length; i++) {
            System.out.println(väikesed[i]);
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Keskmised lapsed:");
        for (int i = 0; i < keskmised.length; i++) {
            System.out.println(keskmised[i]);
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Suured lapsed:");
        for (int i = 0; i < suured.length; i++) {
            System.out.println(suured[i]);
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Väikesed lapsed pikkusega üle 80:");
        for (int i = 0; i < väikesed.length; i++) {
            if (väikesed[i] > 80) {
                System.out.println(väikesed[i]);
            }
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Harmooniline keskmine, väikesed: " + harmoonilineKeskmine(väikesed));
        System.out.println("Harmooniline keskmine, keskmised: " + harmoonilineKeskmine(keskmised));
        System.out.println("Harmooniline keskmine, suured: " + harmoonilineKeskmine(suured));

        System.out.println("----------------------------------------------------");

        System.out.println("Harmooniline keskmise definitsioon: https://et.wikipedia.org/wiki/Harmooniline_keskmine");

    }

    /*
Koostage meetod, mille argumentideks oleksid pikkuse alumine ja ülemine piir ja mis tagastaks juhuslikult genereeritud
täisarvu antud vahemikust. Kasutage juhuarvu genereerimisel ja ümardamisel klassi Math vastavaid meetodeid. (Tegelikult
on olemas ka klass Random, aga ärgem seda veel puutugem, kuna seal pole staatilisi meetodeid.)
     */
    public static int generaator(int aluminePiir, int üleminePiir) {
        return (int) Math.round(aluminePiir + Math.random() * (üleminePiir - aluminePiir));
    }

    /*
Koostage meetod, mille argumentideks oleksid laste arv, pikkuste alumine ja ülemine piir. Looge meetodis massiiviloome
abil täisarvude massiiv, mis sisaldab laste pikkusi, mis on juhuslikult genereeritud kasutades eelmist meetodit. Meetodi
tagastustüüp peaks olema int[].
     */
    public static int[] massiiviGeneraator(int lasteArv, int aluminePiir, int üleminePiir) {
        int[] result = new int[lasteArv];
        for (int i = 0; i < lasteArv; i++) {
            result[i] = (generaator(aluminePiir, üleminePiir));
        }
        return result;
    }

    /*
    Viimast meetodit peameetodis rakendades luua 10-liikmeline massiiv väiksemate laste jaoks, 15-liikmeline massiiv
keskmiste laste jaoks ja 20-liikmeline massiiv suuremate laste jaoks.
     */

    public static double harmoonilineKeskmine(int[] sisend) {
        double summa = 0;
        double jagatis;
        for (int i = 0; i < sisend.length; i++) {

            summa += 1 / (double) sisend[i];

        }
        return sisend.length / summa;
    }
}

