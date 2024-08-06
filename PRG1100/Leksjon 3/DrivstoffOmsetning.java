/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class DrivstoffOmsetning{
	public static void main (String[] args) {
		String ut = ""; 
		try {
			String filnavn = showInputDialog("Gi filnavn: "); 
			File fil = new File(filnavn + ".txt"); 
			Scanner leser = new Scanner(fil); 

			double[] sum = new double[4];  

			while(leser.hasNextLine()) {
				String linje = leser.nextLine(); 
				linje = linje.trim(); 
				if(linje.length() > 0) {
					String[] data = linje.split("( )+"); 
					char type = data[0].toUpperCase().charAt(0); 
					double liter = parseDouble(data[1]); 
					double pris = parseDouble(data[2]); 
					if(type == 'L' || type == 'H') {
						sum[0] += liter; 
						sum[1] += pris; 
					}
					else {
						sum[2] += liter; 
						sum[3] += pris; 
					}
				}
			}
			leser.close(); 

			ut += "Samlet omsetning i liter og beløp: " + '\n' + 
				  "Bensin: " + avrund(sum[0]) + "L " + avrund(sum[1]) + "kr" + '\n' + 
				  "Diesel: " + avrund(sum[2]) + "L " + avrund(sum[3]) + "kr"; 
			PrintWriter skriver = new PrintWriter(new FileWriter(fil, true)); 
			skriver.println(ut);
			skriver.close();  
		}
	    catch (FileNotFoundException e) {
	      showMessageDialog(null, "Problem, finner ikke filen!");
	    }
	    catch (NumberFormatException e) {
	      showMessageDialog(null, "Problem, innholdet kan ikke håndteres!");
	    }
		catch(Exception e) {
			out.println("Uidentifisert problem!"); 
		}
	} 

	 private static int avrund(double tall) {
  	// Hjelpemetoden avrunder til nærmeste heltall
     return (int)(tall + 0.5);
  }
}	