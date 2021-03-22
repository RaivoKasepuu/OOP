package Ülesanne_4;

public class Sõiduk {

    private double kiirus;
    private String numbriMärk;


    public Sõiduk(double kiirus, String numbriMaärk) {
        this.kiirus = kiirus;
        this.numbriMärk = numbriMaärk;
    }

    public double getKiirus() {
        return kiirus;
    }

    public void setKiirus(double kiirus) {
        this.kiirus = kiirus;
    }

    public String getNumbriMärk() {
        return numbriMärk;
    }

    public void setNumbriMärk(String numbriMärk) {
        this.numbriMärk = numbriMärk;
    }


    public double keskmineKiirus (double kiirus) {
    return kiirus - 10;
    }


    @Override
    public String toString() {
        return "Ülesanne_4.Sõiduk{" +
                "maksimaalne kiirus=" + kiirus +
                ", numbriMärk='" + numbriMärk + '\'' +
                '}';
    }
}
