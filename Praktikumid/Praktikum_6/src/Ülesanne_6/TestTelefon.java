package Ülesanne_6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestTelefon {
    public static void main(String[] args) {
        Telefon moblaUno = new Mobiiltelefon("5502500", "TillTill", "Raivo", true);
        Telefon taksofon = new Lauatelefon("111111111", "Plahvatus", "Pae_tänav");
        Telefon moblaDuo = new Mobiiltelefon("5171173", "KollKoll", "Pille", false);
        Telefon kgb_otseliin = new Lauatelefon("123456789", "LaskKuklasse", "Pagari_tänav");

        System.out.println(moblaDuo.getHelin());

        System.out.println(moblaDuo.getNumber());


        ArrayList<Telefon> telefonid = new ArrayList<>();
        telefonid.add(moblaDuo);
        telefonid.add(moblaUno);
        telefonid.add(taksofon);
        telefonid.add(kgb_otseliin);

        System.out.println("Järjendi kaudu sortimine");
        System.out.println("Enne sortimist: ");
        for (int i = 0; i < telefonid.size(); i++) {
            System.out.println(telefonid.get(i));
        }
        Collections.sort(telefonid);
        System.out.println("Peale : ");
        for (int i = 0; i < telefonid.size(); i++) {
            System.out.println(telefonid.get(i));
        }

        System.out.println("Massiivi kaudu sortimine:");
        Telefon[] telefonideMassiiv = {moblaUno, moblaDuo, taksofon, kgb_otseliin};
        System.out.println("Algne järjestus: " + Arrays.toString(telefonideMassiiv));
        java.util.Arrays.sort(telefonideMassiiv);
        System.out.println("Sorteerimise järel saadud järjestus: " + Arrays.toString(telefonideMassiiv));

    }


}
