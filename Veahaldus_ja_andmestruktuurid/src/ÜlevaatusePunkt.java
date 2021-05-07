import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.*;

public class ÜlevaatusePunkt {

    private static List<Auto> loeAutod(String failinimi) throws IOException {
        List<Auto> autod = new ArrayList<>();
        try(DataInputStream dis = new DataInputStream(new FileInputStream(failinimi))){
            int autodeArv = dis.readInt();
            for (int i = 0; i < autodeArv; i++) {
                String regNr = dis.readUTF();
                String omanik = dis.readUTF();
                String aegSõnena = dis.readUTF();
                LocalDate ülevaatus = LocalDate.parse(aegSõnena);
                Auto auto = new Auto(regNr, omanik, ülevaatus);
                autod.add(auto);
            }
        }
        return autod;
    }

    private static Map<String , List<Auto>> omanikeKaupa(List<Auto> autod){
        Map<String, List<Auto>> omanikudAutod = new HashMap<>();
        for (Auto auto:autod) {
            List<Auto> autolist = new ArrayList<>();
            /*
            if(omanikudAutod.containsKey(auto.getOmanik())){
                autolist = omanikudAutod.get(auto.getOmanik());
                autolist.add(auto);
                omanikudAutod.put(auto.getOmanik(), autolist);
            }
            else{
                autolist.add(auto);
                omanikudAutod.put(auto.getOmanik(), autolist);
            }

             */
            String omanik = auto.getOmanik();
            autolist = omanikudAutod.getOrDefault(omanik, autolist);
            autolist.add(auto);
            omanikudAutod.put(omanik, autolist);
        }

        return omanikudAutod;
    }

    public static void main(String[] args) throws IOException{
        /*LocalDate kuupäev = LocalDate.parse("2021-02-15");
        Auto auto = new Auto("222BVD", "Siim Siil", kuupäev);
        System.out.println(auto);
        auto.teostaÜlevaatus();
         */
        List<Auto> autod = loeAutod("autod.bin");
        /*System.out.println(autod);
        for (int i = 0; i < autod.size(); i++) {
            System.out.print(autod.get(i));

         */

        Map<String , List<Auto>> omanikudAutod = omanikeKaupa(autod);
        //System.out.println(omanikudAutod);

        Scanner sc = new Scanner(System.in);
        System.out.println("Kas soovid ülevaatust (T)eostada, autosid (V)aadata või (S)alvestada ja lõpetada?");
        String vastus = sc.nextLine();
        while(!vastus.equals("S")){
            if(vastus.equals("T")){
                Collections.sort(autod);
                Auto auto = autod.get(0);
                System.out.println(auto);
                try{
                    auto.teostaÜlevaatus();
                }
                catch (ÜlevaatuseErind e){
                    System.out.println(e.getMessage());
                }
            }
            if (vastus.equals("V")){
                System.out.println("Oled vaadelnud järgmisi linde:");


                System.out.println("Sisesta omaniku nimi: ");
                String omanik = sc.nextLine();
                if(omanikudAutod.containsKey(omanik)){
                    List<Auto> alist = omanikudAutod.get(omanik);
                    for (Auto auto : alist) {
                        System.out.print(auto);
                    }
                }
                else{
                    System.out.println("Sellist omanikku ei ole!");
                    System.exit(0);
                }
            }
            System.out.println("Kas soovid ülevaatust (T)eostada, autosid (V)aadata või (S)alvestada ja lõpetada?");
            vastus = sc.nextLine();
        }
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("autod.txt", true), StandardCharsets.UTF_8))){
            Collections.sort(autod);
            for (Auto auto : autod) {
                bw.write(auto.toString());
            }
            System.out.println("Autod on salvestatud!");
        }

    }
}
