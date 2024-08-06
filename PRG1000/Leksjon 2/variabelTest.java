/*Mønstergil 
 *Leksjon2: Jobb 1 
 * Tester deklarasjon av og utskrift fra variabler
 */


import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class variabelTest {
	public static void main (String[] args) {
		//Deklarerer variabler for navn og etternavn
		String fornavn; 
		String etternavn; 
		//Initier en variabel 
		String melding = "Lykke til med Java!"; 
		//Deklarerer heltallsvariabel for årstall
		int årstall; 

		//Leser inn fornavn, etternavn og årstall fra brukeren
		fornavn = showInputDialog("Fornavn: "); 
		etternavn = showInputDialog("Etternavn: "); 
		årstall = parseInt(showInputDialog("Årstall: ")); 

		showMessageDialog(null, "Fornavn: " + fornavn + '\n' +
								"Etternavn: " + etternavn + '\n' +
								"Årstall: " + årstall + '\n' + 
								melding); 
	}
}