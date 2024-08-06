import static java.lang.System.*; 
import static javax.swing.JOptionPane.*; 
import static java.lang.Integer.*; 
import static java.lang.Double.*; 
import static java.lang.Math.*; 
import java.util.*;
import java.io.*;

public class Gjennomsnitt2{
   public static void main (String[] args) throws Exception {
	   //Leser inn navn på fil 
	   String ukeDag = showInputDialog("Gi ukedag: "); 

	   //Opretter tab.
	   int[] tid = new int[9]; 
	   //Opretter tabell for antall anrop i hver kat.
	   int[] antKat = new int[9]; 

	   //Scanner fil 
	   File fil = new File(ukeDag + ".txt"); 
	   Scanner leser = new Scanner(fil);

 		   
	   //Løkke som legger til tid til produktkategori 
	   while(leser.hasNextInt()){
		int kat = leser.nextInt(); 
		int sek = leser.nextInt(); 
		antKat[kat]++; 
		tid[kat] += sek; 
	   }
	   leser.close(); 
		
	   //Beregner gjennomsnitt til hver kat
	   for(int i=1;i<antKat.length;i++){
	   	if(antKat[i] > 0){
			tid[i] = tid[i]/antKat[i]; 
	   	}
	   	else{
	   		tid[i] = 0; 
	   	}
	   }
	   out.println(Arrays.toString(tid)); 
	   //skriver gjennomsnitt til ny fil 
	   String ut = ""; 
	   String filNavn = "res" + ukeDag + ".txt"; 
	   PrintWriter skriver = new PrintWriter(filNavn); 
           for(int i=1;i<tid.length;i++){

	        ut += i + " - " + tid[i] + '\n'; 
	   }
	   skriver.println(ut); 
	   skriver.close(); 
   }
}