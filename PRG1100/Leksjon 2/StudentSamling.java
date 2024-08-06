  /* Kap 6: Jobb 3
   * Dette programmet tester ut klasser o
   * objekter. Ikke noe reell aktivitet...
   */
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;
 
  public class StudentSamling {
 
    public static void main(String [] args) {  
 
      Student s1 = new Student();
      s1.setStudNr(123459); 
      s1.setFødtÅr(2002); s1.setKjønn('M'); 
      s1.setFornavn("oLa"); 
      s1.setEtternavn("bY");
      Student s2 = new Student();
      s2.setStudNr(123451); 
      s2.setFødtÅr (2003); s2.setKjønn('K'); 
      s2.setFornavn("Kari");
      s2.setEtternavn(s1.getEtternavn());
	  Student s3 = new Student(123458,"IdA","li",2003, 'K');
      Student s4 = new Student(654321, "Ida", "By", 2002, 'K'); 
      Student s5 = new Student(123443,"Roy","Knutsen",2003, 'M');
      Student s6 = new Student(654311, "John", "Sveinsen", 2002, 'M'); 

      //Oppretter objekt samling 
      Student[] studentTab = new Student[6]; 
      //Legger inn alle objektene 
      studentTab[0] = s1; 
      studentTab[1] = s2; 
      studentTab[2] = s3; 
      studentTab[3] = s4; 
      studentTab[4] = s5; 
      studentTab[5] = s6; 

     
	  //Utskrift av objektene i tabellen 
	  String ut = "Studentregister: " + "\n"; 
	  for (Student enStudent: studentTab) {
	  	ut += enStudent.toString() + '\n';
	  }
	  showMessageDialog(null, ut); 
    

      //Sortert etter stigende rekkefølge 
      //Via hjelpetabell i String -> Arrays 
      String[] studNrTab = new String[studentTab.length]; 
      for(int i=0;i<studentTab.length;i++) {
      	studNrTab[i] = studentTab[i].toString(); 
      }
      Arrays.sort(studNrTab); 
      ut = "Studentregister: " + "\n"; 
	  for (Student enStudent: studentTab) {
	  	ut += enStudent.toString() + '\n';
	  }
	  showMessageDialog(null, ut);

	  //Sortert etter etternavn 
      //Via hjelpetabell i String -> Arrays 
      String[] etternavnTab = new String[studentTab.length]; 
      for(int i=0;i<studentTab.length;i++) {
      	etternavnTab[i] = studentTab[i].skrivEtternavn(); 
      }
      Arrays.sort(etternavnTab); 
      ut = "Studentregister sortert ved etternavn: " + "\n"; 
	  for (String enStudent: etternavnTab) {
	  	ut += enStudent + '\n'; 
	  }
	  showMessageDialog(null, ut);

	  //sortert etter kjønn.. 
	  ut = "Studentregister sortert etter kjønn: " + "\n"; 
	  String menn = "", kvinner = "", andre = ""; 
	  for (Student enStudent: studentTab) {
	  	if((enStudent.getKjønn() == 'M' || enStudent.getKjønn() == 'm')) {
	  		menn += enStudent.skrivEtternavn() + '\n'; 
	  	}
	  	else if ((enStudent.getKjønn() == 'K' || enStudent.getKjønn() == 'k')){
	  		kvinner += enStudent.skrivEtternavn() + '\n'; 
	  	}
	  	else {
	  		andre += enStudent.skrivEtternavn() + '\n'; 
	  	}
	  }
	  showMessageDialog(null, ut+menn+kvinner);


	  // Leser inn fornavn og setter opp studentliste med dette fornavnet 
	  String leterEtter = showInputDialog("Gi fornavn: ");
	  leterEtter = Student.pent(leterEtter); 
	  ut = "Fornavnsliste for " + leterEtter + '\n'; 
	  for(Student enStudent: studentTab) {
	  	if(enStudent.getEtternavn().equals(leterEtter)) {
	  		ut += enStudent + "\n"; 
	  	}
	  }
	  showMessageDialog(null, ut);
  }
}