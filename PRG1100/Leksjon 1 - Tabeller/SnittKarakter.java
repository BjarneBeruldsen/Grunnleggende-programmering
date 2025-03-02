/* Leser inn bokstav karakter for 4 emner
 * Skriver ut disse (pent), beregner 
  *og skriver ut snitt (bokstav-) karakter 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;
import javax.swing.ImageIcon; 

public class SnittKarakter{
	public static void main (String[] args) {

		//oppretter tabeller 
		String[] fag = {"INF1000", "WEB1000", "DAT1000", "PRG1000"}; 
		char[] karakter = new char[4]; 
		//innlesing 
		String[] muligeValg = {"A", "B", "C", "D", "E", "F", "I", "S"}; 
		String ledetekst = "Karakter A - F, S=syk, I=ikke møtt" + '\n'; 

		int antKarakter = 0; 

		ImageIcon logo = new ImageIcon("Logo.png"); 

		for(int i=0;i<karakter.length;i++) {
			int valgPos = showOptionDialog(null, ledetekst + "Gi karakter i " + fag[i], "", DEFAULT_OPTION, QUESTION_MESSAGE, logo, muligeValg, muligeValg[0]); 
			String valg = muligeValg[valgPos]; 
			karakter[i] = valg.charAt(0); 
			if(karakter[i] >= 'a' && karakter[i] <= 'z') {
				karakter[i] = (char)(karakter[i] - 32); 
			}
			antKarakter++; 
			if(karakter[i] == 'I' || karakter[i] == 'S') {
				antKarakter--; 
			}
		}
	 

		//utskrift
		String ut = "Karakterkort H2023" + '\n'; 
		for(int i=0;i<karakter.length;i++) {
					ut += fag[i] + " " + skriv(karakter[i]) + '\n'; 
		}
		ut += "---------" + '\n';

		//karakter beregning 
		ut += "Gjennomsnitt: "; 

		//beregning 
		int sum = 0; 
		int tallKarakter = 0; 
		for(int i=0;i<karakter.length;i++) {
			if (karakter[i] <= 'F' && karakter[i] >= 'A') {
				tallKarakter = 70 - karakter[i]; 
				sum += tallKarakter; 
			}
		}
		int snittTall = sum / antKarakter; 
		char snittBokstav = (char)(70 - snittTall); 
		ut += skriv(snittBokstav); 

		out.println(ut);

	}	

		
	

	//hjelpemetoder 
	private static String skriv(char b) {
		if(b == 'I' || b == 'S') {
			return ""; 
		}
		else {
			return ""+b; 
		}
	}

	//Gjør om liten til stor bokstav
	private static char liten(char tegn) {
		return (char)(tegn + 32);
	}

	//metode som regner karakter om til tall
}