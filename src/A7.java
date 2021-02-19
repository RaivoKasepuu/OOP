import java.util.Scanner;

public class A7 {

/*
Ülesanne A7 (kontroll) --> P7 (kontroll)
Koostage programm, mis saab käsurealt inimese eesnime, kehamassi (kilogrammides, täisarvuna) ja pikkuse (meetrites,
reaalarvuna) ning arvutaks tema kehamassiindeksi ning annaks vastavalt tulemusele vähemalt kolme sorti soovitusi
(näiteks, "Söö rohkem", "Kasva pikemaks" jms.)

Kirjutage paberile/dokumenti, millised on käsurealt lugemise ja eelmises praktikumis käsitletud klaviatuurilt
sisestamise põhilised erinevused. Milliste programmide puhul võiks neid rakendada?

Kui olete juba hulk aega proovinud ülesannet iseseisvalt lahendada ja see ikka ei õnnestu, siis võib-olla saate abi
murelahendajalt. Püütud on tüüpilisemaid probleemseid kohti selgitada ja anda vihjeid.
 */


    public static void main(String[] args) {
        System.out.println("A7");

        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta eesnimi: ");
        String nimi = input.nextLine();
        System.out.println("Sisesta kehakaal: ");
        String kehakaal = input.nextLine();
        System.out.println("Sisesta pikkus (meetrites): ");
        String pikkus = input.nextLine();

        double BMI = 1.3 * Double.parseDouble(kehakaal) / Double.parseDouble(pikkus);
        System.out.println("Simu kehamassiindeks on: " + BMI);
        if (BMI < 18.5) {
            System.out.println("alakaal!");

        } else if (BMI < 25 && BMI >= 18.5) {
            System.out.println("normaalkaal");
        } else {
            System.out.println("ülekaal. Võtame veel ühed õlled?");
        }

    }
}
