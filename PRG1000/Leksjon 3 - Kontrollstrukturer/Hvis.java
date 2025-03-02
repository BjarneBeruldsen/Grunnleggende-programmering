import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Hvis {
	public static void main (String[] args) {
		//initierer variablene 1 og 2
		double a = parseDouble(showInputDialog("Tall a: ")); 
		double b = parseDouble(showInputDialog("Tall b: ")); 

		//skriver ut resultat visst b ikke er null og feilmelding ellers
		if (b != 0){
			showMessageDialog(null, "a / b = " + a + "/" + b + " = " + a / b); 
		}
		else showMessageDialog(null, "B kan ikke være lik null"); 
	}
}