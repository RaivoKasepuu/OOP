abstract class Jook implements Comparable<Jook> {

    private String nimetus;
    private double hind;
    private int maht;

    public Jook(String nimetus, double hind, int maht) {
        this.nimetus = nimetus;
        this.hind = hind;
        this.maht = maht;
    }

    public String getNimetus() {
        return nimetus;
    }

    public double getHind() {
        return hind;
    }

    public int getMaht() {
        return maht;
    }

    abstract double liitriHind();

    abstract double tellimuseHind();

    @Override
    public String toString() {
        return "Jook{" +
                "nimetus='" + nimetus + '\'' +
                ", hind=" + hind +
                ", maht=" + maht +
                ", liitri hind=" + liitriHind() +
                ", tellimuse hind=" + tellimuseHind() +
                '}';
    }

    @Override
    public int compareTo(Jook o) {
        if (liitriHind() > o.liitriHind()) {  // vastavalt liitri hinnale
            return 1;
        } else if (liitriHind() < o.liitriHind()) {
            return -1;
        } else {
            return 0;
        }
    }
}
