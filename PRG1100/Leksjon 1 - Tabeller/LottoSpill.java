/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class LottoSpill{
	public static void main (String[] args) {

		//leser inn ønsket antall rekker 
		int[][] kupong = new int[100000][7]; 
		int lengde = 0; 
		do {
			lengde = parseInt(showInputDialog("Gi antall rekker(2-10): ")); 
		} while(lengde < 2 || lengde > 100000); 


		//trekker vinnerekke 
		int[] vinner = trekkLotto(); 
		out.println("Vinnerrekke: " + Arrays.toString(vinner)); 

		boolean vunnet = false; 

		for(int i=0;i<lengde;i++) {
			int[] lotto = trekkLotto(); 
			kupong[i] = lotto; 
			if(Arrays.equals(vinner, lotto)) {
				vunnet = true; 
			}
		} 

		//utskrift 
		for(int i=0;i<lengde;i++) {
			for(int j=0;j<7;j++) {
				if(kupong[i][j] <= 9) {
					out.print("  " + kupong[i][j]); 
				}
				else {
					out.print(" " + kupong[i][j]); 
				}
			}
			out.println(); 
		}

		if(vunnet) {
			out.println("  Gratulerer du har vunnet!"); 
		}
		else {
			out.println("  Beklager ingen premie:("); 
		}
	} 

	private static int[] trekkLotto() {
		int[] lotto = new int[7];
		int tall = 0; 

		for(int i=0;i<lotto.length;i++){ 
			while(Arrays.binarySearch(lotto, tall) >= 0) {
				tall = (int)(random() * 34) + 1; 
			}
			lotto[0] = tall; 
			Arrays.sort(lotto); 
		} 

		return lotto; 
	}
}