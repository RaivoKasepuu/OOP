public class Pudelijook extends Jook{

    private int pudeliteArv;

    public Pudelijook(String nimetus, double hind, int maht, int pudeliteArv) {
        super(nimetus, hind, maht);
        this.pudeliteArv = pudeliteArv;
    }


    @Override
    double liitriHind() {
        return 1000 * hind * maht;
    }

    @Override
    double tellimuseHind() {
        return hind * pudeliteArv;
    }


    @Override
    public String toString() {
        return "Pudelijook{" +
                "nimetus='" + super.getNimetus() + '\'' +
                ", hind=" + super.getHind() +
                ", maht=" + super.getMaht() +
                ", pudeliteArv=" + pudeliteArv +
                '}';
    }
}
