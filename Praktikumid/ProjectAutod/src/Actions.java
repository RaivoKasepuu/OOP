import java.time.LocalDate;
import java.util.Scanner;

public class Actions {

    public static void lisaAutoTest() {
        LocalDate loomiseKuupäev = LocalDate.now();
        Integer id = IdGeneraator.getNextId();
        String vinTähis = "VIN1234567";
        String mark = "Audi";
        String mudel = "A4";
        String klient = "Kalmer Tennossaar";
        String asukoht = "Tapa";
        String töödeNimekiri = "klaasid toonida";

        Auto uusAuto = new Auto(id, loomiseKuupäev, vinTähis, mark, mudel, klient, asukoht, töödeNimekiri);
        FailiTabel.lisaAuto(uusAuto);

        System.out.println("Uus Auto edukalt sisestatud!");
        System.out.println(uusAuto.toString());
    }

    static void lisaAutoMenüü() {

        Scanner sisend = new Scanner(System.in);

        System.out.println("Sisesta kuupäev formaadis YYYY-MM-DD: ");
        String kuupäev = sisend.nextLine();
        LocalDate loomiseKuupäev = LocalDate.now();

        if (kuupäev.length() != 0) {
            loomiseKuupäev = LocalDate.parse(kuupäev);
        }

        System.out.println("Sisesta VIN tähis: ");
        String vinTähis = sisend.nextLine();

        System.out.println("Sisesta auto mark: ");
        String mark = sisend.nextLine();

        System.out.println("Sisesta auto mudel: ");
        String mudel = sisend.nextLine();

        System.out.println("Sisesta kliendi nimi: ");
        String klient = sisend.nextLine();

        System.out.println("Sisesta auto asukoht: ");
        String asukoht = sisend.nextLine();

        System.out.println("Sisesta tehtavad tööd: ");
        String töödeNimekiri = sisend.nextLine();

        Integer id = IdGeneraator.getNextId();

        Auto uusAuto = new Auto(id, loomiseKuupäev, vinTähis, mark, mudel, klient, asukoht, töödeNimekiri);
        FailiTabel.lisaAuto(uusAuto);

        System.out.println("Uus Auto edukalt sisestatud!");
        System.out.println(uusAuto.toString());
    }

    static void kustutaAutoMenüü() {
        System.out.print("Sisesta auto rea nr: ");
        Scanner sc = new Scanner(System.in);
        int reaNr = sc.nextInt();
        if (Main.tabel.kustutaAuto(reaNr)) {
            System.out.println("Auto realt nr " + reaNr + " kustutatud!");
        } else {
            System.out.println("Auto eemaldamine ebaõnnestus. Kontrolli rea numberit!");
        }
    }

    static void prindiTabelMenüü() {
        System.out.println(Main.tabel.prindiTabel());
    }

    static void nextTest() {
        System.out.println("Seda funktsionaalsust veel pole. Rühmatöö 2 tuleb ju varsti!");
    }


}

