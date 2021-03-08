public class SõnadeAnalüüs {

    public static void main(String[] args) {
        String lause = "Ekraanile peab väljastatama alglause ning sõnad ja nende pikkused";
        System.out.println("Alglause on:");
        System.out.println(lause);
        String[] arrayOfLause = lause.split(" ");
        for (int i = 0; i < arrayOfLause.length; i++) {
            System.out.println(arrayOfLause[i] + " [" + arrayOfLause[i].length() + "]");
        }
    }
}


