public class Kolmnurk implements Hulknurk, Comparable<Kolmnurk> {


    private double a,b,c; // küljed

    public Kolmnurk(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double pindala() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public int nurkadeArv() {
        return 3;
    }
    public boolean onTäisnurkne() {
        // Klassis peavad olema realiseeritud kõik liidese meetodid, aga see ei tähenda,
        // et kõik klassi meetodid peavad olema liideses kirjeldatud. Liidesega klass
        // on ikka tavaline klass, kuhu võib oma soovi järgi igasuguseid meetodeid lisada.
        double[] abc = {a, b, c};
        java.util.Arrays.sort(abc);
        double kaatet1 = abc[0] * abc[0];
        double kaatet2 = abc[1] * abc[1];
        double hüpotenuus = abc[2] * abc[2];
        return Math.abs(kaatet1 + kaatet2 - hüpotenuus) < 0.001; // ümardusviga
    }

    public int compareTo(Kolmnurk võrreldav) {
        if (pindala() < võrreldav.pindala())
            return -1; // negatiivne arv näitab, et this on väiksem kui võrreldav
        if (pindala() > võrreldav.pindala())
            return 1; // positiivne arv näitab, et this on suurem kui võrreldav
        return 0; // null tähendab, et mõlemad on võrdsed
    }


    public static void main(String[] args) {
        Kolmnurk kolmnurk = new Kolmnurk(3, 4, 5);
        Hulknurk hulknurk = kolmnurk;
        System.out.println(kolmnurk.nurkadeArv());
        System.out.println(hulknurk.nurkadeArv());
        System.out.println(hulknurk.pindala());


    }

}
