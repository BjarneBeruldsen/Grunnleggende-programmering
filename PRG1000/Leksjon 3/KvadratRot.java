/*Programmet skriver ut kvadrat
 *tallene fra 1-100
 */
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class KvadratRot {
	public static void main (String[] args) {
		String ut = "Kvadrattall fra 1-100: "; 

			for(int i = 1;i <= 10; i++){
				ut+= i * i + " = " + i + " x " + i + ", ";  
			}

		showMessageDialog(null, ut); 
	}
}