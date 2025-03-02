/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class SammeVerdi{
	public static void main (String[] args) {
		//metode kall
		int[] tallTab = {1, 2, 3, 4, 5, 6, 7};
		tallTab = fyllTabVerdi(tallTab, 6); 
		out.println(Arrays.toString(tallTab)); 
	} 
	

	private static int[] fyllTabVerdi(int tab[], int tall) {
		for(int i=0;i<tab.length;i++) {
			tab[i] = tall; 
		}
		return tab; 
	}
}