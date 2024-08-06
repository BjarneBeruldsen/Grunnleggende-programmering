/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class LottoRekke{
	public static void main (String[] args) { 
		//leser inn antall rekker
		int antall = Min.lesHeltall(2, 20000, "Gi antall rekker: "); 
		int[][]kupong = new int[antall][7]; 

		for(int i=0;i<antall;i++) {
			kupong[i] = trekkRekke(); 
		}

		//skriver ut kupongen 
		String ut = ""; 
		for(int i=0;i<antall;i++) {
			for(int j=0;j<7;j++) {
				if(kupong[i][j] < 10) {
					ut += "  "; 
				}
				else {
					ut += " "; 
				}
				ut += kupong[i][j]; 
			}
			ut += '\n'; 
		} 

		int[] vinnerRekke = trekkRekke(); 


		boolean vunnet = false; 

		for(int i=0;i<antall;i++) {
			if(Arrays.equals(vinnerRekke, kupong[i])) {
				vunnet = true; 
			}
		}

		if(vunnet) {
				ut += "Gratulerer du har vunnet!"; 
			}
			else {
				ut += "Beklager ingen premie:(("; 
			}

		out.println(ut);
	} 
	



//metode som returnerer en lotto rekke med 7 heltall.
	private static int[] trekkRekke() {
		int[] rekke = new int[7]; 
		boolean fraFør; 
		int tall = 0; 

		for(int i=0;i<rekke.length;i++) {
		fraFør = true; 
			do {
				fraFør = false;  
				tall = Min.trekkTall(1,34);
				for(int j=0;j<i;j++) { 
					if(rekke[j] == tall) {
						fraFør = true; 
					}
				}
			} while(fraFør); 
			rekke[i] = tall; 
		}
		Arrays.sort(rekke); 
		return rekke; 
	}
}

