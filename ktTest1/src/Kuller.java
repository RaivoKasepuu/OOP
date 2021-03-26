import java.util.ArrayList;
import java.util.List;

public class Kuller {

    private String kulleriNimi;
    private List<Integer> hinnangud = new ArrayList<>();  // võib panna ka konstruktori sisse


    public Kuller(String kulleriNimi) {
        this.kulleriNimi = kulleriNimi;
    }

    public void lisaHinnang(int hinnang) {
        hinnangud.add(hinnang);
    }

    public double keskmineHinnang() {
        double summa = 0;
        for (int i = 0; i < hinnangud.size(); i++) {
            summa += hinnangud.get(i);

        }
        return summa / hinnangud.size();
    }

    @Override
    public String toString() {
        return "Kuller{" +
                "kulleriNimi=' " + kulleriNimi + '\'' +
                ", keskmine hinnang = " + keskmineHinnang() +
                '}';
    }
}
