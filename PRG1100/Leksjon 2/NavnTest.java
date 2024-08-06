/* 
 */ 
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class NavnTest{
	public static void main (String[] args) {
		Navn[] navnTab = new Navn[3]; 

		navnTab[0] = new Navn("bJARNE", "bErUlDsen"); 
		navnTab[1] = new Navn("juLie", "liLLEJORD"); 
		navnTab[2] = new Navn("viLjar", "lIllEjorD"); 

		//utskrift 
		for(int i=0;i<navnTab.length;i++) {
			out.println(navnTab[i].toString()); 
		}

		//endre navn 
		navnTab[2].setEtternavn("hOVD"); 
		navnTab[0].setFornavn("mARNE"); 

		for(int i=0;i<navnTab.length;i++) {
			out.println(navnTab[i].toString()); 
		}
	} 
}	