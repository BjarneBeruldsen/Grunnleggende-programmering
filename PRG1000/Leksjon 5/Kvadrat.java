import static java.lang.Integer.*;

public class Kvadrat extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//tegner vindu 
		final int VINDU = 400; 
		makeWindow("Kvadrat", VINDU, VINDU); 

		int h = VINDU; 
		int x = 0; 
		int y = 0; 

		//tegner største kvadrat 
		drawRectangle(x, y, h, h); 

		int nyH = h/4; 

		//Tegner mindre rektangel 
		drawRectangle(x, y, nyH, nyH); 
		x += nyH + VINDU / 2; 
		drawRectangle(x, y, nyH, nyH); 
		y += nyH + VINDU / 2; 
		drawRectangle(x, y, nyH, nyH); 
		x = 0; 
		drawRectangle(x, y, nyH, nyH);
	}
}