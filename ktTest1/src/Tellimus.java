import java.util.ArrayList;
import java.util.List;

public class Tellimus {
    private Kuller kuller;
    private List<Toit> toidud = new ArrayList<>();

    public Tellimus(Kuller kuller) {
        this.kuller = kuller;
       // toidud = new ArrayList<>();
    }
    public void lisaToit(Toit toit){
        toidud.add(toit);
    }

    public Kuller getKuller() {
        return kuller;
    }

    public double summa() {
        double maksumus = 0;
        for(Toit toit: toidud) {
            maksumus += toit.getHind();
        }
        return maksumus;
    }

    @Override
    public String toString() {
        return "Tellimus{" +
                "kogumaksumus=" + summa() +
                ", toitude arv=" + toidud.size() +
                ", kulleri hinnang" + kuller.keskmineHinnang() +
                '}';
    }
}
