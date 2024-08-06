import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Omkretsberegning {
	public static void main (String[] args) {
		String txt = "+--------------------+" + '\n' +
					 "|                         | " + "Høyde" +'\n' +
		             "+--------------------+" +'\n' + 
				     "       Bredde         " + '\n'; 

	    int lengde = parseInt(showInputDialog(txt + '\n' + "Lengde: ")); 
	    int bredde = parseInt(showInputDialog(txt + '\n' + "Bredde: ")); 

	    int omkrets = lengde + lengde + bredde + bredde; 

	    showMessageDialog(null, "Omkrets: " + omkrets + " cm"); 
	}
}