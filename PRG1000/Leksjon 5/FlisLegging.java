import static java.lang.System.*; 
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class FlisLegging {
	public static void main (String[] args) {
		//Leser inn areal som skal flislegges i meter
		double veggAreal = parseInt(showInputDialog("Gi areal som skal flislegges(kvadratmeter)")); 

		//Leser inn flis diameter
		double diameter = parseInt(showInputDialog("Gi diameter til flis(cm): "));

		//Beregninger 
		double veggArealCm = veggAreal * 10000;  //veggAreal omgjort til cm 
		double r = diameter / 2; 
		double flisAreal = (3*sqrt(3)/2*(pow(r, 2))); 

		int antallFlis = (int)(veggArealCm / flisAreal + 1); 

		//utskrift
		String ut = "Areal som skal flislegges: " + veggAreal + "m^2" + '\n' + 
					"Diameter som tilhører flis: " + diameter + "cm" + '\n' + 
					"Antall flis som fyller arealet: " + antallFlis; 

		showMessageDialog(null, ut); 
	}
}

