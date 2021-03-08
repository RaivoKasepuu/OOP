public class TestKlass {

    public static void main(String[] args) {

        Raamat kevade = new Raamat("Oskar Luts", "Kevade");

        Raamat[] riiul = new Raamat[100];

        System.out.println(riiul[8]);

        riiul[8] = kevade;

        System.out.println(riiul[8]);
    }

}
