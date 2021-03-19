import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Lapsehoid2 {


    public static void main(String[] args) throws Exception {
        File fail = new File("lapsehoidjad.txt");

        try (Scanner sc = new Scanner(fail, "UTF-8")) {
            ArrayList<Lapsehoidja> list1 = new ArrayList<>();
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                Lapsehoidja lapsehoidja = new Lapsehoidja(Integer.parseInt(tükid[0]), tükid[1]);
                list1.add(lapsehoidja);
            }

            Lapsehoidja lapsehoidja = new Lapsehoidja(35, "Jana");

            // Paneme kohe Jana õigele kohale istuma!
            int id = lapsehoidja.getFirmaNumber();
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).getFirmaNumber() > id) {
                    list1.add(i, lapsehoidja);
                    break;
                }

            }

            // TRükime kõik välja:
            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i).firmaNumber + " " + list1.get(i).getNimi());
                // Eemaldame nr 46:
                if (list1.get(i).firmaNumber == 46) {
                    list1.remove(i);
                }
            }
            System.out.println("**************************************");

            // TRükime uuesti kõik välja. 46 peab olema kadunud:
            for (int i = 0; i < list1.size(); i++) {

                System.out.println(list1.get(i).firmaNumber + " " + list1.get(i).getNimi());

            }

        }
    }
}








