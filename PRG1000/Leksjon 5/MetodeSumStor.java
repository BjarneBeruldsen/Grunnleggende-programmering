/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class MetodeSumStor{
	public static void main (String[] args) {
		int[] heltall = {1, 2, 3, 4, 4, 3, 2, 1}; 
		int sum = sumStor(heltall);
		out.println(sum);  
	} 
	private static int sumStor(int[] tab){
	int sum = 0; 
	for(int i=1;i<tab.length;i++){
		if(tab[i] > tab[0]){
		sum += tab[i]; 
		}
	}
	return sum; 
	}
}	