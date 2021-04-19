import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TekstiAnalüsaator {

    private String fileName;

    public TekstiAnalüsaator(String fileName) {
        this.fileName = fileName;
    }

    public int sõneEsinemisteArv(String testString) throws Exception {
        Integer wordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.fileName), "UTF-8"))) {
            String row = bufferedReader.readLine();
            Integer testStringLength = testString.length();
            while (row != null) {
                for (int i = 0; i < row.length() - testStringLength + 1; i++) {
                    if (testString.equalsIgnoreCase(row.substring(i, i + testStringLength))) {
                        wordCount += 1;
                    }
                }
                row = bufferedReader.readLine();
            }
        }

        return wordCount;
    }
}