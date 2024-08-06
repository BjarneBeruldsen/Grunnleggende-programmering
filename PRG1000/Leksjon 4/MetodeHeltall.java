/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class MetodeHeltall{
	public static void main (String[] args) {
		int heltall = lesHeltall(); 
		showMessageDialog(null, "Heltall " +  heltall);  
	} 

	private static int lesHeltall(){
		int tall = parseInt(showInputDialog("Oppgi heltall: ")); 
		return tall; 
	}
}	