import static java.lang.Integer.*;

public class Kube extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		final int VINDU = 400; 
		makeWindow("Kube", VINDU, VINDU);
		int marg = VINDU / 8; 
		int firkantB = marg * 4; 

		//Tegner firkant 1
		drawRectangle(marg, marg * 3, firkantB, firkantB); 
		//Tegner firkant 2
		drawRectangle(marg * 3, marg, firkantB, firkantB); 


		//Tegner linje1
		drawLine(marg, marg * 3, marg * 3, marg); 
		//tegner linje2
		drawLine(marg + firkantB, marg * 3, marg * 3 + firkantB, marg); 

		//Tegner linje 3
		drawLine(marg, marg * 7, marg * 3, marg * 5); 
		//Tegner linje 4
		drawLine(marg * 5, marg * 7, marg * 7, marg * 5);
	}
}