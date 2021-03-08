public class TestIsik {

    public static void main(String[] args) {

        Isik a = new Isik("Juhan Juurikas", 1.99);
        Isik b = new Isik("Madli Mallikas", 1.55);
        System.out.println("Isik a on " + a);

        System.out.println(a.toString());

        a.setNimi("Maarja Magdaleena");
        System.out.println(a.toString());

        Isik c = new Isik();

        System.out.println(c.toString());


        Isik d = new Isik();
        Isik e = new Isik("Ülli Õpilane", 2.05);

        System.out.println(d.toString());
        System.out.println(e.toString());

        System.out.println(e.suusakepiPikkus()); // kasutab isendi meetodit

        System.out.println(e.bmi());
        Isik f = new Isik("Kaalun Palju", 1.88, 122, 51);
        System.out.println(f.toString());
        System.out.println("Leian BMI: " + f.bmi());
        System.out.println("Leian sünniaasta: " + f.sünniAasta(2021));

    }
}
