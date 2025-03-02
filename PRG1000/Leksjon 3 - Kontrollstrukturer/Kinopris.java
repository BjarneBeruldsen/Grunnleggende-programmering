/*Programmet leser inn pris og alder på kunde
 *Verdiene som blir lest inn blir sjekket om de er
 *gyldige verdier som ikke er negatvie eller større en 
 *gyldig alder eller pris.
 */

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Kinopris {

  public static void main(String[] args) {
  	
  	double pris = 0; 
  	int alder = 0; 
 
  	do {
    	String prisTxt = showInputDialog("Fullpris:");
    	pris = parseDouble(prisTxt);
    	if(pris < 0 || pris > 1000){
    		showMessageDialog(null, "Du må oppgi en gyldig pris!"); 
		}
	} while (pris < 0 || pris > 1000); 

	do {
    	String alderTxt = showInputDialog("Alder:");
    	alder = parseInt(alderTxt);
    	if(alder < 0 || alder >= 150){
    		showMessageDialog(null, "Du må oppgi en gyldig alder!"); 
    	}
	} while (alder < 0 || alder >= 150); 	

    if ( alder<=5 ) // Gratis
      pris = 0.0;
    else if ( alder<=12 || alder>=60 ) // Halv pris
      pris = pris/2.0;

    showMessageDialog(null, "Pris: " + pris);
  }

}