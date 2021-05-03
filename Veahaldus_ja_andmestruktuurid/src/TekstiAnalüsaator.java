import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TekstiAnalüsaator {

    private String word;
    private File file;
    private String coding;


    public TekstiAnalüsaator(String word) {
        this.word = word;
    }

    public TekstiAnalüsaator(File file, String coding) throws Exception {
        Path path = file.toPath();
        this.file = file;
        this.coding = coding;
        String str = Files.readString(path, Charset.forName(coding));
        this.word = str;
    }

    public Map<String, Integer> sõnadeSagedus() {
        String[] words = word.replaceAll("\\p{P}", "").toLowerCase().split("\\s+");
        Map<String, Integer> hashMap = new HashMap<>();
        if (word == ""){
            return hashMap;
        }
        for (String i : words) {
            if (hashMap.containsKey(i)) {
                int count = hashMap.get(i);
                hashMap.put(i, count + 1);
            } else {
                hashMap.put(i, 1);
            }
        }
        return hashMap;
    }

    public Map<String, Map<String, Integer>> sõnadeJärgnevus() {
        String[] words = word.replaceAll("\\p{P}", "").toLowerCase().split("\\s+");
        Map<String, Map<String, Integer>> hashMap = new HashMap<>();
        if (word == ""){
            return hashMap;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String word = words[i];
            if (hashMap.containsKey(word)) {
                Map<String, Integer> nextWordMap = hashMap.get(word);
                if (nextWordMap.containsKey(words[i + 1])) {
                    int count = nextWordMap.get(words[i + 1]);
                    nextWordMap.put(words[i + 1], count + 1);
                } else {
                    nextWordMap.put(words[i + 1], 1);
                }
            } else {
                Map<String, Integer> nextWordMap = new HashMap<>();
                hashMap.put(word, nextWordMap);
                nextWordMap.put(words[i + 1], 1);
            }
        }
        return hashMap;
    }
}
