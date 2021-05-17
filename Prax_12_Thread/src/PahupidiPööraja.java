import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class PahupidiPööraja implements Runnable {

    // järjekord, mille kaudu ülesandeid vastu võetakse
    private BlockingQueue<String> algsedLaused;

    // järjekord, mille kaudu lahendused tagasi saadetakse
    private BlockingQueue<String> pahupidiLaused;

    public PahupidiPööraja(
            BlockingQueue<String> algsedLaused,
            BlockingQueue<String> pahupidiLaused) {
        this.algsedLaused = algsedLaused;
        this.pahupidiLaused = pahupidiLaused;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // proovime järgmise ülesande vastu võtta
                String lause = algsedLaused.poll();
                if (lause == null)
                    break; // ülesanded said otsa, lõpetame töö
                List<String> sõnad = Arrays.asList(lause.split(" "));
                Collections.reverse(sõnad);
                String pahupidiLause = String.join(" ", sõnad);
                // saadame lahenduse tagasi
                pahupidiLaused.put(pahupidiLause);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        List<String> algandmed = Arrays.asList(
                "A BlockingQueue does not accept null elements",
                "Designed to be used primarily for producer-consumer queues",
                "BlockingQueue implementations are thread-safe",
                "BlockingQueue can safely be used with multiple producers/consumers");

        // loome sõnumite järjekorrad ja määrame järjekorra maksimaalse suuruse
        BlockingQueue<String> pahupidiLaused = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> algsedLaused = new ArrayBlockingQueue<>(10);

        // lisame kõik pahupidi pööratavad laused tööde järjekorda
        algsedLaused.addAll(algandmed);

        // käivitame töölised (mõlemad võtavad võidu ühisest järjekorrast ülesandeid)
        new Thread(new PahupidiPööraja(algsedLaused, pahupidiLaused)).start();
        new Thread(new PahupidiPööraja(algsedLaused, pahupidiLaused)).start();

        for (int i = 0; i < algandmed.size(); i++) {
            // võtame tulemuste järjekorrast järgmise lause (vajadusel ootame)
            System.out.println(pahupidiLaused.take());
        }
    }
}