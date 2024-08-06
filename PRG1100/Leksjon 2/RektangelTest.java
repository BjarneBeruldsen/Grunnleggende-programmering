/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class RektangelTest{
	public static void main (String[] args) {
		Rektangel r1 = new Rektangel(10, 10, 10, 10); 

		//endre på x 
		r1.setX(50); 

		//skrive ut x 
		out.println(r1.getX()); 
	} 
}	