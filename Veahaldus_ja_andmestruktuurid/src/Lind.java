public class Lind {

private String liik;
private String värv;
private char sugu;
private boolean kaitseAll;

    public Lind(String liik, String värv, char sugu, boolean kaitseAll) {
        this.liik = liik;
        this.värv = värv;
        // kontrollime siin sugu ja väljastame teate...
        if (sugu !='N' && sugu !='M') {
            throw new ValeSuguErind("Sootu lind? Selliseid me ei lisa... Proovi uuesti");
        } else {
            this.sugu = sugu;
        }
        this.kaitseAll = kaitseAll;
    }

    public String getLiik() {
        return liik;
    }

    public String getVärv() {
        return värv;
    }

    public char getSugu() {
        return sugu;
    }

    public boolean isKaitseAll() {
        return kaitseAll;
    }

    @Override
    public String toString() {
        return liik + " " + värv + " " + sugu + " " + kaitseAll + "\n";
    }

    public String toKaitseAllString() {
        return liik + " " + värv + " " + sugu + "\n";
    }
}
