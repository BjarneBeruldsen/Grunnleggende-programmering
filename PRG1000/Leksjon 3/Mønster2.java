/*Programmet leser inn antall ønsket linjer
 *fra 1-10. Deretter skriver den ut en form
 *med ønsket antall linjer og et spesifikt
 *antall symboler. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Mønster2{
	public static void main (String[] args) {
		int antLinjer = 0; 

		//Brukeren skriver inn lovlig verdi fra 1-10
		do {
			antLinjer = parseInt(showInputDialog("Oppgi ønsket antall linjer fra 1-10")); 
		} while(antLinjer <=0 || antLinjer > 10); 
	 

		//Skriver ut antall linjer og siste linje har likt antall symboler som antall linjer
		
		for(int i=0; i<antLinjer; i++){
			out.println("+"); 
		}
		
		for(int j=0; j<antLinjer;j++){
			out.print("+ "); 
}
	
}
}