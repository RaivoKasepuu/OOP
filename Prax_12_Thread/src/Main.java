import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    private static BlockingQueue<String> integerFileGenerator(int counter) throws IOException {
        BlockingQueue<String> list = new ArrayBlockingQueue<>(counter);
        System.out.println("Genereerime täisarvude failid...");
        for (int i = 0; i < counter; i++) {
            String fileName = "intFile" + (i + 1) + ".txt";
            try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
                for (int j = 0; j < 1000000; j++) {
                    Integer max = 100;
                    Integer randomInteger =  + (int) (Math.random() * max);
                    bufferedWriter.write(randomInteger + " ");
                }
                System.out.println("Loodud file: " + fileName);
                list.add(fileName);
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta loodavate täisarvudega failide arv: ");
        Integer counter = sc.nextInt();
        BlockingQueue<String> files = integerFileGenerator(counter);
        BlockingQueue<Integer> intSum = new ArrayBlockingQueue<>(counter);

        Thread threadOne = new Thread(new SummaArvutaja(files, intSum));
        Thread threadTwo = new Thread(new SummaArvutaja(files, intSum));
        Thread threadThree = new Thread(new SummaArvutaja(files, intSum));
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadOne.join();
        threadTwo.join();
        threadThree.join();
        System.out.println();
        for (int i = 0; i < counter; i++) {
            System.out.println("intFile"+ i + ".txt summa: " + intSum.poll());
        }
    }
}
