import static java.lang.Integer.*; 
import static java.lang.Math.*;
import static java.lang.Double.*;
import java.util.*;
import static java.lang.System.*; 

public class TilfeldigSirkel extends EasyGraphics {
	public static void main (String[] args) {
		launch (args); 
	}

	public void run() {
		//lager vindu 
		final int BREDDE = 600; 
		final int HØYDE = 300; 
		makeWindow("Tilfeldig-Sirkel", BREDDE, HØYDE); 

		//leser inn ønsket antall sirkler
		int antallSirkel = 0; 
		do {
		antallSirkel = parseInt(getText("Gi antall sirkler: "));
		} while(antallSirkel < 0); 

		//Tegner sirkeler
		int x = 0; 
		int y = 0; 
		int r = BREDDE / 20; 
		int antIkkeHel = 0; 
		int antOverlapp = 0; 
		//tabeller som lagrer x og y pos. 
		int[] xTab = new int[antallSirkel]; 
		int[] yTab = new int[antallSirkel];  

		for(int i=0;i<antallSirkel;i++){
			x = Min.trekkTall(0, BREDDE); 
			y = Min.trekkTall(0, HØYDE); 
			drawCircle(x, y, r); 
			if((x - r < 0 ) || (x + r > BREDDE) || (y - r < 0) || (y + r > HØYDE)){
				antIkkeHel++; 
			}

			//Beregner d 
			for(int j=0;j<i;j++){
				double d = sqrt(pow(x - xTab[j], 2) + pow(y- yTab[j],2));
				if(d < 2 * r){
					antOverlapp++; 
				} 
			}
			xTab[i] = x; 
			yTab[i] = y; 


		}
		//Skriver ut resultat til konsollet 
		String ut = "Antall sirkler: " + antallSirkel + '\n' + 
					"Sirkler utenfor vindu: " + antIkkeHel + '\n' + 
					"Antall overlappinger " + antOverlapp; 
		out.println(ut); 
	}
}