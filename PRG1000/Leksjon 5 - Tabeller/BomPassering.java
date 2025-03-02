import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class BomPassering {
	public static void main (String[] args) throws Exception {
		//Leser inn fil 
		String filnavn = showInputDialog("Gi navn på fil:"); 
		File fil = new File(filnavn + ".txt"); 
		Scanner leser = new Scanner(fil); 

		//tabell som holder rede på passeringer av ulike kjøretøy
		int[] kjøretøy = new int[5]; 

		int tall = 0; 
		while(leser.hasNextInt()){
			tall = leser.nextInt(); 
			kjøretøy[tall]++; 
		}
		leser.close(); 

		//skriver resultat til ny fil 
		PrintWriter skriver = new PrintWriter("res" + fil);
		int linje = 0; 
		for(int i=0;i<kjøretøy.length;i++){
			skriver.println(" " + linje + " " + kjøretøy[i]); 
			linje++; 
		}
		skriver.close();
	}
}