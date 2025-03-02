/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Symmetri{
	public static void main (String[] args) {
		int tall = symmetriTall(); 

		out.println(tall);   
	} 

private static int symmetriTall(){
	int tall = 0; 
	int tall1 = 0; 
	int tall3 = 0; 
	//Oppretter løkke som trekker tre siffret tall 
        //og returnerer tall visst fremste og bakerste
	//siffer er like. 
	do {
		tall = Min.trekkTall(100, 999); 
		tall3 = tall % 10; 
		tall1 = tall / 100;  	
	} while(tall1 != tall3); 
	return tall; 
}

}	