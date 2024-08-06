import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class LengdeOmregning {
	public static void main (String[] args) {
		
		//deklarerer variabel og ber brukeren oppgi en verdi 
		double lengdeTommer = parseInt(showInputDialog("Lengde i tommer: ")); 
		
		//initierer en variabel ved en utregning 
		double lengdeMeter = lengdeTommer / 39.3700787;

		//Skriver ut resultatet 
		showMessageDialog(null, "Lengde i tommer: " + lengdeTommer + '\n' +
								"Lengde i meter: " + lengdeMeter);  
	}
}