/*Programmet leser inn personnummer fra bruker
 *og finner kjønn basert på om det midterste
 *tallet er partall eller oddetall
 */

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Kjønn {
	public static void main (String[] args) {
		//Leser inn personnummer fra brukeren 
		int personNr = parseInt(showInputDialog("Oppgi personnummer: ")); 

		String utTxt = "Personnummeret: " + personNr + " tilhører en: "; 

		personNr = personNr / 100; 

		personNr = personNr % 2;  

		if (personNr == 0){
			utTxt += "Jente"; 
		}
		else{
			utTxt += "Gutt";
		}

		showMessageDialog(null, utTxt); 

	}
}