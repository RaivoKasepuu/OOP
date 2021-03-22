package Ülesanne_6;

public class Lauatelefon extends Telefon{
    private String asukoht;

    public Lauatelefon(String telefoniNumber, String telefoniHelin, String asukoht) {
        super(telefoniNumber, telefoniHelin);
        this.asukoht = asukoht;
    }

    @Override
    String tähtisInfo() {
        return asukoht;
    }

    @Override
    public String toString() {
        return "Lauatelefon: " + super.toString() + ", telefoni asukoht = " + asukoht;
    }
}