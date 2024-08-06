import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class SpillerOpptelling extends EasyGraphics {

	public static void main(String[] args) {
		launch(args); 
	}

	public void run() {
		//initierer konstanter 
		final int BREDDE = 800; 
		final int HØYDE = 500; 

		//lager vindu 
		makeWindow("Fotballbane", BREDDE, HØYDE);

		//tegner fotball bane 
		drawRectangle(0, 0, BREDDE, HØYDE); 

		//tegner mål 
		int rute = BREDDE / 8; 
		drawRectangle(0, rute + rute/2, rute, rute*2); 
		drawRectangle(rute*7, rute + rute/2, rute, rute*2); 

		//tenger sirkel 
		drawCircle(BREDDE/2, HØYDE/2, rute + rute/2); 

		//tegner midtlinje 
		drawLine(BREDDE/2, 0, BREDDE/2, rute*5); 

		//trekker tilfeldig posisjon og tegner sirkler 
		boolean svart = true; 
		int x = 0; 
		int y = 0; 
		int r = BREDDE / 80; 
		int midten = BREDDE / 2; 
		int antSForsvar = 0; 
		int antHForsvar = 0; 
		int antSAngrep = 5; 
		int antHAngrep = 5; 
		for(int i=0;i<10;i++){
			x = Min.trekkTall(0+r, BREDDE-r); 
			y = Min.trekkTall(0+r, HØYDE-r); 
			if(svart){
				fillCircle(x, y, r); 
			}
			else{
				drawCircle(x, y, r); 
			}
			//teller antall svarte i høyre og hvite i venstre
			if((svart == true) && (x > midten)){
				antSForsvar++; 
				antSAngrep--; 
			}
			else if((svart != true) && (x < midten)){
				antHForsvar++; 
				antHAngrep--; 
			}
			svart = !svart; 
		}

		//utskrift
		String ut = "Svart lag har " + antSForsvar + " i forsvar (høyre halvdel), " + 
					 antSAngrep + " i angrep." + '\n' + 
					"Hvitt lag har " + antHForsvar + " i forsvar (venstre halvdel), " + 
					 antHAngrep + " i angrep."; 
		out.println(ut); 
	}
}