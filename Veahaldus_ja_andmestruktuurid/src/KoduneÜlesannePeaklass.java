import java.time.LocalDate;
import java.util.Scanner;

public class KoduneÜlesannePeaklass {

    public static int sünniKuu(String isikukood) {
        if (isikukood.length() != 11 || isikukood == null) {
            throw new RuntimeException("Sisestatud isikukood ei vasta EV nõuetele");
        }
        return Integer.parseInt(isikukood.substring(3, 5));
    }

    public static void main(String[] args) {
        System.out.println(sünniKuu("36906190336"));

        LocalDate neljapäev = LocalDate.of(2016, 4, 14);
        LocalDate laupäev = LocalDate.of(2016, 4, 16);
        LocalDate pühapäev = LocalDate.of(2021, 5, 2);
        LocalDate esmaspäev = LocalDate.of(2021, 5, 3);
        KoduneÜlesanne kü1 = new KoduneÜlesanne(neljapäev);
        kü1.setTähtaeg(neljapäev);
        System.out.println(kü1.getTähtaeg());
        kü1.setTähtaeg(laupäev);
        System.out.println(kü1.getTähtaeg());
    }
}
