import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.io.*;
import java.util.*;

public class TallSerier {
	public static void main (String[] args) {
		//Leser inn lengde på tabell 
		int lengde = Min.lesHeltall(4, 16, "Gi lengde på tabell: "); 

		//Oppretter tabell 
		int[] tabell = new int[lengde*2]; 	

		int tall = 0; 
		//Trekker tilfeldig heltall 
		for(int i=0;i<tabell.length;i++){
			do {
				tall = Min.trekkTall(1, 50); 
			} while((Arrays.binarySearch(tabell, tall)) >= 0);
			tabell[0] = tall; 
			Arrays.sort(tabell); 
		} 

		//Deler tabell i to og skriver ut til konsollet
		String linje1 = "Serie 1: "; 
		String linje2 = "Serie 2: "; 
		for(int i=0;i<tabell.length;i++){
			if(i % 2 == 0){
				linje1 += " " + tabell[i]; 
			}
			else{
				linje2 += " " + tabell[i]; 
			}
		}

		out.println(linje1); 
		out.println(linje2); 
	}
}