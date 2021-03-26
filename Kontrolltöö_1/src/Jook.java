abstract class Jook implements Comparable<Jook> {

    String nimetus;
    double hind;
    int maht;

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
                ", liitri hind=" + maht +
                ", tellimuse hind=" + maht +
                '}';
    }

    @Override
    public int compareTo(Jook o) {
        if (getHind()/getMaht() > o.getHind()/o.getMaht()) {  // vastavalt liitri hinnale
            return 1;
        } else if (getHind()/getMaht() < o.getHind()/o.getMaht()) {
            return -1;
        } else {
            return 0;
        }
    }
}
