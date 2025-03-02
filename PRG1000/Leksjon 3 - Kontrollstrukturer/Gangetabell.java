/*Programmet skriver ut den lille 
 *gange tabellen. Den legger til et variabelt
 *antall blanke tegn for å få til den 
 *korrekte høyre justeringen
 */
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class Gangetabell {

  public static void main(String[] args) {

  	//initierer varabler med antall mellomrom
  	String en = " "; 
  	String to = "  "; 
  	String tre = "   "; 
  	String mellomrom = " "; 

  	//lager den øverste linjen 
  	out.print(tre);
  	for (int i=1; i<=10; i++){
  		if(i < 10){
  			mellomrom = tre; 
  		}
  		else {
  			mellomrom = to; 
  		}
  		out.print(mellomrom + i); 
  	}
  	out.println();
  	int j = 1;  
  	out.print(to + j);
  	j++;  


  	//skriver ut den lille gangetabellen
    for (int y=1; y<=10; y++) {
      for (int x=1; x<=10; x++) {
      	if(x * y < 10){
      		mellomrom = tre; 
      	}
      	else if(x * y >= 10 & x * y < 100){
      		mellomrom = to; 
      	}
      	else {
      		mellomrom = en; 
      	}
        out.print(mellomrom + x * y);
      }
      out.println();
      if (j < 10){
      out.print(to + j);  
  	}
  	 else if(j<=10){
  	 	out.print(en + j); 
  	 }
  	  j++; 
    }
  }

}

