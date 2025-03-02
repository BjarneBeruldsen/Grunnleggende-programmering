/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class nedoverTall{
	public static void main (String[] args) {
		int tall = 0; 
		for(int i=5;i<=9;i++){
			tall = nedoverTall(i); 
		out.println(tall); 
		}  
	} 

private static int nedoverTall(int s) {
	int tall1 = s; 
	int tall2 = Min.trekkTall(1, tall1-1); 
	int tall3 = Min.trekkTall(0, tall2-1); 

	if(s >= 2){
	tall1 = s * 100; 
	tall2 = tall2 * 10; 

	s = tall1 + tall2 + tall3;  
	}  
	else{
	s = -1; 
	}
	return s; 
}
}	

