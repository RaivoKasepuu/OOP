import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FailiOperatsioonid {


    public static List<Auto> loeAutodFailist(String failinimi) throws Exception {
        List<Auto> autodeList = new ArrayList<>();
        try (java.util.Scanner sc = new java.util.Scanner(Path.of(failinimi), "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] rE = rida.split(",");
                autodeList.add(
                        new Auto(Integer.parseInt(rE[0]), Date.from(rE[1]), rE[2]), rE[3]), rE[4]), rE[5]), rE[6]), rE[7]);

/*
private int id;                         // 0 Auto ID, millega siinses süsteemis autot ja autoga seotud töid identifitseerime
                private LocalDate kuupäev;              // 1 Auto süsteemi lisamise kuupäev
                private String vin;                     // 2 Auto unikaalne VIN kood
                private String mark;                    // 3 Auto mark
                private String mudel;                   // 4 Auto mudel
                private String klient;                  // 5 Kliendi nimi
                private String asukoht;                 // 6 Auto asukoht
                private String töödeNimekiri;           // 7 Autoga seotud tööde nimekiri
                */

            }
        }
        return autodeList;
    }


    public static List<Töö> loeTöödeFailist(String failinimi) throws Exception {
        List<Töö> töödeList = new ArrayList<>();
        try (java.util.Scanner sc = new java.util.Scanner(Path.of(failinimi), "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] reaElemendid = rida.split(",");
                töödeList.add(
                        new Töö(reaElemendid[0], Double.parseDouble(reaElemendid[1]), Integer.parseInt(reaElemendid[2]), Integer.parseInt(reaElemendid[3])));

            }
        }
        return töödeList;
    }


    public static void kirjutaAutodFaili(List<Auto> autod, String failinimi) throws Exception {

        for (int i = 0; i < autod.size(); i++ ) {
            // Igast autost telib eraldi rida tekstifailis
        }
    }

    public static void kirjutaTöödFaili(List<Töö> tööd, String failinimi) throws Exception {

        for (int i = 0; i < tööd.size(); i++ ) {
            // Igast autost telib eraldi rida tekstifailis
        }
    }

}
