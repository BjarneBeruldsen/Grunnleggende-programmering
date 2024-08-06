/*Programmet leser inn fil med desimaltall,
 *oppretter en ny fil med heltall og en linje 
 *sum med summen av hver linje. 
 */
import static java.lang.System.*; 
import static javax.swing.JOptionPane.*; 
import static java.lang.Integer.*; 
import static java.lang.Double.*; 
import static java.lang.Math.*; 
import java.util.*;
import java.io.*;

public class Desimal{
   public static void main (String[] args) throws Exception{
		//Åpner desimal.txt-filen 
		File desimalFil = new File("desimaltall.txt");
		Scanner leser = new Scanner(desimalFil); 
		leser.useLocale(Locale.US); 

		//Åpne heltall.txt filen for skriving 
		File heltallFil = new File("heltall.txt"); 
		PrintWriter skriver = new PrintWriter(heltallFil); 

		int tallPrLinje = 0; 
		while (leser.hasNext()){
			double desimal = leser.nextDouble(); 
			int heltall = (int)(desimal + 0.5); 
			skriver.print(heltall + " "); 
			tallPrLinje++; 

			if (tallPrLinje == 4){
					skriver.println();
					tallPrLinje = 0; 
				}  
		}

		leser.close(); 
		skriver.close(); 

		leser = new Scanner(heltallFil); 
		skriver = new PrintWriter("linjesum.txt"); 

		int sum = 0; 
		tallPrLinje = 0; 
		while (leser.hasNextInt()){
			sum += leser.nextInt(); 
			tallPrLinje++; 
			if(tallPrLinje == 4){
				skriver.println(sum); 
				sum = 0; 
				tallPrLinje = 0; 
			}

		}
		if(tallPrLinje > 0){
			skriver.println(sum); 
		}

		leser.close(); 
		skriver.close(); 
	}
}