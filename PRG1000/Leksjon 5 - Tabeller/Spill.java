import static java.lang.Integer.*;

public class Spill extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args); 
	}

	public void run() {
		//initierer konstanter
		final int VINDU = 300; 

		//lager vindu 
		makeWindow("Stein-Saks-Papir", VINDU, VINDU); 

		//Leser inn brukernavn 
		String brukernavn = getText("Gi brukernavn: "); 

		//Tegner brukernavn 
		int linje = VINDU / 7; 
		int marg = linje / 2;
		setFont("Arial", 36); 
		drawString(brukernavn, marg, linje*2); 
		drawString("Maskin", VINDU/2 + marg, linje*2); 

		//initierer variabler 
		boolean ferdig = false; 
		int poengM = 0; 
		int poengB = 0; 
		int sifferB = 0; 
		int sifferM = 0; 
		String[] valg = {"Stein", "Saks", "Papir"};  
		String valgM; 
		String valgB; 

		while(ferdig != true){
			do {
				sifferB = parseInt(getText("Ditt valg: [0]Stein, [1]Saks, [2]Papir"));
			} while ((sifferB < 0) || (sifferB > 2));  

			sifferM = Min.trekkTall(0, 2); 

			valgM = valg[sifferM]; 
			valgB = valg[sifferB]; 

			//Tegner valg 
			//Hvisker ut 
			setColor(255, 255, 255); 
			fillRectangle(marg, linje*3, VINDU, linje*3); 
			setColor(0, 0, 0); 
			drawString(valgB, marg, linje*4); 
			drawString(valgM, VINDU/2 + marg, linje*4); 

			//Uavgjort gir ingen utelling 
			if((sifferB != sifferM)){
				//Saks slår papir
				if((sifferB == 1) && (sifferM == 2) || (sifferB == 2) && (sifferM == 0) || (sifferB == 0) && (sifferM == 1)){
					poengB++; 
					drawString("Vinner", marg, linje*5);
				}
				if((sifferM == 1) && (sifferB == 2) || (sifferM == 2) && (sifferB == 0) || (sifferM == 0) && (sifferB == 1)){
					poengM++; 
					drawString("Vinner", VINDU/2 + marg, linje*5); 
				}
		    }
			//Hvisker ut og tegner poeng 
			setColor(255, 255, 255); 
			fillRectangle(marg, linje*6, VINDU, linje);
			setColor(0, 0, 0); 
			drawString("" + poengB, marg, linje*7); 
			drawString("" + poengM, VINDU/2 + marg, linje*7); 

			//Sjekker om spillet er ferdig
			if((poengB >= 3) || (poengM >= 3)){
				ferdig = true; 
			}

		}
		//Skriver seier
		if(poengB == 3){
			drawString("Seier!", marg, linje*3); 
		}
		else{
			drawString("Seier!", VINDU/2 + marg, linje*3); 
		}


	}
}