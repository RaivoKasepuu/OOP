public class Isik {
    String nimi; // isendiväli isiku nime jaoks
    double pikkus; // isendiväli isiku pikkuse jaoks
    double kaal; // isendiväli isiku kaalu jaoks
    int vanus; //isendiväli vanuse jaoks

    public double getKaal() {
        return kaal;
    }

    public void setKaal(double kaal) {
        this.kaal = kaal;
    }

    public int getVanus() {
        return vanus;
    }

    public void setVanus(int vanus) {
        this.vanus = vanus;
    }

    public Isik(String nimi, double pikkus, double kaal, int vanus) {
        this.nimi = nimi;
        this.pikkus = pikkus;
        this.kaal = kaal;
        this.vanus = vanus;
    }

    Isik(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return "Isik{" +
                "nimi='" + nimi + '\'' +
                ", pikkus=" + pikkus +
                ", kaal=" + kaal +
                ", vanus=" + vanus +
                '}';
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus;
    }

    public Isik() {
        nimi = "Nimetu";
        pikkus = 0.0;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }

    public double bmi() {
        return kaal / (pikkus * pikkus); // KMI = kaal (kg) / pikkus (m)²
    }

    public int sünniAasta(int aasta) {
        return aasta - vanus;
    }
}
