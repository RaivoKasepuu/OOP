//Programm, mis jooksvas kataloogis leiab laiendita failid ja lisab neile laiendi
import java.io.File;

public class Failinimed {
    public static void main(String[] args) throws Exception {
        File dir = new File(".");
        String[] failid = dir.list();
        for (String fail : failid) {
            File vana = new File(fail);
            if (vana.isFile() && !fail.contains(".")) {
                File uus = new File(fail + ".txt");
                vana.renameTo(uus);
                System.out.println("Muudetud " + vana.getName() + " -> " + uus.getName());
            }
        }
    }
}
