import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class valutaKalkulator {
	public static void main (String[] args) {
		double dollar = parseInt(showInputDialog("Beløp i Amerikanske dollar: ")); 
		
		double kurs = 10.93; 
		
		double kroner = dollar * kurs; 

		showMessageDialog(null, "Beløp i Amerikanske dollar: " + '\n' + 
								"Kurs: " + kurs + '\n' +
								"Beløp i Norske kroner: " + kroner); 
	}
}