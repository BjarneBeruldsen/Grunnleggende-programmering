/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Utskrift{
	public static void main (String[] args) {
		//metodekall 
		int[] tallTab = {1, 2, 3, 4, 5, 6, 7}; 
		utTab(tallTab);   
	} 

	private static void utTab(int tab[]) {
		out.print("["); 
		for(int i=0;i<tab.length-1;i++) {
			out.print(tab[i] + ", "); 
		}
		out.println(tab[tab.length-1] + "]"); 
	}
}	