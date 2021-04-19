package oop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Kodeering {

    public static void main(String[] args) throws Exception{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("tekst.txt"));

             BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {

             bw.write("Andjä käsi väsis ära, võtje käsi ei väsi kunagi");
             bw.close();

            System.out.println(br.readLine());
        }
    }
}
