/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Forekomst{
	public static void main (String[] args) {
		String ut = "Orlengdeoppteling" + '\n'; 
		 try {
		 	String filnavn = showInputDialog("Gi filnavn:"); 
		 	File fil = new File(filnavn + ".txt"); 
		 	Scanner leser = new Scanner(fil); 

		 	int kort = 0; 
		 	int halvlang = 0;
		 	int lang = 0; 
		 	int antall = 0;  
		 	String ord = ""; 

		 	while(leser.hasNext()) {
		 		ord = leser.next(); 
		 		antall++; 
		 		int lengde = ord.length(); 
		 		if(lengde > 10) {
		 			lang++; 
		 		}
		 		else if(lengde <= 4) {
		 			kort++; 
		 		}
		 		else {
		 			halvlang++; 
		 		}
		 	}
		 	leser.close(); 
		 	ut = "Antall korte: " + kort + " " + kort*100/antall + "%" + '\n' + 
		 		 "Antall halvlang: " + halvlang + " " + halvlang*100/antall + "%" + '\n' + 
		 		 "Antall lang: " + lang + " " + lang*100/antall + "%";
		 	}
		 	catch(Exception e) {
		 		ut = "Orlengdeoppteling lot seg ikke gjennomføre!"; 
		 	}

		 	showMessageDialog(null, ut); 

    } 
}	