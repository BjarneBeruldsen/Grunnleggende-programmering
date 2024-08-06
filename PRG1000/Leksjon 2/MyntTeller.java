import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class MyntTeller {
	public static void main (String[] args) {

		int ant20Kr = parseInt(showInputDialog("Oppgi antall 20kr: ")); 
		int ant10Kr = parseInt(showInputDialog("Oppgi antall 10kr: ")); 
		int ant5Kr = parseInt(showInputDialog("Oppgi antall 5kr: ")); 
		int ant1Kr = parseInt(showInputDialog("Oppgi antall 1kr: ")); 

		int sum = (ant20Kr * 20) + (ant10Kr * 10) + (ant5Kr * 5) + (ant1Kr * 1);  

		showMessageDialog(null, "Antall 20 kroninger: " + ant20Kr + '\n' + 
								"Antall 10 kroninger: " + ant10Kr + '\n' + 
								"Antall 5 kroninger: "  + ant5Kr  + '\n' + 
								"Antall 1 kroninger: "  + ant1Kr +  '\n' + 
								"Samlet verdi av mynter: " + sum + " kr"); 
	}
}