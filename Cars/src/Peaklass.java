import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Peaklass {




    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("Autode müügiks ettevalmistamine");
        System.out.println();

        // Rakendatakse vastavat staatilist meetodit, et lugeda
        // failist autode andmed
        // List<Auto> autod = FailiOperatsioonid.loeAutodFailist("autod.txt");
        File autoFile = new File("autod.txt");
        List<Auto> autod = FileOperations.readFromFile(autoFile);

        // Rakendatakse vastavat staatilist meetodit, et lugeda
        // failist tööde andmed
        //List<Töö> tööd = FailiOperatsioonid.loeTöödeFailist("tööd.txt");

        System.out.println("Autode info ekraanile:");
        // Trükime autode info
        for (int i = 0; i < autod.size(); i++) {
            System.out.println(autod.get(i).toString());
        }

        System.out.println("Auto tööde info ekraanile:");
        // Trükime tööde info
        for (int i = 0; i < tööd.size(); i++) {
            System.out.println(tööd.get(i).toString());
        }


    }}

