package Ülesanne_6;
public class Mobiiltelefon extends Telefon{
    private String omanikuNimi;
    private boolean pildistamisVõimalus;

    public Mobiiltelefon(String telefoniNumber, String telefoniHelin, String omanikuNimi, boolean pildistamisVõimalus) {
        super(telefoniNumber, telefoniHelin);
        this.omanikuNimi = omanikuNimi;
        this.pildistamisVõimalus = pildistamisVõimalus;
    }

    @Override
    String tähtisInfo() {
        return omanikuNimi;
    }

    @Override
    public String toString() {
        return "Mobiiltelefon: " + super.toString() + ", omanikuNimi = " + omanikuNimi + ", pildistamisVõimalus = " + pildistamisVõimalus;
    }
}