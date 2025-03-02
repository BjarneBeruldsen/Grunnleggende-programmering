import static java.lang.Integer.*;

public class Pilknapp extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
		//lager vindu 
		final int VINDU = 300; 
		makeWindow("pilknapp", VINDU, VINDU); 

		int marg = VINDU / 6; 

		//Tegner rektangel 
		int bredde = marg*4; 
		drawRectangle(marg, marg, bredde, bredde); 

		//Tegner linjer
		int mellom = marg / 2; 
		drawLine(marg + mellom, marg + mellom, marg + mellom, marg*4 + mellom); 
		drawLine(marg + mellom, marg + mellom, marg*4 + mellom, marg*3); 
		drawLine(marg + mellom, marg*4 + mellom, marg*4 + mellom, marg*3); 
	}
}