/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class StørreEnFørste{
	public static void main (String[] args) {
		int[]tab = {2, 3, 4, 8, 1}; 
		int n = nDoble(tab); 
		out.println(n); 
	} 

private static int nDoble(int[] tab){
	int n = 0; 
	for(int i=1;i<tab.length;i++){
		if(tab[i] >= 2*tab[0]){
			n++; 
		}
	}
	return n; 
}
}