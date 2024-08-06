import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class tverrsum{
	public static void main (String[] args) {
		int heltall = parseInt(showInputDialog("Skriv inn et heltall mellom 0 og 1000")); 

		int tall1 = heltall % 10; 

		heltall = heltall / 10; 

		int tall2 = heltall % 10; 

		heltall = heltall / 10; 

		int tall3 = heltall % 10; 

		heltall = heltall / 10; 

		int tall4 = heltall % 10; 

		int sum = tall1 + tall2 + tall3 + tall4; 

		showMessageDialog(null, "Tverrsum = " + tall1 + " + "  + tall2 + " + " + tall3 + " = " +  sum); 
	}
}