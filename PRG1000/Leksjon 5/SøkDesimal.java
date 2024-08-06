/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class SøkDesimal{
	public static void main (String[] args) {
		//Opprette tabell
		double[] tall = {-2.3, 7.75};

		//Leser inn tall
		double leterEtter = parseDouble(showInputDialog("Søk etter tall: ")); 

		//Avgjør om taller leterEtter er i tabellen tall 
		boolean funnet = false; 
		int i = 0; 
		while (!funnet && i<tall.length){
			if (tall[i] > leterEtter){
				funnet = true; 
			}
			else{
				i++; 
			}
		if (funnet){
			showMessageDialog(null, "Funnet!"); 
		}
		}
	} 
}	