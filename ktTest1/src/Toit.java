public class Toit implements Comparable<Toit> {

    private String roog;
    private double hind;

    public Toit(String roog, double hind) {
        this.roog = roog;
        this.hind = hind;
    }

    public String getRoog() {
        return roog;
    }

    public double getHind() {
        return hind;
    }

    @Override
    public String toString() {
        return "Toit{" +
                "roog='" + roog + '\'' +
                ", hind=" + hind +
                '}';
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
