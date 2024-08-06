/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Varesøk{
	public static void main (String[] args) throws Exception{
		String filnavn = "varedata.txt"; 
		String søk = "Spett"; 
		String skilletegn = ";"; 
		finnVarer(filnavn, søk, skilletegn); 
	} 

	public static void finnVarer(String filnavn, 
								 String søk, 
								 String skilletegn) throws Exception{
		Scanner leser = new Scanner(new File(filnavn));
		String linje; 
		if (leser.hasNextLine()) {
			linje = leser.nextLine(); //Hopper over en linje 
									  //kan være aktuelt og søke etter kolonne
		}
		while(leser.hasNextLine()) {
			linje = leser.nextLine(); 
			behandleVarelinje(linje, søk, skilletegn); 
		}
		leser.close(); 
	}

	public static void behandleVarelinje(String linje, 
										 String søk, 
										 String skilletegn) {
		String[] vareTab = linje.split(skilletegn); 
		int nr = parseInt(vareTab[0]); 
		String navn = vareTab[1]; 
		double pris = parseDouble(vareTab[2]); 
		int antall = parseInt(vareTab[3]); 
		if(navn.matches("(.)*" + søk + "(.)*")) {
			out.println("Vare " + nr + ": " +
						navn + " - pris =" + pris + 
						" antall=" + antall); 
		}
	}

	/*Kan være aktuelt å opprette klassen Vare.
	 *Da kan man lagre endringer som blir gjort 
	 *i en vare tabell Vare[] og skrive ut tabellen 
	 *til en tekstfil for langtidslagring. Får å håndtere
	 *flere brukere bør man lagre i en database. 
	 */
}	