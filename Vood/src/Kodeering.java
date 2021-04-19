import java.io.*;
import java.nio.charset.Charset;

public class Kodeering {

    public static void main(String[] args) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("tekst.txt",
                Charset.forName("Windows-1257")));
             BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            bw.write("Andjä käsi väsis ära, võtje käsi ei väsi kunagi");
            bw.close();
            System.out.println(br.readLine());
        }
    }
}