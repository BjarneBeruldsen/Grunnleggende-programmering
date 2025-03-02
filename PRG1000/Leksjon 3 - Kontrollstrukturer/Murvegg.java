/*Programmet skriver ut et antall murstein 
 *der annenhver rad starter med en halv murstein
 *og annenhver rad slutter med en halv murstein
 */ 

import static java.lang.Integer.*;

public class Murvegg extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//lager vindu
		makeWindow("Murvegg "); 

		//initierer variabler for lengde og høyde, start(x,y)
		int x = 10; 
		int y = 10; 
		int l = 40;
		final int h = 20; 

		//initierer variabler for antall stein og rader
		int bredde = 20; 
		int høyde = 20; 


		//loop som tegner antall murstein 
		for (int i=1;i<=høyde;i++){
			for (int j=1;j<=bredde;j++){ 
				if (i % 2 > 0){
					if (j >= bredde){
						l = l/2; 
					} 
				}
				if (i % 2 == 0){
					if (j <= 1){
						l = l/2;
					}
				}
				drawRectangle(x, y, l, h); 
				x += l; 
				l = 40; 
			}
			y += h; 
			x = 10; 
		}
	}
}