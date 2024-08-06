/*Leser inn to heltall og beregner sum, differans, produkt, og brøkverdi
 *(visst mulig og evt som desimaltall) mellom de to tallene. Sørg
 *for at programmet skriver ut alle beregningsresultat på en
 *oversiktlig måte
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Kalkulator{
	public static void main (String[] args) {
		//Leser inn regne operasjon 
		int operasjon = parseInt(showInputDialog("Oppgi regne operasjon (1 = +, 2 = -, 3 = *, 4 = /)")); 


		//Leser inn tall 
		 int tall1 = parseInt(showInputDialog("Oppgi tall 1: ")); 
		 int tall2 = parseInt(showInputDialog("Oppgi tall 2: ")); 
 

		 //beregning 
		 int sum = tall1 + tall2; 
		 int differans = tall1 - tall2; 
		 int produkt = tall1 * tall2; 
		 double brøkverdi = (double)tall1 / tall2;  

		 String utTxt = "";  
		 if(operasjon == 1){
		 	utTxt += tall1 + " + " + tall2 + " = " + sum + '\n'; 
		 }
		 else if (operasjon == 2){
		 	utTxt += tall1 + " - " + tall2 + " = " + differans + '\n'; 
		 }
		 else if (operasjon == 3){
		 	utTxt += tall1 + " * " + tall2 + " = " + produkt + '\n';
		 }
		 else if(operasjon == 4){
		 	if (tall2 != 0){
		 		utTxt+= tall1 + " / " +  tall2 + " = " + brøkverdi; 
		 	}
		 	else{
		 		utTxt+= tall1 + " / " +  tall2 + ": ERROR"; 
		 	}
		}

		 //utskrift
		 showMessageDialog(null, utTxt); 

	} 
}	