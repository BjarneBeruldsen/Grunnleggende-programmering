  /* Kap 6: Jobb 1
   * Dette programmet tester ut klasser o
   * objekter. Ikke noe reell aktivitet...
   */
  import static java.lang.System.*;  
  import static javax.swing.JOptionPane.*;
  import static java.lang.Integer.*;
 
  public class StudentTest {
 
    public static void main(String [] args) {  
      // Innlesing 
      //String talltekst = showInputDialog("Gi tall:");
      //int tall = parseInt(talltekst);

      // Opprette objekt
      Student s1 = new Student();
      // Legger inn data
      //s1.studNr = 123456; // korrekt navn? korrekt datatype?
      s1.setStudNr(123456); 
      //s1.getFornavn() = "oLa";
      s1.setFornavn("oLa"); 
      s1.setEtternavn("bY");
      Student s2 = new Student();
      s2.setStudNr(123457); 
      s2.setFornavn("Kari");
      s2.setEtternavn(s1.getEtternavn());

      // Med konstruktør (inndata!)
      Student s3 = new Student(123458,"IdA","li",2003, 'K');

      //overlastet konstruktør
      Student s4 = new Student(654321); 
      // Utskrift 
      String ut = "Student nr 1: "+s1.getStudNr()+"-"+s1.getFornavn()
                + " "+s1.getEtternavn() +"\n"
                + "Student nr 2: "+s2.getStudNr()+"-"+s2.getFornavn()
                + " "+s2.getEtternavn() +"\n"
                + "Student nr 3: "+s3.getStudNr()+"-"+s3.getFornavn()
                + " "+s3.getEtternavn()+" ("+s3.getFødtÅr()+")" +"\n"
                + "Student nr 4: "+s4.getStudNr()+"-"+s4.getFornavn()
                + " "+s4.getEtternavn()+" ("+s4.getFødtÅr()+")";
      out.println(ut); 
      s1.setEtternavn("Moe");// String er immutable
      out.println("s1 (Ola): "+s1.getEtternavn());
      out.println("s2 (Kari): "+s2.getEtternavn());

      // Tester objektmetoder
      ut = "Info om student: " + s3;
      showMessageDialog(null, ut);
      s3.endreEtternavn("Dal");
      ut = "Etter endring: " + s3;
      showMessageDialog(null, ut);
      ut = "Info om student nr2: " + s2;
      showMessageDialog(null, ut);
      ut = "Student nr. 3 er "; 
      if(s3.erKvinne()){
      	ut += "kvinne."; 
      }
      else {
      	ut += "ikke kvinne."; 
      }
      out.println(ut); 
    } 
    
  }