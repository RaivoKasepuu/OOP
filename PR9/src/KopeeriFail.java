import java.io.*;
import java.util.Date;

public class KopeeriFail {

    private static void kopeeri(String original, String copy) throws Exception {
        File file = new File(original);
        if (file.isDirectory()) {
            System.out.println("Ära jama, külamees! See pole fail vaid kataloog!");
            System.exit(1);
        }
        else if (file.isFile()) {
            System.out.println("Normaalne, õnneks taipasid seekord kataloogi asemel faili kopeerida!");
            System.out.println("Kopeeritava faili suurus on: " + file.length());
            System.out.println("Faili kopeerimise aeg: " + new Date(file.lastModified()));
        }

        try (InputStream inputStream = new FileInputStream(original);
             OutputStream outputStream = new FileOutputStream(copy)) {
            byte[] buffer = new byte[1024];
            int read = inputStream.read(buffer);
            while (read > 0) {
                outputStream.write(buffer, 0, read);
                read = inputStream.read(buffer);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Kas sa andsid käsurealt faili nime?");
            System.exit(1);
        }
        kopeeri(args[0], args[0] + ".copy");
    }
}
