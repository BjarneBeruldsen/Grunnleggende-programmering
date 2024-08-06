/*Programmet sjekker om dine lotto 
 *tall stemmer med lotto trekningen 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;

public class LottoSjekk{
	public static void main (String[] args) {
		//tabell for rekke med lotto tall
		int [] lottoTall = {9, 11, 32, 23, 33, 21, 4}; 
		int [] lottoTrekning = {9, 32, 11, 33, 23, 4, 21}; 

		Arrays.sort(lottoTall); 
		Arrays.sort(lottoTrekning); 

		if (Arrays.equals(lottoTall, lottoTrekning)){
			out.println("Du har vunnet første premie!"); 
		} 
		else{
			out.println("Beklager ingen premie"); 
		}
		
	} 
}	