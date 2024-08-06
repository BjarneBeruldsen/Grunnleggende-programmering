/*Programmet finner snitt og tall mindre
 *enn snittet.
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;

public class TallAnalyse{
	public static void main (String[] args) {
		//Leser inn antall tall fra brukeren 
		int antallTall = Min.lesHeltall(1,250,"Antall tall: "); 

		//Opretter tabell
		int[] tall = new int[antallTall]; 

		//Trekker tilfeldig tall(1-10)
		for (int i=0;i<tall.length;i++){
			tall[i] = Min.trekkTall(1,10); 
		}

		//beregner gjennomsnitt 
		int sum = 0; 
		for(int i=0;i<tall.length;i++){
			sum+=tall[i]; 
		}
		int snitt = sum/tall.length; 

		//Finner tall mindre enn snitt. 
		String ut = "Snitt = " + snitt + " Tall mindre enn " + snitt + ": "; 

		for(int i=0;i<tall.length;i++){
			if (tall[i] < snitt){
				ut += tall[i] + " "; 
			}
		}

		//skriver ut om snittet er i tall.
		Arrays.sort(tall); 
		int pos = Arrays.binarySearch(tall, snitt); 
		if(pos < 0){
			ut += '\n' + "Snittet er ikke i tallsettet."; 
		}
		else{
			ut += '\n' + "Snittet er i tallsettet."; 
		}

		//Finner det hyppigste tallet i tabellen. 
		int antallAv[] = new int [tall.length+1]; 

		for(int i=0;i<tall.length;i++){
			antallAv[tall[i]]++; 
		}
		int hyppigste = 1; 
		for(int i=2;i<antallAv.length;i++){
			if(antallAv[hyppigste] < antallAv[i]){
				hyppigste = i; 
			}
		} 

		int gjentakelser = antallAv[hyppigste]; 

		ut += '\n' + "Hyppigste tall: " + hyppigste + " gjentakelser: " + gjentakelser; 

		//utskrift
		showMessageDialog(null, ut);
	} 
}	