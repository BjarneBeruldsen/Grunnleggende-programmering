import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Unicode {
	public static void main (String[] args) {
		char tegn;
		int tall;  
		String ut = "Tall til Unicode: "; 
		for(int i=32; i<=126; i++){
	        tall = i; 
			tegn = (char)tall; 
			ut+= tall + " = " + tegn + " "; 
		}
		showMessageDialog(null, ut); 
	}
}