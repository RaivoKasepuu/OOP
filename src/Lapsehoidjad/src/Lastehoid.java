import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lastehoid {

    public static void main(String[] args) throws FileNotFoundException {

        //Hoiame lastehoidjaid TreeMap-is, pääseme sorteerimisest...
        TreeMap<Integer, String> lapseHoidjaMap = new TreeMap<>();

        // Loeme lapsehidjad failist
        File file = new File("lapsehoidjad.txt");

        try (Scanner sc = new Scanner(file, "UTF-8")) {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] rowItems = row.split(" ");
                Lapsehoidja lapsehoidja = new Lapsehoidja(Integer.parseInt(rowItems[0]), rowItems[1]);
                lapseHoidjaMap.put(lapsehoidja.getFirmaNumber(), lapsehoidja.getNimi());
            }
        }

        // Uus lapsehoidja Jana, nr. 35
        Lapsehoidja lapsehoidja = new Lapsehoidja(35, "Jana");
        lapseHoidjaMap.put(lapsehoidja.getFirmaNumber(), lapsehoidja.getNimi());


        // Kustutame lapsehoidja nr.46
        lapseHoidjaMap.remove(46);

        // Trükime välja kõik lapsehoidjad, firmaNumbri järjestuses
        Set<Integer> keys = lapseHoidjaMap.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + lapseHoidjaMap.get(key));
        }

    }
}
