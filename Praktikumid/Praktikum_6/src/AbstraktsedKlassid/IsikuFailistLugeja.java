package AbstraktsedKlassid;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

abstract class IsikuFailistLugeja {

    protected abstract Isik ridaIsikuks(String rida);

    public List<Isik> loeIsikud(File sisend) throws Exception {
        // Files.readAllLines saab kasutada, et kiirelt etteantud failist kõik read listi lugeda
        List<String> read = Files.readAllLines(sisend.toPath(), StandardCharsets.UTF_8);
        List<Isik> isikud = new ArrayList<>();
        for (String rida : read) {
            isikud.add(ridaIsikuks(rida));
        }
        return isikud;
    }
}
