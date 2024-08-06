/*Programmet leser inn høyde, x og y fra brukeren.
 *Deretter printer man ut et kvadrat med en halvert
 *kvadrat inni seg. Deretter printer man en sirkel 
 *som møter de fire sidene til det største kvadratet.
 *så tegner man en sirkel som møter de fire hjørnene
 *til det minste kvadratet. Deretter fargelegger man feltet
 *mellom de to sirkelene med gult*/

import static java.lang.Integer.*; 

public class FigurIKvadrat extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//Tegner vinu
		makeWindow("Kvadrat"); 

		//Leser inn høyde, x og y fra brukeren
		int h = parseInt(getText("Høyde: ")); 
		int x = parseInt(getText("x: ")); 
		int y = parseInt(getText("y: ")); 

		//Tegner det største kvadratet
		drawRectangle(x, y, h, h); 

		//Regner ut ny høyde
		int nyH = h/2; 

		//Setter farge til gul 
		setColor(255, 255, 0); 
		//Fyller den største sirkelen som møter sidene til det største kvadratet
		fillCircle(nyH + x, nyH + y, nyH); 
		//Markerer sirkelens ytterpunkt i svart 
		setColor(0, 0, 0); 
		drawCircle(nyH + x, nyH + y, nyH); 

		//Regner ut diagonalen til det minste kvadratet
		int d = (int)(Math.sqrt(nyH * nyH + nyH * nyH)); 
		
		//setter fargen til hvit
		setColor(255, 255, 255); 
		//Tegner den minste sirkelen som treffer hjørnene til det minste kvadratet
		fillCircle(nyH + x, nyH + y, d / 2); 
		//Setter fargen til svart
		setColor(0, 0, 0); 
		//Markerer ytterpunktet til den minste sirkelen med svart
		drawCircle(nyH + x, nyH + y, d / 2); 

		//Fyller det minste kvadratet inni det største kvadratet
		fillRectangle(nyH/2 + x, nyH/2 + y, nyH, nyH); 
	}
}