import static java.lang.Integer.*;

public class Siktemerke extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//Lager vindu 
		final int VINDU = 300; 
		int x = VINDU / 2; 
		int y = VINDU / 2; 
		int r = VINDU / 2; 

		makeWindow("Siktemerke", VINDU, VINDU); 

		//Tegner sirkel 
		drawCircle(x, y, r); 

		//Tegner første strek 
		drawLine(0, y, VINDU, y); 

		//Tegner andre strek
		drawLine(x, 0, x, VINDU); 
	}
}