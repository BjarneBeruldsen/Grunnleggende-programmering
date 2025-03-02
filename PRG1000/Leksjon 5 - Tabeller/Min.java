import static java.lang.Math.*;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 

 public class Min {

 	 // Metode for å trekke et tilfeldig heltall i området min - max    
  	public static int trekkTall(int min, int max) {
    	return min + (int)( random()*(max-min+1) );
  	}

  	// hjelpemetode for å skrive tegn i sekvens
  	public static String skrivTegn(char t, int n){
  		String ut = ""; 
  		for (int i=0; i<n; i++)
  		ut += t;
  		return ut; 
  	}

	
	//Metode for innlesing 

	public static int lesHeltall(int min, int max, String ledetekst) { 
		int tall; 
		String talltekst = ""; 
		do {
			talltekst = showInputDialog(ledetekst + " (" + min + " - " + max + "):"); 
			tall = parseInt(talltekst);
			if (tall > max || tall < min){
				showMessageDialog(null, "Ugyldig antall kast!"); 
			} 
		} while(tall > max || tall < min); 
		return tall; 
	}
}
