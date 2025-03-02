/*Programmet leser inn et dagnummer fra 1-7'
 *og skriver ut dagnavnet (mandag-søndag)
 *som hører til dette nummeret. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Dagnavn{
	public static void main (String[] args) {
		//leser inn dagnummer og sjekker at det er gyldig  
		int dagNummer = parseInt(showInputDialog("Oppgi dagnummer: ")); 
		
		//Skriver ut dagnavnet som hører til dagnummer
		String dagNavn = "Dagnummer " + dagNummer + " tilsvarer dagnavn: "; 
		switch (dagNummer) {
			case 1: dagNavn += "Mandag"; break; 
			case 2: dagNavn += "Tirsdag"; break; 
			case 3: dagNavn += "Onsdag"; break; 
			case 4: dagNavn += "Torsdag"; break; 
			case 5: dagNavn += "Fredag"; break; 
			case 6: dagNavn += "Lørdag"; break; 
			case 7: dagNavn += "Søndag"; break;  
			default: dagNavn = "Ugyldig dagnummer"; 
		}
		showMessageDialog(null, dagNavn); 
	} 
}	