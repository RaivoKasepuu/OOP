import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {

    private String atraktsiooniNimi;
    private int nõutudVanus;

    @Override
    public String toString() {
        return "Atraktsioon{" +
                "atraktsiooniNimi='" + atraktsiooniNimi + '\'' +
                ", nõutudVanus=" + nõutudVanus +
                '}';
    }

    public String getAtraktsiooniNimi() {
        return atraktsiooniNimi;
    }

    public void setAtraktsiooniNimi(String atraktsiooniNimi) {
        this.atraktsiooniNimi = atraktsiooniNimi;
    }

    public int getNõutudVanus() {
        return nõutudVanus;
    }

    public void setNõutudVanus(int nõutudVanus) {
        this.nõutudVanus = nõutudVanus;
    }

    public Atraktsioon(String atraktsiooniNimi, int nõutudVanus) {
        this.atraktsiooniNimi = atraktsiooniNimi;
        this.nõutudVanus = nõutudVanus;
    }
/*
    public boolean vanusedSobivad(Dokument[] dokumendid) {
        for (Dokument dokument : dokumendid) {
            if (!dokument.onVähemalt12Aastane())
                return false;
        }
        return true;
    }
*/
    /*
    Peatüki sissejuhatuses küsisime, kuidas võiks tagastada kontrollmeetodis sobimatud dokumendid. Pärast liideste
    õppimist on seda probleemi oluliselt lihtsam lahendada. Veenduge ise! Looge klassi AmeerikaMäed uus meetod
    ebasobivadDokumendid, mis võtab argumendiks dokumentide massiivi ja tagastab kõik dokumendid, mis vanusekontrolli
    ei läbinud. Tagastustüübiks kasutage List<Dokument>. Peameetodis väljastage kõik sobimatud dokumendid.
    Mõistliku väljundi nägemiseks lisage IdKaardile ja Õpilaspiletile ka sobilikud toString meetodid.
    Lõpuks lihtsustage meetodi vanusedSobivad koodi delegeerides põhitöö äsja loodud uuele meetodile.
     */

    public List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid) {

        ArrayList<Dokument> sobimatud = new ArrayList<>();

        for (Dokument dokument : dokumendid) {
            if (!dokument.vanusOnVähemalt(getNõutudVanus())) {
                sobimatud.add(dokument);
            }
        }
        return sobimatud;
    }


}