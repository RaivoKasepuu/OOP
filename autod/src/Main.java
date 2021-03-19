import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        // Loeme failist viimase salvestatud autoMap-i  sisu
        //AutoMap autoMap = FileOperations.readFromFile();
        // Trükime, mis võtmed on kasutusel (ehk mis autode ID-d)
        //System.out.println(autoMap.getKeys());

        AutoMap autoMap = new AutoMap(); // Seda pole enam vaja, kui autod.txt olemas

        // Loome auto
        Auto auto1 = new Auto("123", "dddd", "fffff");
        // Lisame selle auto autoMap-i. Autode ID genereeritakse automaatselt incement by one.
        autoMap.addAuto(autoMap.getNextKey(), auto1);

        // teine auto jne..
        Auto auto2 = new Auto("223", "dddd", "fffff");
        autoMap.addAuto(autoMap.getNextKey(), auto2);
        Auto auto3 = new Auto("323", "dddd", "fffff");
        autoMap.addAuto(autoMap.getNextKey(), auto3);
        Auto auto4 = new Auto("423", "dddd", "fffff");
        autoMap.addAuto(autoMap.getNextKey(), auto4);
        Auto auto5 = new Auto("523", "dddd", "fffff");
        autoMap.addAuto(autoMap.getNextKey(), auto5);

        Auto auto6 = new Auto("623", "dddd", "fffff");
        autoMap.addAuto(auto6);
        // Selle auto lisas mu tütar...
        Auto auto7 = new Auto("eeeee", "Kia", "Muna");
        autoMap.addAuto(auto7);

        // Trükime kogu autoMApi sisu
        System.out.println(autoMap);

        // Kirjutame autoMapi faili...
        FileOperations.writeToFile(autoMap);

        // Mis võtmetega autod on autoMapis?
        System.out.println(autoMap.getKeys());

        // Mis võtme saab järgmine siseastav auto?
        System.out.println(autoMap.getNextKey());

        // kustutame kolmanda auto
        autoMap.removeAuto(3);
        System.out.println(autoMap.getKeys());

        // Muudame neljanda auto VIN koodi:
        // Enne muutust
        System.out.println(autoMap.getAuto(4));
        // muutus ise...
        autoMap.getAuto(4).setVin("xxxxxx");
        // seis peale muutust
        System.out.println(autoMap.getAuto(4));

        // viimane seis autoMAp-ist
        System.out.println(autoMap.getAutoMap());

        // Teeme nüüd testi ja loeme failist AutoMapi välja. Seal peaks olema erinev aseis, rida muutusi vahepeal tehtud...
        AutoMap autoMap2 = FileOperations.readFromFile();

        // Trükime autoMap2 konsooli...
        System.out.println(autoMap2);
        // Vaatame, mis võtmed sellel autoMapil... Kas võti 3 on olemas, mille autoMap -ist kustutasime?
        System.out.println(autoMap2.getKeys());

        // Süsteem töötab, onju!
        System.out.println(autoMap.getAuto(7));
        autoMap.getAuto(4).setMark("Volvo");
        System.out.println(autoMap.getAuto(4));


    }

}
