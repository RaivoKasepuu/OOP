import java.util.ArrayList;
import java.util.List;

public class Tellimus {

    private List<Jook> joogid = new ArrayList<>();

    public void telliJook(Jook jook) {
        joogid.add(jook);
    }

    public double tellimuseMaksumus() {
        double koguMaksumus = 0;
        for (int i = 0; i < joogid.size(); i++) {
            koguMaksumus += joogid.get(i).getHind();
        }
        return Math.round(koguMaksumus * 100.0) / 100.0;
    }

    public void tellimuseJoogid() {
        System.out.println("Joogid:");
        for (int i = 0; i < joogid.size(); i++) {
            System.out.println("   " + joogid.get(i).getNimetus());
        }
    }

    public int tellimuseJookideArv() {
        return joogid.size();
    }

    @Override
    public String toString() {
        return  "Jooke kokku: " + tellimuseJookideArv() +
                ". Tasuda: " + tellimuseMaksumus() + "€" ;
    }
}
