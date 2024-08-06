/* Kap.7: Person-db
 *programmet tilbyr aktivitet mot tabellen Person i personer.db
 *Det er menystyrt og har aktiviteter som vis personer, slett og 
 *legg til person og håndtere backup av db på fysisk fil. 
 */

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*; 
import static java.lang.Math.*;
import java.util.*;
import java.io.*;
import java.sql.*;

 public class PersonInfoApp {
 	private static Connection conn = null; //Opprettes visst den ikke finnes 
 	private static Statement stmt = null; 
 
 	public static void main(String[] args) throws Exception{
 		conn = DriverManager.getConnection("jdbc:sqlite:personer.db"); //Opprettes visst den ikke finnes 
 		stmt = conn.createStatement(); 
 		 
		//Meny styring 
		char valg; 
		do {
 			valg = visMeny();
 			//hvilken aktivietet skal kjøres?
 			switch (valg) {
 			case 'E': skrivListeEtternavn(); break; 
 			case 'T': skrivListeTelefon(); break; 
 			case 'L': leggTilPerson(); break; 
 			case 'H': henteBackup(); break; 
 			 default: /*ingen aktivitet*/
 			} 
 		} while(valg != 'A'); 
 		conn.close(); 



 	}

 	 		//Hjelpemetode for aktivitet i appen 
 		private static char visMeny() {
 			String ut = "Velg oppgave[bokstav]:"+'\n'+
 						"[E] Liste på etternavn"+'\n'+
 						"[T] Liste på telefon"+'\n'+
 						"[S] Slett person"+'\n'+
 						"[L] Legg til person"+'\n'+
 						"[H] Hent backup fra fil" + '\n' + 
 						"[A] Avslutt"; 
 			String valgTekst = showInputDialog(ut); 
 			char kode = valgTekst.trim().toUpperCase().charAt(0); 
 			return kode; 
 		}

 		//Hjelpemetoder for aktivitet i appen
 		private static void skrivListeEtternavn() throws Exception{

	 		String sql = "select * from Person order by Enavn;"; 
	 		ResultSet rs = stmt.executeQuery(sql); 
	 		String ut = "Personer sortert på etternavn" + '\n'; 
	 		while(rs.next()) {
	 			String fn = rs.getString("Fnavn"); 
	 			String en = rs.getString("Enavn"); 
	 			String adr = rs.getString("Adr"); 
	 			int tlf = rs.getInt("Tlf"); 
	 			ut += (fn+";"+en+";"+adr+";"+tlf) + '\n';
	 		}
	 		showMessageDialog(null, ut); 
 		}


 		private static void skrivListeTelefon() {
 			System.out.println("Tlf liste"); 
 		}

 		private static void leggTilPerson() {
 			String nyPerson = ""; 
 			try {
		 			//All info komprimert i et dialogvindu 
		 			nyPerson = showInputDialog("Registrer person. " + '\n' + 
		 											  "Format fn;en;adr;tlf");
		 			String[] dataTab = nyPerson.split(";"); 
		 			String fn = dataTab[0];  
		 			String en = dataTab[1];   
		 			String adr = dataTab[2];   
		 			int tlf = parseInt(dataTab[3]);       
		 			String sql = "insert into Person values('"+fn+"', '"+en+"', '"+adr+"', "+tlf+");"; 
		 			stmt.executeUpdate(sql); 
		 			System.out.println("nyPerson reg.:" + nyPerson); 
 			} 
 			catch(Exception e) {
 				showMessageDialog(null, "Kunne ikke registrere personen!"); 
 				System.out.println("nyPerson ikke reg.:" + nyPerson);
 			}
 		}

 		 private static void henteBackup() {
 		 	String nyPerson = ""; 
 			try {
		 			String filnavn = "register"; 
		 			Scanner leser = new Scanner(new File(filnavn + ".txt")); 
		 			if (!fil.exists()) {
        			showMessageDialog(null, "Filen eksisterer ikke.");
        			return;
    				}
		 		    String sql = "drop table if exists Person;" + 
		 						 "create table if not exists Person(Fnavn varchar(20), Enavn varchar(30), Adr varchar(50), Tlf integer);";
		 			stmt.executeUpdate(sql); 
 		
		 			while(leser.hasNextLine()) {
		 				nyPerson = leser.nextLine(); 
			 			String[] dataTab = nyPerson.split(";"); 
			 			String fn = dataTab[0];  
			 			String en = dataTab[1];   
			 			String adr = dataTab[2];   
			 			int tlf = parseInt(dataTab[3]);       
			 			sql = "insert into Person values('"+fn+"', '"+en+"', '"+adr+"', "+tlf+");"; 
			 			stmt.executeUpdate(sql); 
		 			}
		 			leser.close(); 
		 			System.out.println("Backup hentet, ok!"); 
 			} 
 			catch(Exception e) {
 				showMessageDialog(null, "Kunne ikke hente backup. Se logg"); 
 				System.out.println("Kunne ikke hente backup.");
 			}
 		}
 }