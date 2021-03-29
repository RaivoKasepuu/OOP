import java.io.*;
import java.util.List;

public class FileOperations {

    public static void writeToFile(List<Auto> list, File fileName) throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(list);
        System.out.println("Writing done");

    }

    public static List<Auto> readFromFile(File fileName) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream((new FileInputStream(fileName)));
        List<Auto> list = (List<Auto>) in.readObject();
        System.out.println("Reading done");

        return list;

    }


}

