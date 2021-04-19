import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Tsensuur {

    public static void main(String[] args) throws Exception {
        LinkedList<String> tabuList = new LinkedList<>();

        for (String i : args) {
            tabuList.add(i.replaceAll("[^A-Za-z0-9]", ""));
        }
        /*
        for (int i = 0; i < tabuList.size(); i++) {
            System.out.println(tabuList.get(i));
        }
        */
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"))) {
            String row = bufferedReader.readLine();
            while (row != null) {
                String[] stringList = row.split(" ");
                for (String str : stringList) {
                    if (str.equals(" ")) {
                        System.exit(1);
                    }

                    if (!tabuList.contains(str)) {
                        System.out.println(str);
                    }
                }
                row = bufferedReader.readLine();
            }
        }
    }
}
