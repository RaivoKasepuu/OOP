import java.io.*;
import java.util.zip.*;

public class Zipper {
    public static void zipi(String pakitavFail, String zipFail) throws Exception {
        try (ZipOutputStream zipVäljund = new ZipOutputStream(new FileOutputStream(zipFail));
             FileInputStream sisendFail = new FileInputStream(pakitavFail)) {
            // ettevalmistus zip-faili väljastuseks
            zipVäljund.putNextEntry(new ZipEntry(pakitavFail));
            // sisendfailist lugemine ja zip-faili kirjutamine
            byte[] buf = new byte[1024]; // andmevahetusbuffer
            int len;
            while ((len = sisendFail.read(buf)) > 0) { // omistamine ja kontroll kombineeritud
                zipVäljund.write(buf, 0, len); // (andmed, nihe, pikkus)
            }
        }
    }


    public static void unzipi(String pakitavFail, String zipFail) throws Exception {
        try (ZipOutputStream zipSisend = new ZipOutputStream(new FileOutputStream(zipFail));
             FileInputStream sisendFail = new FileInputStream(pakitavFail)) {
            // ettevalmistus zip-faili väljastuseks
            zipSisend.putNextEntry(new ZipEntry(pakitavFail));
            // sisendfailist lugemine ja zip-faili kirjutamine
            byte[] buf = new byte[1024]; // andmevahetusbuffer
            int len;
            while ((len = sisendFail.read(buf)) > 0) { // omistamine ja kontroll kombineeritud
                zipSisend.write(buf, 0, len); // (andmed, nihe, pikkus)
            }
        }
    }



}