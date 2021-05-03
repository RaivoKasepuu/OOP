import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Peaklass {

    public static void main(String[] args) {
        String[] järjend = { "sõne1", "sõne2"};

        ArrayList<String> list = new ArrayList();

        list.add("sõne");

        System.out.println(kasPalindroom("aiassadassaia"));

    }

    public static boolean kasPalindroom (String sõna) {
        Deque<Character> magasin = new ArrayDeque<>();
        char[] tähemärkidest_järjend = sõna.toCharArray();
        String tagurpidiSõna = "";
        for (char tähemärk : tähemärkidest_järjend) {
            magasin.push(tähemärk);

            }
        while (magasin.size() > 0 ) {
            tagurpidiSõna += magasin.pop();
        }

        if (tagurpidiSõna.equals(sõna)) {
            return true;
        }
        return false;
    }


}
