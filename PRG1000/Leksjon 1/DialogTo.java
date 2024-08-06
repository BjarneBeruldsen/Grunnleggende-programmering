import static javax.swing.JOptionPane.*;

public class DialogTo {

  public static void main(String[] args) {
    String navn = showInputDialog("Navn: ");
    String etternavn = showInputDialog("Etternavn: "); 
    showMessageDialog(null, "Hei " + navn + " " + etternavn);
  }

}