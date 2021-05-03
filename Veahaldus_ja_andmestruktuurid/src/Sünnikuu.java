public class Sünnikuu {

    /*
    Kirjutada meetod sünnikuu, mis võtab parameetriks String kujul isikukoodi ja tagastab isikukoodist kuud tähistava osa arvuna (int).
    Lisada meetodi algusesse kontroll: kui argumendiks antud sõne on null või selle pikkus ei ole 11 tähemärki,
    siis visata RuntimeException tüüpi erind, mis kirjeldab vea olemust. Kirjutada peameetod, millega meetodi tööd kontrollitakse.
     */

    public static int sünniKuu (String isikukood) {

        if (isikukood == null || isikukood.length() != 11) {
            throw new RuntimeException("isikukood peab olema 11 märki pikk!");
        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println(sünniKuu("36906190336"));

    }

}
