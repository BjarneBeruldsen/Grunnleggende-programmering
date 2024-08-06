import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 


public class Min {
	public static void main (String[] args) {
		int tall1 = parseInt(showInputDialog("Tall 1: ")); 
		int tall2 = parseInt(showInputDialog("Tall 2: ")); 
		int tall3 = parseInt(showInputDialog("Tall 3: "));
		int tall4 = parseInt(showInputDialog("Tall 4: ")); 

		int minste1 = Math.min(tall1, tall2); 
		int minste2 = Math.min(tall3, tall4); 
		int minste = Math.min(minste1, minste2); 

		showMessageDialog(null, "Det minste av tallene: " + tall1 + " ," + tall2 + " ," + tall3 + ", " + tall4 + ", " + '\n' + 
								"Er: " + minste); 
	}
}