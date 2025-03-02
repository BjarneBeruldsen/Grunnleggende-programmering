/*Programmet leser inn heltall og sriver ut 
 *det bakerste sifferet både som tall og som tekst
 *f.eks. skal tallet 175 skrives ut som: 
 * Siste i siffer 175 er 5 -> FEM
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class TekstligSiffer{
	public static void main (String[] args) {
		//leser inn heltall 
		int tall = parseInt(showInputDialog("Oppgi et heltall: ")); 

		//Finner bakerste tallet
		int bakTall = tall % 10; 

		//Initierer string og legger til riktig tekst med switch-setning 
		String ut = "Siste siffer i " + tall + " er " + bakTall + " -> "; 
		switch(bakTall){
			case 0: ut += "NULL"; break; 
			case 1: ut += "EN"; break; 
			case 2: ut += "TO"; break; 
			case 3: ut += "TRE"; break; 
			case 4: ut += "FIRE"; break; 
			case 5: ut += "FEM"; break; 
			case 6: ut += "SEKS"; break; 
			case 7: ut += "SYV"; break; 
			case 8: ut += "ÅTTE"; break; 
			case 9: ut += "NI"; break; 
			default: ut = "Ugyldig tall"; 
		}

		//Utskrift 
		showMessageDialog(null, ut); 
	} 
}	