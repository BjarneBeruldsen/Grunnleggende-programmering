/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Lotto{
	public static void main (String[] args) {
		int fra = parseInt(showInputDialog("Fra: ")); 
		int til = parseInt(showInputDialog("Til: "));

		int tilFeldig = lottoTall(fra, til); 
		showMessageDialog(null, "TIlfeldig tall: " + tilFeldig);   
	} 
	//Metode som tar i mot parametre og returnerer et tilfeldig tall mellom parametrene
	private static int lottoTall (int fra, int til) {
		int tall = (int)(random()*(til - fra + 1) + fra); 
		return tall;  
	}
}	