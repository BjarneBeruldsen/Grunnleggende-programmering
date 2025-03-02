/*Leksjon 6: Jobb 1 
 *Teste ut lesing fra og skriving til fil. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class NavneListe{
	public static void main (String[] args) throws Exception {
		//Lager data til hurtigminne
		String[] navn = {"Jan Jansen", "Knut Hamsun", "Ola Svenson", 
						 "Johnny Jonson", "Svein Sveinertsen"}; 

		//Skrive til fil 
		PrintWriter skriver = new PrintWriter("navn.txt"); 

		for(int i=0;i<navn.length;i++){
			skriver.println(navn[i]);  
		}  
		//lukke filen
		skriver.close(); 

		//BHenter navneliste fra fil , snur den og skriver til ny fil
		//Leser et nytt navn fra brukker og legger sist i lista på fil
		File fil = new File("navn.txt"); 
		Scanner leser = new Scanner(fil); 

		String linje;  
		int antLinje = 0; //Teller antall linjer på filen 
		while(leser.hasNextLine()){ 
			linje = leser.nextLine(); 
			antLinje++; 
		}
		leser.close(); 
						//NB! FLytter leseposisjon på fila 
		String[] nyNavn = new String[antLinje]; 
		leser = new Scanner(fil); 
		for(int i=0;i<antLinje;i++){
			nyNavn[i] = leser.nextLine();  
		}

		//lukk fil 
		leser.close(); 

		//Snur navnelista 
		String[] hjelp = new String[antLinje]; 
		for(int i=0;i<antLinje;i++){
			hjelp[i] = nyNavn[antLinje-1-i]; 
		}
		nyNavn = hjelp; 

		skriver = new PrintWriter("snu" + fil);  
		for(int i=0;i<antLinje;i++){
			skriver.println(nyNavn[i]); 
		} 
		skriver.close(); 
		// Leser inn enda ett navn (fra brukeren)
		String nyttNavn = showInputDialog("Gi navn (Fornavn Etternavn): "); 

		//append = true; 
		FileWriter skrivelink = new FileWriter("snunavn.txt", true); 
		skriver = new PrintWriter(skrivelink); //unngå overskriving 
		skriver.println(nyttNavn); 
		skriver.close(); 
 
		//Driftsmelding til loggen 
		String ut = Arrays.toString(nyNavn) + '\n' + "Filbehandling ok!"; 
		out.println(ut); 


		//c Splitte navn til nytt oppsett: Etternavn, Fornavn
		skriver = new PrintWriter("etter" + fil); 
		for(int i=0;i<antLinje;i++){
			Scanner etNavn = new Scanner(nyNavn[i]); 
			String fornavn = etNavn.next(); 
			String etternavn = etNavn.next(); 
			skriver.println(etternavn + " " + fornavn);
		} 
		skriver.close();

		//leger til navn til "navn.txt" på den rette alfabetiske plassen 
		//Lager kopi av tabell i kapittel 1
		String hjelp2[] = Arrays.copyOf(navn, navn.length+1); 

		//Leser inn nytt navn 
		String nyttNavn2 = showInputDialog("Gi nytt navn (Fornavn Etternav: "); 
		hjelp2[hjelp2.length-1] = nyttNavn2; 
		 

	
		navn = hjelp2;
		Arrays.sort(navn); 
		skriver = new PrintWriter(fil); 

		for(int i=0;i<navn.length;i++){
			skriver.println(navn[i]);  
		}  
		//lukke filen
		skriver.close(); 
	} 
	public static void main(String[] args) {
    launch(args);

  }
}	