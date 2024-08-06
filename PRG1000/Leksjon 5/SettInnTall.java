/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*; 

public class SettInnTall{
	public static void main (String[] args) {
		//Lager en tabell med verider
		int [] tallTab = {0, 42, 53, 6, 2, 43, 12, 53, 23, 64, 21, 34}; 

		//finner et tilfeldig tall fra 1-10
		int tilfeldig = (int)(random() * 10) + 1; 

		//utskrift
		for (int i=0;i<tallTab.length;i++){
			out.print(tallTab[i] + " "); 
			}

		out.println(); 
		out.println("Legger til tilfeldig tall: " + tilfeldig); 


		//sorterer tallene 
		tallTab[0] =  tilfeldig; 
		Arrays.sort(tallTab); 

		//utskrift
		out.print("Tabellen sortert med tilfeldig tall: "); 

		for(int i=0;i<tallTab.length;i++){
				out.print(tallTab[i] + " "); 
			}
	} 
}	