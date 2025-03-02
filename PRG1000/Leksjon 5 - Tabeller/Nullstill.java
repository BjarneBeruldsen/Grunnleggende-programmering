/*Programmet inneholder en metode
 *for nullstilling av tabellens verdier. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Nullstill{
	public static void main (String[] args) {
		int [] nyTab = {1, 2, 3, 4, 5}; 
		for (int i=0; i<nyTab.length;i++){
			out.print(nyTab[i] + " "); 
		}
		out.println(); 
		nullstill(nyTab); 
		
		for (int i=0; i<nyTab.length;i++){
			out.print(nyTab[i] + " "); 	
			}


	} 
	//metode for nullstilling
	private static void nullstill (int [] tab){
		for (int i=0; i<tab.length; i++){
			tab[i] = 0; 
		}
	}
}	