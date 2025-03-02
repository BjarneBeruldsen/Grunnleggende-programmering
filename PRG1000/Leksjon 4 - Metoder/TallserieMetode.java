/*Programmet inneholder en metode 
 *som summerer en tallsereie ved hjelp 
 *av en for-løkke
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class TallserieMetode{
	public static void main (String[] args) {
		int svar = sum(2,6); 
		out.println(svar); 
	} 

	private static int sum(int fra, int til){
		int sum = 0; 
		for(int tall=fra;tall<=til;tall++){
			sum += tall; 
		}
		return sum; 
	}

}	