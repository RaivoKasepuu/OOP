public class JooksebParalleelseltTest {
    public static void main(String[] args) {
        JooksebParalleelselt kood = new JooksebParalleelselt();
        Thread lõim = new Thread(kood); // tekitame lõime
        lõim.start(); // käivitame lõime (NB! kasutama peab start, mitte run meetodit!)
    }
}