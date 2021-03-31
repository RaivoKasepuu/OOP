public class Pudelijook extends Jook{

    private int pudeliteArv;

    public Pudelijook(String nimetus, double hind, int maht, int pudeliteArv) {
        super(nimetus, hind, maht);
        this.pudeliteArv = pudeliteArv;
    }


    @Override
    double liitriHind() {
        return 1000 * getHind() / getMaht();
    }

    @Override
    double tellimuseHind() {
        return getHind() * pudeliteArv;
    }


    @Override
    public String toString() {
        return "Pudelijook: " +
                super.getNimetus() +
                ", hind " + super.getHind() + "€," +
                ", maht " + super.getMaht() + "ml" +
                ", pudelite arv " + pudeliteArv;
    }
}
