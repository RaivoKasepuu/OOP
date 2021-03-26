import java.util.ArrayList;
import java.util.List;

public class Tellimus {

    private List<Jook> joogidTellimuses = new ArrayList<>();

    public Tellimus() {
    }

    public void telliJook(Jook jook) {
        joogidTellimuses.add(jook);
    }


    public double tellimuseMaksumus() {
        double koguMaksumus = 0;
        for (int i = 0; i < joogidTellimuses.size(); i++) {
            koguMaksumus += joogidTellimuses.get(i).getHind();
        }
        return koguMaksumus;
    }

    public void tellimuseJoogid() {
        System.out.println("Kõik tellimuse joogid:");
        for (int i = 0; i < joogidTellimuses.size(); i++) {
            System.out.println(joogidTellimuses.get(i).nimetus);
        }
    }

    public void tellimuseJookideArv() {
        System.out.println("Jooke: " + joogidTellimuses.size());
    }


    @Override
    public String toString() {
        return "Tellimus{" +
                " tellimuse maksumus: " + tellimuseMaksumus() +
                " jookide arv: " + joogidTellimuses.size() +
                '}';
    }
}
