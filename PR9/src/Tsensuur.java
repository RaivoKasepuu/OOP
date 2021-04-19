import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Tsensuur {

    public static void main(String[] args) throws Exception {
        LinkedList<String> tabuList = new LinkedList<>();

        for (String i : args) {
            tabuList.add(i.replaceAll("[^A-Za-z0-9]", ""));
        }

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"))) {
                String row = bufferedReader.readLine();
                while (row != null) {
                    String[] stringList = row.split(",");
                    for (String str : stringList) {
                        if (tabuList.contains(str)) {

                        } else {
                            System.out.println(str);
                        }
                    }
                    row = bufferedReader.readLine();
                }
            }
        }
    }
