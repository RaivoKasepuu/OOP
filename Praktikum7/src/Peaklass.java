import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Peaklass {

    public static void main(String[] args) throws IOException {


        System.out.println("Tere");
        Toit toit = new Toit("Pizza", 8.50);
        KampaaniaToit kampaaniaToit = new KampaaniaToit("Extra Pizza", 8.50, 20);

        Toit toit2 = new Toit("Pizza", 3.50);
        KampaaniaToit kampaaniaToit2 = new KampaaniaToit("Extra Pizza", 5.50, 20);

        Toit toit3 = new Toit("Pizza", 4.50);
        KampaaniaToit kampaaniaToit3 = new KampaaniaToit("Extra Pizza", 4.50, 20);


        System.out.println(toit);
        System.out.println(kampaaniaToit);

        Kuller kuller = new Kuller("Volli");
        Kuller kuller1 = new Kuller("Malle");

        Tellimus tellimus = new Tellimus(kuller);
        Tellimus tellimus1 = new Tellimus(kuller1);
        Tellimus tellimus2 = new Tellimus(kuller);
        Tellimus tellimus3 = new Tellimus(kuller1);

        Tellimus[] tellimused = {tellimus, tellimus1, tellimus2, tellimus3};

        tellimus.lisaToit(toit);
        tellimus.lisaToit(kampaaniaToit);
        System.out.println("Tellimuse maksumus " + tellimus.summa());

        //System.out.println(tellimus);

        Klient klient = new Klient("boss", 200);

        Klient klient2 = new Klient("1boss", 100);
        Klient klient3 = new Klient("2boss", 100);
        Klient klient4 = new Klient("3boss", 100);

        Klient[] kliendid = {klient, klient2, klient3, klient4};

        //System.out.println(klient);

        List<Toit> toidud = new ArrayList<>();

        toidud.add(toit);
        toidud.add(toit2);
        toidud.add(toit3);
        toidud.add(kampaaniaToit);
        toidud.add(kampaaniaToit2);
        toidud.add(kampaaniaToit3);

        System.out.println(toidud);
        Collections.sort(toidud);
        System.out.println(toidud);

        for (int i = 0; i < tellimused.length; i++) {
            Collections.shuffle(toidud);

            for (int j = 0; j < 3; j++) {
                tellimused[i].lisaToit(toidud.get(j));
            }
        }

        for (int i = 0; i < kliendid.length; i++) {
            kliendid[i].maksa(tellimused[i]);
            kliendid[i].hinda(tellimused[i]);
            System.out.println(kliendid[i]);
            System.out.println(tellimused[i]);

        }
    }
}

