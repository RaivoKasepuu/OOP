import java.io.File;

public class TekstiAnalüsaatorPeaklass {

    public static void main(String[] args) throws Exception {
        File file = new File("PulpFiction.txt");
        TekstiAnalüsaator pulpFiction = new TekstiAnalüsaator(file, "UTF-8");
        System.out.println(pulpFiction.sõnadeJärgnevus());
        System.out.println(pulpFiction.sõnadeSagedus());
    }
}
