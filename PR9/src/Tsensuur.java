import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Tsensuur {

    public static void main(String[] args) throws Exception {
        LinkedList<String> tabuList = new LinkedList<>();

        for (String i : args)
            tabuList.add(i);

        /*


        for (int i = 0; i < tabuList.size(); i++) {
            String str = tabuList.get(i);
            str = str.replaceAll(", $", "");
            tabuList.add(str);
        }

        for (int i = 0; i < tabuList.size(); i++) {
            System.out.println(tabuList.get(i));
        }

        System.out.println(tabuList);
  */

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"))) {
            String row = bufferedReader.readLine();
            while (row != null) {
                String[] stringList = row.split(",");
                for (String i : stringList) {
                    if (tabuList.contains(i)) {

                    } else {
                        System.out.println(i);
                    }
                }
                row = bufferedReader.readLine();
            }
        }
    }
}
