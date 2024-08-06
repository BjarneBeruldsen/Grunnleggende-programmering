import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class TrekantFigur{
	public static void main(String[] args){
		//Leser inn høyden
		int høyde = Min.lesHeltall(2, 9, "Gi høyde: "); 

		//skriver ut figuren i konstollet
		for(int i=0; i<høyde; i++){
			for (int j=0;j<høyde-i;j++){
				out.print(høyde); 
			}
			out.println(); 
		}
	}

}