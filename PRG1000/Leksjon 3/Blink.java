/*Programmet leser inn anttal ønskede sirkler 
 *og tegner en blink med annenhver svart og 
 *hvit farge på sirklene
 *den starter ytterst og tegner seg innover mot midten 
 */

import static java.lang.Integer.*;

public class Blink extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		makeWindow("Blink"); 
		//leser inn antall sirkler fra brukeren fra 1-10
		int antallS = 0; 

		do {	
			antallS = parseInt(getText("Antall sirkeler fra 1-10: ")); 
		}while ((antallS > 10) || (antallS < 1));  

		//initierer variabler. Blinken har alltid samme sentrum. 
		final int xStart = 110; 
		final int yStart = 110; 
		int radius = 10; 
		int nyRadius = radius * antallS; 

		//Lager en løkke som tegner antall sirkeler i svart og hvitt
		boolean svart = true; 
		for (int i=0;i<antallS;i++){
			//Fyller svart sirkel visst svart er true 
			if (svart){
				setColor(0, 0, 0); 
				fillCircle(xStart, yStart, nyRadius); 
			}
			else{
				setColor(255, 255, 255); 
				fillCircle(xStart, yStart, nyRadius); 
			}
			svart = !svart; 
			nyRadius -= radius; 

		}
	}
}