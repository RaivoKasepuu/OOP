import java.util.ArrayList;
import java.util.List;

public class Tellimus {

    private List<Jook> joogid = new ArrayList<>();

    public Tellimus() {
    }

    public void telliJook (Jook jook) {
        joogid.add(jook);
    }


    public double tellimuseMaksumus() {
        double koguMaksumus = 0;

        return koguMaksumus;
    }

    public void tellimuseJoogid() {
        System.out.println("Kõik joogid");
    }

    @Override
    public String toString() {
        return "Tellimus{" +
                "tellimuse maksumus" + tellimuseMaksumus() +
                "jookide arv" + joogid.size() +
                '}';
    }
}
