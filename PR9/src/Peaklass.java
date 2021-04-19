public class Peaklass {

    public static void main(String[] args) throws Exception {


        String[] ained = {"NLKP ajalugu", "Poliitökonoomia", "Astroloogia", "Alkeemia"};
        int[] algused = {10 * 60 + 15, 12 * 60 + 15, 14 * 60 + 15, 16 * 60 + 15};

        Tunniplaan tp1 = new Tunniplaan(ained, algused);
        tp1.kirjutaFaili("tunniplaan.txt");

        System.out.println(tp1.annaAlgusaeg("Alkeemia"));
        Tunniplaan tp2 = new Tunniplaan("tunniplaan.txt");
        System.out.println(tp2.toString());

        System.out.println();

        TekstiAnalüsaator kanaRomaan = new TekstiAnalüsaator("valton_kanaromaan.txt");
        System.out.println("Analüüsime A.Valtoni 'Kanaromaani'. Uurime, mitu korda on selles sõne 'kes'. ");
        System.out.println("Sõne 'kes' esineb romaanis: " + kanaRomaan.sõneEsinemisteArv("kes") + " korda.");
        System.out.println();


        TekstiAnalüsaator testtekst1 = new TekstiAnalüsaator("testtekst_kala.txt");
        System.out.println("Sõne 'kala' esineb testtekstis: " + testtekst1.sõneEsinemisteArv("kala") + " korda.");
        TekstiAnalüsaator testtekst2 = new TekstiAnalüsaator("testtekst_lala.txt");
        System.out.println("Sõne 'lala' esineb testtekstis: " + testtekst2.sõneEsinemisteArv("lala") + " korda.");
        TekstiAnalüsaator testtekst3 = new TekstiAnalüsaator("testtekst_efg.txt");
        System.out.println("Sõne 'efg' esineb testtekstis: " + testtekst3.sõneEsinemisteArv("efg") + " korda.");
        TekstiAnalüsaator testtekst = new TekstiAnalüsaator("testtekst.txt");
        System.out.println("Sõne 'kes' esineb testtekstis: " + testtekst.sõneEsinemisteArv("kes") + " korda.");
        System.out.println();


        Mp3Analüsaator acdc = new Mp3Analüsaator("AC_DC_Highway_to_Hell.mp3");
        System.out.println(acdc.onKantri());


        Mp3Analüsaator downInTennessee = new Mp3Analüsaator("John_Anderson_Down_in_Tennessee.mp3");
        System.out.println(downInTennessee.onKantri());


    }

}