/* Lager et datasett med småsiffer (0-4)
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Smaasiffer{
	public static void main (String[] args) {
		final int ANT = 50; 
		int[] siffer = new int[ANT]; 

		//fyller tabellen med småsiffer
		for(int i=0;i<siffer.length;i++){
			siffer[i] = Min.trekkTall(0,4); 
		}

		//Teller forekomster av hver siffer 
		int[] antallAv = new int[5]; 
		for(int i=0;i<siffer.length;i++){
			antallAv[siffer[i]]++; 
		}

		//utskrift 
		String ut = "Forekomst av småsiffer" + '\n';
		for(int i=0;i<5;i++){
			ut += i + ": " + Min.skrivTegn('#', antallAv[i]); 
			ut += " ("+antallAv[i]+")" + '\n'; 
		} 

		showMessageDialog(null, ut); 
	} 
}	