public class TestElektriAutod {

    public static void main(String[] args) {

        Elektrijaam elektriJaam = new Elektrijaam(0.15);


        Elektriauto elektriAutoUno = new Elektriauto("Zapakas", 12, 120, 60, elektriJaam);
        Elektriauto elektriAutoDuo = new Elektriauto("Mosse", 15, 600, 300,elektriJaam);
        System.out.println(elektriAutoUno);
        System.out.println(elektriAutoDuo);
        System.out.println("Zapakaga 100km maksab: " + elektriAutoUno.maksumus100());
        System.out.println("Mossega 100km läbimine maksab: " + elektriAutoDuo.maksumus100());
        System.out.println("Zapakaga 300 km sõidu maksumus: " + elektriAutoUno.maksumus(300));
        System.out.println("Mossega 600km läbimine maksab: " + elektriAutoDuo.maksumus(600));
        System.out.println("Zapakaga reisi kestvus 400km, 100km/h keatab: " + elektriAutoUno.reisiKestus(400, 100));
        System.out.println("Mossega rallitamine 500km kiirusega 100km/h kestab: " + elektriAutoDuo.reisiKestus(500, 100));
    }
}
