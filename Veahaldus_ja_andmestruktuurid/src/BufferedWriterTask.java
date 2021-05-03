import java.io.*;

class BufferedWriterTask {

      public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[0]), "UTF-8"))) {
            bufferedWriter.write("Hello World!");
        }
    }

}