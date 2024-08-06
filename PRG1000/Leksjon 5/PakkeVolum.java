import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class PakkeVolum {
	public static void main(String[] args) throws Exception{
		//Leser inn fil 
		String filnavn = showInputDialog("Gi filnavn: "); 
		File fil = new File(filnavn + ".txt");

		//Leser filen 
		Scanner leser = new Scanner(fil); 

		//Oppretter skriving til ny fil 
		PrintWriter skriver = new PrintWriter("res" + fil); 

		//leser og skriver res til ny fil
		int lengde = 0; 
		int bredde = 0; 
		int høyde = 0; 
		int vekt = 0; 
		int porto = 0; 
		int volum = 0; 
		int tallPrLinje=0; 
		int minst = Integer.MAX_VALUE; 
		int størst = 0; 
		int sumVolum = 0; 

		while(leser.hasNextInt()){
			lengde = leser.nextInt(); 
			bredde = leser.nextInt(); 
			høyde = leser.nextInt(); 
			vekt = leser.nextInt(); 
			porto = leser.nextInt(); 

			//berenger volum 
			volum = lengde * bredde * høyde; 

			//finner minst, størst og samlet volum 
			sumVolum += volum; 
			if(volum < minst){
				minst = volum; 
			}
			
			if(volum > størst){
				størst = volum; 
			}

			skriver.print(volum + " "); 
			tallPrLinje++; 

			if(tallPrLinje == 5){
				skriver.println(); 
				tallPrLinje = 0; 
			}
		}
		leser.close(); 
		skriver.close(); 

		//Skriver minste, største og samlet volum i konsollet
		String ut = "Resultat for " + filnavn + ":" + '\n' + 
					"Samlet volum: " + sumVolum + '\n' + 
					"Minste volum: " + minst + '\n' + 
					"Største volum: " + størst; 

		out.println(ut);
	}
}