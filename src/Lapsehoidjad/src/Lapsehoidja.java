public class Lapsehoidja {

    int firmaNumber;
    String nimi;

    public Lapsehoidja(int firmaNumber, String nimi) {
        this.firmaNumber = firmaNumber;
        this.nimi = nimi;
    }

    public int getFirmaNumber() {
        return firmaNumber;
    }

    public void setFirmaNumber(int firmaNumber) {
        this.firmaNumber = firmaNumber;
    }

    @Override
    public String toString() {
        return "Lapsehoidja{" +
                "firmaNumber=" + firmaNumber +
                ", nimi='" + nimi + '\'' +
                '}';
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}
