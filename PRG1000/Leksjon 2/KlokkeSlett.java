import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class KlokkeSlett {
	public static void main (String[] args) {
		
		//Deklarering av variabler og tilordning fra brukere
		int t = parseInt(showInputDialog("Antall timer: ")); 
		int m = parseInt(showInputDialog("Antall minutter: ")); 
		int s = parseInt(showInputDialog("Antall sekunder: ")); 

		//Utregning
		int tSekund = t * 3600; 
		int mSekund = m * 60; 

		//Regner ut antall sekunder
		int sumSekund = tSekund + mSekund + s; 

		//Skriver ut resultat 
		showMessageDialog(null, "Klokken: " + t + ':' + m + ':' + s + '\n' + 
								"Tilsvarer: " + sumSekund + " sekunder"); 
	}
}