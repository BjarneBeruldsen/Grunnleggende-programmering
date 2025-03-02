/*Programmet leser inn et heltall og skirver
 *skriver ut faktulitets produktet.
 *eks. 1*2*3*4 = 24
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Fakultetsfunksjon{
	public static void main (String[] args) {
		//leser inn et heltall
		int heltall = 0; 
		int produkt = 0;  
		boolean ulovlig; 

		do {
			heltall = parseInt(showInputDialog("Oppgi et heltall: ")); 
			produkt = faktulitet(heltall); 
			ulovlig = (heltall < 0); 
			if (ulovlig){
				showMessageDialog(null, heltall + " er ugyldig"); 
			}
		} while(ulovlig); 

		showMessageDialog(null,"Tallene fra 1 - " +  heltall + " returnerer produktet " + produkt); 
	} 

	//metode som regner faktulitet
	private static int faktulitet(int tall){
		int produkt = 1; 
		for (int i=1; i < tall; i++){
			produkt += i * produkt; 
		}
		return produkt; 
	}
}	