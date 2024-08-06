/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class KvadratTest{
	public static void main (String[] args) {
		//oppretter kvadrater 
		Kvadrat kv1 = new Kvadrat(3); 
		Kvadrat kv2 = new Kvadrat(4);
		Kvadrat kv3 = new Kvadrat(6);

		//tegner kvadrat
		out.println("Areal: " + kv1.areal()); 
		out.println("Omkrets: " + kv1.omkrets()); 
		out.println(kv1.tegnKvadrat()); 
		out.println("Areal: " + kv2.areal()); 
		out.println("Omkrets: " + kv2.omkrets());
		out.println(kv2.tegnKvadrat()); 
		out.println("Areal: " + kv3.areal()); 
		out.println("Omkrets: " + kv3.omkrets());
		out.println(kv3.tegnKvadrat()); 

		if(kv3.sum(kv1, kv2)) {
			out.println("Summen av kv1 og kv2 tilsvarer kv3"); 
		} 
		else {
			out.println("Summen av kv1 og kv2 tilsvarer ikke kv3"); 
		}
	} 
}	