public class Toit implements Comparable<Toit> {


    private String nimetus;
    private double hind;

    @Override
    public String toString() {
        return "Toit{" +
                "nimetus='" + nimetus + '\'' +
                ", hind=" + getHind() +
                '}';
    }

    public Toit(String nimetus, double hind) {
        this.nimetus = nimetus;
        this.hind = hind;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getHind() {
        return hind;
    }

    public void setHind(double hind) {
        this.hind = hind;
    }

    @Override
    public int compareTo(Toit o) {
        if (getHind() > o.getHind()) {
            return 1;
        } else if (getHind() < o.getHind()) {
            return -1;
        } else {
            return 0;
        }
    }
}
