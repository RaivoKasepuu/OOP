package Ülesanne_4;

public class Kastiauto extends Auto {

    private double furgooniRuumala;

    @Override
    public String toString() {
        return "Ülesanne_4.Sõiduk{" +
                "maksimaalne kiirus=" + getKiirus() +
                ", numbriMaärk='" + getNumbriMärk() + '\'' +
                ", rattasteArv=" + getRattasteArv() +
                ", furgooniRuumala=" + furgooniRuumala +
                '}';
    }

    public Kastiauto(double kiirus, String numbriMärk, int rattasteArv, double furgooniRuumala) {
        super(kiirus, numbriMärk, rattasteArv);
        this.furgooniRuumala = furgooniRuumala;
    }

    public double getFurgooniRuumala() {
        return furgooniRuumala;
    }

    public double keskmineKiirus (double kiirus) {
        return kiirus - 30;
    }

    public void setFurgooniRuumala(double furgooniRuumala) {
        this.furgooniRuumala = furgooniRuumala;
    }
}
