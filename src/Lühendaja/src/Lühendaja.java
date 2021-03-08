import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import java.util.Scanner;

public class Lühendaja {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        java.io.File fail = new java.io.File("nimed.txt");

        try (java.util.Scanner sc = new java.util.Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                String nimi = tükid[tükid.length - 1];

                for (int i = 0; i < tükid.length - 1; i++) {
                    String [] sidekriipsugaEesnimi = tükid[i].split("-");
                    if (sidekriipsugaEesnimi.length > 1) {
                        nimi = nimi + " " + sidekriipsugaEesnimi[0].charAt(0) + "-" +
                                sidekriipsugaEesnimi[1].charAt(0) + ".";
                    }
                    else {
                        nimi = nimi + " " + tükid[i].charAt(0) + "."  ;
                    }
                }
                System.out.println(nimi);
            }
        }
    }
}
