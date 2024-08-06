import static java.lang.Integer.*;

public class Info extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//Lager vindu 
		final int VINDU = 400; 
		int x = VINDU / 2; 
		int y = VINDU / 2; 
		int r = VINDU / 2; 

		makeWindow("Info-logo", VINDU, VINDU); 

		//Tegner sirkel 
		drawCircle(x, y, r); 

		//Tegner prikken over i en 
		int rute = VINDU / 8;   
		int bredde = rute * 2;

		x = rute * 3; 
		y = rute / 2; 

		fillRectangle(x, y, bredde, bredde); 

		//Tegner i 
		int høyde = rute * 4 + rute / 2; 
		y = rute * 3; 

		fillRectangle(x, y, bredde, høyde); 
	}
}