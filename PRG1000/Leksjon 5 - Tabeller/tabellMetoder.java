/* Leksjon5 Jobb4 - test av egne hjelpemetoder
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;

public class tabellMetoder{
	public static void main (String[] args) {
		final int ANT = 10; 
		int[] småSiffer;
		småSiffer = småSiffer(ANT); 

		int[] småSiffer2 = new int[ANT]; 

		fyllTab(småSiffer2); 

		//regner ut gjennomsnitt 
		int snitt = sumTab(småSiffer)/ANT; 
		int antallOver = 0; 

		for(int i=0;i<småSiffer.length;i++){
			if(småSiffer[i] > snitt){
				antallOver++; 
			}
		}
		char[] vokal = fyllVokal(4); 

		char[] snuBokstaver = snuRekkefølge(vokal); 

		//sjekker tegn i samme posisjon 
		int antall = 0; 
		for (int i=0;i<vokal.length;i++){
			if(vokal[i] == snuBokstaver[i]){
				antall++; 
			}
		}

		//utskrift 
		String ut = "Småsiffertabell: " + Arrays.toString(småSiffer) + '\n' + 
					"Fyller med småsiffer: " + Arrays.toString(småSiffer2) + '\n' + 
					"Sum av verdier i tabell: " + sumTab(småSiffer) + '\n' + 
					"Snitt: " + snitt + '\n' + 
					"Antall over snitt: " + antallOver + '\n' + 
					"Tabell med vokaler: " + Arrays.toString(vokal) + '\n' + 
					"Snudd rekkefølge: " + Arrays.toString(snuBokstaver) +'\n' + 
					"Antall tegn i samme posisjon: " + antall; 


		showMessageDialog(null, ut); 
	} 
	

	//Metode som oppretter tabell med småsiffer
	private static int[] småSiffer(int antall){ 
		int[] småSiffer = new int[antall]; 

		for(int i=0;i<småSiffer.length;i++){
			småSiffer[i] = Min.trekkTall(0,4); 
		}
		return småSiffer; 
	}

	//Metode som fyller opp en eksisterende tabell med småsiffer
	private static void fyllTab(int[] tab){
		for(int i=0;i<tab.length;i++){
			tab[i] = Min.trekkTall(0,4); 
		}
	}

	//Regner summmen av heltall i en gitt tabell 
	private static int sumTab(int[] tab){
		int sum = 0; 
		for (int i=0;i<tab.length;i++){
			sum += tab[i]; 
		}
		return sum; 
	}

	//Oppretter og fyller tab store vokaler. 
	private static char[] fyllVokal(int n){
		char[] vokal = {'A','E','I','O', 'U', 'Y'}; 
		char[] lengde = new char[n]; 

		for (int i=0;i<lengde.length;i++){
			int tall = Min.trekkTall(0,5); 
			lengde[i] = vokal[tall]; 
		}
		return lengde; 
	}

	//Snur om på rekkefølge av verdiene i en tegnTabell
	private static char[] snuRekkefølge(char[] tab){
		char[] snu = new char[tab.length];  
		int j = tab.length; 
		for(int i=0;i<tab.length;i++){
			snu[i] = tab[j-1]; 
			j--; 
		}
		return snu; 
	}
}

