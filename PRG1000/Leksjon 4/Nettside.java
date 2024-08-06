/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Nettside{
	public static void main (String[] args) {
		startDokument(); 
		overSkrift("Dette er en overskrift!"); 
		sluttDokument();  
	} 

	//Metode for å starte html dokument
	private static void startDokument(){
		out.println("<html><body>"); 
	}

	//Metode for å stoppe dokumentet 
	private static void sluttDokument(){
		out.println("</html></body>"); 
	}

	//Metode for overskrift
	private static void overSkrift(String o){
		out.println("<h1>" + o + "</h1>"); 
	}
}	