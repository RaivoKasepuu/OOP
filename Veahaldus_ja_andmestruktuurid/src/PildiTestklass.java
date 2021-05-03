import java.util.Scanner;

public class PildiTestklass {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            while (true) {
                try {
                    Pilt pilt = new Pilt(1, 1);
                    System.out.println("Mul on üks pilt.");
                    System.out.println("Pildi laius on: " + pilt.getPictureWidth() + " pikslit");
                    System.out.println("pildi kõrgus on: " + pilt.getPictureHeight() + " pikslit");
                    System.out.println("Sisesta koordinaat X (täisarv vahemikus 1..." + pilt.getPictureWidth() + ") : ");
                    Integer locationX = Integer.parseInt(scanner.nextLine());
                    System.out.println("Sisesta koordinaat Y (täisarv vahemikus 1..." + pilt.getPictureHeight() + ") : ");
                    Integer locationY = Integer.parseInt(scanner.nextLine());
                    System.out.println("Sisesta värvikood (täisarv vahemikus 0...255): ");
                    Integer colorCode = Integer.parseInt(scanner.nextLine());
                    System.out.println("Valisid piksli X = " + locationX + " Y = " + locationY + " ja tema tooniks on hetkel " + pilt.annaPiksel(locationX, locationY));
                    pilt.määraPiksel(locationX, locationY, colorCode);
                    System.out.println("Määrasid pikslile kohal X = " + locationX + " ja Y = " + locationY + " värvikoodiks " + colorCode);
                    System.out.println("Uueks piksli X = " + locationX + " Y = " +  locationY + " väärtuseks on " + pilt.annaPiksel(locationX, locationY));
                } catch (NumberFormatException e) {
                    System.out.println("Sisetatu pole täisarv");
                }
            }
        }
    }
}
