import static java.lang.System.*; 
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class HøydeSnitt {
	public static void main (String[] args) throws Exception{
		//Leser inn fil 
		String klasse = showInputDialog("Gi navn på klassen: "); 
		File fil = new File(klasse + ".txt"); 
		Scanner leser = new Scanner(fil);  

		//leser høyder
		int antallElever = 0; 
		int sumHøyde = 0;  
		//setter minste høyde til 250 cm
		int minst = 250; 
		int størst = 0; 
		int høyde = 0; 
		while(leser.hasNextInt()){
			høyde = leser.nextInt(); 
			sumHøyde += høyde; 
			antallElever++; 
			if(høyde < minst){
				minst = høyde; 
			}
			if(høyde > størst){
				størst = høyde; 
			}
		}
		leser.close(); 

		leser = new Scanner(fil); 

		//Beregner aktuelle resultat
		int snittHøyde = (int)(1.0 * sumHøyde / antallElever + 0.5); 
		int lengde = antallElever / 2; 

		int sumLav = 0; 
		int antallLav = 0; 
		int sumHøy = 0; 
		int antallHøy = 0; 

		while(leser.hasNextInt()){
			høyde = leser.nextInt(); 
			if(høyde < snittHøyde){
				sumLav += høyde; 
				antallLav++; 
			}
			else if(høyde > snittHøyde){
				sumHøy += høyde; 
				antallHøy++; 
			}
		}
		leser.close(); 
		int snittLav = (int)(1.0 * sumLav / antallLav + 0.5); 
		int snittHøy = (int)(1.0 * sumHøy / antallHøy + 0.5); 

		//Skriver resultat til ny fil 
		String ut = minst + 	  " - Minste høyde" + '\n' + 
					snittLav + 	  " - Snitt lave" + '\n' +
					snittHøyde +  " - Klassesnitt" + '\n' +
					snittHøy +    " - Snitt høye" + '\n' +
					størst +      " - Størst høyde";

		PrintWriter skriver = new PrintWriter("res" + fil); 

		skriver.println(ut); 
		skriver.close(); 
	}
}   
