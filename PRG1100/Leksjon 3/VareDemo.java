import static java.lang.System.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;  // Pene tall...
import java.sql.*; 

public class VareDemo {

public static void main(String[] args) {
  try { 
    String prisTekst = showInputDialog("Gi prisgrense:");
    double prisGrense = parseDouble(prisTekst);
    visVarer(prisGrense);
  }
  catch (Exception e) {
    out.println("Databasefeil: " + e.toString());
  }
}

public static void visVarer(double prisGrense)
                                 throws Exception { 
  String url = "jdbc:sqlite:butikk.db";
  String sql = "select * from Vare " +
               "where Pris < " + prisGrense; 

  // Opprett forbindelsen til databasen
  Connection con = DriverManager.getConnection(url);

  // Utfør SQL-spørringen.
  Statement stmt = con.createStatement();
  ResultSet rs   = stmt.executeQuery(sql);

  DecimalFormat df = new DecimalFormat("#.00");
  int vareNr;
  String varenavn;
  double pris;
  int antall;
  while ( rs.next() ) { // Behandle hver rad
    vareNr   = rs.getInt("Nr");
    varenavn = rs.getString("Navn");
    pris     = rs.getDouble("Pris");
    antall   = rs.getInt("Antall");
    
    out.println("Nr: " + vareNr
              + ", Navn: " + varenavn
              + ", Pris: " + df.format(pris)
              + ", Antall: " + antall);
  }
  
  con.close(); // Lukk forbindelsen til databasen
}

} // 3.44.2.jar