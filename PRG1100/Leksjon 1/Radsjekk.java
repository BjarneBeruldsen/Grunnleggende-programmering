/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Radsjekk{
	public static void main (String[] args) {
		final int ANT_SETER = 5; 
		final int ANT_RADER = 5; 

		boolean[][] opptatt = new boolean[ANT_RADER][ANT_SETER]; 

		for(int i=0;i<ANT_RADER;i++) {
			for(int j=0;j<ANT_SETER;j++) {
				opptatt[i][j] = (Min.trekkTall(0, 1) == 1); 
			}

		}

		String ut = "  ";
		for(int i=1;i<=ANT_SETER;i++) {
			if(i > 9) {
				ut += i % 10 + " "; 
			}
			else {
				ut += i + " "; 
			}
		}
		ut += '\n'; 

		 //X = opptatt _ = ledig
		for(int i=0;i<ANT_RADER;i++) {
			if((i+1) > 9) {
				ut += (i+1) % 10 + " "; 
			}
			else {
				ut += (i+1) + " "; 
			}
			for(int j=0;j<ANT_SETER;j++) {
				if(opptatt[i][j]) {
					ut += "X "; 
				}
				else {
					ut += "_ "; 
				}
			}
			ut += '\n';  
		}
		out.println(ut);
	} 
}	