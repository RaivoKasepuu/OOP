import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lastehoid {

    static TreeMap<Integer, String> lasteMap = new TreeMap<>();
    public static void main(String[] args) throws FileNotFoundException {

        TreeMap<Integer, String> lapseHoidjaMap = new TreeMap<>();
        File file = new File("lapsehoidjad.txt");

        try (Scanner sc = new Scanner(file, "UTF-8")) {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] rowItems = row.split(" ");
                lapseHoidjaMap.put(Integer.parseInt(rowItems[0]), rowItems[1]);
            }
        }
        lapseHoidjaMap.put(35, "Jana");
        Set<Integer> keys = lapseHoidjaMap.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + lapseHoidjaMap.get(key));
        }
    }
}
