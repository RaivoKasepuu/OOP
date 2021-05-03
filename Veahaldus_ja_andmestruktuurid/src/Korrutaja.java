import java.util.Scanner;

public class Korrutaja {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Oskan kahega korrutada! Sisesta täisarv: ");
                Integer userInput = Integer.parseInt(sc.nextLine());
                System.out.println(2 * userInput);
            } catch (NumberFormatException e) {
                System.out.println("Ma ju palusin, sisesta TÄISarv!!! Mis jama sina mulle aga pakud: " + e + " Mõtle veidi ja tee uuesti!");
            }
        }
    }
}