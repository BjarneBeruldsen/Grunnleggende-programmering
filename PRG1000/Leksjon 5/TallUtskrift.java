/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class TallUtskrift{
	public static void main (String[] args) {
		//oppretter tabell 
		int[] tab = {1,1,1,1,1,1,4,4,4,4,7,8,8,8,8,8,8,8,9,9,9,9,9}; 
		for(int i=0;i<tab.length-1;i++){
			out.print(" " + tab[i]); 
			//Sjekker om tall er mindre enn neste tall
			if(tab[i] < tab[i+1]){
				out.println(); 
			}
		}
  			//skriver ut siste tall 
			out.print(" " + tab[tab.length-1]); 
	} 
}	