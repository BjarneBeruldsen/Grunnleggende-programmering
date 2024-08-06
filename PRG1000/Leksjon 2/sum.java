import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class sum {
	public static void main (String[] args) {
		int heltall1 = parseInt(showInputDialog("Første heltall: ")); 
		int heltall2 = parseInt(showInputDialog("Andre heltall: ")); 
		int sum = heltall1 + heltall2; 
		showMessageDialog(null, "Sum: " + sum); 
	}
}