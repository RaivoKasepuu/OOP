public class TestHulkNurk {

    public static void main(String[] args) {
        Kolmnurk kolmnurk = new Kolmnurk(3,4,5);
        Hulknurk hulknurk = kolmnurk;
        System.out.println(kolmnurk.nurkadeArv());
        System.out.println(hulknurk.pindala());



        Kolmnurk kolmnurk2 = new Kolmnurk(3, 4, 5);
        System.out.println(kolmnurk.getClass()); // class Kolmnurk
        Hulknurk hulknurk2 = new Kolmnurk(3, 4, 5);
        System.out.println(hulknurk.getClass()); // class Kolmnurk

        System.out.println(kolmnurk2.onTäisnurkne());

    }


}
