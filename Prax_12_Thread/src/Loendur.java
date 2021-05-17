public class Loendur {

    private Object monitor = new Object();
    private int arv = 0;

    public void liida(int liidetav) {
        synchronized (monitor) {
            arv += liidetav;
        }
    }

    public int väärtus() {
        synchronized (monitor) {
            return arv;
        }
    }
}
