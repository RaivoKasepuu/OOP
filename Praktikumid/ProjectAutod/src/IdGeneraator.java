import java.util.Random;

// Siin klassis genereerime juhusliku ID autodele.
public class IdGeneraator {

    public static Integer getNextId() {
        Random random = new Random();

        return 100000 + random.nextInt(10000);

    }
}
