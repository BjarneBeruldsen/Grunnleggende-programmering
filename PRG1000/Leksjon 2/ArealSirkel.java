import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class ArealSirkel {
	public static void main (String[] args) {
		int radius = parseInt(showInputDialog("Sirkelen sin radius: ")); 
		double pi = 3.14; 
		double areal = pi * radius;   

		showMessageDialog(null, "Areale av sirkelen er: " + (int)(areal+0.5) + " cm"); 
	}
}
