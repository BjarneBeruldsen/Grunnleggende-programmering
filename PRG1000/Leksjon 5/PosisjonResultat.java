import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.io.*;
import java.util.*;

public class PosisjonResultat {
	public static void main (String[] args) throws Exception { 

		//leser inn fil 
		int robotnummer = 0; 
		do {
			robotnummer = parseInt(showInputDialog("Gi nummer på robot: "));
		} while (robotnummer < 0); 
		File fil = new File("robot" + robotnummer + ".txt"); 
		Scanner leser = new Scanner(fil); 

		//Tabell som holder rede på hjørner
		int[] hjørne = new int[4]; 

		int x = 0; 
		int y = 0; 
		int posTotal = 0; 
		//Leser inn posisjon 
		while(leser.hasNextInt()){
			x = leser.nextInt(); 
			y = leser.nextInt(); 
			if((x <= 100) && (y <= 100)){
				hjørne[0]++; 
			}
			if((x >= 300) && (y <= 100)){
				hjørne[1]++; 
			}
			if((x <= 100) && (y >= 300)){
				hjørne[2]++; 
			}
			if((x >= 300) && (y >= 300)){
				hjørne[3]++; 
			}
			posTotal++; 
		} 
		leser.close(); 

		//Beregner prosenter 
		int sumProsent = 0; 
		int[] prosent = new int[4]; 
		for(int i=0;i<prosent.length;i++){
			prosent[i] = 100 * hjørne[i] / posTotal; 
			sumProsent += prosent[i]; 
		}

		//Skriver resultat til ny fil 
		PrintWriter skriver = new PrintWriter("res" + fil); 

		skriver.println("Totalt ant. posisjoner: " + posTotal); 
		for(int i=0;i<hjørne.length;i++){
			skriver.println("Ant. i hjørne nr. " + i + ": " + hjørne[i] + " ("+prosent[i] + "%)");  
		}
		skriver.println("Hjørneprosent: " + sumProsent + "%"); 
		skriver.close(); 

		Arrays.sort(hjørne); 
		//Konkluderer om robotten infrir krav 
		String ut = "Robot nr." + robotnummer + " "; 
		if((hjørne[0] >= 5) && (sumProsent <= 25)){
			ut += "infrir krav"; 
		}
		else{
			ut += "infrir ikke krav"; 
		}

		showMessageDialog(null, ut); 
	}
}