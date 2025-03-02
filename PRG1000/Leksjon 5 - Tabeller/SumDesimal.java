/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class SumDesimal{
	public static void main (String[] args) {
		double[] tab = {2.5, 2.5, 2.5}; 
		double sum = sumTab(tab); 
		out.println(sum); 
	} 
	

	private static double sumTab(double[] tab){
	double sum = 0; 
		for(int i=0; i<tab.length;i++){
			sum += tab[i]; 
		}
		return sum; 
	}
}