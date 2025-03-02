/*Programmet leser inn et tall fra 0-6.
 *og skriver ut tilhørende dag navn med
 *neste dag og forrige dag i konsollet. 
 */

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Dagnummer {
	
 public static void main(String[] args) {
	//Leser inn dagnummer
	int dagnummer = Min.lesHeltall(0,6,"Gi heltall:"); 
	
	String[] dag = {"mandag", "tirsdag", "onsdag", 
			"torsdag", "fredag", "lørdag", "søndag"}; 

	//deklarerer variabler 
	String dag1;  
	String dag2 = dag[dagnummer]; 
	String dag3;

	if(dag2 == dag[6]){
		dag3 = dag[0]; 
	}
	else{
		dag3 = dag[dagnummer+1]; 
	}

	if(dag2 == dag[0]){
		dag1 = dag[6]; 
	}
	else{
		dag1 = dag[dagnummer-1]; 
	}
	//utskrift
	String ut = "Dagnummer: " + dagnummer + '\n' + 
		    "I går var det " + dag1 + '\n' + 
		    "I dag er det " + dag2+ '\n' + 
		    "I morgen er det " + dag3; 
	
	out.println(ut);  
 }

}