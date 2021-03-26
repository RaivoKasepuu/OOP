public class Klient {

    private String nimi;
    private double raha;


    public Klient(String nimi, double raha) {
        this.nimi = nimi;
        this.raha = raha;
    }

    public void maksa(Tellimus tellimus) {
        raha -=tellimus.summa();
    }

    public void hinda(Tellimus tellimus){
        int hinnang = (int) Math.round(Math.random()*3 + 2);
        tellimus.getKuller().lisaHinnang(hinnang);
    }

    @Override
    public String toString() {
        return "Klient{" +
                "nimi = '" + nimi + '\'' +
                ", raha = " + raha +
                '}';
    }
}
