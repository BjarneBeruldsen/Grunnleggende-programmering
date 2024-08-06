public class Student {
	// Objektvariabler med begrenset tilgang 
	private int studNr;
	private int fødtÅr; //uten private av tidshensyn 
	private String fornavn;
	private String etternavn;
	private char kjønn; 

	// Konstruktør(-er)
	public Student(int studNr, String fornavn, String etternavn, 
		             int fødtÅr, char kjønn) {
		this.studNr = studNr;
		this.fornavn = pent(fornavn);
		this.etternavn = pent(etternavn);
		this.fødtÅr = fødtÅr;
		this.kjønn = kjønn; 
	}

	// Overlaste konstruktør
	public Student () {
		// tomt her -> default null/0
	}

	//kun studentNr 
	public Student(int studNr) {
		this.studNr = studNr; 
		//øvrige variabler er default nullstilte
	}

	// Objektmetoder (aktiviteter)

	//Disse følger av private på objektvariabler 
	public void setStudNr(int studNr) {this.studNr = studNr;}
	public int getStudNr() {return studNr;}
	public void setFornavn(String fornavn) {this.fornavn = pent(fornavn);} //eksempel på at man kan sjekke inndata 
	public String getFornavn() {return fornavn;}
	public void setEtternavn(String etternavn) {this.etternavn = pent(etternavn);}
	public String getEtternavn() {return etternavn;}
	public int getFødtÅr() {return fødtÅr;}
	public void setFødtÅr(int fødtÅr) {this.fødtÅr = fødtÅr;}
	public char getKjønn() {return kjønn;}
	public void setKjønn(char kjønn) {this.kjønn = kjønn;}


	// Utskrift (dump) av alle objektets data
	public String skrivUt() {
		return studNr+";"+fornavn+";"+etternavn+";"+fødtÅr;
	}
	//toString som forventes å være i alle klasser
	public String toString() {
		return studNr+";"+fornavn+";"+etternavn+";"+fødtÅr+";"+kjønn;
	}
	public String skrivEtternavn() {
		return pent(etternavn)+", "+pent(fornavn)+";"+studNr+";"+fødtÅr+";"+kjønn;
	}
	// Endrer etternavn               // etternavn
	public void endreEtternavn(String nyttEtternavn) {
    etternavn = nyttEtternavn;
  //this.etternavn = etternavn;
	}

	//kontroll på navne-formatet 
	public  static String pent(String navn) {
		char i = navn.toUpperCase().charAt(0); 
		String resten = navn.toLowerCase().substring(1); 
		return i + resten; 
	}

	//Metode sjekker kjønn
	public boolean erKvinne() {
		return (kjønn == 'K' || kjønn == 'k'); 
	}
}