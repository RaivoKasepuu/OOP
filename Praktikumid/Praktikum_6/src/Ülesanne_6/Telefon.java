package Ülesanne_6;

public abstract class Telefon implements Comparable<Telefon> {
    private String Number;
    private String Helin;

    public Telefon(String telefoniNumber, String telefoniHelin) {
        this.Number = telefoniNumber;
        this.Helin = telefoniHelin;
    }


    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public String getHelin() {
        return Helin;
    }

    public void setHelin(String helin) {
        this.Helin = helin;
    }


    @Override
    public String toString() {
        return "Telefon{" +
                "telefoniNumber='" + Number + '\'' +
                ", telefoniHelin='" + Helin + '\'' +
                '}';
    }

    abstract String tähtisInfo();

    String viimasedNumbrid(int n) {
        String viimasedNumbrid = Number.substring(Number.length() - n, Number.length());
        return viimasedNumbrid;
    }


    public int compareTo(Telefon võrreldav) {
        if (Integer.parseInt(viimasedNumbrid(3)) < Integer.parseInt(võrreldav.viimasedNumbrid(3)))
            return -1;

        if (Integer.parseInt(viimasedNumbrid(3)) > Integer.parseInt(võrreldav.viimasedNumbrid(3)))
            return 1;

        return 0;
    }
}
