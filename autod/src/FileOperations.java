import java.io.*;

public class FileOperations {

    public static void writeToFile(AutoMap autoMap) throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("autod.txt"));
        out.writeObject(autoMap);
        System.out.println("Writing done");

    }

    public static AutoMap readFromFile() throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream((new FileInputStream("autod.txt")));
        AutoMap autoMap = (AutoMap)  in.readObject();
        System.out.println("Reading done");

        return autoMap;

    }


}
