package AbstraktsedKlassid;

import java.io.File;
import java.util.List;

class DemoAbstract {
    public static void main(String[] args) throws Exception {
        EesnimiPerenimiLugeja epLugeja = new EesnimiPerenimiLugeja();
        List<Isik> nimed = epLugeja.loeIsikud(new File("nimed.txt"));
        IsikuFailistLugeja teineLugeja = new PerenimiEesnimiLugeja();
        List<Isik> ametlikudNimed = teineLugeja.loeIsikud(new File("ametlikud-nimed.txt"));
        // IsikuFailistLugeja lugeja = new IsikuFailistLugeja(); // viga!
    }
}