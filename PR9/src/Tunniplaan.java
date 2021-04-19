import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tunniplaan {

    private String[] ained;
    private int[] algused;

    public Tunniplaan(String[] ained, int[] algused) {
        this.ained = ained;
        this.algused = algused;
    }

    public Tunniplaan(String fileName) throws Exception {
        File file = new File(fileName);
        List<String> arrayOfStrings = new LinkedList<>();
        List<Integer> arrayOfIntegers = new LinkedList<>();
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {
            int counter = dataInputStream.readInt();
            for (int i = 0; i < counter; i++) {
                String one = dataInputStream.readUTF();
                arrayOfStrings.add(one);
            }
            int begins = dataInputStream.readInt();
            for (int i = 0; i < begins; i++) {
                int two = dataInputStream.readInt();
                arrayOfIntegers.add(two);
            }
            String[] ained = arrayOfStrings.toArray(new String[counter]);
            int[] algused = arrayOfIntegers.stream().mapToInt(i -> i).toArray();
            this.ained = ained;
            this.algused = algused;
        }
    }

    public void kirjutaFaili(String fileName) throws Exception {
        File file = new File(fileName);
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))) {
            dataOutputStream.writeInt(ained.length);
            for (String i : ained) dataOutputStream.writeUTF(i);
            dataOutputStream.writeInt(algused.length);
            for (int i : algused) {
                dataOutputStream.writeInt(i);
            }
        }
    }

    public int annaAlgusaeg(String study) {
        return algused[Arrays.asList(ained).indexOf(study)];
    }

    @Override
    public String toString() {
        return "Tunniplaan {" + " õppeained = " + Arrays.toString(ained) + ", tundide algused = " + Arrays.toString(algused) + " }";
    }
}
