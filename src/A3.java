import java.util.ArrayList;

public class A3 {

    /*
    Ülesanne A3 --> P3 (kontroll)
Proovige erinevate klassi Math meetodite tööd. Proovige mõnda ühe ja mõnda kahe argumendiga meetodit. Proovige ka
kasutada väärtusi e ja π. Proovige ja tutvuge ka vähemalt ühe sellise funktsiooniga, millest te varem kuulnud pole.
Palun kirjutage paberile/dokumenti, mis meetoditega tutvusite ja mida teeb teile seni võõras olnud funktsioon.
     */

    public static void main(String[] args) {
        System.out.println("Ülesanne A3");
        int täringuvise = (int) Math.round(Math.random() * 5 + 1);
        int täringuvise2 = (int) Math.round(Math.random() * 5 + 1);
        System.out.println("Viskasin täringut. Tulemuseks sain: " + täringuvise);
        System.out.println("Viskasin veel täringut. Tulemuseks sain: " + täringuvise2);
        System.out.println("Kui suurema täringuviske tulemus oleks ringi raadius, siis ringi pindala oleks: " + ringiPindala(Math.max(täringuvise, täringuvise2)));
        System.out.println("Teeme visete põhjal ruutvõttandi: ( x - " + täringuvise + " ) * ( x - " + täringuvise2 + " ) = 0");
        System.out.println("sulge läbikorrutades saame : x2 - " + (täringuvise + täringuvise2) + "x + " + (täringuvise * täringuvise2) + " = 0" );
        System.out.println("ja kontrolliks lahendame selle ruutvõrrandi:");
        System.out.println("Lahendid esitame järjendis: " + ruutVõrrand(1, täringuvise + täringuvise2, täringuvise * täringuvise2));
    }

    public static double ringiPindala(int raadius) {
        return raadius * raadius * Math.PI;
    }

    public static ArrayList ruutVõrrand(int a, int b, int c) {
        ArrayList<Double> result = new ArrayList();
        int i = b * b - 4 * a * c;
        if (i < 0) {
            System.out.println("reaalsed lahendid puuduvad");

        } else {
            double xOne = ((-1) * b + Math.sqrt(i)) / (2 * a);
            double xTwo = ((-1) * b - Math.sqrt(i)) / (2 * a);
            result.add(xOne);
            result.add(xTwo);
        }
        return result;
    }

}
