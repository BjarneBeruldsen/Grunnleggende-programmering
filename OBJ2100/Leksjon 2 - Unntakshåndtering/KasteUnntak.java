import java.util.Scanner;

public class KasteUnntak {
    public static void main(String[] args) {
        //henter tall fra bruker
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn to tall: ");
        int tall1 = input.nextInt();
        int tall2 = input.nextInt();

        try{
            int resultat = del(5, 0);
            System.out.println("Tall 1: " + tall1 + " + Tall 2: " + tall2 +
                               " = " + resultat);
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: En integer kan ikke bli delt på 0");
        }

        System.out.println("Fortsetter..");


        for(int i=0;i<2;i++) {
            try{
                System.out.println(1 / 0 );
                System.out.println(i + "");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static int del(int tall1, int tall2) {
        if(tall2 == 0) {
            throw new ArithmeticException("Divident kan ikke være null");
        }
        return tall1 / tall2;
    }
}