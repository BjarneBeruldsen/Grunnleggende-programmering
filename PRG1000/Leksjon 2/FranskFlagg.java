import static java.lang.Integer.*;
/*Programmet tegner et fransk flagg. Brukeren oppgir
 *ønsket størrelse i prosent. Flagget skaleres etter 
 *prosenten. Eks. 100 gir den opprinnelige størrelsen
 *50 gir tegner et flagg som har halvparten av den 
 *opprinnelige størrelsen. 
 */ 

public class FranskFlagg extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		
		//Lager vindu 
		makeWindow("Fransk Flagg"); 

		//Leser inn størrelse i prosent fra brukeren 
		int prosent = parseInt(getText("Størrelse i prosent: ")); 
 

		//Initierer variabler
		int l = 600; 
		int b = 300; 
		int x = 50; 
		int y = 50; 

		int nyL = l * prosent / 100; 
		int nyB = b * prosent / 100; 

		//Tegner flagget 
		setColor(0, 0, 255); 
		fillRectangle(x, y, nyL / 3, nyB); 

		setColor(255, 255, 255); 
		fillRectangle(nyL / 3 + x, y, nyL / 3, nyB); 

		setColor(255, 0, 0); 
		fillRectangle(nyL / 3 * 2 + x, y, nyL / 3, nyB); 

		setColor(0, 0, 0); 
		drawRectangle(x, y, nyL, nyB); 
	}
}