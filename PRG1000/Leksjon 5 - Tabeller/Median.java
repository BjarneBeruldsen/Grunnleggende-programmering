/* Leksjon 5: Job 1
 *Programmet beregner medianen (midterste verdien)
 *i et sett med heltall. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*; 

public class Median{
	public static void main (String[] args) {
		String talltekst = showInputDialog("Gi antall tall: "); 
		int antallTall = parseInt(talltekst); 

		int[] tall = new int[antallTall];
		for(int i=0;i<antallTall;i++){
		talltekst = showInputDialog("Gi tall: "); 
		int innTall = parseInt(talltekst); 
		tall[i] = innTall; 
		} 

		//utskrift 
		String ut = "Innlest tallsett: " + '\n'; 
		//Skriver tallene 
		for (int i=0; i<antallTall;i++){
			ut += tall[i] + " "; 
		}
		ut += '\n'; 
		//Ny overksrift
		ut += "minste -> største: "; 
		//bibliotek: sorteringsmetode, stidende ordning 
		Arrays.sort(tall); 			
		//skriver tallene i stigende rekkefølge
		for (int i=0; i<antallTall;i++){
			ut += tall[i] + " "; 
		}
		ut += '\n'; 
		//median
		int midten = tall.length / 2; 
		int median; 
		if (antallTall %2 == 1)
			median = tall[midten]; 
		else 
			median = (tall[midten-1] + tall[midten])/2; 
		//bør vel avrunde til nærmeste heltall?
		ut += "Median: " + median; 

		showMessageDialog(null, ut); 
	} 
}	