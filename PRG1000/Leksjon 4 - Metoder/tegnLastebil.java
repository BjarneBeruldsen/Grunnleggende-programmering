import static java.lang.Integer.*;

public class tegnLastebil extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		makeWindow("Lastebil"); 
		int antall = 5; 
		int y = 50, x = 50, l = 300, h = 100; 
		for (int i=1;i<=antall;i++){
			tegnLastebil(x, y, l, h); 
			y += h + 50 + h/10; 
		}
	}

	private void tegnLastebil(int x, int y, int b, int h){
		//tegner den største firkanten
		drawRectangle(x, y + h / 2, b, h / 2); 

		//tegner den mellomste firkanten
		drawRectangle(x, y, b - h / 2, h / 2); 

		//tegner den minste firkanten
		drawRectangle(x + b - h / 2, y + h / 4, h / 4, h / 4); 

		//Tegner første hjul til høyre 
		int r = h/10; 
		drawCircle(x + b - r,y + h + r, r); 

		//tegner sirkel i midten 
		drawCircle(x + r*3, y + h + r, r); 

		//tegner sirkel til venstre 
		drawCircle(x + r,  y + h + r, r); 
	}
}