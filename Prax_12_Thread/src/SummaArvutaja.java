import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;

public class SummaArvutaja implements Runnable {

    private BlockingQueue<String> fileNames;
    private BlockingQueue<Integer> sums;

    public SummaArvutaja(BlockingQueue<String> fileNames, BlockingQueue<Integer> sums) {
        this.fileNames = fileNames;
        this.sums = sums;
    }

    public int summaArvutaja(String fileName) {
        Integer sum = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String row = bufferedReader.readLine();
            while (row != null) {
                String[] intsInData = row.split(" ");
                for (int i = 0; i < intsInData.length; i++) {
                    int arvuna = Integer.parseInt(intsInData[i]);
                    sum += arvuna;
                }
                row = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String fileName = fileNames.poll();
                if (fileName == null)
                    break;
                int summa = summaArvutaja(fileName);
                sums.put(summa);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
