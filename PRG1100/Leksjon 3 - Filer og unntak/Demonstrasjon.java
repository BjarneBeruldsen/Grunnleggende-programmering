/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Demonstrasjon{
	public static void main (String[] args) {
		PrintWriter skriver = null; 
		String melding = "Tallet er lagret"; 

		try {
			skriver = new PrintWriter("tall.txt"); 
			int tall = parseInt(showInputDialog("Gi heltall: ")); 
			skriver.println(tall); 
		} 
		catch (FileNotFoundException e){
			melding = "Ikke riktig filnavn!"; 
		}
		catch (NumberFormatException e){
			melding = "Tallet er ikke et heltall!"; 
		}
		finally {
			if(skriver != null) {
				skriver.close(); 
			}
			out.println(melding); 
		}
	} 
}	