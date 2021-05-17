
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class FailiTabel implements Tabel {
    private Path fail;







    public FailiTabel(String failiNimi) {
        try {
            this.fail = Path.of(failiNimi);
            if (!Files.exists(this.fail, new LinkOption[0])) {
                Files.createFile(Path.of(failiNimi));
            }
        } catch (IOException var3) {
            var3.printStackTrace();
        }
    }










    public void lisaAuto(Auto auto) {
        LocalDate var10000 = auto.getKuupäev();
        String autoRida = var10000 + "," + auto.getVin() + "," + auto.getMark() + "," + auto.getMudel() + "," + auto.getKlient() + "," + auto.getAsukoht() + "," + auto.getTöödeNimekiri() + "\n";
        try {
            Files.writeString(this.fail, autoRida, StandardOpenOption.APPEND);
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }






    public void pätsaAuto(Auto auto) {
        LocalDate var10000 = auto.getKuupäev();
        String autoRida = var10000 + "," + auto.getVin() + "," + auto.getMark() + "," + auto.getMudel() + "," + auto.getKlient() + "," + auto.getAsukoht() + "," + auto.getTöödeNimekiri() + "\n";
        try {
            Files.writeString(this.fail, autoRida, StandardOpenOption.APPEND);
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }









    public boolean kustutaAuto(int reaNr) {
        try {
            List<String> read = Files.readAllLines(this.fail);
            if (reaNr > 0 && reaNr <= read.size()) {
                read.remove(reaNr - 1);
                Files.write(this.fail, read, StandardOpenOption.TRUNCATE_EXISTING);
                return true;
            } else {
                return false;
            }
        } catch (IOException var3) {
            var3.printStackTrace();
            return false;
        }
    }





    public String prindiTabel() {
        try {
            List<String> read = Files.readAllLines(this.fail);
            StringBuilder uuedRead = new StringBuilder();
            int i = 1;

            for(Iterator var4 = read.iterator(); var4.hasNext(); ++i) {
                String rida = (String)var4.next();
                uuedRead.append(i + "," + rida);
                uuedRead.append("\n");
            }

            return uuedRead.toString();
        } catch (IOException var6) {
            var6.printStackTrace();
            return null;
        }
    }
}




