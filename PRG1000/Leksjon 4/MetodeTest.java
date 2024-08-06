import static java.lang.System.*;

public class MetodeTest { 

  public static void main(String[] args) {
 	trekant(4); 
  }

  private static void trekant(int m) {
    for (int i=1; i<=m; i++){
    	for(int j=1; j<=i; j++){
    		out.print("*"); 
    	}
    	out.println();
    }
  }

}