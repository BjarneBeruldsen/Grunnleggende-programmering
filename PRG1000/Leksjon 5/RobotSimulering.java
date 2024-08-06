import static java.lang.Integer.*;
import java.util.*; 

public class RobotSimulering extends EasyGraphics{
	public static void main (String[] args) {
		launch (args); 
	}

	public void run() {
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

		//Trekker tilfeldig start posisjon 
		boolean hjørneFem = false; 
		x = VINDU / 200; 
		y = VINDU / 200; 
		int r = 2; 
		final int TOTALPOS = 1000; 
		int posTotal = 0; 

		int[] hjørne = new int[4]; 

		while((hjørneFem == false) && (posTotal <= TOTALPOS)){
			fillCircle(x, y, r);
			posTotal++;  
			if((x <= 100) && (y <= 100)){
				hjørne[0]++; 
			}
			if((x >= 300) && (y <= 100)){
				hjørne[1]++; 
			}
			if((x <= 100) && (y >= 300)){
				hjørne[2]++; 
			}
			if((x >= 300) && (y >= 300)){
				hjørne[3]++; 
			}
			//sjekker om pos. er innom hjørne minst 5 ganger
			Arrays.sort(hjørne); 
			if(hjørne[0] >= 5){
				hjørneFem = true; 
			}
			x = Min.trekkTall(0, 400); 
			y = Min.trekkTall(0, 400); 
		}

		//regner ut hjørne prosent 
		int sumProsent = 0; 
		int[] prosent = new int[4]; 
		for(int i=0;i<prosent.length;i++){
			prosent[i] = 100 * hjørne[i] / posTotal; 
			sumProsent += prosent[i]; 
		}

		//Tegner resultat 
		int linje = VINDU / 12; 
		int marg = linje / 2; 
		int størrelse = linje; 
		int mellom = nyH + VINDU / 2; 

		setFont("Arial", størrelse); 
		setColor(255, 0, 0); 

		//tegner prosent i hvert hjørne 
		drawString("" + prosent[0] + "%", marg, linje * 2); 
		drawString("" + prosent[1] + "%", mellom + marg, linje * 2);
		drawString("" + prosent[2] + "%", marg, linje * 11); 
		drawString("" + prosent[3] + "%", mellom + marg, linje * 11);

		//tegner antall posisjoner og hjørneprosent
		String linje1 = "Antall posisjoner: " + posTotal + " "; 
		String linje2 = "Hjørneprosent: " + sumProsent + "%" + " "; 
		drawString(linje1, marg, linje * 6); 
		drawString(linje2, marg, linje * 7 + marg); 
	}
}