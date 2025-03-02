/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class LinjeNummerering{
	public static void main (String[] args) throws Exception{
		
		String filnavn = showInputDialog("Filnavn: "); 
		File fil = new File(filnavn); 
		Scanner leser = new Scanner(fil); 
		int linjeNr = 1; 
		String linje; 
		while(leser.hasNextLine()){
			linje = leser.nextLine(); 
			out.println(linjeNr + ": " + linje);
			linjeNr++; 
		}
		leser.close(); 							  
	} 
}	