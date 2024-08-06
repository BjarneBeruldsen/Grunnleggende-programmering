import static java.lang.Integer.*;

public class Presentasjon extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args); 
	}

	public void run() {
		//initierer konstanter og lager vindu 
		final int BREDDE = 800;
		final int HØYDE = 350; 
		makeWindow("Presentasjon", BREDDE, HØYDE); 

		//Tabell som holder rede på passeringer 
		int[] kjøretøy = new int[5]; 

		//Simulerer passeringer 
		for(int i=0;i<kjøretøy.length;i++){
			int antallPassering = Min.trekkTall(50, 750);
			kjøretøy[i] = antallPassering; 
		}

		//Linje avstand og marg
		int marg = BREDDE / (BREDDE / 10);
		int linje = HØYDE / 7; 

		//Tegner innhold i presentasjon 
		setFont("Arial", 16); 
		drawString("Passering fra dato: ddmmåååå", marg, linje);  

		//Tabell som inneholder navn på kjøretøy
		String[] kNavn = {"Motorsykkel:", "Personbil:", "Lastebil:", "Buss:", "Vogntog:"}; 

		//variabler til rektangel 
		int h = linje / 2; 
		int xR = BREDDE / (BREDDE / 100); 
		int yR = linje * 2 - h; 
		int bR = -(xR + marg-30);
		//Tegner presentasjon 
		for(int i=0;i<kNavn.length;i++){
			drawString("" + kNavn[i], marg, linje * (i + 2)); 
			fillRectangle(xR, yR, kjøretøy[i] + bR, h); 
			drawString("" + kjøretøy[i], xR + kjøretøy[i] + bR, linje * (i + 2)); 
			yR += linje; 
		}
	}
}