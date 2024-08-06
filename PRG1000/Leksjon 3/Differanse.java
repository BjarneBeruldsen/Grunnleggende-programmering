import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Differanse {
	public static void main (String[] args) {
		int anne = parseInt(showInputDialog("Alderen til Anne: ")); 
		int jens = parseInt(showInputDialog("Alderen til Jens: "));

		int nils; 

		if (anne > jens){
			nils = anne - jens; 
		}
		else{
			nils = jens - anne; 
		}

		showMessageDialog(null, "Differansen mellom Anne og Jens er: " + nils); 
	}
}