package Ülesanne_6;

public abstract class Telefon implements Comparable<Telefon> {
    private String telefoniNumber;
    private String telefoniHelin;

    public Telefon(String telefoniNumber, String telefoniHelin) {
        this.telefoniNumber = telefoniNumber;
        this.telefoniHelin = telefoniHelin;
    }


    public String getTelefoniNumber() {
        return telefoniNumber;
    }

    public void setTelefoniNumber(String telefoniNumber) {
        this.telefoniNumber = telefoniNumber;
    }

    public String getTelefoniHelin() {
        return telefoniHelin;
    }

    public void setTelefoniHelin(String telefoniHelin) {
        this.telefoniHelin = telefoniHelin;
    }


    @Override
    public String toString() {
        return "Telefon{" +
                "telefoniNumber='" + telefoniNumber + '\'' +
                ", telefoniHelin='" + telefoniHelin + '\'' +
                '}';
    }

    abstract String tähtisInfo();

    String viimasedNumbrid(int n) {
        String viimasedNumbrid = telefoniNumber.substring(telefoniNumber.length() - n, telefoniNumber.length());
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
