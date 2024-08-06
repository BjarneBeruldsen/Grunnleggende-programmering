import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;

public class ByttVerdi {
	public static void main (String[] args) {

	int x = 5; 
	int y = 6; 
	int z = 7; //x = 5, y = 6, z = 7

	x = x + y; //x = 11, y = 6, z = 7
	y = x - y; //x = 11, y = 5, z = 7
	x = x - y; //x = 6, y = 5, z = 7

	z = x + z; //x = 6, y = 5, z = 13
	x = z - x; //x = 7, y = 5, z = 13
	z = z - x; //x = 7, y = 5, z = 13

	out.println("x: " + x + ", y: " + y + ", z: " + z); 
	}
}