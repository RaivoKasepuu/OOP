package Ülesanne_4;

public class TestSõiduk {

    public static void main(String[] args) {

        Kastiauto kallur = new Kastiauto ( 60, "111DDD", 4, 12);
        Kastiauto tallur = new Kastiauto ( 70, "222DDD", 4, 15);
        Kastiauto pallur = new Kastiauto ( 80, "333DDD", 4, 18);


        Auto zapakas = new Auto(99, "999DDD", 4);
        Auto zhiguli = new Auto(139, "888DDD", 4);
        Auto project34 = new Auto(299, "formula_1", 6);

        Sõiduk mingiKäru = new Sõiduk(20, "puudub");



        System.out.println(mingiKäru.toString());
        System.out.println(zapakas.toString());
        System.out.println(tallur.toString());
    }

}
