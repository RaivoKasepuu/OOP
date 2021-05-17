import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FailiLugeja implements Runnable {
    private String fail;

    public FailiLugeja(String fail) {
        this.fail = fail;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(new File(fail))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

