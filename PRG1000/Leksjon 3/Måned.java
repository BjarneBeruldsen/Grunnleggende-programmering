/*Programmet leser inn måndsnumer og skriver ut 
/*navnet på måneden
 */
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Måned{
	public static void main (String[] args) {
		//Leser inn månedsnummer
		int mndNummer = parseInt(showInputDialog("Månedsnummer: ")); 
		String mnd = "Månedsnummer " + mndNummer + " er "; 

		//valgsetning som gjør om tall til måned
		switch (mndNummer) {
		case 1: mnd += "Januar"; break; 
		case 2: mnd += "Februar"; break; 
		case 3: mnd += "Mars"; break; 
		case 4: mnd += "April"; break; 
		case 5: mnd += "Mai"; break; 
		case 6: mnd += "Juni"; break; 
		case 7: mnd += "Juli"; break; 
		case 8: mnd += "August"; break; 
		case 9: mnd += "September"; break; 
		case 10: mnd += "Oktober"; break; 
		case 11: mnd += "November"; break; 
		case 12: mnd += "Desember"; break; 
		default: mnd += "Ugyldig måned"; 
		}

		showMessageDialog(null, mnd); 
	}
}