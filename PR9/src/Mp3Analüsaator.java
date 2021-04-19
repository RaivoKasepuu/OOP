import java.io.*;

public class Mp3Analüsaator {

    private String fileName;

    public Mp3Analüsaator(String fileName) {
        this.fileName = fileName;
    }

    public boolean onKantri() throws Exception{
        File file = new File(this.fileName);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        randomAccessFile.seek(file.length() - 1);
        byte byteValue = randomAccessFile.readByte();
        System.out.println(byteValue);
        if (byteValue == 2) {
            return true;
        } else {
            return false;
        }
    }


}