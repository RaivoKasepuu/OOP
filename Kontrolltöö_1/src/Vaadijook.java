public class Vaadijook extends Jook{


    public Vaadijook(String nimetus, double hind, int maht) {
        super(nimetus, hind, maht);
    }

    @Override
    double liitriHind() {
        return 10 * hind;
    }

    @Override
    double tellimuseHind() {
        return hind * maht / 100;
    }

    @Override
    public String toString() {
        return "Vaadijook{" +
                "nimetus='" + nimetus + '\'' +
                ", hind=" + hind +
                ", maht=" + maht +
                '}';
    }
}
