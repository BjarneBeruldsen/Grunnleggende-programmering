/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class MetodeSum{
	public static void main (String[] args) {
		int fra = parseInt(showInputDialog("Fra: ")); 
		int til = parseInt(showInputDialog("Til: ")); 

		int tallSerie = sum(fra, til); 

		showMessageDialog(null, "Sum: " + tallSerie); 
	} 

	//Metode for å regne summen av en tallserie
	private static int sum(int fra, int til) {
		int summen = (fra + til) * (til - fra + 1) / 2; 
		return summen; 
	}
}	