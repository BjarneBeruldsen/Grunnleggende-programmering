import static java.lang.Integer.*;

public class FyrstikkFamilie extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() { 
		makeWindow("Fyrstikkbein"); 
		int størrelse = parseInt(getText("Familie størrelse: ")); 

		tegnFamilie(størrelse, 50, 50); 
	}

	//tegner familie 
	private void tegnFamilie(int familieStørrelse, 
							 int startX, int startY){
		final int b = 20; 
		final int h = 100; 

		for (int i=1; i <= familieStørrelse; i++){
			
			if (i > 2){
				tegnFyrstikkFigur(startX , (startY + h) - (h / 2), b/4, h/4); 
				startX += b/4 + 10/4; 
			}
			else {
				tegnFyrstikkFigur(startX, startY, b, h); 
				startX += b + 10; 
			}

			startX += b; 
			pause(500); 
		}
	} 
	
	//metode for å tegne fyrstikkfiguren
	private void tegnFyrstikkFigur(int x, int y, int b, int h){
		int delHøyde = h/3; 
		tegnHode(x, y, b); 
		tegnKropp(x, y, b, delHøyde); 
		tegnBein(x - b / 2, y + delHøyde*2, b, delHøyde); 
	}

	//metode for å tegne hode
	private void tegnHode(int x, int y, int b){
		drawCircle(x, y - b/2, b/2); 
	}

	//metode for å tegne kropp
	private void tegnKropp(int x, int y, int b, int h){ 
		drawLine(x, y, x, y + h); 
		drawLine(x - b / 2, y + h / 2, x + b / 2, y + h / 2); 
	}

	//Metode for å tegne bein.
	private void tegnBein(int x, int y, int b, int h){
		drawLine(x, y, x + b / 2, y - h); 
		drawLine(x + b, y, x + b / 2, y - h); 
	}
}