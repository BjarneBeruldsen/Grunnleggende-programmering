import java.util.ArrayList;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("pants");
            //når ikke denne
            System.out.println("Denne blir ikke printet");
        } catch (NumberFormatException e) {
            System.out.println("Feil format!");
        } finally {
            //blir alltid gjennomført uansett
            System.out.println("Blokk ");
        }
        System.out.println("Programmet fortsetter");
        System.out.println("Tall blir 5 siden finally alltid blir utført: " + tall());

    }

    public static int tall() {
        try {
            return 3;
        }
        catch (Exception e) {
            return 4;
        }
        finally {
            return 5; //Bør unngå dette
        }
    }
}