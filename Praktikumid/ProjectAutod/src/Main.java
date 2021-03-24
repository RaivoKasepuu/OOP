import java.util.Scanner;

public class Main {

    static FailiTabel tabel = new FailiTabel("autod.txt");

    public static void main(String[] args)  {

        System.out.println("Tere tulemast autode müügiks ettevalmistamise infosüsteemi!");
        System.out.println("autorid: Mario Käära , Raivo Kasepuu");
        System.out.println("MVP edition 1.0");
        System.out.println();
        System.out.println("Auto lisamiseks vali: " + Menüü.LISA_AUTO.ordinal());
        System.out.println("Autode tabeli printimiseks vali: " + Menüü.PRINDI_TABEL.ordinal());
        System.out.println("Auto kustutamiseks vali: " + Menüü.KUSTUTA_AUTO.ordinal());
        System.out.println("Auto automaatseks lisamiseks programmi testimisel vali: " + Menüü.LISA_AUTO_AUTOMAATSELT.ordinal());
        System.out.println("Väljumiseks vali: " + Menüü.MENÜÜST_VÄLJA.ordinal());

        Scanner valik = new Scanner(System.in);

        loop:
        while (true) {
            System.out.print("Tee valik: ");

            int input = valik.nextInt();
            switch (Menüü.values()[input]) {

                case LISA_AUTO -> {
                    Actions.lisaAutoMenüü();

                    break;
                }
                case PRINDI_TABEL -> {
                    Actions.prindiTabelMenüü();
                    break;
                }
                case KUSTUTA_AUTO -> {
                    Actions.kustutaAutoMenüü();
                    break;
                }
                case LISA_AUTO_AUTOMAATSELT ->  {
                    Actions.lisaAutoTest();
                    break;
                }


                case MENÜÜST_VÄLJA -> {
                    break loop;
                }
            }
        }
    }
}
