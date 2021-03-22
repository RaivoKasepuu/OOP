import java.util.ArrayList;
import java.util.List;


public class AmeerikaMäed {

     /*
    Peatüki sissejuhatuses küsisime, kuidas võiks tagastada kontrollmeetodis sobimatud dokumendid. Pärast liideste
    õppimist on seda probleemi oluliselt lihtsam lahendada. Veenduge ise! Looge klassi AmeerikaMäed uus meetod
    ebasobivadDokumendid, mis võtab argumendiks dokumentide massiivi ja tagastab kõik dokumendid, mis vanusekontrolli
    ei läbinud. Tagastustüübiks kasutage List<Dokument>. Peameetodis väljastage kõik sobimatud dokumendid.
    Mõistliku väljundi nägemiseks lisage IdKaardile ja Õpilaspiletile ka sobilikud toString meetodid.
    Lõpuks lihtsustage meetodi vanusedSobivad koodi delegeerides põhitöö äsja loodud uuele meetodile.
     */



/*
    public boolean vanusedSobivad(Dokument[] dokumendid) {
        for (Dokument dokument : dokumendid) {
            if (!dokument.onVähemalt12Aastane())
                return false;
        }
        return true;
    }



    public List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid) {

        ArrayList<Dokument> sobimatud = new ArrayList<>();

        for (Dokument dokument : dokumendid) {
            if (!dokument.onVähemalt12Aastane()){
                sobimatud.add(dokument);
            }
        }
        return sobimatud;
    }
*/

}