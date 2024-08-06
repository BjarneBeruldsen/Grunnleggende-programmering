/*Leksjon 3: Jobb 1
 *Leser inn heltall og avgjør
 *og skriver ut om dette tallet har flere en tre siffer. 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Avgjør{
	public static void main (String[] args) {
		int heltall = parseInt(showInputDialog("Oppgi et heltall: ")); 

		String ut = "Heltall " + heltall + " har"; 

		//Avgjør om tallet har flere enn 3 siffer.
		if (heltall > -1000 && heltall < 1000){
			ut += " ikke";  
		}
		ut += " flere enn tre siffer"; 

		showMessageDialog(null, ut); 
	} 
}	