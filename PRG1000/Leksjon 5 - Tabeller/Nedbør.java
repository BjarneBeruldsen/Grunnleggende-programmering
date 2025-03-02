/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Nedbør {
	
 	public static void main(String[] args) throws Exception{
	
	//Leser inn fil 
	String filNavn = showInputDialog("Oppgi dag:"); 
	File fil = new File(filNavn + ".txt"); 

	//Leser filen 
	Scanner leser = new Scanner(fil); 
 	
	//Beregner verdier
	int total = 0; 
	int min = 0; 
 	int max = 0; 
	double median = 0.0; 
	
	//oppretter tabell 
	int[] verdi = new int[24]; 
	
	//leser inn 24 nedbørsverdier i tab og beregner total.
	int nesteTall = 0; 
	for(int i=0;i<verdi.length;i++){
		nesteTall = leser.nextInt(); 
		verdi[i] = nesteTall; 
		total += nesteTall; 
	}
	leser.close(); 

	//Beregner min og maks 
	Arrays.sort(verdi); 
	min = verdi[0]; 
	max = verdi[23]; 	

	//Beregner median
	int tallMidten = verdi.length / 2; 
 	
	median = (verdi[tallMidten-1] + verdi[tallMidten]) / 2; 
	
	//Avrunder til nærmeste heltatll
	int median2 = (int)(median + 0.5); 

	//Utskrift 
	String ut = '\n' + "  Total: " + total + " mm/døgn" + '\n' + 
	            "Minimum: " + min + " mm/t" + '\n' + 
	            " Median: " + median2 + " mm/t" + '\n' +
	            "Maximum: " + max + " mm/t";  
	

	//Skriver resultat på fil 
	PrintWriter skriver = new PrintWriter(new FileWriter(fil, true)); 
	skriver.println(ut); 
	skriver.close(); 

	}
}