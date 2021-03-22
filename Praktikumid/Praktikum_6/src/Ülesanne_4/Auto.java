package Ülesanne_4;

public class Auto extends  Sõiduk {
    private int rattasteArv;

    public Auto(double kiirus, String numbriMärk, int rattasteArv) {
        super(kiirus, numbriMärk);
        this.rattasteArv = rattasteArv;
    }


    public int getRattasteArv() {
        return rattasteArv;
    }

    public void setRattasteArv(int rattasteArv) {
        this.rattasteArv = rattasteArv;
    }

    public double keskmineKiirus (double kiirus) {
        return kiirus - 20;
    }

    @Override
    public String toString() {
        return "Ülesanne_4.Sõiduk{" +
                "maksimaalne kiirus=" + getKiirus() +
                ", numbriMärk='" + getNumbriMärk() + '\'' +
                ", rattasteArv=" + rattasteArv +
                '}';
    }



}
