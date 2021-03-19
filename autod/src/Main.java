import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        AutoMap autoMap = FileOperations.readFromFile();
  //      System.out.println(autoMap.getKeys());

        AutoMap autoMap = new AutoMap();
        Auto auto1 = new Auto("123", "dddd", "fffff");

        autoMap.addAuto(autoMap.getNextKey(), auto1);
        Auto auto2 = new Auto("223", "dddd", "fffff");
        autoMap.addAuto(autoMap.getNextKey(), auto2);
        Auto auto3 = new Auto("323", "dddd", "fffff");
        autoMap.addAuto(autoMap.getNextKey(), auto3);
        Auto auto4 = new Auto("423", "dddd", "fffff");
        autoMap.addAuto(autoMap.getNextKey(), auto4);
        Auto auto5 = new Auto("523", "dddd", "fffff");
        autoMap.addAuto(autoMap.getNextKey(), auto5);

        Auto auto6 = new Auto("623", "dddd", "fffff");
        autoMap.addAuto(auto6);

        System.out.println(autoMap);
        //String autoString = autoMap.toString();

        //FileOperations.writeToFile(autoMap);

        System.out.println(autoMap.getKeys());
        System.out.println(autoMap.getNextKey());

        autoMap.removeAuto(3);
        System.out.println(autoMap.getKeys());

        System.out.println(autoMap.getAuto(4));
        autoMap.getAuto(4).setVin("xxxxxx");
        System.out.println(autoMap.getAuto(4));

        System.out.println(autoMap.getAutoMap());
        //AutoMap autoMap2 = FileOperations.readFromFile();

        System.out.println(autoMap);


    }

}
