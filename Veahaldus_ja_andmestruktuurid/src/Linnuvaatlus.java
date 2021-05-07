import java.io.*;
import java.util.*;

public class Linnuvaatlus {

    private static List<Lind> loeLinnud(String failiNimi) throws IOException {
        List<Lind> linnud = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(failiNimi)))) {
            String row = bufferedReader.readLine();
            while (row != null) {
                boolean kaitseAll = false;
                String[] rowElement = row.split(",");
                String liik = rowElement[0];
                String värv = rowElement[1];
                String linnuSugu = rowElement[2];
                String kasKaitseAll = rowElement[3];


                char sugu = linnuSugu.charAt(0);

                if (kasKaitseAll.equals("1")) {
                    kaitseAll = true;
                } else {
                    kaitseAll = false;
                }
                try {
                    Lind lind = new Lind(liik, värv, sugu, kaitseAll);
                    linnud.add(lind);
                } catch (ValeSuguErind e) {
                    System.out.println(e.getMessage() + " jama sellega...");
                }


                row = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linnud;
    }

    private static Map<String, Integer> liigiKaupa(List<Lind> linnud) {
        Map<String, Integer> linnuLiigid = new HashMap<>();
        Integer liikideArv;

        for (Lind lind : linnud) {

            if (linnuLiigid.containsKey(lind.getLiik())) {
                liikideArv = linnuLiigid.get(lind.getLiik());
                liikideArv += 1;
                linnuLiigid.put(lind.getLiik(), liikideArv);
            } else {
                linnuLiigid.put(lind.getLiik(), 1);
            }
        }
        return linnuLiigid;
    }


    public static void main(String[] args) throws IOException {

        System.out.println("Tere tulemast linde vaatlema!");
        System.out.println("Selle programmi autos on Raivo Kasepuu, matrikkel B710710");
        System.out.println();
        System.out.println("Lugesime failist just sisse sellised linnud: ");
        List<Lind> linnud = loeLinnud("linnud.txt");

        for (int i = 0; i < linnud.size(); i++) {
            System.out.println(linnud.get(i));
        }
        System.out.println();
        System.out.println("NB! false tähendab, et lind pole kaitse all, true tähendab, et ta on kaitse all!");
        System.out.println();
        System.out.println("Liigume, lugupeetud linnuvaatleja, nüüd edasi!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Kas soovid lisada (L), vaadata (V) või salvestada ja lõpetada (S)?");
        String vastus = sc.nextLine();

        while (!vastus.equals("S")) {
            if (vastus.equals("L")) {
                // Lisame linnu
                System.out.println("lisa lind formaadis: liik, värvus, sugu (M/N), kaitse all oled (0 - pole, 1 - on kaitse all");
                String row = sc.nextLine();
                boolean kaitseAll;
                String[] rowElement = row.split(",");
                String liik = rowElement[0];
                String värv = rowElement[1];
                String linnuSugu = rowElement[2];
                String kasKaitseAll = rowElement[3];
                char sugu = linnuSugu.charAt(0);

                if (kasKaitseAll.equals("1")) {
                    kaitseAll = true;
                } else {
                    kaitseAll = false;
                }
                try {
                    Lind lind = new Lind(liik, värv, sugu, kaitseAll);
                    linnud.add(lind);
                    System.out.println("Lind lisatud!");
                } catch (ValeSuguErind e) {
                    System.out.println(e.getMessage());
                }


            }
            if (vastus.equals("V")) {
                // Esitame vaadeldud linnud
                System.out.println("oled vaadelnud järgmisi linde:");
                List<String> vaadeldudLinnud = new ArrayList<String>(liigiKaupa(linnud).keySet());
                for (int i = 0; i < vaadeldudLinnud.size(); i++) {
                    System.out.println(vaadeldudLinnud.get(i));
                }
                System.out.println("Sisesta linnuliik, mille vaatlemise arvu soovid meelde tuletada: ");
                vastus = sc.nextLine();

                Map<String, Integer> linnuMap = liigiKaupa(linnud);
                if (linnuMap.containsKey(vastus)) {
                    System.out.println("oled näinud linnuliiki " + vastus + " " + linnuMap.get(vastus) + " korda");
                } else {
                    System.exit(0);
                }
            }

            System.out.println("Kas soovid lisada (L), vaadata (V) või salvestada ja lõpetada (S)?");
            vastus = sc.nextLine();
        }
        // Oleme jõudnud punkti, kus kasutaja tahab meie programmist väljuda... Salvestame ja laseme tal minna!
        // Salvestame linnud

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("linnud.dat"))) {
            dataOutputStream.write(linnud.size());
            for (Lind lind : linnud) {
                dataOutputStream.writeUTF(lind.getLiik());
                dataOutputStream.writeUTF(lind.getVärv());
                dataOutputStream.writeChar(lind.getSugu());
                dataOutputStream.writeBoolean(lind.isKaitseAll());

            }
        }
        // Salvestame kaitsealused linnud

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("kaitsealused.txt")))) {

            for (Lind lind : linnud) {
                if (lind.isKaitseAll()) {
                    bw.write(lind.toKaitseAllString());
                }
            }
            System.out.println("Linnud on salvestatud! Aeg minna...");
        }
    }
}
