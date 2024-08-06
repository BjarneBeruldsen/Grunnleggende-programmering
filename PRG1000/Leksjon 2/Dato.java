import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Dato {
	public static void main (String[] args) {
		
		int dag = parseInt(showInputDialog("Dagnummer: ")); 
		int måned = parseInt(showInputDialog("Månedsnummer: "));
		int årstall = parseInt(showInputDialog("Årstall: ")); 

		showMessageDialog(null,"Dato: " + dag + "." + måned + "." + årstall); 
	}
}