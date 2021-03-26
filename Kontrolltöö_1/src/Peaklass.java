import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Peaklass {


    public static List<Jook> loeJoogid(String failinimi) throws Exception {
        List<Jook> list1 = new ArrayList<>();
        try (java.util.Scanner sc = new java.util.Scanner(Path.of(failinimi), "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(",");
                if (tükid.length == 4) {
                    list1.add(new Pudelijook(tükid[0], Double.parseDouble(tükid[1]), Integer.parseInt(tükid[2]),Integer.parseInt(tükid[3])));
                } else {
                    list1.add(new Vaadijook(tükid[0], Double.parseDouble(tükid[1]), Integer.parseInt(tükid[2])));
                }
            }
        }
        return list1;
    }


    public static void main(String[] args) throws Exception {


        // Rakendatakse vastavat staatilist meetodit, et lugeda failist jookide andmed
        List<Jook> joogid = loeJoogid("joogid.txt");

        System.out.println("Jookide info ekraanile:");
        // Trükime joogid letile enne sorteerimist

        System.out.println("Joogid enne sorteerimist: ");
        for (int i = 0; i <joogid.size(); i++){
            System.out.println(joogid.get(i));
        }
        System.out.println();

        System.out.println("Sorteerin jooke....");
        // Sorteeritakse joogid vastavalt meetodis compareTo kirjeldatud järjekorrale
        Collections.sort(joogid);

        // Trükime joogid letile peale sorteerimist
        System.out.println("Joogid peale sorteerimist: ");
        for (int i = 0; i <joogid.size(); i++){
            System.out.println(joogid.get(i));
        }
        System.out.println();


        // Luuakse 5 tellimust

        Tellimus tellimus = new Tellimus();
        Tellimus tellimus2 = new Tellimus();
        Tellimus tellimus3 = new Tellimus();
        Tellimus tellimus4 = new Tellimus();
        Tellimus tellimus5 = new Tellimus();

        // Kõikidest Tellimustest tehakse Tellimus [] tüüpi massiiv
        Tellimus[] tellimused = {tellimus, tellimus2, tellimus3, tellimus4, tellimus5};



        // Iga tellimuse jaoks valitakse juhuslikult 1-4 jooki. Selleks tuleb kasutada Collections.shuffle meetodit.
        // Antud meetod võtab argumendiks
        //listi ning järjestab selle suvalises järjekorras. Jookide list järjestada iga tellimuse jaoks uuesti
        //ümber, jookide arv n genereerida juhuslikult lõigust [1, 4] (täisarvuna) ning lisada tellimusse n
        //esimest jooki.

        for (int i = 0; i < tellimused.length; i++) {
            System.out.println("Tellimus " + i);
            // segame joogid
            Collections.shuffle(joogid);

            // juhusliku jookide arvu genereerimine
            int jooke = (int) Math.round(Math.random() * 4 + 1);
            System.out.println("jooke tellimuses: " + jooke);

            for (int j = 0; j < jooke; j++) {
                tellimused[i].telliJook(joogid.get(j));
                System.out.println("lisasin tellimusele: " + joogid.get(j));
            }
        }
        System.out.println();
        // Tellimuste info ja iga tellimuse jookide nimekiri väljastatakse ekraanile.

        for (int i = 0; i < tellimused.length; i++) {
            System.out.println(tellimused[i].toString());
        }

/*
        // Luuakse 4 klienti rahasummaga 100 (nimed mõtelge ise välja)
        Klient klient1 = new Klient("Kairit", 260);
        Klient klient2 = new Klient("Meelis", 60);
        Klient klient3 = new Klient("Margus", 300);
        Klient klient4 = new Klient("Angeelika", 500);


        // Kõikidest klientidest tehakse Klient[]-tüüpi massiiv. (Massiivi võib ka enne klientide tegemist luua ja järjest täita.)
        List<Klient> kliendid = new ArrayList<>();
        kliendid.addAll(Arrays.asList(klient1, klient2, klient3, klient4));

        // Luuakse 2 kullerit (nimed mõtelge ise välja)
        Kuller kuller1 = new Kuller("Artjom");
        Kuller kuller2 = new Kuller("Andrei");

        // Luuakse 4 tellimust (2 ühe kulleriga ja 2 teise kulleriga)
        Tellimus tellimus1 = new Tellimus(kuller1);
        Tellimus tellimus2 = new Tellimus(kuller2);

        // Kõikidest tellimustest tehakse Tellimus[]-tüüpi massiiv. (Massiivi võib ka enne tellimuste tegemist luua ja järjest täita.)
        List<Tellimus> tellimused = new ArrayList<>();
        tellimused.addAll(Arrays.asList(tellimus1, tellimus2));

        // Iga tellimuse jaoks valitakse juhuslikult 3 toitu (võib eeldada, et failis on vähemalt 3 toitu).
        // Selleks tuleb kasutada Collections.shuffle meetodit. Antud meetod võtab argumendiks listi ning järjestab selle suvalises
        // järjekorras. Toitude list järjestada iga tellimuse jaoks uuesti ümber ning lisada tellimusse 3 esimest toitu.
        for (Tellimus i : tellimused) {
            Collections.shuffle(toidud);
            for (int j = 0; j < 3; j++) {
                i.lisaToit(toidud.get(j));
            }
        }

        // Tellimuste info väljastatakse ekraanile
        for (Tellimus i: tellimused) {
            System.out.println(i.toString());
        }

        // Kliendid maksavad tellimuste eest ja hindavad kullereid (üks klient maksab ühe tellimuse eest ja hindab selle tellimuse toonud kullerit)
        klient1.maksa(tellimus1);
        klient1.hinda(tellimus1);

        klient2.maksa(tellimus2);
        klient2.hinda(tellimus2);

        // Klientide info väljastatakse ekraanile
        for (Klient i: kliendid) {
            System.out.println(i.toString());
        }

        // Kullerite info väljastatakse ekraanile
        System.out.println(kuller1.toString());
        System.out.println(kuller2.toString());
*/

    }

}
