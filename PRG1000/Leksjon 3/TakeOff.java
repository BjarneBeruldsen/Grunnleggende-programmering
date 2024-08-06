/*Programmet teller ned fra 10-0.
 */

import static java.lang.Integer.*;

public class TakeOff extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//lager vindu
		makeWindow("Take off", 400, 400); 

		//Setter passelig font og størrelse 
		setFont("Areal", 50); 
		String tekst = "";

		//skriver ut et og et tall 
		for(int i=10; i>=0; i--){
			drawString(tekst + i, 200, 200);  
			pause(1000);
			//hvisker ut ved å sette fargen til hvit og tegnet tallet på nyytt
			setColor(255, 255, 255); 
			drawString(tekst + i, 200, 200); 
			//setter fargen til svart
			setColor(0, 0, 0);   
		}
	}
}