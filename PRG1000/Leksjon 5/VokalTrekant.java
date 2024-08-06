import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class VokalTrekant {
	public static void main(String[] args) {
		//leser inn antall linjer 
		int n = Min.lesHeltall(3, 9, "Gi antall linjer: "); 

		//oppretter tabell for vokaler
		char[] vokal = {'A', 'E', 'I', 'O', 'U', 'Y', 'Æ', 'Ø', 'Å'}; 

		for(int i=0;i<n;i++){				
			for(int j=0;j<=i;j++){
				out.print(vokal[i] + " "); 
			}
			out.println(); 
		}
	}
}