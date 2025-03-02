/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class LottoTest{
	public static void main (String[] args) {
		Lotto rekke1 = new Lotto(); 

		//lager unik rekke 
		Lotto rekke2; 
		do {
			rekke2 = new Lotto(); 
		} while(rekke2.equals(rekke1)); 

		
		//utskrift 
		out.println(rekke1.toString() + "\n" + 
					rekke2.toString()); 


	} 
}	