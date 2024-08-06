/*Programmet leser inn ønsket antall Fibanocci-tall
 *deretter skriver den ut antall Fibanocci-tall. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Fibanocci{
	public static void main (String[] args) {
		//Initierer variabler for ta vare på data
		int tall1 = 1; 
		int tall2 = 0; 

		//Brukeren oppgir et antall (n) tall som skal skrives ut
		int n = parseInt(showInputDialog("Antall Fibanocci-tall: ")); 
		String ut = ""; 

		//Lager Fibanocci-tall rekke.
		for(int i = 0; i < n; i++){
			tall2 = tall1 + tall2; 
			tall1 = tall2 - tall1; 
			ut += tall2 + " "; 
		}

		//Skriver ut tallrekken
		showMessageDialog(null,"Fibanocci-tall rekke: " + '\n' + ut); 
	} 
}	