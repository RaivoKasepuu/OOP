public class TestRaamat {

    public static void main(String[] args) {

     Isik onuOskar = new Isik("Oskar Luts", 166, 66, 220 );
        Isik onuAnton = new Isik("Anton Hansen Tammsaare", 177, 77, 260 );

        Raamat kevade = new Raamat(onuOskar , "Kevade");
        Raamat[] riiul = new Raamat[100];
        System.out.println(riiul[8]);
        riiul[8] = kevade;
        System.out.println(riiul[8]);
        String autor = "Eduard Vilde";

        for (int i = 0; i < riiul.length; i++) {
            riiul[i] = new Raamat(onuAnton, "Kogutud teosed " + String.valueOf(i + 1));
        }

        System.out.println("4. raamat riiulil on " + riiul[3] + ".");
        System.out.println("5. raamat riiulil on " + riiul[4] + ".");
        System.out.println("6. raamat riiulil on " + riiul[5] + ".");
        System.out.println("7. raamat riiulil on " + riiul[6] + ".");
        System.out.println("8. raamat riiulil on " + riiul[7] + ".");
        System.out.println("9. raamat riiulil on " + riiul[8] + ".");
        System.out.println("10. raamat riiulil on " + riiul[9] + ".");


    }

}
