import java.util.ArrayList;
import java.util.List;

public class Tellimus {

    private List<Jook> joogid = new ArrayList<>();

    public Tellimus() {
        this.joogid = joogid;
    }

    public void telliJook(Jook jook) {

        joogid.add(jook);

    }


    public double tellimuseMaksumus() {
        double koguMaksumus = 0;
        for (int i = 0; i < joogid.size(); i++) {
            koguMaksumus += joogid.get(i).getHind();
        }
        return koguMaksumus;
    }

    public void tellimuseJoogid() {
        System.out.println("Kõik tellimuse joogid:");
        for (int i = 0; i < joogid.size(); i++) {
            System.out.println(joogid.get(i).getNimetus());
        }
    }

    public void tellimuseJookideArv() {
        System.out.println("Jooke: " + joogid.size());
    }


    @Override
    public String toString() {
        return "Tellimus{" +
                " tellimuse maksumus: " + tellimuseMaksumus() + "tugrikut" +
                " jookide arv: " + joogid.size() + " tk" +
                '}';
    }
}
