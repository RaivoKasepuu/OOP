public class Vaadijook extends Jook{


    public Vaadijook(String nimetus, double hind, int maht) {
        super(nimetus, hind, maht);
    }

    @Override
    double liitriHind() {
        return 10 * getHind();
    }

    @Override
    double tellimuseHind() {
        return getHind() * getMaht() / 100;
    }

    @Override
    public String toString() {
        return "Vaadijook: " +
                super.getNimetus() +
                ", hind " + super.getHind() + "€," +
                ", maht " + super.getMaht() + "ml";
    }
}
