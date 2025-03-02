import static java.lang.Integer.*;

public class Søyle extends EasyGraphics {
	
	public static void main (String [] args) {
		launch (args);
	}

	public void run() {
final int VINDU = 400; 

makeWindow("Søyle", VINDU, VINDU); 
int høyde = 5; 

int r = (VINDU / høyde)/ 2; 
int mellomrom = r*2 + 1;
int x = r; 
int y = r; 

for (int i=0;i<=høyde;i++){
	for (int j=0;j<=i;j++){
		drawCircle(x, y, r); 
		x += mellomrom; 
	}
	y += mellomrom; 
	x = r; 
} 
	}
}