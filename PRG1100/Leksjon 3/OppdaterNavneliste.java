/*Oppdaterer navne luste og overskriver den
 * til den gitte filen.  
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class OppdaterNavneliste{
	public static void main (String[] args) {
		String ut = "Oppdatering av navneliste gjennomført!"; 
		try {
			String filnavn = showInputDialog("Gi filnavn: "); 
			File fil = new File(filnavn + ".txt");
			Scanner leser = new Scanner(fil); 

			int antallNavn = 0; 
			while(leser.hasNextLine()) {
				String navn = leser.nextLine(); 
				antallNavn++; 
			} 
			leser.close(); 

			String[] navnTab = new String[antallNavn+1]; 
			leser = new Scanner(fil);
			for(int i=0;i<antallNavn;i++) {
				navnTab[i] = leser.nextLine(); 
			}
			leser.close(); 
			
			navnTab[navnTab.length-1] = "Bjarne";
			Arrays.sort(navnTab); 

			PrintWriter skriver = new PrintWriter(filnavn + ".txt"); 
			for(int i=0;i<navnTab.length;i++) {
				skriver.println(navnTab[i]); 
			}
			skriver.close(); 
		}
		catch(Exception e) {
			ut = "Feil med oppdatering av navneliste"; 
		}  

		showMessageDialog(null, ut); 
	} 
}	