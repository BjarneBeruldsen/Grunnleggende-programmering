/* Orogrammet fyller en tabell (lengde 50) med små 
 *siffer (0-4). presentert resultat både ved tall og 
 *linje diagram. F.eks. # for hver forekomst av et 
 *siffer.
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Tilfeldig{
	public static void main (String[] args) {
		//oppretter tabeller
		int[] tabell = new int[50]; 
		int[] tabell2 = new int [5]; 


		//fyller med tilfeldig tall fra 0-4
		for(int i=0;i<tabell.length;i++){
			int tall = Min.trekkTall(0,4);
			tabell[i] = tall; 
			tabell2[tall]++; 
		}

		//utskrift 
		String ut = ""; 
		for(int i=0;i<=4;i++){
			ut += i + ": " + 
			Min.skrivTegn('O', tabell2[i]) + " " + 
			tabell2[i] + '\n'; 
		}
		showMessageDialog(null, ut); 
	} 
}	