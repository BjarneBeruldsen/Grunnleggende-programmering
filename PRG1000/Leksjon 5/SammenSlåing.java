/*Programmet slår sammen verdiene i to tabeller
 *til en ved hjelp av en metode. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class SammenSlåing{
	public static void main (String[] args) {
		int [] tab1 = {0, 1, 2, 3, 4}; 
		int [] tab2 = {5, 6, 7, 8, 9, 10}; 
		int [] tilsammen = samle(tab1, tab2);

		for (int i=0;i<tilsammen.length;i++){
			out.print(tilsammen[i] + " "); 
		}
	} 

	private static int [] samle(int [] tabA, int [] tabB){
		int nyLengde =  tabA.length + tabB.length; 
		int [] nyTab = new int[nyLengde]; 

		for (int i=0;i<tabA.length;i++){
			nyTab[i] = tabA[i]; 
		}
		for (int j=0;j<tabB.length;j++){
			nyTab[tabA.length+j] = tabB[j]; 
		}
		return nyTab; 
	}
}	