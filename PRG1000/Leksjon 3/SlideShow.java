/*Programmet viser et slideshow
 *med en overskrivt og tre tekster
 *som kommer neden fra og opp
 */

import static java.lang.Integer.*;

public class SlideShow extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//Oppretter vindu 
		makeWindow("Slideshow", 800, 400); 

		//Setter en marg
		final int marg = 10; 

		//Initierer String variabler  
		String overskrift = "Datatyper"; 
		String tekst1 = "-Integer"; 
		String tekst2 = "-Double"; 
		String tekst3 = "-Char"; 

		//Tegner overskrift 
		setFont("Areal", 24);
		drawString(overskrift, marg, 34); 

		//Tegner tekster 
		setFont("Areal", 12); 
		int id1 = drawString(tekst1, marg, 412); 
		int id2 = drawString(tekst2, marg, 412); 
		int id3 = drawString(tekst3, marg, 412); 

		//Lager animasjon der tekstene flyr inn nedenfra med pauser
		moveString(id1, marg, 54);
		pause(1000); 
		moveString(id2, marg, 74); 
		pause(1000); 
		moveString(id3, marg, 94); 

	}
}