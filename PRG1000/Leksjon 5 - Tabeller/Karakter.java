import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Karakter{
	public static void main (String[] args) throws Exception {
	//Leser inn fil 
	String filNavn = showInputDialog("Gi fag: "); 
	File fil = new File(filNavn + ".txt"); 

	Scanner leser = new Scanner(fil); 

	//finner antall karakterer og antall av hver karakter 
	int antallKarakter = 0; 
	int tall = 0; 
	int sum = 0; 

	//tabell for å holde rede på antall av hver karakter
	int[] karakter = new int[6]; 

	while(leser.hasNextInt()){
		tall = leser.nextInt();
		karakter[tall]++; 
		sum += tall; 
		antallKarakter++;  
	}
	leser.close(); 

	//Beregner snitt 
	double desimalSnitt = sum / antallKarakter; 
	int snitt = (int)(desimalSnitt + 0.5); 

	//switch setning som gjør om snitt til bokstav
	char bokstav = ' '; 
	switch (snitt) {
		case 5: bokstav = 'A'; break; 
		case 4: bokstav = 'B'; break;
		case 3: bokstav = 'C'; break;
		case 2: bokstav = 'D'; break;
		case 1: bokstav = 'E'; break;
		case 0: bokstav = 'F'; break;
		default: bokstav = ' '; break; 
	}


	//Skriver resultat til fil 
	PrintWriter skriver = new PrintWriter("res" + fil); 
	//Variabelt antall mellomrom 
	String to = "  "; 
	String tre = "   "; 

	String ut = "   A   B   C   D   E   F"; 
	skriver.println(ut); 

	for(int i=0;i<karakter.length;i++){
		if(karakter[i] < 10){
			skriver.print(tre + karakter[i]); 
		}
		else{
			skriver.print(to + karakter[i]); 
		}
	}
	skriver.println(); 
	skriver.println(); 

	skriver.println("   Snitt: " + bokstav); 
	skriver.close(); 

	}
}