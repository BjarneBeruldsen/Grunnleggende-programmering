/*Programmet leser inn tre heltall 
 *og skriver dem ut i rekkefølge
 */

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Rekkefølge {
	public static void main (String[] args) {
		//Leser inn tre heltall 
		int tall1 = parseInt(showInputDialog("Tall 1: ")); 
		int tall2 = parseInt(showInputDialog("Tall 2: "));
		int tall3 = parseInt(showInputDialog("Tall 3: ")); 

		//Sjekker rekkefølge med if-setninger
		String utTxt = ("Tall 1: " + tall1 + ", Tall 2: " + tall2 + ", Tall 3: " + tall3 + " i stigende rekkefølge: " + '\n');  

		if (tall1 < tall2 & tall2 < tall3){
			utTxt += tall1 + ", " + tall2 + ", " + tall3; 
		}
			else if (tall3 < tall2 & tall2 < tall1){
				utTxt += tall3 + " ," + tall2 + " ," + tall1; 
			}

			else if (tall1 < tall3 & tall3 < tall2){
				utTxt += tall1 + " ," + tall3 + " ," + tall2; 
			}

			else if (tall2 < tall3 & tall3 < tall1){
				utTxt += tall2 + " ," + tall3 + " ," + tall1; 
			}

			else if (tall2 < tall1 & tall1 < tall3){
				utTxt += tall2 + ", " + tall1 + " ," + tall3; 
			}
			else{
				utTxt += tall3 + ", " + tall1 + " ," + tall2; 
			}

		//skriver ut tallene i riktig rekkefølge
		showMessageDialog(null, utTxt); 
	}
}