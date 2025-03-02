/*
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Yatzy{
	public static void main (String[] args) throws Exception{
		//konstanter 
		final int TYPER = 21; 

		//leser inn antall spillere
		int antSpiller = 0; 
		do {
			antSpiller = parseInt(showInputDialog("Antall spillere: "));   
		} while(antSpiller < 1 || antSpiller > 7); 

		//oppretter tabeller 
		int[][] poeng = new int[antSpiller+1][TYPER+1]; 
		String[] spillNavn = new String[antSpiller+1]; 
		String[] typeNavn = {"Nullstill", "Enere              ", "Toere              ", "Treere             ", "Firere              ", "Femmere         ", 
							 			  "Seksere           ", "Bonus             ", "1 Par               ", "2 Par               ", "3 Par               ", 
							 			  "3 like               ", "4 like               ", "5 like               ", "Liten straight  ", 
										  "Stor straight   ", "Full straight   ", "Hytte 2+3        ", 
							 			  "Hus 3+3		          ", "Tårn 2+4         ", "Sjanse            ", "Maxiyatzy       "}; 

		//fil for lagring av spill
		String filnavn = showInputDialog("Dato og Klokkeslett: "); 

		//leser inn navn 
		for(int i=1;i<spillNavn.length;i++) {
			spillNavn[i] = showInputDialog("Navn på spiller: " + (i) + ":"); 
		}

		int antRunder = 0;   
		int spiller = 1; 
		int type = 0; 
		String kategori = "";
		String ut = "";  
		int[]sumFør = new int[antSpiller+1]; 
		int[]sumFerdig = new int[antSpiller+1]; 

		//Oversikt over hvilke tall som tilsvarer kategori
		for(int i=1;i<typeNavn.length;i++) {
			kategori += typeNavn[i] + "(" + (i) + ")" + '\n'; 
		}

		PrintWriter skriver = new PrintWriter(filnavn + ".txt"); 

		while(antRunder < TYPER*antSpiller) {
			do {
				type = parseInt(showInputDialog("Kategori for " + spillNavn[spiller] + ":" + '\n' + 
												kategori)); 
			} while (type < -1 || type > 21); 
			
			//reversibel skriv 0 for å endre på forrige poengsum
			if(type == 0) {
				spiller--; 
				antRunder--; 
				sumFerdig[spiller+1] -= poeng[spiller][type]; 
				do {
					if(spiller == 0) {
						spiller = antSpiller; 
				}
					type = parseInt(showInputDialog("Kategori for " + spillNavn[spiller] + ":" + '\n' + 
												kategori)); 
				} while (type < -1 || type > 21);
			}

			

			//leser inn antall poeng for riktg spiller og riktig type
			do {
				poeng[spiller][type] = parseInt(showInputDialog(spillNavn[spiller] + " " + typeNavn[type] + " poeng: ")); 
			} while (type < 0 || type > 100); 

			if(type < 7) {
				sumFør[spiller] += poeng[spiller][type]; 
			}
			sumFerdig[spiller] += poeng[spiller][type]; 
			antRunder++; 
			spiller++; 
			if(spiller > antSpiller) {
				spiller = 1; 
			}

			//utksrift av poeng 
			ut = "                            " + spillNavn[1]; 
			for(int i=2;i<spillNavn.length;i++){
				ut += "       " + spillNavn[i]; 
			} 
			ut += '\n'; 

			for(int i=1;i<TYPER;i++) {
				//skriver ut sum før bonus  

				if(i == 7){
					ut += "Sum                   "; 
					for(int u=1;u<sumFerdig.length;u++) {
						ut += "("+spillNavn[u]+")" + sumFør[u]; 
						if  (sumFør[u] > 9 && sumFør[u] < 100) {
							ut += "  "; 
						}
						else if(sumFerdig[u] > 99) {
							ut += " "; 
						}
						else {
							ut += "   "; 
						}
						if(u == antSpiller) {
							ut += '\n'; 
						}

						if(sumFør[u] >= 84) {
							poeng[u][7] = 100; 
						}

					}
			}
				ut += typeNavn[i]; 

				for (int j=1;j<spillNavn.length;j++) {
					if(poeng[j][i] > 9 && poeng[j][i] < 100) {
						ut += "  "; 
					}
					else if(poeng[j][i] > 99) {
						ut += " "; 
					}
					else {
						ut += "   "; 
					}
					ut += "("+spillNavn[j]+")" + poeng[j][i];
				}
				ut += '\n'; 
			}
			ut += "Sum                   "; 
			for(int i=1;i<sumFerdig.length;i++) {
				ut += "("+spillNavn[i]+")" + sumFerdig[i]; 
					if (sumFerdig[i] > 9 && sumFerdig[i] < 100) {
						ut += "  "; 
					}
					else if(sumFerdig[i] > 99) {
						ut += " "; 
					}
					else {
						ut += "   "; 
					}
			}

			skriver.println(antSpiller + " " + antRunder + '\n' + 
							ut); 
			skriver.close(); 
			showMessageDialog(null, ut); 
		}
		String ferdig = ""; 
		for(int u=1;u<sumFerdig.length;u++) {
						ferdig += "("+spillNavn[u]+")" + sumFør[u]; 
						if  (sumFør[u] > 9 && sumFør[u] < 100) {
							ferdig += "  "; 
						}
						else if(sumFerdig[u] > 99) {
							ferdig += " "; 
						}
						else {
							ferdig += "   "; 
						}
						if(u == antSpiller) {
							ferdig += '\n'; 
						}
		}
		showMessageDialog(null, "Spillet er ferdig!" + '\n' + 
								ferdig);
		out.println(ut); 

	} 
}	