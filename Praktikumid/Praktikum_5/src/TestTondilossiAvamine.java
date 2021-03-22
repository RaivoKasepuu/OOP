public class TestTondilossiAvamine {
    public static void main(String[] args) {
        AmeerikaMäed mäed = new AmeerikaMäed();
        Dokument[] dokumendid = {
                new IdKaart("39108071234"),
                new Õpilaspilet(2008),
                new Õpilaspilet(2006),
                new Õpilaspilet(1991),
                new Õpilaspilet(2015),
                new IdKaart("51511111234")
        };
        //System.out.println("sobib: " + mäed.vanusedSobivad(dokumendid));
        //System.out.println("sobimatud: " + mäed.ebasobivadDokumendid(dokumendid));

        Atraktsioon tondiloss = new Atraktsioon("lõbumaja", 14);
        Atraktsioon striptiis = new Atraktsioon("striptiis", 12);

        System.out.println("Tondilossi sisenemiseks ebasobivad dokumendid on järgmised: "+ tondiloss.ebasobivadDokumendid(dokumendid));
        System.out.println("Striptiisietendusele sisenemiseks ebasobivad dokumendid on järgmised: " + striptiis.ebasobivadDokumendid(dokumendid));





    }
}
