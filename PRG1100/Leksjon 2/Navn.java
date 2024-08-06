public class Navn{
	private String fornavn; 
	private String etternavn; 

	public Navn(String fornavn, String etternavn) {
		this.fornavn = pent(fornavn); 
		this.etternavn = pent(etternavn);
	}


	public void setFornavn(String fornavn) {this.fornavn = pent(fornavn);}
	public String getFornavn(){return fornavn;}
	public void setEtternavn(String etternavn) {this.etternavn = pent(etternavn);}
	public String getEtternavn(){return etternavn;}

	//toString metode 
	public String toString() {
		return etternavn + ", " + fornavn; 
	}

	//Metode som penskriver navn 
	private String pent(String navn) {
		char i = navn.toUpperCase().charAt(0); 
		String resten = navn.toLowerCase().substring(1); 
		return i+resten;
	}
}