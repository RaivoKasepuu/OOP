public class A7_käsurealt {

    public static void main(String[] args) {
        System.out.println("A7 käsurealt");

        String nimi = args[0];
        double BMI = Double.parseDouble(args[1]) / Math.pow(Double.parseDouble(args[2]), 2);
        System.out.println(nimi + ", Simu kehamassiindeks on: " + BMI);
        if (BMI < 18.5) {
            System.out.println("alakaal!");

        } else if (BMI < 25 && BMI >= 18.5) {
            System.out.println("normaalkaal");
        } else {
            System.out.println("ülekaal. Võtame veel ühed õlled?");
        }

    }
}


