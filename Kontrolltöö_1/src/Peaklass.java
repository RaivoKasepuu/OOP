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

        System.out.println();
        System.out.println(" Raivo Kasepuu, B710710 konmtreolltöö nr.1 ");
        System.out.println();

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
        // Sorteeritakse joogid vastavalt liitrihinnale
        Collections.sort(joogid);

        // Trükime joogid letile peale sorteerimist
        System.out.println("Joogid peale sorteerimist liitrihinna järgi: ");
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
            // segame joogid
            Collections.shuffle(joogid);

            // juhusliku jookide arvu genereerimine tellimusse
            int jooke = (int) (1 + (Math.random() * 4);
            System.out.println("jooke" + jooke);

            for (int j = 0; j < jooke; j++) {
                tellimused[i].telliJook(joogid.get(j));
            }
        }
        System.out.println();
        // Tellimuste info ja iga tellimuse jookide nimekiri väljastatakse ekraanile.

        for (int i = 0; i < tellimused.length; i++) {
            System.out.println("Tellimus nr." + (i + 1));
            tellimus.tellimuseJookideArv();
            tellimus.tellimuseJoogid();
            System.out.println("_________________________________________");
            System.out.println("Tellimuse maksumus: " + tellimused[i].tellimuseMaksumus()) ;
            System.out.println();


        }
    }
}
