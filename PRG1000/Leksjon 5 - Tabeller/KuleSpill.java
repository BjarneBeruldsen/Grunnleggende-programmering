import static java.lang.Integer.*;

public class KuleSpill extends EasyGraphics {


	public static void main (String [] args) {
		launch (args); 
	}


	public void run() {
		//initierer variabler
		final int BREDDE = 600; 
		final int HØYDE = 200; 
		//lager vindu 
		makeWindow("Kule spill", BREDDE, HØYDE); 
		int mellomrom = 10; 
		int boksBredde = (BREDDE-mellomrom * 2) / 21; 
		int r = boksBredde / 2; 
	
		 
		int x = mellomrom; 
		int y = HØYDE / 4; 
		
		//Tegner spiller 1
		fillCircle(x + r, y + r, r); 
		String tekst = "Spiller 1"; 
		drawString(tekst, x * 3 + mellomrom, y + r * 2); 

		//Tegner 21 bokser 
		for(int i=0;i<21;i++){
			drawRectangle(x, y * 2, boksBredde, boksBredde); 
			x += boksBredde; 
		}
		//nulstiller x
		x = mellomrom; 

		//Tegner spiller 2
		drawCircle(x + r, y * 3 + r, r); 
		tekst = "Spiller 2"; 
		drawString(tekst, x * 3 + mellomrom, y * 3 + r * 2); 

		//Trekker hvem som starter
		int starter = Min.trekkTall(1, 2); 
		String ut = ""; 
		boolean spillerEn = true; 
		if(starter == 1){
			spillerEn = true; 
		}
		else{
			spillerEn = false; 
		}

		
		//Ber spiller om å oppgi antall kuler
		x = x + r;
		y = y * 2 + r; 
		boolean ferdig = true; 
		int runder = 0; 
		int antallK = 0; 
		int maksKuler = 3; 
		int minKuler = 1; 
		while(ferdig){
			do {
				antallK = parseInt(getText("Spiller " + starter + ": Gi antall kuler (1-3)")); 
			} while((antallK > maksKuler) || (antallK < minKuler)); 
		    	for(int j=0;j<antallK;j++){
				if(spillerEn){
					fillCircle(x, y, r);
					starter = 2; 
					runder++; 
				}
				else{
					drawCircle(x, y, r); 
					starter = 1; 
					runder++; 
				}
				x += boksBredde; 
		

			}
			//Avslutter spillet etter 21 kuler
			if(runder >= 21){
				ferdig = false; 
			}
				//Kan tegne maks to kuler visst 19 kuler er tegnet	
			if(runder >= 19){
				maksKuler = 2; 
			}
			//Kan tegne maks en kule visst 20 kuler er tegnet
			if(runder >= 20){
				maksKuler = 1; 
			}

			spillerEn = !spillerEn; 
		}
		//nullstiller x og y 
		x = mellomrom; 
		y = HØYDE / 4; 
			if(spillerEn){
				tekst = "Spiller 2 vant!"; 
				drawString(tekst, x * 3 + mellomrom + boksBredde * 6, y + r * 2);
			}
			else{
				tekst = "Spiller 1 vant!"; 
				drawString(tekst, x * 3 + mellomrom + boksBredde * 6, y + r * 2);
			}
	}			
}
