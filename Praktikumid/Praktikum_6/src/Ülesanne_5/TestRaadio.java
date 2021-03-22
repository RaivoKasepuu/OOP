package Ülesanne_5;

import java.util.ArrayList;

public class TestRaadio {

    public static void main(String[] args) {

        /*
        Tekitage testklass, mis tekitab Ülesanne_5.LotoNumbriTeataja, Ülesanne_5.ValiRaadiosaatja ja Ülesanne_5.
        UudisteRaadio isendid ja lisab neile
        mõned tavalised ja mõned hajameelsed kuulajad. Uuendage uudiste raadio aktuaalsete uudiste list väljamõeldud
        uudistega. Katsetage võidunumbrite, uudiste ja valju raadiosaate edastamist. Ärge unustage kontrollida,
        kuidas erinevad kuulajad kuuldut meenutavad.
        */

        // Teeme mõned raadiokuulajad:
        RaadioKuulaja raadioKuulajaUno = new RaadioKuulaja("Albert");
        RaadioKuulaja raadioKuulajaDuo = new RaadioKuulaja("Dilbert");
        HajameelneKuulaja hajameelneKuulajaUno = new HajameelneKuulaja("Maali");
        HajameelneKuulaja hajameelneKuulajaDuo = new HajameelneKuulaja("Juuli");

        // Teeme normaalsetest raadiokuulajatest ArrayListi:
        ArrayList<RaadioKuulaja> raadiokuulajad = new ArrayList<>();
        raadiokuulajad.add(raadioKuulajaUno);
        raadiokuulajad.add(raadioKuulajaDuo);

        // Teeme hajameelsetest raadiokuulajatest ArrayListi:
        ArrayList<RaadioKuulaja> hajameelsedRaadioKuulajad = new ArrayList<>();
        hajameelsedRaadioKuulajad.add(hajameelneKuulajaUno);
        hajameelsedRaadioKuulajad.add(hajameelneKuulajaDuo);

        // Genereerime mõned uudised
        String news1 = "Trump is dead. I repeat, Trump is dead";
        String news2 = "Elvis found! Drunk and homeless, but ALIVE";
        String news3 = "Finally, last digit for Pi founded!";
        String news4 = "Chuck Norris got second place in TV game 'Who Wants to Be a Millionaire?'";

        // Lisame uudised ArrayListi:
        ArrayList<String> aktuaalsedUudised = new ArrayList<>();
        aktuaalsedUudised.add(news1);
        aktuaalsedUudised.add(news2);
        aktuaalsedUudised.add(news3);
        aktuaalsedUudised.add(news4);

        Raadiosaatja pereRaadio = new Raadiosaatja(hajameelsedRaadioKuulajad);
        LotoNumbriTeataja raadioStarFM  = new LotoNumbriTeataja(raadiokuulajad);
        LotoNumbriTeataja raadioRetro  = new LotoNumbriTeataja(hajameelsedRaadioKuulajad);
        ValiRaadiosaatja kukuRaadio = new ValiRaadiosaatja(raadiokuulajad);
        ValiRaadiosaatja raadio2 = new ValiRaadiosaatja(hajameelsedRaadioKuulajad);
        UudisteRaadio vikerRaadio = new UudisteRaadio(raadiokuulajad, aktuaalsedUudised);
        UudisteRaadio skyRadio = new UudisteRaadio(raadiokuulajad, aktuaalsedUudised);

        pereRaadio.edasta(news1);
        System.out.println(vikerRaadio.getRaadiokuulajad());
        skyRadio.edasta(news1);
        raadio2.edasta(news2);
        raadio2.lisaKuulaja(raadioKuulajaUno);
        vikerRaadio.edastaUudised();
        pereRaadio.lisaKuulaja(raadioKuulajaDuo);
        raadioStarFM.loosiJaEdasta();
        raadioRetro.loosiJaEdasta();
        skyRadio.edasta(news3);
        pereRaadio.edasta(news3);
        kukuRaadio.edasta(news4);
        System.out.println("Raadiokuulajate meenutused");
        System.out.println(raadioKuulajaUno.meenuta());
        System.out.println(raadioKuulajaDuo.meenuta());
        System.out.println(hajameelneKuulajaUno.meenuta());
        System.out.println(hajameelneKuulajaDuo.meenuta());
        System.out.println(pereRaadio.getRaadiokuulajad());
        System.out.println(kukuRaadio.getRaadiokuulajad());
        System.out.println(skyRadio.getRaadiokuulajad());
        System.out.println(raadioRetro.getRaadiokuulajad());
    }
}
