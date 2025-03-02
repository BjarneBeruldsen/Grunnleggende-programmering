/*Inneholder objektvariabel sidelengde 
 *som brukes i objektmetoder til å regne
 *areal, omkrets og diagonal samt utskrift. 
 *siste metode sjekker om to kvadraters areal 
 *tilsvarer areal til det refererende kvadratet. 
 */
public class Kvadrat {
	private int sidelengde; 

	public Kvadrat (int sidelengde) {
		this.sidelengde = sidelengde; 
	}

	//set og get
	public void setSidelengde(int sidelengde){this.sidelengde = sidelengde;}
	public int getSidelengde(){return sidelengde;}

	//metode areal 
	public int areal() {
		return sidelengde*sidelengde; 
	}

	//metode omkrets 
	public int omkrets() {
		return sidelengde * 4; 
	}

	//metode diagonal 
	public double diagonal() {
		return Math.sqrt(2)*sidelengde; 
	}

	public String tegnKvadrat() {
		String ut = ""; 
		for(int i=0;i<sidelengde;i++) {
			for(int j=0;j<sidelengde;j++) {
				ut+= "* "; 
			}
			ut += '\n'; 
		}
		return ut; 
	}
	//Metode som avjør summering 
	public boolean sum(Kvadrat kv1, Kvadrat kv2) {
		return(kv1.areal() + kv2.areal() == areal()); 
	}
}

