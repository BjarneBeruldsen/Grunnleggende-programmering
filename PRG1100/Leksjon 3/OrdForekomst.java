/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class OrdForekomst{
	public static void main (String[] args) {
		String ut = "Ordlengde opptelling" + '\n';
		Scanner leser = null;  
		try{
			String filnavn = showInputDialog("Gi filnavn"); 
			File fil = new File(filnavn + ".txt"); 
			leser = new Scanner(fil); 
			int[] forekomst = new int[12]; 

			while(leser.hasNextLine()) {
				String linje = leser.nextLine(); 
				String[] ord = linje.split("( |\\.|,)+"); 
				for(int i=0;i<ord.length;i++) {
					if (ord[i].length() >= 12) {
						forekomst[0]++; 
					}
					else {
						forekomst[ord[i].length()]++; 
					}
				} 
			}

			for(int i=1;i<forekomst.length;i++) {
				ut+= "Ordlengde " + i + " antall: " + forekomst[i] + '\n'; 
			}
			ut += "Ordlengde 12 eller mer: " + forekomst[0]; 
		} 
		catch(FileNotFoundException e) {
			ut = "Filen finnes ikke!"; 
		}
		finally {
			if (leser != null) {
				leser.close(); 
			}
			showMessageDialog(null, ut); 
		}
	} 
}	