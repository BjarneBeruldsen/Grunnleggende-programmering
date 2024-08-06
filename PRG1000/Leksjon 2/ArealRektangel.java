import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class ArealRektangel {
	public static void main (String[] args) {
		int l = parseInt(showInputDialog("Lengden av rektangelet:"));
		int b = parseInt(showInputDialog("Bredden av rektangelet:"));
		int areal = l * b; 
		showMessageDialog(null, "Arealet av rektangelet er: " + areal + " cm"); 
	}
}