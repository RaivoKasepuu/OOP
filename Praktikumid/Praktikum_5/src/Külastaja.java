public class Külastaja implements Comparable {

    private String nimi;
    private int atraktsioonideArv;

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setAtraktsioonideArv(int atraktsioonideArv) {
        this.atraktsioonideArv = atraktsioonideArv;
    }

    public Külastaja(String nimi, int atraktsioonideArv) {
        this.nimi = nimi;
        this.atraktsioonideArv = atraktsioonideArv;
    }

    @Override
    public String toString() {
        return "Külastaja{" +
                "nimi='" + nimi + '\'' +
                '}';
    }

    public String getNimi() {
        return nimi;
    }

    public int getAtraktsioonideArv() {
        return atraktsioonideArv;
    }

    @Override
    public int compareTo(Object temp) {

        Külastaja other = (Külastaja) temp;

        if(getAtraktsioonideArv() > other.getAtraktsioonideArv()) {
            return 1;
        } else if (getAtraktsioonideArv() < other.getAtraktsioonideArv()) {
            return -1;
        } else {
            return 0;
        }
    }
}
