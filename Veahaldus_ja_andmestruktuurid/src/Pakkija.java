import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Pakkija {
    public static void main(String[] args) throws IOException{
        File inputFile = new File(args[0]);
        File resultZipFile = new File(args[1]);
        theZipper(inputFile, resultZipFile);
        System.out.println("Varukoopia tehtud.");
        System.out.println("Kena päeva!");
    }

    private static void theZipper(File inputFile, File resultZipFile) throws IOException{
        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             ZipOutputStream zipOutputStream = new ZipOutputStream(
                     new BufferedOutputStream(new FileOutputStream(resultZipFile)))) {
            zipOutputStream.putNextEntry(new ZipEntry(inputFile.getName()));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, length);
            }
            inputFile.delete();
            System.out.println("Algne fail kustutatud.");
        }
    }
}
