/* Eksempel 7.1
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class SkrivNavneListe{
	public static void main (String[] args) 
								throws Exception {
		
		//Åpner filen for skriving. 
		String filnavn = "navn.txt"; 
		PrintWriter skriver = new PrintWriter(filnavn); 

		String[] navnTab = {"Jo", "Jan", "June", "Jenny"}; 

		//Skriver navn i navnTab til .txt fil
		for(int i=0;i<navnTab.length;i++){
			skriver.println(navnTab[i]); 
		}

		skriver.close(); //Lukker filen
	} 
}	