/*Programmet inneholder en metode for å regne
 *om fra centimeter til tommer og en metode 
 *som regner motsatt. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class MetodeCentiTommer{
	public static void main (String[] args) {
		double centi = 10.0; 
		double tommer = centi2Tommer(centi); 
		out.println(centi + " centimeter = " + tommer + " tommer" + '\n' + 
					tommer + " tommer = " + centi + " centimeter" + '\n' + 
					"Tilbake til cm: " + tommer2Centi(tommer));  
	} 
	//metode for regning fra centimeter til tommer 
	private static double centi2Tommer(double centi){
		return(centi / 2.54); 
	}

	//metode som regner den motsatte veien. 

	private static double tommer2Centi(double tommer){
		return(tommer * 2.54); 
	}
}	


	