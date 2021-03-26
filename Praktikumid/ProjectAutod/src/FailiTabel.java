import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class FailiTabel {
    private static Path fail;
    public FailiTabel(String failiNimi) {

        try {
            this.fail = Path.of(failiNimi);
            if (!Files.exists(fail)) {
                Files.createFile(Path.of(failiNimi));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lisaAuto(Auto auto) {
        System.out.println("Failitabel - lisame Auto");
        String autoRida = auto.getId() + "," + auto.getKuupäev() + "," + auto.getVin() + "," + auto.getMark() + "," + auto.getMudel() + "," + auto.getKlient() + "," + auto.getAsukoht() + "," + auto.getTöödeNimekiri() + "\n";
        try {
            Files.writeString(fail, autoRida, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public boolean kustutaAuto(int reaNr) {
        System.out.println("Failitabel - kustutame Auto");
        try {
            List<String> read = Files.readAllLines(fail);
            if (reaNr > 0 && reaNr <= read.size()) {
                read.remove(reaNr - 1);
                Files.write(fail, read, StandardOpenOption.TRUNCATE_EXISTING);
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String prindiTabel() {
        System.out.println("Failitabel - Süsteemis olevad autod");
        try {
            List<String> read = Files.readAllLines(fail);
            StringBuilder uuedRead = new StringBuilder();

            // Lisame faili igale reale rea loenduri
            int reaLoendur = 1;
            for (String rida : read) {
                uuedRead.append(reaLoendur + "," + rida);
                uuedRead.append("\n");
                reaLoendur++;
            }

            return uuedRead.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
