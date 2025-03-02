/* Leksjon 5: Eksempel terningkast 
 * Kaster terning (simulert ved trekning) og noterer antall øyne.
 * Teller forekomster av hvert kastresultat
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

//

public class Terningkast{
	public static void main (String[] args) {
		//deklarerer telletabell
		int[] antallAv = new int[7]; //Bruker ikke plass nr.0
		
		//innlesing
		/* 
		String talltekst = ""; 
		int tall = 0; 
		do {
			talltekst = showInputDialog("Gi antall kast (1-250):"); 
			tall = parseInt(talltekst);
			if (tall > 250 || tall < 1){
				showMessageDialog(null, "Ugyldig antall kast!"); 
			} 
		} while(tall > 250 || tall < 1); 
		*/
		int tall = Min.lesHeltall(1,250,"Gi antall kast"); 

		//Kaster terning for å notere øyne
		for(int i=0;i<tall;i++){
			int øyne = Min.trekkTall(1,6); 
			antallAv[øyne]++; // en mer av dette tallet (øyne)
		}


		//utskrift 
		String ut = "Kastresultat" + '\n'; 
		for(int i=1;i<6;i++){
			ut += i + ": " + Min.skrivTegn('|', antallAv[i]) 
			+ "(" + antallAv[i]+ ")" +'\n'; 
		}
		showMessageDialog(null, ut); 

	} 
}	