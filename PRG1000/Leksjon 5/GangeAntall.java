/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class GangeAntall{
	public static void main (String[] args) {
		//oppretter tabell 
		int[] tab = {1,6,4,4,7,1,8,7,9,5}; 
		int gange = 0; 
		int sum = 0; 
		for(int i=0;i<tab.length-1;i+=2){
			gange = tab[i] * tab[i+1]; 
			sum += gange; 
		}
		out.println(sum); 
	} 
}	