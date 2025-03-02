/*Programmet skriver ut mønster
 *etter at brukeren skriver inn 
 *ønsket antall linjer fra 1-10.
 */
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Mønster {
	public static void main (String[] args) {

		int antLinjer; 
		//Leser inn verdier mellom 0-10
		do {
			antLinjer = parseInt(showInputDialog("Oppgi antall linjer: ")); 
		} while (antLinjer <= 0 || antLinjer > 10); 

		//Nestet for-setninger som skriver ut øsnket linjer med økende antall symboler. 
		for(int i=0;i<=antLinjer;i++){
			for(int j=0;j<i;j++){
				out.print("+ "); 
			}
			out.println(); 
		}
	}
}