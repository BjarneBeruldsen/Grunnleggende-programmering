/*Legger til navn på slutten av 
 *navn.txt
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class LeggTilNavn{
	public static void main (String[] args) throws Exception{
		String fil = "navn.txt"; 
		String nyttNavn = "Anders";  
		PrintWriter skriver = new PrintWriter(new FileWriter(fil, true)); 
		skriver.println(nyttNavn); 
		skriver.close();  
	} 
}	