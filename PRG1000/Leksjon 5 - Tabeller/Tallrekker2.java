/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;

public class Tallrekker2{
	public static void main (String[] args) {
		//opretter tabeller
		int[] tabellA = {2,5,3,0,2,8};
		int[] tabellB = {4,5,3,7,2,7}; 

		//a) Utskrift av tabellene 
		String ut = "Tabellene er slik:" + '\n' + 
					"Tabell A: " + Arrays.toString(tabellA) + '\n' +
					"Tabell B: " + Arrays.toString(tabellB) + '\n'; 

		//Er tabellene verdilike 
		if (Arrays.equals(tabellA, tabellB)){
			ut+= "Tabellene er verdilike"; 
		}
		else {
			ut += "Tabellene er ikke verdilike!"; 
		}		

		//sorter tabellene 
		Arrays.sort(tabellA); 
		Arrays.sort(tabellB);

		ut += '\n' + "Sorterte Tabeller:" + '\n' + 
		"Tabell A: " + Arrays.toString(tabellA) + '\n' +
	    "Tabell B: " + Arrays.toString(tabellB) + '\n'; 

	    //Skriver ut det største sifferert som er trukket ut
	    int høyestA = tabellA[5]; 
	    int høyestB = tabellB[5]; 

	    if(høyestA > høyestB){
	    	ut += "Høyeste trekte tall er " + høyestA; 
	    }
	    else{
	    	ut += "Høyeste trekte tall er " + høyestB; 
	    }
	    ut += '\n'; 

	    //leser inn siffer fra bruker
	    int heltall = Min.lesHeltall(0, 9, "Oppgi et heltall: "); 

	    int posA = Arrays.binarySearch(tabellA, heltall); 
	    int posB = Arrays.binarySearch(tabellB, heltall);

	    if (posA>0 && posB >0){
	    	ut += heltall + " er funnnet i begge tabellene"; 
	    }
	    else if(posA>0 || posB >0){
	    	ut += heltall + " er funnet i en av tabellene"; 
	    }
	    else{
	    	ut += heltall + " er ikke funnet i tabellene"; 
	    }

	    ut+='\n'; 

	    //Oppretter tabell rekke
	    ut += "Rekke tall for tall:"; 
	    int[] rekke = new int[5];
	    for (int j=0;j<5;j++){
	    int tall; 
	    do {
	    	tall = Min.trekkTall(0,9); 
		} while(Arrays.binarySearch(rekke, tall) >= 0); 
		rekke [i] = tall; 
		Arrays.sort(rekke); 

		//Skriver hvert tall som blir lagt til rekke
			for(int i=0;i<1;i++){
				int[] kopi = Arrays.copyOf(rekke, j+1); 
				ut+= '\n' + 
				Arrays.toString(kopi); 
			}
		}

		showMessageDialog(null, ut);
	} 
}	