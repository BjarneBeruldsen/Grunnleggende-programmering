import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        //legger til måneder og antDager i tabeller
        String[] mnd = {"Januar", "Februar", "Mars", "April", "Mai", "Juni",
                        "Juli", "August", "September", "Oktober", "November", "Desember"};
        int[] antDager = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //ber bruker om å oppgi tall fra 1-12
        Scanner input = new Scanner(System.in);

        System.out.print("Gi mnd fra 1-12: ");
        int nr = 0;

        try {
            //henter nr
            nr = input.nextInt();
            System.out.println("Måned: " + mnd[nr-1] + " Antall dager: " + antDager[nr-1]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("mnd.nr: " + nr + " er ikke fra 1-12");
        }
        catch (InputMismatchException e) {
            System.out.println("mnd.nr må være et heltall");
        }
    }
}