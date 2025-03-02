/*Programmet lager en sirkel som beveger seg skrått ned 
 *mot høyre. Den endrer retning når den treffer en av 
 *vinduets fire vegger. 
 */
import static java.lang.Integer.*;

public class Biljard extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//setter konstanter
		final int BREDDE = 800; 
		final int HØYDE = 500; 
		final int FLYTNINGER = 100000000; 

		//tegner vindu
		makeWindow("Biljard", BREDDE, HØYDE); 

		//initierer variabler
		int r = 10; 
		int x = 20; 
		int y = 20; 
		int dx = 2; 
		int dy = 3; 

		//setter fargen til rød
		setColor(255, 0, 0); 

		//tegner sirkelen
		int id = fillCircle(x, y, r); 

		//Flytter på sirkelen og endrer retning 
		for (int i=0;i<FLYTNINGER;i++){
			if((x + dx - r <= 0) || (x + dx + r >= BREDDE)){
				dx = -dx; 
			}
			if((y + dy - r <= 0) || (y + dy + r >= HØYDE)){
				dy = -dy; 
			}
			x += dx; 
			y += dy; 

			moveCircle(id, x, y); 
			setSpeed(1); 
		}
	}
}