public class TestPank {

    public static void main(String[] args) {
        Klient volli = new Klient(361, 333, 222);
        Klient polli = new Klient(362, 444, 222);
        Klient dolli = new Klient(363, 555, 444);
        Klient kolli = new Klient(363, 666, 44);
        Kuldklient malle = new Kuldklient(465, 1777, 4567, "Albert");
        Kuldklient pelle = new Kuldklient(565, 2777, 4567, "Molbert");
        Kuldklient pille = new Kuldklient(665, 3777, 77777, "Albert");

        System.out.println(volli.getIsikukood());
        System.out.println(polli.getSaldo());
        polli.teostaÜlekanne("konto 2", 111);
        System.out.println(polli.getSaldo());
        System.out.println(malle.getKliendiHaldur());
        malle.setKliendiHaldur("Dilbert");
        System.out.println(malle.getKliendiHaldur());
        System.out.println(malle.getSaldo());
        malle.arvutaTehinguTasud();
        malle.teostaÜlekanne("BBB", 1000);
        System.out.println(malle.getSaldo());
        System.out.println(pille.getAktsiaportfelliVäärtus());
        System.out.println(pille.arvutaPortfelliHaldustasu());
        System.out.println(pelle.arvutaPortfelliHaldustasu());
        System.out.println(polli.arvutaPortfelliHaldustasu());


        KampaaniaKuldklient k = new KampaaniaKuldklient(1, 100, 3000, "Adalbert");
        System.out.println(k.toString());


    }


}
