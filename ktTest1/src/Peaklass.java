import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Peaklass {

    public static void main(String[] args) throws IOException {

        List<Toit> toidud = new ArrayList<>();

        // Loeme failist toidud
        Path path = Paths.get("toidud.txt");
        List<String> lines = Files.readAllLines(path);

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
            String[] partLines = lines.get(i).split(",");
            if (partLines.length < 3) {
                Toit toit = new Toit(partLines[0], Double.parseDouble(partLines[1]));
                toidud.add(toit);
            } else if ((partLines.length > 2)) {
                KampaaniaToit kampaaniaToit = new KampaaniaToit(partLines[0], Double.parseDouble(partLines[1]), Integer.parseInt(partLines[2]));
                toidud.add(kampaaniaToit);
            }
            System.out.println(toidud.size());
        }
        System.out.println(toidud);

        System.out.println();

        Kuller volli = new Kuller("Volli");
        Kuller malle = new Kuller("Malle");
        Kuller[] kullerid = {volli,malle};

        Tellimus tellimus = new Tellimus(volli);
        Tellimus tellimus1 = new Tellimus(malle);
        Tellimus tellimus2 = new Tellimus(volli);
        Tellimus tellimus3 = new Tellimus(malle);
        Tellimus[] tellimused = {tellimus, tellimus1, tellimus2, tellimus3};

        Klient klient = new Klient("boss", 200);
        Klient klient2 = new Klient("1boss", 100);
        Klient klient3 = new Klient("2boss", 100);
        Klient klient4 = new Klient("3boss", 100);
        Klient[] kliendid = {klient, klient2, klient3, klient4};

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
