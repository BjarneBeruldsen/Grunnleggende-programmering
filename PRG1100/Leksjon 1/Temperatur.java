/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Temperatur{
	public static void main (String[] args) {
		//oppretter tabell 
		int[] temp = new int[7]; 
		String[] dag = {"Man", "Tir", "Ons", "Tor", "Fre", "Lør", "Søn"}; 

		//leser inn temp for hver dag og beregner 
		int sum = 0; 
		int min = Integer.MAX_VALUE; 
		int minPos = 0; 
		int maks = Integer.MIN_VALUE; 
		int maksPos = 0; 

		for(int i=0;i<temp.length;i++) {
			temp[i] = parseInt(showInputDialog("Gi temperatur: ")); 
			sum += temp[i]; 
			if(temp[i] < min) {
				min = temp[i]; 
				minPos = i; 
			}
			if(temp[i] > maks) {
				maks = temp[i]; 
				maksPos = i; 
			}
		}


		//utskrift 
		String ut = ""; 
		for(int i=0;i<temp.length;i++) {
			ut += dag[i] + ": " + temp[i] + '\n'; 
		}

		ut += "Minimumstemperatur: " + min + " på " + dag[minPos] + '\n' + 
			  "Maksimumstemperatur: " + maks + " på " + dag[maksPos]; 

		showMessageDialog(null, ut); 
	} 
}	