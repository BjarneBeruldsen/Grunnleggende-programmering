/*Jobb 3: Tallrekker
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*; 

public class TallRekker{
	public static void main (String[] args) {
		//oppretter tabeller 
		int[] tabellA = new int[5]; 
		int[] tabellB = new int[5]; 


		//fyler med tilfeldig tall fra 0-9
		for(int i=0; i<5;i++){
			tabellA[i] = Min.trekkTall(0,9);
			tabellB[i] = Min.trekkTall(0,9); 
		}

		//skriver ut ved hjelp av toString-metoden 
		out.println(Arrays.toString(tabellA)); 
		out.println(Arrays.toString(tabellB)); 

		//Sjekker likehet med equals-metoden
		boolean lik = Arrays.equals(tabellA, tabellB); 
		if(lik == true){
			out.println("Tabellene er like"); 
		}
		else{
			out.println("Tabellene er ikke like"); 
		}

		//sorterer og skriver ut på nytt
		Arrays.sort(tabellA); 
		Arrays.sort(tabellB);

		out.println(Arrays.toString(tabellA)); 
		out.println(Arrays.toString(tabellB));

		//Leser inn et siffer fra brukeren
		int siffer = parseInt(showInputDialog("Oppgi et siffer: ")); 
		int pos = Arrays.binarySearch(tabellA, siffer); 
		int pos2 = Arrays.binarySearch(tabellB, siffer); 
		if((pos>=0) || (pos2>=0)){
			out.println("Tallet " + siffer + " er funnet"); 
		}
		else{
			out.println("Tallet " + siffer + " er ikke funnet"); 
		}

		//e
		//Opretter tabell 
		int[] rekke = new int[5];  
	
		for(int i=0;i<5;i++){ 
			rekke[0] = Min.trekkTall(0,20); 
			Arrays.sort(rekke); 
			out.println(Arrays.toString(rekke)); 
		}
	} 
}	