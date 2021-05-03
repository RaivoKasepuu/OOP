import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Pidu {

    private String fileName;
    private String visitor;
    private Map<String, String> visitorMap = new HashMap<>();
    private String invitor;

    public Pidu() {
    }

    public Pidu (String fileName, String visitor) throws Exception{
        this.fileName = fileName;
        this.visitor = visitor;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String row = bufferedReader.readLine();
            while (row != null) {
                String[] rowElement = row.split(" ");
                visitorMap.put(rowElement[1], rowElement[0]);
                row = bufferedReader.readLine();
            }
        }
        String invitor = visitorMap.get(visitor);
        while (visitorMap.containsKey(invitor)) {
            invitor = visitorMap.get(invitor);
        }
        this.invitor = invitor;
    }

    public String getInvitor() {
        return invitor;
    }


    public static void main(String[] args) throws Exception {
        Pidu pidu = new Pidu(args[0], args[1]);
        System.out.println(pidu.getInvitor());
    }
}
