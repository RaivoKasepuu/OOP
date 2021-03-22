import java.util.ArrayList;
import java.util.Collections;


public class TestLoosiratas {
    public static void main(String[] args) {


        ArrayList<Külastaja> list = new ArrayList<>();

        Külastaja albert1 = new Külastaja("Albert1", 4);
        list.add(albert1);
        Külastaja albert2 = new Külastaja("Albert2", 5);
        list.add(albert2);
        Külastaja albert3 = new Külastaja("Albert3", 6);
        list.add(albert3);
        Külastaja dilbert1 = new Külastaja("Dilbert1", 9);
        list.add(dilbert1);
        Külastaja dilbert2 = new Külastaja("Dillbert2", 8);
        list.add(dilbert2);
        Külastaja dilbert3 = new Külastaja("Dilbert3", 7);
        list.add(dilbert3);
        Külastaja molbert1 = new Külastaja("Molbert1", 1);
        list.add(molbert1);
        Külastaja mollbert2 = new Külastaja("Molbert2", 2);
        list.add(mollbert2);
        Külastaja molbert3 = new Külastaja("Molbert3", 3);
        list.add(molbert3);




        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNimi());
        }
        System.out.println(list.toString());

        Collections.sort(list, Collections.reverseOrder());
        int n = 3;

        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).getNimi());
        }

    }


}
