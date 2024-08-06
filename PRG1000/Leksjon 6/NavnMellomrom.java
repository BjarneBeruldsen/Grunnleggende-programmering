/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class NavnMellomrom{
	public static void main (String[] args) throws Exception{
		//leser inn filnavn 
		String filNavn = showInputDialog("Oppgi filnavn: "); 
		File fil = new File(filNavn + ".txt"); 

		//Scanner 
		Scanner leser = new Scanner(fil); 

		//Teller antall ord i tabellen
		int antOrd = 0; 
		while(leser.hasNext()){
			String neste = leser.next(); 
			antOrd++; 
		}  
		leser.close(); 
		leser = new Scanner(fil); 
		
		//Oppretter tabell og sjekker lengde på ord 
		int enTilFire = 0; 
		int femTilTi = 0; 
		int merEnnTi =0; 
		int ordLengde = 0; 
		String[] navn = new String[antOrd]; 
		for(int i=0;i<navn.length;i++){
			navn[i] = leser.next(); 
			ordLengde = navn[i].length();  
			if(ordLengde <=4){
				enTilFire++; 	
			}
			else if(ordLengde <= 10){
				femTilTi++; 
			}
			else{
				merEnnTi++; 
			} 
		}
		leser.close(); 

		//Skriver ut resultat i absolutte tall og prosent
		String ut = "Ordlengde:" + '\n' + 
			    "1-4 " + "bokstaver : " + enTilFire + " Prosent: " + 100 * enTilFire / antOrd + "%" + '\n' + 
			    "5-10 " + "bokstaver : " + femTilTi + " Prosent: " +  100 * femTilTi/ antOrd +  "%" + '\n' +  
			    "Fler enn 10 bokstaver: " + merEnnTi + " Prosent: " + 100 * merEnnTi / antOrd + "%" + '\n';    
		showMessageDialog(null, ut); 
	
		
	} 
}	