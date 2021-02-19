public class A4 {

     /*
    Ülesanne A4 (kontroll) --> P4 (kontroll)
Ühes klassis võivad olla ka samanimelised meetodid. Koostage kolm samanimelist (aga muidugi erineva signatuuriga)
staatilist meetodit, mis vastavalt sellele, millist tüüpi ja kui palju on argumente, tagastaksid erinevat tüüpi väärtuse.

Näiteks

kui argumentideks on kaks int-tüüpi arvu, siis tagastatakse nende summa;
kui argumentideks on üks double-tüüpi arv, siis tagastatakse selle arvu ruut, mis on ümardatud täisarvuks;
kui argumentideks on sõne ja int-tüüpi arv, siis ei tagastataks midagi, aga see sõne väljastatakse ekraanile vastav arv
kordi (kasutage tsüklit).
Rakendage loodud meetodeid peameetodis. Palun kirjutage paberile/dokumenti koostatud meetodite signatuurid.

Kui olete juba hulk aega proovinud ülesannet iseseisvalt lahendada ja see ikka ei õnnestu, siis võib-olla saate abi
murelahendajalt. Püütud on tüüpilisemaid probleemseid kohti selgitada ja anda vihjeid.
     */

    public static void main(String[] args) {
        System.out.println("Ülesanne A4");
        System.out.println(summa(1, 2));
        System.out.println(ümardatudRuut(7.5));


    }

    public static int summa (int a, int b) {
        return a + b;
    }

    public static double ümardatudRuut (double a) {

        return Math.round(a * a );
    }

}


