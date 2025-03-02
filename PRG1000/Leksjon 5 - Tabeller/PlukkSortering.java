/* Programmet sorterer tallene i tabbelen "tall"
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class PlukkSortering{
	public static void main (String[] args) {
		//Legger data sett i en tabell
		int [] tall = {7, 2, 1, 4}; 
		//oppretter ny hjelpe tabell til sortering av tall
		int [] nyTall = new int [tall.length]; 

		//for-løkke som finner minste talls posisjon
		for (int tallNr=0; tallNr<tall.length; tallNr++){
			int minPos = 0; //Antar at minste tallet er i posisjon 0
			for (int posNr=1;posNr<tall.length; posNr++){
				if (tall[posNr] < tall[minPos]){
					minPos = posNr; 
				}
			}
			//Nå er den minste verdien lokalisert i minPos
			//Verdien kopieres over i hjelpe tabellen
			nyTall[tallNr] = tall[minPos]; 

			//setter in integers max verdi i minPos
			tall[minPos] = Integer.MAX_VALUE; 
		}
		//sorterer tabellen ved å gi verdier fra nyTall
		tall = nyTall;  
		for (int i=0;i<tall.length; i++){
			out.println("Tall " + i + ": " + tall[i]); 
		}
	} 
}	