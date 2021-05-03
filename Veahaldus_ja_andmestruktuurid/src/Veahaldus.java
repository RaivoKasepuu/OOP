public class Veahaldus {

    public static void main(String[] args) {

        System.out.println(faktoriaal(-2));
        }

        static int faktoriaal(int n) {
            if (n < 0)
                throw new IllegalArgumentException("N ei saa olla negatiivne!");
            int tulemus = 1;
            for (int i = n; i > 1; i--)
                tulemus = tulemus * i;
            return tulemus;

        }

}
