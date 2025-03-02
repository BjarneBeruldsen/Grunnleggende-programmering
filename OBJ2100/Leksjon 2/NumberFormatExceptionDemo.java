import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        //henter tall fra bruker
        Scanner input = new Scanner(System.in);
        System.out.print("Gi tall1 + operator + tall2 adskilt med mellomrom: ");
        String linje = input.nextLine();
        String[] data = linje.split(" ");
        int sum = 0;
        int t1, t2;
        String operator;

        try {
            t1 = Integer.parseInt(data[0]);
            t2 = Integer.parseInt(data[2]);
            operator = data[1];

            switch(operator) {
                case "+" :
                    sum = t1 + t2; break;
                case "-" :
                    sum = t1 - t2; break;
                case "*" :
                    sum = t1 * t2; break;
                case "/" :
                    sum = t1 / t2; break;
                default: throw new NumberFormatException();
            }
            System.out.println(t1 + " " + operator + " " + t2 + " = " + sum);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Ugyldig input: " + data[0] + " " + data[1] +  " " + data[2]);
        }

    }
}